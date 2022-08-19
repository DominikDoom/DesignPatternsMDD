package generation.patterns

import com.grosner.kpoet.*
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeName
import com.squareup.javapoet.TypeSpec
import generation.Generator
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import util.arrayList
import util.genName

class Observer: DesignPattern() {
    override fun generate(e: EClass, pkg: EPackage, gen: Generator): TypeSpec.Builder {
        // Generate interface if it doesn't exist yet
        if (ref == null) {
            val inter = javaFile(pkg.name) {
                `interface`("I${e.genName}") {
                    modifiers(public)

                    public(TypeName.VOID, "update", param(TypeName.OBJECT, "o")) {
                        modifiers(abstract)
                    }
                }
            }.toBuilder().indent("    ").build().toString()
            gen.save("I${e.genName}", pkg.name, inter)
        }

        // Generate observer code in class
        if (ref != null) {
            val interfaceName = ClassName.get(pkg.name, "I${ref!!.genName}")
            // Observer
            ts.apply {
                implements(interfaceName)

                public(TypeName.VOID, "update", param(TypeName.OBJECT, "o")) {
                    javadoc("TODO: Implement update functionality")
                    statement("throw new UnsupportedOperationException()")
                }
            }
        } else {
            // Observable
            val interfaceName = ClassName.get(pkg.name, "I${e.genName}")
            val listType = ParameterizedTypeName.get(arrayList, interfaceName)

            ts.apply {
                `private field`(listType, "observers") {
                    `=`("new ArrayList<>()")
                }

                public(TypeName.VOID, "addObserver", param(interfaceName, "o")) {
                    statement("observers.add(o)")
                }
                public(TypeName.VOID, "removeObserver", param(interfaceName, "o")) {
                    statement("observers.remove(o)")
                }
                public(TypeName.VOID, "notifyObservers", param(TypeName.OBJECT, "obj")) {
                    `for`("I${e.genName} o : observers") {
                        statement("o.update(obj)")
                    }
                }
            }
        }
        return ts
    }
}