/**
 */
package de.dc.minion.model.addon.snapshot.impl;

import de.dc.minion.model.addon.snapshot.LightingEffect;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lighting Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.LightingEffectImpl#getDiffuseConstant <em>Diffuse Constant</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.LightingEffectImpl#getSpecularConstant <em>Specular Constant</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.LightingEffectImpl#getSpecularExponent <em>Specular Exponent</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.LightingEffectImpl#getSurfaceScale <em>Surface Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightingEffectImpl extends FXEffectImpl implements LightingEffect {
	/**
	 * The default value of the '{@link #getDiffuseConstant() <em>Diffuse Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseConstant()
	 * @generated
	 * @ordered
	 */
	protected static final double DIFFUSE_CONSTANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiffuseConstant() <em>Diffuse Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseConstant()
	 * @generated
	 * @ordered
	 */
	protected double diffuseConstant = DIFFUSE_CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecularConstant() <em>Specular Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularConstant()
	 * @generated
	 * @ordered
	 */
	protected static final double SPECULAR_CONSTANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpecularConstant() <em>Specular Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularConstant()
	 * @generated
	 * @ordered
	 */
	protected double specularConstant = SPECULAR_CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecularExponent() <em>Specular Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularExponent()
	 * @generated
	 * @ordered
	 */
	protected static final double SPECULAR_EXPONENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpecularExponent() <em>Specular Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularExponent()
	 * @generated
	 * @ordered
	 */
	protected double specularExponent = SPECULAR_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurfaceScale() <em>Surface Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SURFACE_SCALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSurfaceScale() <em>Surface Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceScale()
	 * @generated
	 * @ordered
	 */
	protected double surfaceScale = SURFACE_SCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightingEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnapshotPackage.Literals.LIGHTING_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiffuseConstant() {
		return diffuseConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiffuseConstant(double newDiffuseConstant) {
		double oldDiffuseConstant = diffuseConstant;
		diffuseConstant = newDiffuseConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.LIGHTING_EFFECT__DIFFUSE_CONSTANT,
					oldDiffuseConstant, diffuseConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSpecularConstant() {
		return specularConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecularConstant(double newSpecularConstant) {
		double oldSpecularConstant = specularConstant;
		specularConstant = newSpecularConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.LIGHTING_EFFECT__SPECULAR_CONSTANT,
					oldSpecularConstant, specularConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSpecularExponent() {
		return specularExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecularExponent(double newSpecularExponent) {
		double oldSpecularExponent = specularExponent;
		specularExponent = newSpecularExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.LIGHTING_EFFECT__SPECULAR_EXPONENT,
					oldSpecularExponent, specularExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSurfaceScale() {
		return surfaceScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurfaceScale(double newSurfaceScale) {
		double oldSurfaceScale = surfaceScale;
		surfaceScale = newSurfaceScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.LIGHTING_EFFECT__SURFACE_SCALE,
					oldSurfaceScale, surfaceScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SnapshotPackage.LIGHTING_EFFECT__DIFFUSE_CONSTANT:
			return getDiffuseConstant();
		case SnapshotPackage.LIGHTING_EFFECT__SPECULAR_CONSTANT:
			return getSpecularConstant();
		case SnapshotPackage.LIGHTING_EFFECT__SPECULAR_EXPONENT:
			return getSpecularExponent();
		case SnapshotPackage.LIGHTING_EFFECT__SURFACE_SCALE:
			return getSurfaceScale();
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
		case SnapshotPackage.LIGHTING_EFFECT__DIFFUSE_CONSTANT:
			setDiffuseConstant((Double) newValue);
			return;
		case SnapshotPackage.LIGHTING_EFFECT__SPECULAR_CONSTANT:
			setSpecularConstant((Double) newValue);
			return;
		case SnapshotPackage.LIGHTING_EFFECT__SPECULAR_EXPONENT:
			setSpecularExponent((Double) newValue);
			return;
		case SnapshotPackage.LIGHTING_EFFECT__SURFACE_SCALE:
			setSurfaceScale((Double) newValue);
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
		case SnapshotPackage.LIGHTING_EFFECT__DIFFUSE_CONSTANT:
			setDiffuseConstant(DIFFUSE_CONSTANT_EDEFAULT);
			return;
		case SnapshotPackage.LIGHTING_EFFECT__SPECULAR_CONSTANT:
			setSpecularConstant(SPECULAR_CONSTANT_EDEFAULT);
			return;
		case SnapshotPackage.LIGHTING_EFFECT__SPECULAR_EXPONENT:
			setSpecularExponent(SPECULAR_EXPONENT_EDEFAULT);
			return;
		case SnapshotPackage.LIGHTING_EFFECT__SURFACE_SCALE:
			setSurfaceScale(SURFACE_SCALE_EDEFAULT);
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
		case SnapshotPackage.LIGHTING_EFFECT__DIFFUSE_CONSTANT:
			return diffuseConstant != DIFFUSE_CONSTANT_EDEFAULT;
		case SnapshotPackage.LIGHTING_EFFECT__SPECULAR_CONSTANT:
			return specularConstant != SPECULAR_CONSTANT_EDEFAULT;
		case SnapshotPackage.LIGHTING_EFFECT__SPECULAR_EXPONENT:
			return specularExponent != SPECULAR_EXPONENT_EDEFAULT;
		case SnapshotPackage.LIGHTING_EFFECT__SURFACE_SCALE:
			return surfaceScale != SURFACE_SCALE_EDEFAULT;
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
		result.append(" (diffuseConstant: ");
		result.append(diffuseConstant);
		result.append(", specularConstant: ");
		result.append(specularConstant);
		result.append(", specularExponent: ");
		result.append(specularExponent);
		result.append(", surfaceScale: ");
		result.append(surfaceScale);
		result.append(')');
		return result.toString();
	}

} //LightingEffectImpl
