package generation.patterns

import com.squareup.javapoet.TypeSpec
import generation.Generator
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

abstract class DesignPattern {
    lateinit var ts: TypeSpec.Builder

    abstract fun generate(e: EClass, pkg: EPackage, gen: Generator): TypeSpec.Builder
}