/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.StatePattern#getStateClasses <em>State Classes</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getStatePattern()
 * @model
 * @generated
 */
public interface StatePattern extends EObject {
	/**
	 * Returns the value of the '<em><b>State Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Classes</em>' reference list.
	 * @see designPatternsMDD.patterns.PatternsPackage#getStatePattern_StateClasses()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getStateClasses();

} // StatePattern
