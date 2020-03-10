/**
 */
package de.dc.minion.fx.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command History Touch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * EMF Command Undo Redo Model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.fx.model.CommandHistoryTouch#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.fx.model.MinionPackage#getCommandHistoryTouch()
 * @model
 * @generated
 */
public interface CommandHistoryTouch extends Vision {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.minion.fx.model.EmfCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see de.dc.minion.fx.model.MinionPackage#getCommandHistoryTouch_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmfCommand> getCommands();

} // CommandHistoryTouch
