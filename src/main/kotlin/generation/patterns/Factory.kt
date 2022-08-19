package generation.patterns

import com.grosner.kpoet.*
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.TypeSpec
import generation.Generator
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class Factory: DesignPattern() {
    override fun generate(e: EClass, pkg: EPackage, gen: Generator): TypeSpec.Builder {
        val interfaceName = ClassName.get(pkg.name, "I$referenceName")
        // Create factory and common interface
        val factoryFile = javaFile(pkg.name) {
            `public class`("${referenceName}Factory") {
                public(interfaceName, "get${referenceName}", param(String::class, "type")) {
                    returns(interfaceName)
                    switch("type") {
                        refList!!.forEach {
                            case(it.S) {
                                `return`("new $it()")
                            }
                        }
                        default {
                            statement("throw new IllegalArgumentException(\"Unknown type: \" + type)")
                        }
                        this
                    }
                }
            }
        }.toBuilder().indent("    ").build().toString()

        val interfaceFile = javaFile(pkg.name) {
            `interface`(interfaceName.simpleName()) {
                modifiers(public)
                javadoc("TODO: Implement common method(s) for factory group $referenceName")
            }
        }.toBuilder().indent("    ").build().toString()

        gen.saveExtendable("${referenceName}Factory", pkg.name, factoryFile)
        gen.saveExtendable(interfaceName.simpleName(), pkg.name, interfaceFile)

        // Implement interface in class
        ts.apply {
            implements(interfaceName)
        }
        return ts
    }
}