/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.FactoryPattern#getFactoryGroups <em>Factory Groups</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getFactoryPattern()
 * @model
 * @generated
 */
public interface FactoryPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Factory Groups</b></em>' containment reference list.
	 * The list contents are of type {@link designPatternsMDD.patterns.FactoryGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Groups</em>' containment reference list.
	 * @see designPatternsMDD.patterns.PatternsPackage#getFactoryPattern_FactoryGroups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FactoryGroup> getFactoryGroups();

} // FactoryPattern
