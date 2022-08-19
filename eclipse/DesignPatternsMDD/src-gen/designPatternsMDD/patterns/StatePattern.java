/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link designPatternsMDD.patterns.StatePattern#getStateGroups <em>State Groups</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getStatePattern()
 * @model
 * @generated
 */
public interface StatePattern extends EObject {
	/**
	 * Returns the value of the '<em><b>State Groups</b></em>' containment reference list.
	 * The list contents are of type {@link designPatternsMDD.patterns.StateGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Groups</em>' containment reference list.
	 * @see designPatternsMDD.patterns.PatternsPackage#getStatePattern_StateGroups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StateGroup> getStateGroups();

} // StatePattern
