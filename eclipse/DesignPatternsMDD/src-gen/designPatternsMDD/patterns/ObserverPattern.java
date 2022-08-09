/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observer Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.ObserverPattern#getObseverPairs <em>Obsever Pairs</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getObserverPattern()
 * @model
 * @generated
 */
public interface ObserverPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Obsever Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link designPatternsMDD.patterns.ObserverPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obsever Pairs</em>' containment reference list.
	 * @see designPatternsMDD.patterns.PatternsPackage#getObserverPattern_ObseverPairs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ObserverPair> getObseverPairs();

} // ObserverPattern
