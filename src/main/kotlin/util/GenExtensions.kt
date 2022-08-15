package util

import org.eclipse.emf.ecore.EClass

val EClass.genName: String
    get() = "${name}Gen"

fun camelCase(vararg strings: String): String {
    return strings.mapIndexed { index, s ->
        if (index > 0)
            s.replaceFirstChar { it.uppercase() }
        else s
    }.joinToString("")
}