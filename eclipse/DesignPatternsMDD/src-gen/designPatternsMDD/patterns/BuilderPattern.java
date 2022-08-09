/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.BuilderPattern#getBuilderClasses <em>Builder Classes</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getBuilderPattern()
 * @model
 * @generated
 */
public interface BuilderPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Builder Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Classes</em>' reference list.
	 * @see designPatternsMDD.patterns.PatternsPackage#getBuilderPattern_BuilderClasses()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getBuilderClasses();

} // BuilderPattern
