/**
 */
package de.dc.minion.model.addon.mesh;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.mesh.Timeline#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.mesh.Timeline#getPlay <em>Play</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.mesh.MeshPackage#getTimeline()
 * @model
 * @generated
 */
public interface Timeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getTimeline_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.mesh.Timeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Play</b></em>' reference list.
	 * The list contents are of type {@link de.dc.minion.model.addon.mesh.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play</em>' reference list.
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getTimeline_Play()
	 * @model
	 * @generated
	 */
	EList<Transition> getPlay();

} // Timeline
