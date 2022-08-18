package generation

import com.grosner.kpoet.*
import com.squareup.javapoet.ClassName
import designPatternsMDD.DesignPatternsMDDPackage
import designPatternsMDD.Root
import designPatternsMDD.patterns.ObserverPair
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import util.*
import java.io.File
import java.nio.file.Path

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
        // Create resource set for proper metamodel namespace resolution
        val resourceSet = ResourceSetImpl()
        resourceSet.resourceFactoryRegistry.extensionToFactoryMap[Registry.DEFAULT_EXTENSION] =
            XMIResourceFactoryImpl()
        resourceSet.packageRegistry[DesignPatternsMDDPackage.eNS_URI] = DesignPatternsMDDPackage.eINSTANCE
        // Load resource from file
        val resource = resourceSet.createResource(ecoreURI)

        // Empty options to use defaults
        val options: Map<Any, Any> = emptyMap()
        resource.load(options)

        // Loop through the model and generate code for each EClass
        val ecoreContents = resource.contents.asSequence()

        ecoreContents.filterIsInstance<Root>().first().let { root ->
            // Fill the pattern lists with the specified classes
            builders = root.patterns?.builderPattern?.builderClasses
            singletons = root.patterns?.singletonPattern?.singletonClasses
            observerPairs = root.patterns?.observerPattern?.obseverPairs
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

    private fun EClass.getPatterns(): GenClassHolder {
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
        if (usedPatterns.contains(DesignPattern.BUILDER)) {
            val builder = javaFile(pkg.name) {
                `class`(eClass.name + "Builder") {
                    modifiers(public)
                    genExtendIfNeeded(eClass, pkg)
                    // Create builder
                    generateBuilderPattern(eClass, pkg)

                    this // Needed since the last statement can sometimes be a unit without it
                }
            }.toBuilder().indent("    ").build().toString()
            save(eClass.name + "Builder", pkg.name, builder)
        }
        // Generate the class itself
        val kPoetCode = javaFile(pkg.name) {
            `class`(eClass.genName) {
                modifiers(public, abstract)
                genExtendIfNeeded(eClass, pkg)

                // Add attribute fields
                generateAttrsWithGetterSetter(eClass.eAttributes)
                // Add reference fields
                generateRefsWithGetterSetter(eClass.eReferences, pkg)

                // Add constructor
                constructor(){modifiers(protected)}
                    if (eClass.eAllSuperTypes.isEmpty()) {
                        generateFullConstructor(eClass.eAttributes, eClass.eReferences, pkg, usedPatterns)
                    } else {
                        generateExtensionConstructor(
                            eClass.eAttributes,
                            eClass.eAllAttributes - eClass.eAttributes,
                            eClass.eReferences,
                            eClass.eAllReferences - eClass.eReferences,
                            pkg,
                            usedPatterns
                        )
                    }

                this // Needed since the last statement can sometimes be a unit without it
            }
        }.toBuilder().indent("    ").build().toString()

        // Generate the manually extendable class
        val kPoetCodeExtendable = javaFile(pkg.name) {
            `class`(eClass.name) {
                modifiers(public)
                extends(ClassName.get(pkg.name, eClass.genName))
                //Add Singleton Pattern
                if (usedPatterns.contains(DesignPattern.SINGLETON))
                    generateSingletonPattern(eClass, pkg)

                javadoc("TODO: Add custom logic here")

                generateEmptySuperConstructor(usedPatterns)
                generateSuperConstructor(eClass.eAllAttributes, eClass.eAllReferences, pkg, usedPatterns)
                this // Needed since the last statement can sometimes be a unit without it
            }
        }.toBuilder().indent("    ").build().toString()

        // Save the code to a generated file
        save(eClass.genName, pkg.name, kPoetCode)
        saveExtendable(eClass.name, pkg.name, kPoetCodeExtendable)
    }

    private fun save(name: String, pkg: String, code: String) {
        val file = getOutFile(name, pkg)
        file.writeFile(code)
    }

    private fun saveExtendable(name: String, pkg: String, code: String) {
        val file = getOutFile(name, pkg)

        if (file.isFile) {
            println("${ANSI_YELLOW}Skipped extendable file ${file.name} since it already exits$ANSI_RESET")
            return
        }

        file.writeFile(code)
    }

    private fun getOutFile(name: String, pkg: String): File {
        // Create output directory if it doesn't exist
        val pkgWithoutBase = pkg.replace(outPath.toAbsolutePath().toString(), "")
        val outFile = Path.of(outPath.toString(), pkgWithoutBase.replace(".", File.separator)).toFile()
        if (!outFile.exists())
            outFile.mkdirs()

        return File(outFile, "${name}.java")
    }

    private fun File.writeFile(code: String) {
        createNewFile()
        writeText(code)
        println("${ANSI_GREEN}Successfully generated ${name}$ANSI_RESET")
    }
}