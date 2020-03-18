/**
 */
package de.dc.minion.model.addon.mes.provider;

import de.dc.minion.model.addon.mes.Mes;
import de.dc.minion.model.addon.mes.MesFactory;
import de.dc.minion.model.addon.mes.MesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.minion.model.addon.mes.Mes} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MesItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MesItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(MesPackage.Literals.MES__LISTS);
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
	 * This returns Mes.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mes"));
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
		return getString("_UI_Mes_type");
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

		switch (notification.getFeatureID(Mes.class)) {
		case MesPackage.MES__LISTS:
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

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createApplicationList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createAccessPrivilegeList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createFilterList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createTaskList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createFormList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createListList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createConfigurationList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createStatusList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createUserList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createUserGroupList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createReportList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createStateModelList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createMesssagesList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createLocaleList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createDataTableList()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.MES__LISTS, MesFactory.eINSTANCE.createStatus()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MesEditPlugin.INSTANCE;
	}

}
