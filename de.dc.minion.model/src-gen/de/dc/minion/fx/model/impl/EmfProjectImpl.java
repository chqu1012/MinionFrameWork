/**
 */
package de.dc.minion.fx.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dc.minion.fx.model.EmfAttribute;
import de.dc.minion.fx.model.EmfProject;
import de.dc.minion.fx.model.MinionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.fx.model.impl.EmfProjectImpl#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.impl.EmfProjectImpl#getEfactory <em>Efactory</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.impl.EmfProjectImpl#getModelItemProviderAdapterFactory <em>Model Item Provider Adapter Factory</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.impl.EmfProjectImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.impl.EmfProjectImpl#getRootElementPackage <em>Root Element Package</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.impl.EmfProjectImpl#getExportPath <em>Export Path</em>}</li>
 *   <li>{@link de.dc.minion.fx.model.impl.EmfProjectImpl#getEditingAttributes <em>Editing Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfProjectImpl extends MinimalEObjectImpl.Container implements EmfProject {
	/**
	 * The default value of the '{@link #getEPackage() <em>EPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String EPACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
	protected String ePackage = EPACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfactory() <em>Efactory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfactory()
	 * @generated
	 * @ordered
	 */
	protected static final String EFACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfactory() <em>Efactory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfactory()
	 * @generated
	 * @ordered
	 */
	protected String efactory = EFACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelItemProviderAdapterFactory() <em>Model Item Provider Adapter Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelItemProviderAdapterFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ITEM_PROVIDER_ADAPTER_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelItemProviderAdapterFactory() <em>Model Item Provider Adapter Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelItemProviderAdapterFactory()
	 * @generated
	 * @ordered
	 */
	protected String modelItemProviderAdapterFactory = MODEL_ITEM_PROVIDER_ADAPTER_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootElement() <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected String rootElement = ROOT_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootElementPackage() <em>Root Element Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElementPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_ELEMENT_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootElementPackage() <em>Root Element Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElementPackage()
	 * @generated
	 * @ordered
	 */
	protected String rootElementPackage = ROOT_ELEMENT_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExportPath() <em>Export Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportPath()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExportPath() <em>Export Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportPath()
	 * @generated
	 * @ordered
	 */
	protected String exportPath = EXPORT_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEditingAttributes() <em>Editing Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditingAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EmfAttribute> editingAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinionPackage.Literals.EMF_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEPackage() {
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEPackage(String newEPackage) {
		String oldEPackage = ePackage;
		ePackage = newEPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinionPackage.EMF_PROJECT__EPACKAGE, oldEPackage,
					ePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEfactory() {
		return efactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEfactory(String newEfactory) {
		String oldEfactory = efactory;
		efactory = newEfactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinionPackage.EMF_PROJECT__EFACTORY, oldEfactory,
					efactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelItemProviderAdapterFactory() {
		return modelItemProviderAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelItemProviderAdapterFactory(String newModelItemProviderAdapterFactory) {
		String oldModelItemProviderAdapterFactory = modelItemProviderAdapterFactory;
		modelItemProviderAdapterFactory = newModelItemProviderAdapterFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MinionPackage.EMF_PROJECT__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY, oldModelItemProviderAdapterFactory,
					modelItemProviderAdapterFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootElement(String newRootElement) {
		String oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinionPackage.EMF_PROJECT__ROOT_ELEMENT,
					oldRootElement, rootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootElementPackage() {
		return rootElementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootElementPackage(String newRootElementPackage) {
		String oldRootElementPackage = rootElementPackage;
		rootElementPackage = newRootElementPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinionPackage.EMF_PROJECT__ROOT_ELEMENT_PACKAGE,
					oldRootElementPackage, rootElementPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExportPath() {
		return exportPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExportPath(String newExportPath) {
		String oldExportPath = exportPath;
		exportPath = newExportPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinionPackage.EMF_PROJECT__EXPORT_PATH, oldExportPath,
					exportPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmfAttribute> getEditingAttributes() {
		if (editingAttributes == null) {
			editingAttributes = new EObjectContainmentEList<EmfAttribute>(EmfAttribute.class, this,
					MinionPackage.EMF_PROJECT__EDITING_ATTRIBUTES);
		}
		return editingAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MinionPackage.EMF_PROJECT__EDITING_ATTRIBUTES:
			return ((InternalEList<?>) getEditingAttributes()).basicRemove(otherEnd, msgs);
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
		case MinionPackage.EMF_PROJECT__EPACKAGE:
			return getEPackage();
		case MinionPackage.EMF_PROJECT__EFACTORY:
			return getEfactory();
		case MinionPackage.EMF_PROJECT__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
			return getModelItemProviderAdapterFactory();
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT:
			return getRootElement();
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT_PACKAGE:
			return getRootElementPackage();
		case MinionPackage.EMF_PROJECT__EXPORT_PATH:
			return getExportPath();
		case MinionPackage.EMF_PROJECT__EDITING_ATTRIBUTES:
			return getEditingAttributes();
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
		case MinionPackage.EMF_PROJECT__EPACKAGE:
			setEPackage((String) newValue);
			return;
		case MinionPackage.EMF_PROJECT__EFACTORY:
			setEfactory((String) newValue);
			return;
		case MinionPackage.EMF_PROJECT__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
			setModelItemProviderAdapterFactory((String) newValue);
			return;
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT:
			setRootElement((String) newValue);
			return;
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT_PACKAGE:
			setRootElementPackage((String) newValue);
			return;
		case MinionPackage.EMF_PROJECT__EXPORT_PATH:
			setExportPath((String) newValue);
			return;
		case MinionPackage.EMF_PROJECT__EDITING_ATTRIBUTES:
			getEditingAttributes().clear();
			getEditingAttributes().addAll((Collection<? extends EmfAttribute>) newValue);
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
		case MinionPackage.EMF_PROJECT__EPACKAGE:
			setEPackage(EPACKAGE_EDEFAULT);
			return;
		case MinionPackage.EMF_PROJECT__EFACTORY:
			setEfactory(EFACTORY_EDEFAULT);
			return;
		case MinionPackage.EMF_PROJECT__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
			setModelItemProviderAdapterFactory(MODEL_ITEM_PROVIDER_ADAPTER_FACTORY_EDEFAULT);
			return;
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT:
			setRootElement(ROOT_ELEMENT_EDEFAULT);
			return;
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT_PACKAGE:
			setRootElementPackage(ROOT_ELEMENT_PACKAGE_EDEFAULT);
			return;
		case MinionPackage.EMF_PROJECT__EXPORT_PATH:
			setExportPath(EXPORT_PATH_EDEFAULT);
			return;
		case MinionPackage.EMF_PROJECT__EDITING_ATTRIBUTES:
			getEditingAttributes().clear();
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
		case MinionPackage.EMF_PROJECT__EPACKAGE:
			return EPACKAGE_EDEFAULT == null ? ePackage != null : !EPACKAGE_EDEFAULT.equals(ePackage);
		case MinionPackage.EMF_PROJECT__EFACTORY:
			return EFACTORY_EDEFAULT == null ? efactory != null : !EFACTORY_EDEFAULT.equals(efactory);
		case MinionPackage.EMF_PROJECT__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
			return MODEL_ITEM_PROVIDER_ADAPTER_FACTORY_EDEFAULT == null ? modelItemProviderAdapterFactory != null
					: !MODEL_ITEM_PROVIDER_ADAPTER_FACTORY_EDEFAULT.equals(modelItemProviderAdapterFactory);
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT:
			return ROOT_ELEMENT_EDEFAULT == null ? rootElement != null : !ROOT_ELEMENT_EDEFAULT.equals(rootElement);
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT_PACKAGE:
			return ROOT_ELEMENT_PACKAGE_EDEFAULT == null ? rootElementPackage != null
					: !ROOT_ELEMENT_PACKAGE_EDEFAULT.equals(rootElementPackage);
		case MinionPackage.EMF_PROJECT__EXPORT_PATH:
			return EXPORT_PATH_EDEFAULT == null ? exportPath != null : !EXPORT_PATH_EDEFAULT.equals(exportPath);
		case MinionPackage.EMF_PROJECT__EDITING_ATTRIBUTES:
			return editingAttributes != null && !editingAttributes.isEmpty();
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
		result.append(" (ePackage: ");
		result.append(ePackage);
		result.append(", efactory: ");
		result.append(efactory);
		result.append(", modelItemProviderAdapterFactory: ");
		result.append(modelItemProviderAdapterFactory);
		result.append(", rootElement: ");
		result.append(rootElement);
		result.append(", rootElementPackage: ");
		result.append(rootElementPackage);
		result.append(", exportPath: ");
		result.append(exportPath);
		result.append(')');
		return result.toString();
	}

} //EmfProjectImpl
