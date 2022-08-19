/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.StateGroup#getMainClass <em>Main Class</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.StateGroup#getStateClasses <em>State Classes</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getStateGroup()
 * @model
 * @generated
 */
public interface StateGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Class</em>' reference.
	 * @see #setMainClass(EClass)
	 * @see designPatternsMDD.patterns.PatternsPackage#getStateGroup_MainClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getMainClass();

	/**
	 * Sets the value of the '{@link designPatternsMDD.patterns.StateGroup#getMainClass <em>Main Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Class</em>' reference.
	 * @see #getMainClass()
	 * @generated
	 */
	void setMainClass(EClass value);

	/**
	 * Returns the value of the '<em><b>State Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Classes</em>' reference list.
	 * @see designPatternsMDD.patterns.PatternsPackage#getStateGroup_StateClasses()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getStateClasses();

} // StateGroup
