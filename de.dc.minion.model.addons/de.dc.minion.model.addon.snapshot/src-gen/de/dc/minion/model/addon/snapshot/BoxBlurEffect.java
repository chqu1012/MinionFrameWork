/**
 */
package de.dc.minion.model.addon.snapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box Blur Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.BoxBlurEffect#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.BoxBlurEffect#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.BoxBlurEffect#getIterations <em>Iterations</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBoxBlurEffect()
 * @model
 * @generated
 */
public interface BoxBlurEffect extends FXEffect {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBoxBlurEffect_Height()
	 * @model unique="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.BoxBlurEffect#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBoxBlurEffect_Width()
	 * @model unique="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.BoxBlurEffect#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #setIterations(int)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBoxBlurEffect_Iterations()
	 * @model unique="false"
	 * @generated
	 */
	int getIterations();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.BoxBlurEffect#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(int value);

} // BoxBlurEffect
