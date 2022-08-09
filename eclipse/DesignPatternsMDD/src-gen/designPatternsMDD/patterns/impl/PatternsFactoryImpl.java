/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.*;

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
public class PatternsFactoryImpl extends EFactoryImpl implements PatternsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternsFactory init() {
		try {
			PatternsFactory thePatternsFactory = (PatternsFactory) EPackage.Registry.INSTANCE
					.getEFactory(PatternsPackage.eNS_URI);
			if (thePatternsFactory != null) {
				return thePatternsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsFactoryImpl() {
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
		case PatternsPackage.PATTERN_ROOT:
			return createPatternRoot();
		case PatternsPackage.OBSERVER_PATTERN:
			return createObserverPattern();
		case PatternsPackage.SINGLETON_PATTERN:
			return createSingletonPattern();
		case PatternsPackage.BUILDER_PATTERN:
			return createBuilderPattern();
		case PatternsPackage.OBSERVER_PAIR:
			return createObserverPair();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternRoot createPatternRoot() {
		PatternRootImpl patternRoot = new PatternRootImpl();
		return patternRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverPattern createObserverPattern() {
		ObserverPatternImpl observerPattern = new ObserverPatternImpl();
		return observerPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonPattern createSingletonPattern() {
		SingletonPatternImpl singletonPattern = new SingletonPatternImpl();
		return singletonPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderPattern createBuilderPattern() {
		BuilderPatternImpl builderPattern = new BuilderPatternImpl();
		return builderPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverPair createObserverPair() {
		ObserverPairImpl observerPair = new ObserverPairImpl();
		return observerPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsPackage getPatternsPackage() {
		return (PatternsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternsPackage getPackage() {
		return PatternsPackage.eINSTANCE;
	}

} //PatternsFactoryImpl
