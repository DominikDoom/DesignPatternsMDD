/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observer Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.ObserverPair#getObservable <em>Observable</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.ObserverPair#getObservers <em>Observers</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getObserverPair()
 * @model
 * @generated
 */
public interface ObserverPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Observable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observable</em>' reference.
	 * @see #setObservable(EClass)
	 * @see designPatternsMDD.patterns.PatternsPackage#getObserverPair_Observable()
	 * @model required="true"
	 * @generated
	 */
	EClass getObservable();

	/**
	 * Sets the value of the '{@link designPatternsMDD.patterns.ObserverPair#getObservable <em>Observable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observable</em>' reference.
	 * @see #getObservable()
	 * @generated
	 */
	void setObservable(EClass value);

	/**
	 * Returns the value of the '<em><b>Observers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observers</em>' reference list.
	 * @see designPatternsMDD.patterns.PatternsPackage#getObserverPair_Observers()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getObservers();

} // ObserverPair
