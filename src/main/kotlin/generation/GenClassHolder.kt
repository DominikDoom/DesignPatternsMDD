package generation

import org.eclipse.emf.ecore.EClass

data class GenClassHolder(
    val eClass: EClass,
    val usedPatterns: DesignPatterns,
    val referenceClass: EClass? = null
)
