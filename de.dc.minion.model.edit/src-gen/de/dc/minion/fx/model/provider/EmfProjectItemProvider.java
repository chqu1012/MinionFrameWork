/**
 */
package de.dc.minion.fx.model.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dc.minion.fx.model.EmfProject;
import de.dc.minion.fx.model.MinionFactory;
import de.dc.minion.fx.model.MinionPackage;

/**
 * This is the item provider adapter for a {@link de.dc.minion.fx.model.EmfProject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfProjectItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfProjectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEPackagePropertyDescriptor(object);
			addEfactoryPropertyDescriptor(object);
			addModelItemProviderAdapterFactoryPropertyDescriptor(object);
			addRootElementPropertyDescriptor(object);
			addRootElementPackagePropertyDescriptor(object);
			addExportPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the EPackage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EmfProject_ePackage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EmfProject_ePackage_feature",
								"_UI_EmfProject_type"),
						MinionPackage.Literals.EMF_PROJECT__EPACKAGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Efactory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfactoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EmfProject_efactory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EmfProject_efactory_feature",
								"_UI_EmfProject_type"),
						MinionPackage.Literals.EMF_PROJECT__EFACTORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Model Item Provider Adapter Factory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelItemProviderAdapterFactoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EmfProject_modelItemProviderAdapterFactory_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_EmfProject_modelItemProviderAdapterFactory_feature", "_UI_EmfProject_type"),
						MinionPackage.Literals.EMF_PROJECT__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Root Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EmfProject_rootElement_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EmfProject_rootElement_feature",
								"_UI_EmfProject_type"),
						MinionPackage.Literals.EMF_PROJECT__ROOT_ELEMENT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Root Element Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootElementPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EmfProject_rootElementPackage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EmfProject_rootElementPackage_feature",
								"_UI_EmfProject_type"),
						MinionPackage.Literals.EMF_PROJECT__ROOT_ELEMENT_PACKAGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Export Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExportPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EmfProject_exportPath_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EmfProject_exportPath_feature",
								"_UI_EmfProject_type"),
						MinionPackage.Literals.EMF_PROJECT__EXPORT_PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MinionPackage.Literals.EMF_PROJECT__EDITING_ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EmfProject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EmfProject"));
	}

	/**
	 * This returns <code>getImage(object)</code> for the column index <code>0</code> or <code>super.getImage(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText(Object)
	 * @see #getColumnText(Object, int)
	 * @generated
	 */
	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getImage(object) : super.getImage(object);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EmfProject) object).getEPackage();
		return label == null || label.length() == 0 ? getString("_UI_EmfProject_type")
				: getString("_UI_EmfProject_type") + " " + label;
	}

	/**
	 * This returns <code>getText(object)</code> for the column index <code>0</code> or <code>super.getText(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage(Object)
	 * @see #getColumnImage(Object, int)
	 * @generated
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getText(object) : super.getText(object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EmfProject.class)) {
		case MinionPackage.EMF_PROJECT__EPACKAGE:
		case MinionPackage.EMF_PROJECT__EFACTORY:
		case MinionPackage.EMF_PROJECT__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT:
		case MinionPackage.EMF_PROJECT__ROOT_ELEMENT_PACKAGE:
		case MinionPackage.EMF_PROJECT__EXPORT_PATH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MinionPackage.EMF_PROJECT__EDITING_ATTRIBUTES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MinionPackage.Literals.EMF_PROJECT__EDITING_ATTRIBUTES,
				MinionFactory.eINSTANCE.createEmfAttribute()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MinonEditPlugin.INSTANCE;
	}

}
