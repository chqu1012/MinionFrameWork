/**
 */
package de.dc.minion.fx.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dc.minion.fx.model.MinionPackage;
import de.dc.minion.fx.model.RecentlyOpenFile;
import de.dc.minion.fx.model.RecentlyOpenVision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recently Open Vision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.fx.model.impl.RecentlyOpenVisionImpl#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecentlyOpenVisionImpl extends VisionImpl implements RecentlyOpenVision {
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<RecentlyOpenFile> files;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecentlyOpenVisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinionPackage.Literals.RECENTLY_OPEN_VISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecentlyOpenFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<RecentlyOpenFile>(RecentlyOpenFile.class, this,
					MinionPackage.RECENTLY_OPEN_VISION__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MinionPackage.RECENTLY_OPEN_VISION__FILES:
			return ((InternalEList<?>) getFiles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MinionPackage.RECENTLY_OPEN_VISION__FILES:
			return getFiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MinionPackage.RECENTLY_OPEN_VISION__FILES:
			getFiles().clear();
			getFiles().addAll((Collection<? extends RecentlyOpenFile>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MinionPackage.RECENTLY_OPEN_VISION__FILES:
			getFiles().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MinionPackage.RECENTLY_OPEN_VISION__FILES:
			return files != null && !files.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecentlyOpenVisionImpl
