/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.FactoryGroup#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.FactoryGroup#getFactoryClasses <em>Factory Classes</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getFactoryGroup()
 * @model
 * @generated
 */
public interface FactoryGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see designPatternsMDD.patterns.PatternsPackage#getFactoryGroup_GroupName()
	 * @model
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link designPatternsMDD.patterns.FactoryGroup#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Factory Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Classes</em>' reference list.
	 * @see designPatternsMDD.patterns.PatternsPackage#getFactoryGroup_FactoryClasses()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getFactoryClasses();

} // FactoryGroup
