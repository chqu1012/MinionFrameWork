/**
 */
package de.dc.minion.model.addon.snapshot.impl;

import de.dc.minion.model.addon.snapshot.ReflectionEffect;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflection Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ReflectionEffectImpl#getBottomOpacity <em>Bottom Opacity</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ReflectionEffectImpl#getFraction <em>Fraction</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ReflectionEffectImpl#getTopOffset <em>Top Offset</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ReflectionEffectImpl#getTopOpacity <em>Top Opacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReflectionEffectImpl extends FXEffectImpl implements ReflectionEffect {
	/**
	 * The default value of the '{@link #getBottomOpacity() <em>Bottom Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_OPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBottomOpacity() <em>Bottom Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomOpacity()
	 * @generated
	 * @ordered
	 */
	protected double bottomOpacity = BOTTOM_OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected static final double FRACTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected double fraction = FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopOffset() <em>Top Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopOffset() <em>Top Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopOffset()
	 * @generated
	 * @ordered
	 */
	protected double topOffset = TOP_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopOpacity() <em>Top Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_OPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopOpacity() <em>Top Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopOpacity()
	 * @generated
	 * @ordered
	 */
	protected double topOpacity = TOP_OPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflectionEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnapshotPackage.Literals.REFLECTION_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBottomOpacity() {
		return bottomOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBottomOpacity(double newBottomOpacity) {
		double oldBottomOpacity = bottomOpacity;
		bottomOpacity = newBottomOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.REFLECTION_EFFECT__BOTTOM_OPACITY,
					oldBottomOpacity, bottomOpacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFraction() {
		return fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFraction(double newFraction) {
		double oldFraction = fraction;
		fraction = newFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.REFLECTION_EFFECT__FRACTION,
					oldFraction, fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTopOffset() {
		return topOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopOffset(double newTopOffset) {
		double oldTopOffset = topOffset;
		topOffset = newTopOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.REFLECTION_EFFECT__TOP_OFFSET,
					oldTopOffset, topOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTopOpacity() {
		return topOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopOpacity(double newTopOpacity) {
		double oldTopOpacity = topOpacity;
		topOpacity = newTopOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.REFLECTION_EFFECT__TOP_OPACITY,
					oldTopOpacity, topOpacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SnapshotPackage.REFLECTION_EFFECT__BOTTOM_OPACITY:
			return getBottomOpacity();
		case SnapshotPackage.REFLECTION_EFFECT__FRACTION:
			return getFraction();
		case SnapshotPackage.REFLECTION_EFFECT__TOP_OFFSET:
			return getTopOffset();
		case SnapshotPackage.REFLECTION_EFFECT__TOP_OPACITY:
			return getTopOpacity();
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
		case SnapshotPackage.REFLECTION_EFFECT__BOTTOM_OPACITY:
			setBottomOpacity((Double) newValue);
			return;
		case SnapshotPackage.REFLECTION_EFFECT__FRACTION:
			setFraction((Double) newValue);
			return;
		case SnapshotPackage.REFLECTION_EFFECT__TOP_OFFSET:
			setTopOffset((Double) newValue);
			return;
		case SnapshotPackage.REFLECTION_EFFECT__TOP_OPACITY:
			setTopOpacity((Double) newValue);
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
		case SnapshotPackage.REFLECTION_EFFECT__BOTTOM_OPACITY:
			setBottomOpacity(BOTTOM_OPACITY_EDEFAULT);
			return;
		case SnapshotPackage.REFLECTION_EFFECT__FRACTION:
			setFraction(FRACTION_EDEFAULT);
			return;
		case SnapshotPackage.REFLECTION_EFFECT__TOP_OFFSET:
			setTopOffset(TOP_OFFSET_EDEFAULT);
			return;
		case SnapshotPackage.REFLECTION_EFFECT__TOP_OPACITY:
			setTopOpacity(TOP_OPACITY_EDEFAULT);
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
		case SnapshotPackage.REFLECTION_EFFECT__BOTTOM_OPACITY:
			return bottomOpacity != BOTTOM_OPACITY_EDEFAULT;
		case SnapshotPackage.REFLECTION_EFFECT__FRACTION:
			return fraction != FRACTION_EDEFAULT;
		case SnapshotPackage.REFLECTION_EFFECT__TOP_OFFSET:
			return topOffset != TOP_OFFSET_EDEFAULT;
		case SnapshotPackage.REFLECTION_EFFECT__TOP_OPACITY:
			return topOpacity != TOP_OPACITY_EDEFAULT;
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
		result.append(" (bottomOpacity: ");
		result.append(bottomOpacity);
		result.append(", fraction: ");
		result.append(fraction);
		result.append(", topOffset: ");
		result.append(topOffset);
		result.append(", topOpacity: ");
		result.append(topOpacity);
		result.append(')');
		return result.toString();
	}

} //ReflectionEffectImpl
