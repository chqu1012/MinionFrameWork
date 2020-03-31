/**
 */
package de.dc.minion.model.addon.mesh.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dc.minion.model.addon.mesh.Box;
import de.dc.minion.model.addon.mesh.MeshPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.mesh.impl.BoxImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.mesh.impl.BoxImpl#getPositionZ <em>Position Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoxImpl extends RectangleImpl implements Box {
	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Double DEPTH_EDEFAULT = new Double(200.0);

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected Double depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double POSITION_Z_EDEFAULT = new Double(10.0);

	/**
	 * The cached value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected Double positionZ = POSITION_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeshPackage.Literals.BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepth(Double newDepth) {
		Double oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.BOX__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getPositionZ() {
		return positionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionZ(Double newPositionZ) {
		Double oldPositionZ = positionZ;
		positionZ = newPositionZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.BOX__POSITION_Z, oldPositionZ,
					positionZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MeshPackage.BOX__DEPTH:
			return getDepth();
		case MeshPackage.BOX__POSITION_Z:
			return getPositionZ();
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
		case MeshPackage.BOX__DEPTH:
			setDepth((Double) newValue);
			return;
		case MeshPackage.BOX__POSITION_Z:
			setPositionZ((Double) newValue);
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
		case MeshPackage.BOX__DEPTH:
			setDepth(DEPTH_EDEFAULT);
			return;
		case MeshPackage.BOX__POSITION_Z:
			setPositionZ(POSITION_Z_EDEFAULT);
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
		case MeshPackage.BOX__DEPTH:
			return DEPTH_EDEFAULT == null ? depth != null : !DEPTH_EDEFAULT.equals(depth);
		case MeshPackage.BOX__POSITION_Z:
			return POSITION_Z_EDEFAULT == null ? positionZ != null : !POSITION_Z_EDEFAULT.equals(positionZ);
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
		result.append(" (depth: ");
		result.append(depth);
		result.append(", positionZ: ");
		result.append(positionZ);
		result.append(')');
		return result.toString();
	}

} //BoxImpl
