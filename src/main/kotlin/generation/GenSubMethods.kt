package generation

import com.grosner.kpoet.*
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.ParameterSpec
import com.squareup.javapoet.TypeName
import com.squareup.javapoet.TypeSpec
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import util.camelCase
import util.genName
import util.poetTypeName

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
        `private field`(a.poetTypeName, a.name)
        `public`(
            type = a.poetTypeName,
            name = camelCase("get", a.name)
        ) {
            `return`(a.name)
        }
        `public`(
            type = TypeName.VOID,
            name = camelCase("set", a.name),
            param(a.poetTypeName, a.name)
        ) {
            statement("this.${a.name} = ${a.name}")
        }
    }
    return this
}

fun TypeSpec.Builder.generateRefsWithGetterSetter(refs: EList<EReference>, pkg: EPackage): TypeSpec.Builder {
    refs.forEach { r ->
        val typeName = r.poetTypeName(pkg)

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

/**
 * Generates a constructor that takes all attributes and references of the class as parameters.
 * @param a The attributes of the class.
 * @param r The references of the class.
 * @param pkg The package containing the class.
 * @return The built constructor.
 * */
fun TypeSpec.Builder.generateFullConstructor(
    a: EList<EAttribute>,
    r: EList<EReference>,
    pkg: EPackage
): TypeSpec.Builder {
    return constructor(
        *getParamsFromAttrs(a),
        *getParamsFromRefs(r, pkg)
    ) {
        modifiers(protected)

        // Add direct statements
        (a + r).forEach {
            statement("this.${it.name} = ${it.name}")
        }
        this
    }
}

/**
 * Generates a constructor that calls super for all fields inherited from the super class and
 * normally assigns the rest.
 * @param a The attributes of the class.
 * @param aSuper The attributes of the super class (without [a]).
 * @param r The references of the class.
 * @param rSuper The references of the super class (without [r]).
 * @param pkg The package containing the class.
 * @return The built constructor.
 * */
fun TypeSpec.Builder.generateExtensionConstructor(
    a: EList<EAttribute>,
    aSuper: List<EAttribute>,
    r: EList<EReference>,
    rSuper: List<EReference>,
    pkg: EPackage
): TypeSpec.Builder {
    return constructor(
        *getParamsFromAttrs(aSuper + a),
        *getParamsFromRefs(rSuper + r, pkg)
    ) {
        modifiers(protected)

        // Add super statement
        statement(
            "super(${
                (aSuper + rSuper).joinToString(", ") { it.name }
            })"
        )

        // Add direct statements
        (a + r).forEach {
            statement("this.${it.name} = ${it.name}")
        }
        this
    }
}

/**
 * Generates a constructor that calls super for all fields.
 * @param a The attributes of the class.
 * @param r The references of the class.
 * @param pkg The package containing the class.
 * @return The built constructor.
 * */
fun TypeSpec.Builder.generateSuperConstructor(a: EList<EAttribute>, r: EList<EReference>, pkg: EPackage): TypeSpec.Builder {
    return constructor(
        *getParamsFromAttrs(a),
        *getParamsFromRefs(r, pkg)
    ) {
        modifiers(public)

        // Add super statement
        statement(
            "super(${
                (a + r).joinToString(", ") { it.name }
            })"
        )
        this
    }
}

fun getParamsFromAttrs(a: List<EAttribute>): Array<ParameterSpec.Builder> {
    return a.map {
        param(it.poetTypeName, it.name)
    }.toTypedArray()
}

fun getParamsFromRefs(r: List<EReference>, pkg: EPackage): Array<ParameterSpec.Builder> {
    return r.map {
        param(it.poetTypeName(pkg), it.name)
    }.toTypedArray()
}