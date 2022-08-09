/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see designPatternsMDD.patterns.PatternsPackage
 * @generated
 */
public interface PatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsFactory eINSTANCE = designPatternsMDD.patterns.impl.PatternsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Root</em>'.
	 * @generated
	 */
	PatternRoot createPatternRoot();

	/**
	 * Returns a new object of class '<em>Observer Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observer Pattern</em>'.
	 * @generated
	 */
	ObserverPattern createObserverPattern();

	/**
	 * Returns a new object of class '<em>Singleton Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singleton Pattern</em>'.
	 * @generated
	 */
	SingletonPattern createSingletonPattern();

	/**
	 * Returns a new object of class '<em>Builder Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Builder Pattern</em>'.
	 * @generated
	 */
	BuilderPattern createBuilderPattern();

	/**
	 * Returns a new object of class '<em>Observer Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observer Pair</em>'.
	 * @generated
	 */
	ObserverPair createObserverPair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternsPackage getPatternsPackage();

} //PatternsFactory
