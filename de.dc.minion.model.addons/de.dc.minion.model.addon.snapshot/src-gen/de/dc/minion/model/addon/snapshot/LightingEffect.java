/**
 */
package de.dc.minion.model.addon.snapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lighting Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.LightingEffect#getDiffuseConstant <em>Diffuse Constant</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.LightingEffect#getSpecularConstant <em>Specular Constant</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.LightingEffect#getSpecularExponent <em>Specular Exponent</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.LightingEffect#getSurfaceScale <em>Surface Scale</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getLightingEffect()
 * @model
 * @generated
 */
public interface LightingEffect extends FXEffect {
	/**
	 * Returns the value of the '<em><b>Diffuse Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Constant</em>' attribute.
	 * @see #setDiffuseConstant(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getLightingEffect_DiffuseConstant()
	 * @model unique="false"
	 * @generated
	 */
	double getDiffuseConstant();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.LightingEffect#getDiffuseConstant <em>Diffuse Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Constant</em>' attribute.
	 * @see #getDiffuseConstant()
	 * @generated
	 */
	void setDiffuseConstant(double value);

	/**
	 * Returns the value of the '<em><b>Specular Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular Constant</em>' attribute.
	 * @see #setSpecularConstant(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getLightingEffect_SpecularConstant()
	 * @model unique="false"
	 * @generated
	 */
	double getSpecularConstant();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.LightingEffect#getSpecularConstant <em>Specular Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular Constant</em>' attribute.
	 * @see #getSpecularConstant()
	 * @generated
	 */
	void setSpecularConstant(double value);

	/**
	 * Returns the value of the '<em><b>Specular Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular Exponent</em>' attribute.
	 * @see #setSpecularExponent(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getLightingEffect_SpecularExponent()
	 * @model unique="false"
	 * @generated
	 */
	double getSpecularExponent();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.LightingEffect#getSpecularExponent <em>Specular Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular Exponent</em>' attribute.
	 * @see #getSpecularExponent()
	 * @generated
	 */
	void setSpecularExponent(double value);

	/**
	 * Returns the value of the '<em><b>Surface Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Scale</em>' attribute.
	 * @see #setSurfaceScale(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getLightingEffect_SurfaceScale()
	 * @model unique="false"
	 * @generated
	 */
	double getSurfaceScale();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.LightingEffect#getSurfaceScale <em>Surface Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Scale</em>' attribute.
	 * @see #getSurfaceScale()
	 * @generated
	 */
	void setSurfaceScale(double value);

} // LightingEffect
