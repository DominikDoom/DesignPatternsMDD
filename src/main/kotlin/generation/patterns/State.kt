package generation.patterns

import com.grosner.kpoet.*
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.TypeName
import com.squareup.javapoet.TypeSpec
import generation.Generator
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class State: DesignPattern() {
    override fun generate(e: EClass, pkg: EPackage, gen: Generator): TypeSpec.Builder {
        // Generate state interface
        if (referenceName == null) {
            val inter = javaFile(pkg.name) {
                `interface`("I${e.name}State") {
                    modifiers(public)

                    public(TypeName.VOID, "doAction") {
                        modifiers(abstract)
                    }
                }
            }.toBuilder().indent("    ").build().toString()
            gen.save("I${e.name}State", pkg.name, inter)
        }

        // Generate observer code in class
        if (referenceName != null) {
            val interfaceName = ClassName.get(pkg.name, "I${referenceName}State")
            // Concrete state class
            ts.apply {
                implements(interfaceName)

                public(TypeName.VOID, "doAction") {
                    javadoc("TODO: Implement state functionality")
                    statement("throw new UnsupportedOperationException()")
                }
            }
        } else {
            // Observable
            val interfaceName = ClassName.get(pkg.name, "I${e.name}State")

            ts.apply {
                `private field`(interfaceName, "state")

                public(TypeName.VOID, "setState", param(interfaceName, "state")) {
                    statement("this.state = state")
                }
                public(interfaceName, "getState") {
                    `return`("this.state")
                }
            }
        }
        return ts
    }
}