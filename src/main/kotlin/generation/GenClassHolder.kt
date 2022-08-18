package generation

import generation.patterns.DesignPattern
import org.eclipse.emf.ecore.EClass

data class GenClassHolder(
    val eClass: EClass,
    val usedPatterns: List<DesignPattern>,
    val referenceClass: EClass? = null
)
