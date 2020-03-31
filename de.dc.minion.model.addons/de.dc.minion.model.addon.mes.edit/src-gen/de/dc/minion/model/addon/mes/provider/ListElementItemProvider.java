/**
 */
package de.dc.minion.model.addon.mes.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dc.minion.model.addon.mes.ListElement;
import de.dc.minion.model.addon.mes.MesFactory;
import de.dc.minion.model.addon.mes.MesPackage;

/**
 * This is the item provider adapter for a {@link de.dc.minion.model.addon.mes.ListElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListElementItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListElementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MesPackage.Literals.LIST_ELEMENT__ITEMS);
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
		String label = ((ListElement<?>) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ListElement_type")
				: getString("_UI_ListElement_type") + " " + label;
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

		switch (notification.getFeatureID(ListElement.class)) {
		case MesPackage.LIST_ELEMENT__ITEMS:
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

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createMes()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				MesFactory.eINSTANCE.createApplicationList()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				MesFactory.eINSTANCE.createAccessPrivilegeList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createFilterList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createTaskList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createFormList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createListList()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				MesFactory.eINSTANCE.createConfigurationList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createStatusList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createUserList()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				MesFactory.eINSTANCE.createUserGroupList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createReportList()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				MesFactory.eINSTANCE.createStateModelList()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				MesFactory.eINSTANCE.createMesssagesList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createLocaleList()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				MesFactory.eINSTANCE.createDataTableList()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createStatus()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createDataTable()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createLocale()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createMessages()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createState()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createReport()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createStatusItem()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createUserGroup()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createUser()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createListItem()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createForm()));

		newChildDescriptors
				.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createTask()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				MesFactory.eINSTANCE.createApplication()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				MesFactory.eINSTANCE.createAccessPrivilege()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, MesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add(
				createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS, EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add(createChildParameter(MesPackage.Literals.LIST_ELEMENT__ITEMS,
				EcoreFactory.eINSTANCE.createETypeParameter()));
	}

}
