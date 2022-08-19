package generation

import generation.patterns.DesignPattern
import org.eclipse.emf.ecore.EClass

data class GenClassHolder(
    val eClass: EClass,
    val usedPatterns: List<DesignPattern>,
    val referenceName: String? = null,
    val refList: List<String>? = null
)
