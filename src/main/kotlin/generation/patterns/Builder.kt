package generation.patterns

import com.grosner.kpoet.*
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.TypeSpec
import generation.Generator
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import util.camelCase
import util.poetTypeName

class Builder: DesignPattern() {
    override fun generate(e: EClass, pkg: EPackage, gen: Generator): TypeSpec.Builder {
        // Create builder class file
        val builder = javaFile(pkg.name) {
            `abstract class`(e.name + "Builder") {
                modifiers(public)
                // Create builder
                val typeName = ClassName.get(pkg.name, e.name)
                val builderTypeName = ClassName.get(pkg.name, "${e.name}Builder")
                `private field`(typeName, "instance")
                `constructor` {
                    modifiers(public)
                    statement("this.instance = new ${e.name}()")
                }
                e.eAllAttributes.forEach { a ->
                    `public`(
                        type = builderTypeName,
                        name = camelCase("set", a.name),
                        param(a.poetTypeName, a.name)
                    )
                    {
                        statement("this.instance.${camelCase("set", a.name)}(${a.name})")
                        `return`("this")
                    }
                }
                e.eAllReferences.forEach { r ->
                    `public`(
                        type = builderTypeName,
                        name = camelCase("set", r.name),
                        param(r.poetTypeName(pkg), r.name)
                    )
                    {
                        statement("this.instance.${camelCase("set", r.name)}(${r.name})")
                        `return`("this")
                    }
                }
                `public`(
                    type = typeName,
                    name = "build",
                ) {
                    `return`("this.instance")
                }

                this // Needed since the last statement can sometimes be a unit without it
            }
        }.toBuilder().indent("    ").build().toString()
        gen.save(e.name + "Builder", pkg.name, builder)

        return ts
    }
}
