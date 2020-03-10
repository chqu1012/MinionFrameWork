/**
 */
package de.dc.minion.fx.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.fx.model.EmfResult#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.EmfResult#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.fx.model.MinionPackage#getEmfResult()
 * @model
 * @generated
 */
public interface EmfResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.minion.fx.model.MinionPackage#getEmfResult_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.minion.fx.model.EmfResult#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(Object)
	 * @see de.dc.minion.fx.model.MinionPackage#getEmfResult_Object()
	 * @model unique="false"
	 * @generated
	 */
	Object getObject();

	/**
	 * Sets the value of the '{@link de.dc.minion.fx.model.EmfResult#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Object value);

} // EmfResult
