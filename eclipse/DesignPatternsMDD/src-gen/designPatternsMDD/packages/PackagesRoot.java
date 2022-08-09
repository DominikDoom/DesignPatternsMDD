/**
 */
package designPatternsMDD.packages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains the actual model to generate classes for. Classes specified here can then be referenced in the pattern properties to assign them to it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.packages.PackagesRoot#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.packages.PackagesPackage#getPackagesRoot()
 * @model
 * @generated
 */
public interface PackagesRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see designPatternsMDD.packages.PackagesPackage#getPackagesRoot_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPackage> getPackages();

} // PackagesRoot
