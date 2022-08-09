package generation

import com.grosner.kpoet.*
import com.squareup.javapoet.*
import designPatternsMDD.Root
import designPatternsMDD.patterns.ObserverPair
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import util.*
import java.io.File
import java.nio.file.Path
import java.util.*
import java.util.regex.Pattern
import javax.lang.model.element.Modifier

class Generator(private val outPath: Path) {
    private val files = mutableListOf<File>()

    private var builders: Iterable<EClass>? = null
    private var singletons: Iterable<EClass>? = null
    private var observerPairs: Iterable<ObserverPair>? = null
    private var observers: Iterable<EClass>? = null
    private var observables: Iterable<EClass>? = null

    fun addFile(file: File) {
        files.add(file)
    }

    fun hasFiles() = files.isNotEmpty()

    fun generate() {
        files.forEach {
            modelToCode(it)
        }
    }

    private fun modelToCode(modelFile: File) {
        // Create XMI resource factory for parsing
        val ecoreURI = URI.createFileURI(modelFile.absolutePath)
        val resource = XMIResourceFactoryImpl().createResource(ecoreURI)

        // Empty options to use defaults
        val options: Map<Any, Any> = emptyMap()
        resource.load(options)

        // Loop through the model and generate code for each EClass
        val ecoreContents = resource.contents.asSequence()

        ecoreContents.filterIsInstance<Root>().forEach { root ->
            // Fill the pattern lists with the specified classes
            builders = root.patterns.builderPattern.builderClasses
            singletons = root.patterns.singletonPattern.singletonClasses
            observerPairs = root.patterns.observerPattern.obseverPairs
            observables = observerPairs?.map { it.observable }
            observers = observerPairs?.flatMap { it.observers }

            // Generate the modeled packages & classes
            root.packages.packages.forEach { pkg ->
                pkg.eAllContents().asSequence().filterIsInstance<EClass>().forEach { e ->
                    // Check for and add used patterns to the holder class
                    val holder = e.getPatterns()
                    // Generate code for this class using the specified patterns
                    holder.generate(pkg)
                }
            }
        }
    }

    private fun EClass.getPatterns() : GenClassHolder {
        var patterns = DesignPatterns.of(DesignPattern.NONE)
        var referenceClass: EClass? = null

        // Builders
        if (builders != null && builders!!.contains(this)) {
            patterns = patterns and DesignPattern.BUILDER
        }
        // Singletons
        if (singletons != null && singletons!!.contains(this)) {
            patterns = patterns and DesignPattern.SINGLETON
        }
        // Observers
        if (observerPairs != null) {
            if (observables != null && observables!!.contains(this)) {
                patterns = patterns and DesignPattern.OBSERVER
            }
            if (observers != null && observers!!.contains(this)) {
                patterns = patterns and DesignPattern.OBSERVER
                referenceClass = observerPairs!!.find { it.observers.contains(this) }!!.observable
            }
        }

        return if (referenceClass != null) {
            GenClassHolder(this, patterns, referenceClass)
        } else {
            GenClassHolder(this, patterns)
        }
    }

    private fun GenClassHolder.generate(pkg: EPackage) {
        // TODO generate patterns

        // Generate the class itself
        val kPoetCode = javaFile(pkg.name) {
            `class`(eClass.genName) {
                modifiers(public, final)

                // Add attribute fields
                generateAttrsWithGetterSetter(eClass.eAllAttributes)
                // Add reference fields
                generateRefsWithGetterSetter(eClass.eAllReferences, pkg)

                this // Needed since the last statement can sometimes be a unit without it
            }
        }.toBuilder().indent("    ").build().toString()

        // Save the code to a generated file
        save(eClass.name, pkg.name, kPoetCode)
    }

    private fun save(name: String, pkg: String, code: String) {
        // Create output directory if it doesn't exist
        val pkgWithoutBase = pkg.replace(outPath.toAbsolutePath().toString(), "")
        val outFile = Path.of(outPath.toString(), pkgWithoutBase.replace(".", File.separator)).toFile()
        if (!outFile.exists())
            outFile.mkdirs()

        val file = File(outFile, "${name}Gen.java")
        file.createNewFile()
        file.writeText(code)
        println("${ANSI_GREEN}Successfully generated ${file.name}$ANSI_RESET")
    }
}