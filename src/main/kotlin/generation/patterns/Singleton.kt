package generation.patterns

import com.grosner.kpoet.`=`
import com.grosner.kpoet.`private static final field`
import com.grosner.kpoet.`public static`
import com.grosner.kpoet.`return`
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.TypeSpec
import generation.Generator
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import util.camelCase

class Singleton: DesignPattern() {
    override fun generate(e: EClass, pkg: EPackage, gen: Generator): TypeSpec.Builder {
        ts.apply {
            val typeName = ClassName.get(pkg.name, e.name)
            `private static final field`(typeName, "instance") {
                `=`("new ${e.name}()")
            }
            `public static`(
                type = typeName,
                name = camelCase("get", e.name)
            ) {
                `return`("instance")
            }
        }
        return ts
    }
}