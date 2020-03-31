/**
 */
package de.dc.minion.model.addon.restaurant.reservation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dc.minion.model.addon.restaurant.reservation.ReservationPackage;
import de.dc.minion.model.addon.restaurant.reservation.Wall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.impl.WallImpl#getStartx <em>Startx</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.impl.WallImpl#getStartY <em>Start Y</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.impl.WallImpl#getEndx <em>Endx</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.impl.WallImpl#getEndY <em>End Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallImpl extends LayoutItemImpl implements Wall {
	/**
	 * The default value of the '{@link #getStartx() <em>Startx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartx()
	 * @generated
	 * @ordered
	 */
	protected static final Double STARTX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartx() <em>Startx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartx()
	 * @generated
	 * @ordered
	 */
	protected Double startx = STARTX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartY() <em>Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartY()
	 * @generated
	 * @ordered
	 */
	protected static final Double START_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartY() <em>Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartY()
	 * @generated
	 * @ordered
	 */
	protected Double startY = START_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndx() <em>Endx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndx()
	 * @generated
	 * @ordered
	 */
	protected static final Double ENDX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndx() <em>Endx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndx()
	 * @generated
	 * @ordered
	 */
	protected Double endx = ENDX_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndY() <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndY()
	 * @generated
	 * @ordered
	 */
	protected static final Double END_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndY() <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndY()
	 * @generated
	 * @ordered
	 */
	protected Double endY = END_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.WALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getStartx() {
		return startx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartx(Double newStartx) {
		Double oldStartx = startx;
		startx = newStartx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.WALL__STARTX, oldStartx, startx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getStartY() {
		return startY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartY(Double newStartY) {
		Double oldStartY = startY;
		startY = newStartY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.WALL__START_Y, oldStartY, startY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getEndx() {
		return endx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndx(Double newEndx) {
		Double oldEndx = endx;
		endx = newEndx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.WALL__ENDX, oldEndx, endx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getEndY() {
		return endY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndY(Double newEndY) {
		Double oldEndY = endY;
		endY = newEndY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.WALL__END_Y, oldEndY, endY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReservationPackage.WALL__STARTX:
			return getStartx();
		case ReservationPackage.WALL__START_Y:
			return getStartY();
		case ReservationPackage.WALL__ENDX:
			return getEndx();
		case ReservationPackage.WALL__END_Y:
			return getEndY();
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
		case ReservationPackage.WALL__STARTX:
			setStartx((Double) newValue);
			return;
		case ReservationPackage.WALL__START_Y:
			setStartY((Double) newValue);
			return;
		case ReservationPackage.WALL__ENDX:
			setEndx((Double) newValue);
			return;
		case ReservationPackage.WALL__END_Y:
			setEndY((Double) newValue);
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
		case ReservationPackage.WALL__STARTX:
			setStartx(STARTX_EDEFAULT);
			return;
		case ReservationPackage.WALL__START_Y:
			setStartY(START_Y_EDEFAULT);
			return;
		case ReservationPackage.WALL__ENDX:
			setEndx(ENDX_EDEFAULT);
			return;
		case ReservationPackage.WALL__END_Y:
			setEndY(END_Y_EDEFAULT);
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
		case ReservationPackage.WALL__STARTX:
			return STARTX_EDEFAULT == null ? startx != null : !STARTX_EDEFAULT.equals(startx);
		case ReservationPackage.WALL__START_Y:
			return START_Y_EDEFAULT == null ? startY != null : !START_Y_EDEFAULT.equals(startY);
		case ReservationPackage.WALL__ENDX:
			return ENDX_EDEFAULT == null ? endx != null : !ENDX_EDEFAULT.equals(endx);
		case ReservationPackage.WALL__END_Y:
			return END_Y_EDEFAULT == null ? endY != null : !END_Y_EDEFAULT.equals(endY);
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
		result.append(" (startx: ");
		result.append(startx);
		result.append(", startY: ");
		result.append(startY);
		result.append(", endx: ");
		result.append(endx);
		result.append(", endY: ");
		result.append(endY);
		result.append(')');
		return result.toString();
	}

} //WallImpl
