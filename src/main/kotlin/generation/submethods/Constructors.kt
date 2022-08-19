package generation.submethods

import com.grosner.kpoet.*
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec
import generation.References
import generation.patterns.DesignPattern
import generation.patterns.Singleton
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference

fun TypeSpec.Builder.generateEmptySuperConstructor(usedPatterns: Map<DesignPattern, References?>): TypeSpec.Builder {
    return constructor {
        patternDependentModifiers(usedPatterns)
    }
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
    pkg: EPackage,
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
fun TypeSpec.Builder.generateSuperConstructor(
    a: EList<EAttribute>,
    r: EList<EReference>,
    pkg: EPackage,
    usedPatterns: Map<DesignPattern, References?>
): TypeSpec.Builder {
    return constructor(
        *getParamsFromAttrs(a),
        *getParamsFromRefs(r, pkg)
    ) {
        patternDependentModifiers(usedPatterns)

        // Add super statement
        statement(
            "super(${
                (a + r).joinToString(", ") { it.name }
            })"
        )
        this
    }
}

fun MethodSpec.Builder.patternDependentModifiers(usedPatterns: Map<DesignPattern, References?>): MethodSpec.Builder {
    if (usedPatterns.any { it.key is Singleton })
        modifiers(private)
    else
        modifiers(public)

    return this
}