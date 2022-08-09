/**
 */
package designPatternsMDD;

import designPatternsMDD.packages.PackagesRoot;

import designPatternsMDD.patterns.PatternRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.Root#getPackages <em>Packages</em>}</li>
 *   <li>{@link designPatternsMDD.Root#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.DesignPatternsMDDPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference.
	 * @see #setPackages(PackagesRoot)
	 * @see designPatternsMDD.DesignPatternsMDDPackage#getRoot_Packages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PackagesRoot getPackages();

	/**
	 * Sets the value of the '{@link designPatternsMDD.Root#getPackages <em>Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages</em>' containment reference.
	 * @see #getPackages()
	 * @generated
	 */
	void setPackages(PackagesRoot value);

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference.
	 * @see #setPatterns(PatternRoot)
	 * @see designPatternsMDD.DesignPatternsMDDPackage#getRoot_Patterns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PatternRoot getPatterns();

	/**
	 * Sets the value of the '{@link designPatternsMDD.Root#getPatterns <em>Patterns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patterns</em>' containment reference.
	 * @see #getPatterns()
	 * @generated
	 */
	void setPatterns(PatternRoot value);

} // Root
