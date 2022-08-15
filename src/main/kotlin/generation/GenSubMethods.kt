package generation

import com.grosner.kpoet.*
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeName
import com.squareup.javapoet.TypeSpec
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import util.camelCase
import util.genName

private val arrayList = ClassName.get("java.util", "ArrayList")

fun TypeSpec.Builder.genExtendIfNeeded(e: EClass, pkg: EPackage): TypeSpec.Builder {
    return if (e.eAllSuperTypes.isNotEmpty()) {
        val typeName = ClassName.get(pkg.name, e.eAllSuperTypes.first().genName)
        extends(typeName)
    } else {
        this
    }
}

fun TypeSpec.Builder.generateAttrsWithGetterSetter(attrs: EList<EAttribute>): TypeSpec.Builder {
    attrs.forEach { a ->
        `private field`(a.eType.instanceClass.kotlin, a.name)
        `public`(
            type = a.eType.instanceClass.kotlin,
            name = camelCase("get", a.name)
        ) {
            `return`(a.name)
        }
        `public`(
            type = TypeName.VOID,
            name = camelCase("set", a.name),
            param(a.eType.instanceClass.kotlin, a.name)
        ) {
            statement("this.${a.name} = ${a.name}")
        }
    }
    return this
}

fun TypeSpec.Builder.generateRefsWithGetterSetter(refs: EList<EReference>, pkg: EPackage): TypeSpec.Builder {
    refs.forEach { r ->
        // Create type name for either direct reference or parameterized ArrayList
        val typeName: TypeName =
            if (r.isMany) {
                // ArrayList reference type
                ParameterizedTypeName.get(
                    arrayList,
                    ClassName.get(pkg.name, r.eReferenceType.genName)
                )
            } else {
                // Direct reference type
                ClassName.get(pkg.name, r.eReferenceType.genName)
            }

        // Create field
        `private field`(typeName, r.name)

        // Create getter
        `public`(
            type = typeName,
            name = camelCase("get", r.name)
        ) {
            `return`(r.name)
        }

        // Create setter
        `public`(
            type = TypeName.VOID,
            name = camelCase("set", r.name),
            param(typeName, r.name)
        ) {
            statement("this.${r.name} = ${r.name}")
        }
    }
    return this
}