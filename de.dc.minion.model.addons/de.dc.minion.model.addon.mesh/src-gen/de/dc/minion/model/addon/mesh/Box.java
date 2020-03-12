/**
 */
package de.dc.minion.model.addon.mesh;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.mesh.Box#getDepth <em>Depth</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.mesh.Box#getPositionZ <em>Position Z</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.mesh.MeshPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends Rectangle {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(Double)
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getBox_Depth()
	 * @model default="200" unique="false"
	 * @generated
	 */
	Double getDepth();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.mesh.Box#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(Double value);

	/**
	 * Returns the value of the '<em><b>Position Z</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Z</em>' attribute.
	 * @see #setPositionZ(Double)
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getBox_PositionZ()
	 * @model default="10" unique="false"
	 * @generated
	 */
	Double getPositionZ();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.mesh.Box#getPositionZ <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Z</em>' attribute.
	 * @see #getPositionZ()
	 * @generated
	 */
	void setPositionZ(Double value);

} // Box
