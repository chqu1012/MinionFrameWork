/**
 */
package de.dc.minion.model.addon.snapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inner Shadow Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getBlurType <em>Blur Type</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#isChangeIsLocal <em>Change Is Local</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getColor <em>Color</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getChoke <em>Choke</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getOffsetY <em>Offset Y</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getSpread <em>Spread</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect()
 * @model
 * @generated
 */
public interface InnerShadowEffect extends FXEffect {
	/**
	 * Returns the value of the '<em><b>Blur Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.minion.model.addon.snapshot.BlurType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blur Type</em>' attribute.
	 * @see de.dc.minion.model.addon.snapshot.BlurType
	 * @see #setBlurType(BlurType)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_BlurType()
	 * @model unique="false"
	 * @generated
	 */
	BlurType getBlurType();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getBlurType <em>Blur Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blur Type</em>' attribute.
	 * @see de.dc.minion.model.addon.snapshot.BlurType
	 * @see #getBlurType()
	 * @generated
	 */
	void setBlurType(BlurType value);

	/**
	 * Returns the value of the '<em><b>Change Is Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Is Local</em>' attribute.
	 * @see #setChangeIsLocal(boolean)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_ChangeIsLocal()
	 * @model unique="false"
	 * @generated
	 */
	boolean isChangeIsLocal();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#isChangeIsLocal <em>Change Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Is Local</em>' attribute.
	 * @see #isChangeIsLocal()
	 * @generated
	 */
	void setChangeIsLocal(boolean value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Choke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choke</em>' attribute.
	 * @see #setChoke(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_Choke()
	 * @model unique="false"
	 * @generated
	 */
	double getChoke();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getChoke <em>Choke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choke</em>' attribute.
	 * @see #getChoke()
	 * @generated
	 */
	void setChoke(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_Height()
	 * @model unique="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset X</em>' attribute.
	 * @see #setOffsetX(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_OffsetX()
	 * @model unique="false"
	 * @generated
	 */
	double getOffsetX();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getOffsetX <em>Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset X</em>' attribute.
	 * @see #getOffsetX()
	 * @generated
	 */
	void setOffsetX(double value);

	/**
	 * Returns the value of the '<em><b>Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Y</em>' attribute.
	 * @see #setOffsetY(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_OffsetY()
	 * @model unique="false"
	 * @generated
	 */
	double getOffsetY();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getOffsetY <em>Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Y</em>' attribute.
	 * @see #getOffsetY()
	 * @generated
	 */
	void setOffsetY(double value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_Radius()
	 * @model unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Spread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spread</em>' attribute.
	 * @see #setSpread(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_Spread()
	 * @model unique="false"
	 * @generated
	 */
	double getSpread();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getSpread <em>Spread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spread</em>' attribute.
	 * @see #getSpread()
	 * @generated
	 */
	void setSpread(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getInnerShadowEffect_Width()
	 * @model unique="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.InnerShadowEffect#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

} // InnerShadowEffect
