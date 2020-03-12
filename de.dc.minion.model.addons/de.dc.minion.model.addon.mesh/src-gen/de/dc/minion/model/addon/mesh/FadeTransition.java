/**
 */
package de.dc.minion.model.addon.mesh;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fade Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.mesh.FadeTransition#getFromValue <em>From Value</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.mesh.FadeTransition#getToValue <em>To Value</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.mesh.FadeTransition#getAutoReverse <em>Auto Reverse</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.mesh.MeshPackage#getFadeTransition()
 * @model
 * @generated
 */
public interface FadeTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>From Value</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Value</em>' attribute.
	 * @see #setFromValue(Double)
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getFadeTransition_FromValue()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	Double getFromValue();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.mesh.FadeTransition#getFromValue <em>From Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Value</em>' attribute.
	 * @see #getFromValue()
	 * @generated
	 */
	void setFromValue(Double value);

	/**
	 * Returns the value of the '<em><b>To Value</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Value</em>' attribute.
	 * @see #setToValue(Double)
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getFadeTransition_ToValue()
	 * @model default="0.1" unique="false"
	 * @generated
	 */
	Double getToValue();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.mesh.FadeTransition#getToValue <em>To Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Value</em>' attribute.
	 * @see #getToValue()
	 * @generated
	 */
	void setToValue(Double value);

	/**
	 * Returns the value of the '<em><b>Auto Reverse</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Reverse</em>' attribute.
	 * @see #setAutoReverse(Boolean)
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getFadeTransition_AutoReverse()
	 * @model default="true" unique="false"
	 * @generated
	 */
	Boolean getAutoReverse();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.mesh.FadeTransition#getAutoReverse <em>Auto Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Reverse</em>' attribute.
	 * @see #getAutoReverse()
	 * @generated
	 */
	void setAutoReverse(Boolean value);

} // FadeTransition
