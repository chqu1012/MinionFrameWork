/**
 */
package de.dc.minion.fx.model.provider;

import de.dc.minion.fx.model.Landscape;
import de.dc.minion.fx.model.MinionPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.minion.fx.model.Landscape} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LandscapeItemProvider extends TouchItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandscapeItemProvider(AdapterFactory adapterFactory) {
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

			addLeftPropertyDescriptor(object);
			addRightPropertyDescriptor(object);
			addBottomPropertyDescriptor(object);
			addCenterPropertyDescriptor(object);
			addUseAsPagePropertyDescriptor(object);
			addShowToolbarPropertyDescriptor(object);
			addShowStatusbarPropertyDescriptor(object);
			addShowMenubarPropertyDescriptor(object);
			addShowSearchPropertyDescriptor(object);
			addShowLandscapeSwitcherPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_left_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_left_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__LEFT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_right_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_right_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__RIGHT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Bottom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBottomPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_bottom_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_bottom_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__BOTTOM, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Center feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCenterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_center_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_center_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__CENTER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Use As Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseAsPagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_useAsPage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_useAsPage_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__USE_AS_PAGE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Show Toolbar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowToolbarPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_showToolbar_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_showToolbar_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__SHOW_TOOLBAR, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Show Statusbar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowStatusbarPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_showStatusbar_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_showStatusbar_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__SHOW_STATUSBAR, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Show Menubar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowMenubarPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_showMenubar_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_showMenubar_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__SHOW_MENUBAR, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Show Search feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowSearchPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_showSearch_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_showSearch_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__SHOW_SEARCH, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Show Landscape Switcher feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowLandscapeSwitcherPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Landscape_showLandscapeSwitcher_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Landscape_showLandscapeSwitcher_feature",
								"_UI_Landscape_type"),
						MinionPackage.Literals.LANDSCAPE__SHOW_LANDSCAPE_SWITCHER, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Landscape.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Landscape"));
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
		String label = ((Landscape) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Landscape_type")
				: getString("_UI_Landscape_type") + " " + label;
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

		switch (notification.getFeatureID(Landscape.class)) {
		case MinionPackage.LANDSCAPE__USE_AS_PAGE:
		case MinionPackage.LANDSCAPE__SHOW_TOOLBAR:
		case MinionPackage.LANDSCAPE__SHOW_STATUSBAR:
		case MinionPackage.LANDSCAPE__SHOW_MENUBAR:
		case MinionPackage.LANDSCAPE__SHOW_SEARCH:
		case MinionPackage.LANDSCAPE__SHOW_LANDSCAPE_SWITCHER:
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
