/**
 */
package de.dc.minion.fx.model.impl;

import de.dc.minion.fx.model.MinionPackage;
import de.dc.minion.fx.model.RecentlyOpenFile;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recently Open File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.fx.model.impl.RecentlyOpenFileImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.impl.RecentlyOpenFileImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.impl.RecentlyOpenFileImpl#getLandscapeId <em>Landscape Id</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.impl.RecentlyOpenFileImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecentlyOpenFileImpl extends MinimalEObjectImpl.Container implements RecentlyOpenFile {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLandscapeId() <em>Landscape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandscapeId()
	 * @generated
	 * @ordered
	 */
	protected static final String LANDSCAPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLandscapeId() <em>Landscape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandscapeId()
	 * @generated
	 * @ordered
	 */
	protected String landscapeId = LANDSCAPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecentlyOpenFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinionPackage.Literals.RECENTLY_OPEN_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinionPackage.RECENTLY_OPEN_FILE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinionPackage.RECENTLY_OPEN_FILE__PATH, oldPath,
					path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLandscapeId() {
		return landscapeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLandscapeId(String newLandscapeId) {
		String oldLandscapeId = landscapeId;
		landscapeId = newLandscapeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinionPackage.RECENTLY_OPEN_FILE__LANDSCAPE_ID,
					oldLandscapeId, landscapeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinionPackage.RECENTLY_OPEN_FILE__TIMESTAMP,
					oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MinionPackage.RECENTLY_OPEN_FILE__NAME:
			return getName();
		case MinionPackage.RECENTLY_OPEN_FILE__PATH:
			return getPath();
		case MinionPackage.RECENTLY_OPEN_FILE__LANDSCAPE_ID:
			return getLandscapeId();
		case MinionPackage.RECENTLY_OPEN_FILE__TIMESTAMP:
			return getTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MinionPackage.RECENTLY_OPEN_FILE__NAME:
			setName((String) newValue);
			return;
		case MinionPackage.RECENTLY_OPEN_FILE__PATH:
			setPath((String) newValue);
			return;
		case MinionPackage.RECENTLY_OPEN_FILE__LANDSCAPE_ID:
			setLandscapeId((String) newValue);
			return;
		case MinionPackage.RECENTLY_OPEN_FILE__TIMESTAMP:
			setTimestamp((Date) newValue);
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
		case MinionPackage.RECENTLY_OPEN_FILE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MinionPackage.RECENTLY_OPEN_FILE__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case MinionPackage.RECENTLY_OPEN_FILE__LANDSCAPE_ID:
			setLandscapeId(LANDSCAPE_ID_EDEFAULT);
			return;
		case MinionPackage.RECENTLY_OPEN_FILE__TIMESTAMP:
			setTimestamp(TIMESTAMP_EDEFAULT);
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
		case MinionPackage.RECENTLY_OPEN_FILE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MinionPackage.RECENTLY_OPEN_FILE__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case MinionPackage.RECENTLY_OPEN_FILE__LANDSCAPE_ID:
			return LANDSCAPE_ID_EDEFAULT == null ? landscapeId != null : !LANDSCAPE_ID_EDEFAULT.equals(landscapeId);
		case MinionPackage.RECENTLY_OPEN_FILE__TIMESTAMP:
			return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(", landscapeId: ");
		result.append(landscapeId);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //RecentlyOpenFileImpl
