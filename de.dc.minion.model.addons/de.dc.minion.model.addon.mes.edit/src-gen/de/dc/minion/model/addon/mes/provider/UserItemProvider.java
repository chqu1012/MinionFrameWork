/**
 */
package de.dc.minion.model.addon.mes.provider;

import de.dc.minion.model.addon.mes.MesPackage;
import de.dc.minion.model.addon.mes.User;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.minion.model.addon.mes.User} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserItemProvider(AdapterFactory adapterFactory) {
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

			addFirstnamePropertyDescriptor(object);
			addLastnamePropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addNotePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addPasswordDurationPropertyDescriptor(object);
			addPasswordExpirationPropertyDescriptor(object);
			addUserExpirationPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Firstname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_firstname_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_firstname_feature", "_UI_User_type"),
						MesPackage.Literals.USER__FIRSTNAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lastname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_lastname_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_lastname_feature", "_UI_User_type"),
						MesPackage.Literals.USER__LASTNAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_email_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_email_feature", "_UI_User_type"),
						MesPackage.Literals.USER__EMAIL, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Note feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_note_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_note_feature", "_UI_User_type"),
						MesPackage.Literals.USER__NOTE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_password_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_password_feature", "_UI_User_type"),
						MesPackage.Literals.USER__PASSWORD, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Password Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_passwordDuration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_passwordDuration_feature",
								"_UI_User_type"),
						MesPackage.Literals.USER__PASSWORD_DURATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Password Expiration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordExpirationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_passwordExpiration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_passwordExpiration_feature",
								"_UI_User_type"),
						MesPackage.Literals.USER__PASSWORD_EXPIRATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Expiration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserExpirationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_userExpiration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_userExpiration_feature",
								"_UI_User_type"),
						MesPackage.Literals.USER__USER_EXPIRATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_User_status_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_User_status_feature", "_UI_User_type"),
						MesPackage.Literals.USER__STATUS, true, false, true, null, null, null));
	}

	/**
	 * This returns User.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/User"));
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
		String label = ((User) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_User_type")
				: getString("_UI_User_type") + " " + label;
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

		switch (notification.getFeatureID(User.class)) {
		case MesPackage.USER__FIRSTNAME:
		case MesPackage.USER__LASTNAME:
		case MesPackage.USER__EMAIL:
		case MesPackage.USER__NOTE:
		case MesPackage.USER__PASSWORD:
		case MesPackage.USER__PASSWORD_DURATION:
		case MesPackage.USER__PASSWORD_EXPIRATION:
		case MesPackage.USER__USER_EXPIRATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
