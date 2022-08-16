package util

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeName
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import kotlin.reflect.KClass

private val arrayList = ClassName.get("java.util", "ArrayList")

val EClass.genName: String
    get() = "${name}Gen"

fun camelCase(vararg strings: String): String {
    return strings.mapIndexed { index, s ->
        if (index > 0)
            s.replaceFirstChar { it.uppercase() }
        else s
    }.joinToString("")
}

fun EReference.poetTypeName(pkg: EPackage): TypeName {
        return if (isMany) {
            // ArrayList reference type
            ParameterizedTypeName.get(
                arrayList,
                ClassName.get(pkg.name, eReferenceType.genName)
            )
        } else {
            // Direct reference type
            ClassName.get(pkg.name, eReferenceType.genName)
        }
    }

val EAttribute.poetTypeName: KClass<*>
    get() = eType.instanceClass.kotlin