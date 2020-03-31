/**
 */
package de.dc.minion.model.addon.restaurant.reservation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.dc.minion.model.addon.restaurant.reservation.ReservationPackage;
import de.dc.minion.model.addon.restaurant.reservation.Style;
import de.dc.minion.model.addon.restaurant.reservation.StyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.impl.StyleImpl#getStyleType <em>Style Type</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.impl.StyleImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleImpl extends MinimalEObjectImpl.Container implements Style {
	/**
	 * The default value of the '{@link #getStyleType() <em>Style Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleType()
	 * @generated
	 * @ordered
	 */
	protected static final StyleType STYLE_TYPE_EDEFAULT = StyleType.BACKGROUND_COLOR;

	/**
	 * The cached value of the '{@link #getStyleType() <em>Style Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleType()
	 * @generated
	 * @ordered
	 */
	protected StyleType styleType = STYLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleType getStyleType() {
		return styleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleType(StyleType newStyleType) {
		StyleType oldStyleType = styleType;
		styleType = newStyleType == null ? STYLE_TYPE_EDEFAULT : newStyleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.STYLE__STYLE_TYPE, oldStyleType,
					styleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.STYLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReservationPackage.STYLE__STYLE_TYPE:
			return getStyleType();
		case ReservationPackage.STYLE__VALUE:
			return getValue();
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
		case ReservationPackage.STYLE__STYLE_TYPE:
			setStyleType((StyleType) newValue);
			return;
		case ReservationPackage.STYLE__VALUE:
			setValue((String) newValue);
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
		case ReservationPackage.STYLE__STYLE_TYPE:
			setStyleType(STYLE_TYPE_EDEFAULT);
			return;
		case ReservationPackage.STYLE__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case ReservationPackage.STYLE__STYLE_TYPE:
			return styleType != STYLE_TYPE_EDEFAULT;
		case ReservationPackage.STYLE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (styleType: ");
		result.append(styleType);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //StyleImpl
