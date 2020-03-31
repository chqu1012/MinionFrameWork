/**
 */
package de.dc.minion.model.addon.mesh;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.mesh.Transition#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.mesh.Transition#getTransitionShapes <em>Transition Shapes</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.mesh.MeshPackage#getTransition()
 * @model abstract="true"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getTransition_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.mesh.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transition Shapes</b></em>' reference list.
	 * The list contents are of type {@link de.dc.minion.model.addon.mesh.Shape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Shapes</em>' reference list.
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getTransition_TransitionShapes()
	 * @model
	 * @generated
	 */
	EList<Shape> getTransitionShapes();

} // Transition
