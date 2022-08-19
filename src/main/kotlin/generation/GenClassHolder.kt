package generation

import generation.patterns.DesignPattern
import org.eclipse.emf.ecore.EClass

data class GenClassHolder(
    val eClass: EClass,
    val usedPatterns: Map<DesignPattern, References?>
)

data class References(
    val refName: String,
    val refList: List<String>?
)
