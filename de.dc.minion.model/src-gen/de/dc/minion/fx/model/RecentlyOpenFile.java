/**
 */
package de.dc.minion.fx.model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recently Open File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.fx.model.RecentlyOpenFile#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.RecentlyOpenFile#getPath <em>Path</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.RecentlyOpenFile#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.fx.model.MinionPackage#getRecentlyOpenFile()
 * @model
 * @generated
 */
public interface RecentlyOpenFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.minion.fx.model.MinionPackage#getRecentlyOpenFile_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.minion.fx.model.RecentlyOpenFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.dc.minion.fx.model.MinionPackage#getRecentlyOpenFile_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.dc.minion.fx.model.RecentlyOpenFile#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see de.dc.minion.fx.model.MinionPackage#getRecentlyOpenFile_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link de.dc.minion.fx.model.RecentlyOpenFile#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // RecentlyOpenFile
