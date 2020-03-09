/**
 */
package de.dc.minion.fx.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recently Open Vision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.fx.model.RecentlyOpenVision#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.fx.model.MinionPackage#getRecentlyOpenVision()
 * @model
 * @generated
 */
public interface RecentlyOpenVision extends Vision {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.minion.fx.model.RecentlyOpenFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see de.dc.minion.fx.model.MinionPackage#getRecentlyOpenVision_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecentlyOpenFile> getFiles();

} // RecentlyOpenVision
