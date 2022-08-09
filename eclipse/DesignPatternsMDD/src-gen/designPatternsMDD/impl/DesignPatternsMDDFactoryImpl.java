/**
 */
package designPatternsMDD.impl;

import designPatternsMDD.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignPatternsMDDFactoryImpl extends EFactoryImpl implements DesignPatternsMDDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DesignPatternsMDDFactory init() {
		try {
			DesignPatternsMDDFactory theDesignPatternsMDDFactory = (DesignPatternsMDDFactory) EPackage.Registry.INSTANCE
					.getEFactory(DesignPatternsMDDPackage.eNS_URI);
			if (theDesignPatternsMDDFactory != null) {
				return theDesignPatternsMDDFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DesignPatternsMDDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPatternsMDDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DesignPatternsMDDPackage.ROOT:
			return createRoot();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPatternsMDDPackage getDesignPatternsMDDPackage() {
		return (DesignPatternsMDDPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DesignPatternsMDDPackage getPackage() {
		return DesignPatternsMDDPackage.eINSTANCE;
	}

} //DesignPatternsMDDFactoryImpl
