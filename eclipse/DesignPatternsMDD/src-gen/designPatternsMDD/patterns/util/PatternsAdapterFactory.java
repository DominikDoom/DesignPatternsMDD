/**
 */
package designPatternsMDD.patterns.util;

import designPatternsMDD.patterns.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see designPatternsMDD.patterns.PatternsPackage
 * @generated
 */
public class PatternsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PatternsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternsSwitch<Adapter> modelSwitch = new PatternsSwitch<Adapter>() {
		@Override
		public Adapter casePatternRoot(PatternRoot object) {
			return createPatternRootAdapter();
		}

		@Override
		public Adapter caseObserverPattern(ObserverPattern object) {
			return createObserverPatternAdapter();
		}

		@Override
		public Adapter caseSingletonPattern(SingletonPattern object) {
			return createSingletonPatternAdapter();
		}

		@Override
		public Adapter caseBuilderPattern(BuilderPattern object) {
			return createBuilderPatternAdapter();
		}

		@Override
		public Adapter caseObserverPair(ObserverPair object) {
			return createObserverPairAdapter();
		}

		@Override
		public Adapter caseFactoryPattern(FactoryPattern object) {
			return createFactoryPatternAdapter();
		}

		@Override
		public Adapter caseStatePattern(StatePattern object) {
			return createStatePatternAdapter();
		}

		@Override
		public Adapter caseFactoryGroup(FactoryGroup object) {
			return createFactoryGroupAdapter();
		}

		@Override
		public Adapter caseStateGroup(StateGroup object) {
			return createStateGroupAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link designPatternsMDD.patterns.PatternRoot <em>Pattern Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see designPatternsMDD.patterns.PatternRoot
	 * @generated
	 */
	public Adapter createPatternRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link designPatternsMDD.patterns.ObserverPattern <em>Observer Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see designPatternsMDD.patterns.ObserverPattern
	 * @generated
	 */
	public Adapter createObserverPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link designPatternsMDD.patterns.SingletonPattern <em>Singleton Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see designPatternsMDD.patterns.SingletonPattern
	 * @generated
	 */
	public Adapter createSingletonPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link designPatternsMDD.patterns.BuilderPattern <em>Builder Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see designPatternsMDD.patterns.BuilderPattern
	 * @generated
	 */
	public Adapter createBuilderPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link designPatternsMDD.patterns.ObserverPair <em>Observer Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see designPatternsMDD.patterns.ObserverPair
	 * @generated
	 */
	public Adapter createObserverPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link designPatternsMDD.patterns.FactoryPattern <em>Factory Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see designPatternsMDD.patterns.FactoryPattern
	 * @generated
	 */
	public Adapter createFactoryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link designPatternsMDD.patterns.StatePattern <em>State Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see designPatternsMDD.patterns.StatePattern
	 * @generated
	 */
	public Adapter createStatePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link designPatternsMDD.patterns.FactoryGroup <em>Factory Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see designPatternsMDD.patterns.FactoryGroup
	 * @generated
	 */
	public Adapter createFactoryGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link designPatternsMDD.patterns.StateGroup <em>State Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see designPatternsMDD.patterns.StateGroup
	 * @generated
	 */
	public Adapter createStateGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PatternsAdapterFactory
