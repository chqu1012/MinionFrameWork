/**
 */
package de.dc.minion.model.addon.mesh.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dc.minion.model.addon.mesh.FadeTransition;
import de.dc.minion.model.addon.mesh.MeshPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fade Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.mesh.impl.FadeTransitionImpl#getFromValue <em>From Value</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.mesh.impl.FadeTransitionImpl#getToValue <em>To Value</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.mesh.impl.FadeTransitionImpl#getAutoReverse <em>Auto Reverse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FadeTransitionImpl extends TransitionImpl implements FadeTransition {
	/**
	 * The default value of the '{@link #getFromValue() <em>From Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double FROM_VALUE_EDEFAULT = new Double(1.0);

	/**
	 * The cached value of the '{@link #getFromValue() <em>From Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromValue()
	 * @generated
	 * @ordered
	 */
	protected Double fromValue = FROM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToValue() <em>To Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double TO_VALUE_EDEFAULT = new Double(0.1);

	/**
	 * The cached value of the '{@link #getToValue() <em>To Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToValue()
	 * @generated
	 * @ordered
	 */
	protected Double toValue = TO_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoReverse() <em>Auto Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoReverse()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_REVERSE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutoReverse() <em>Auto Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoReverse()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoReverse = AUTO_REVERSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FadeTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeshPackage.Literals.FADE_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getFromValue() {
		return fromValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromValue(Double newFromValue) {
		Double oldFromValue = fromValue;
		fromValue = newFromValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.FADE_TRANSITION__FROM_VALUE, oldFromValue,
					fromValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getToValue() {
		return toValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToValue(Double newToValue) {
		Double oldToValue = toValue;
		toValue = newToValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.FADE_TRANSITION__TO_VALUE, oldToValue,
					toValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoReverse() {
		return autoReverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoReverse(Boolean newAutoReverse) {
		Boolean oldAutoReverse = autoReverse;
		autoReverse = newAutoReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.FADE_TRANSITION__AUTO_REVERSE,
					oldAutoReverse, autoReverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MeshPackage.FADE_TRANSITION__FROM_VALUE:
			return getFromValue();
		case MeshPackage.FADE_TRANSITION__TO_VALUE:
			return getToValue();
		case MeshPackage.FADE_TRANSITION__AUTO_REVERSE:
			return getAutoReverse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MeshPackage.FADE_TRANSITION__FROM_VALUE:
			setFromValue((Double) newValue);
			return;
		case MeshPackage.FADE_TRANSITION__TO_VALUE:
			setToValue((Double) newValue);
			return;
		case MeshPackage.FADE_TRANSITION__AUTO_REVERSE:
			setAutoReverse((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MeshPackage.FADE_TRANSITION__FROM_VALUE:
			setFromValue(FROM_VALUE_EDEFAULT);
			return;
		case MeshPackage.FADE_TRANSITION__TO_VALUE:
			setToValue(TO_VALUE_EDEFAULT);
			return;
		case MeshPackage.FADE_TRANSITION__AUTO_REVERSE:
			setAutoReverse(AUTO_REVERSE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MeshPackage.FADE_TRANSITION__FROM_VALUE:
			return FROM_VALUE_EDEFAULT == null ? fromValue != null : !FROM_VALUE_EDEFAULT.equals(fromValue);
		case MeshPackage.FADE_TRANSITION__TO_VALUE:
			return TO_VALUE_EDEFAULT == null ? toValue != null : !TO_VALUE_EDEFAULT.equals(toValue);
		case MeshPackage.FADE_TRANSITION__AUTO_REVERSE:
			return AUTO_REVERSE_EDEFAULT == null ? autoReverse != null : !AUTO_REVERSE_EDEFAULT.equals(autoReverse);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fromValue: ");
		result.append(fromValue);
		result.append(", toValue: ");
		result.append(toValue);
		result.append(", autoReverse: ");
		result.append(autoReverse);
		result.append(')');
		return result.toString();
	}

} //FadeTransitionImpl
