/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains all patterns to be generated for this project.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.PatternRoot#getObserverPattern <em>Observer Pattern</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.PatternRoot#getSingletonPattern <em>Singleton Pattern</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.PatternRoot#getBuilderPattern <em>Builder Pattern</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getPatternRoot()
 * @model
 * @generated
 */
public interface PatternRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Observer Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer Pattern</em>' containment reference.
	 * @see #setObserverPattern(ObserverPattern)
	 * @see designPatternsMDD.patterns.PatternsPackage#getPatternRoot_ObserverPattern()
	 * @model containment="true"
	 * @generated
	 */
	ObserverPattern getObserverPattern();

	/**
	 * Sets the value of the '{@link designPatternsMDD.patterns.PatternRoot#getObserverPattern <em>Observer Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer Pattern</em>' containment reference.
	 * @see #getObserverPattern()
	 * @generated
	 */
	void setObserverPattern(ObserverPattern value);

	/**
	 * Returns the value of the '<em><b>Singleton Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Pattern</em>' containment reference.
	 * @see #setSingletonPattern(SingletonPattern)
	 * @see designPatternsMDD.patterns.PatternsPackage#getPatternRoot_SingletonPattern()
	 * @model containment="true"
	 * @generated
	 */
	SingletonPattern getSingletonPattern();

	/**
	 * Sets the value of the '{@link designPatternsMDD.patterns.PatternRoot#getSingletonPattern <em>Singleton Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Pattern</em>' containment reference.
	 * @see #getSingletonPattern()
	 * @generated
	 */
	void setSingletonPattern(SingletonPattern value);

	/**
	 * Returns the value of the '<em><b>Builder Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Pattern</em>' containment reference.
	 * @see #setBuilderPattern(BuilderPattern)
	 * @see designPatternsMDD.patterns.PatternsPackage#getPatternRoot_BuilderPattern()
	 * @model containment="true"
	 * @generated
	 */
	BuilderPattern getBuilderPattern();

	/**
	 * Sets the value of the '{@link designPatternsMDD.patterns.PatternRoot#getBuilderPattern <em>Builder Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Pattern</em>' containment reference.
	 * @see #getBuilderPattern()
	 * @generated
	 */
	void setBuilderPattern(BuilderPattern value);

} // PatternRoot
