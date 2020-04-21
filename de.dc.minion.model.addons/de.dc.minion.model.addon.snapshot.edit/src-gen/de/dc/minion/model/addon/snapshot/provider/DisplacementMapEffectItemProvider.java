/**
 */
package de.dc.minion.model.addon.snapshot.provider;

import de.dc.minion.model.addon.snapshot.DisplacementMapEffect;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.minion.model.addon.snapshot.DisplacementMapEffect} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DisplacementMapEffectItemProvider extends FXEffectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplacementMapEffectItemProvider(AdapterFactory adapterFactory) {
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

			addOffsetXPropertyDescriptor(object);
			addOffsetYPropertyDescriptor(object);
			addScaleXPropertyDescriptor(object);
			addScaleYPropertyDescriptor(object);
			addWrapPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Offset X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DisplacementMapEffect_offsetX_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DisplacementMapEffect_offsetX_feature",
						"_UI_DisplacementMapEffect_type"),
				SnapshotPackage.Literals.DISPLACEMENT_MAP_EFFECT__OFFSET_X, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Offset Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DisplacementMapEffect_offsetY_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DisplacementMapEffect_offsetY_feature",
						"_UI_DisplacementMapEffect_type"),
				SnapshotPackage.Literals.DISPLACEMENT_MAP_EFFECT__OFFSET_Y, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scale X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaleXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DisplacementMapEffect_scaleX_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DisplacementMapEffect_scaleX_feature",
						"_UI_DisplacementMapEffect_type"),
				SnapshotPackage.Literals.DISPLACEMENT_MAP_EFFECT__SCALE_X, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scale Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaleYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DisplacementMapEffect_scaleY_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DisplacementMapEffect_scaleY_feature",
						"_UI_DisplacementMapEffect_type"),
				SnapshotPackage.Literals.DISPLACEMENT_MAP_EFFECT__SCALE_Y, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Wrap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWrapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DisplacementMapEffect_wrap_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DisplacementMapEffect_wrap_feature",
						"_UI_DisplacementMapEffect_type"),
				SnapshotPackage.Literals.DISPLACEMENT_MAP_EFFECT__WRAP, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DisplacementMapEffect.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DisplacementMapEffect"));
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
		DisplacementMapEffect displacementMapEffect = (DisplacementMapEffect) object;
		return getString("_UI_DisplacementMapEffect_type") + " " + displacementMapEffect.getOffsetX();
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

		switch (notification.getFeatureID(DisplacementMapEffect.class)) {
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_X:
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_Y:
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_X:
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_Y:
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__WRAP:
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
