/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.SingletonPattern#getSingletonClasses <em>Singleton Classes</em>}</li>
 * </ul>
 *
 * @see designPatternsMDD.patterns.PatternsPackage#getSingletonPattern()
 * @model
 * @generated
 */
public interface SingletonPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Singleton Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Classes</em>' reference list.
	 * @see designPatternsMDD.patterns.PatternsPackage#getSingletonPattern_SingletonClasses()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getSingletonClasses();

} // SingletonPattern
