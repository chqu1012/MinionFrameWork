/**
 */
package de.dc.minion.model.addon.snapshot.provider;

import de.dc.minion.model.addon.snapshot.PerspectiveTransformEffect;
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
 * This is the item provider adapter for a {@link de.dc.minion.model.addon.snapshot.PerspectiveTransformEffect} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PerspectiveTransformEffectItemProvider extends FXEffectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveTransformEffectItemProvider(AdapterFactory adapterFactory) {
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

			addLlxPropertyDescriptor(object);
			addLlyPropertyDescriptor(object);
			addLrxPropertyDescriptor(object);
			addLryPropertyDescriptor(object);
			addUlxPropertyDescriptor(object);
			addUlyPropertyDescriptor(object);
			addUrxPropertyDescriptor(object);
			addUryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Llx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLlxPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PerspectiveTransformEffect_llx_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PerspectiveTransformEffect_llx_feature",
								"_UI_PerspectiveTransformEffect_type"),
						SnapshotPackage.Literals.PERSPECTIVE_TRANSFORM_EFFECT__LLX, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lly feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PerspectiveTransformEffect_lly_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PerspectiveTransformEffect_lly_feature",
								"_UI_PerspectiveTransformEffect_type"),
						SnapshotPackage.Literals.PERSPECTIVE_TRANSFORM_EFFECT__LLY, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lrx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLrxPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PerspectiveTransformEffect_lrx_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PerspectiveTransformEffect_lrx_feature",
								"_UI_PerspectiveTransformEffect_type"),
						SnapshotPackage.Literals.PERSPECTIVE_TRANSFORM_EFFECT__LRX, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PerspectiveTransformEffect_lry_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PerspectiveTransformEffect_lry_feature",
								"_UI_PerspectiveTransformEffect_type"),
						SnapshotPackage.Literals.PERSPECTIVE_TRANSFORM_EFFECT__LRY, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ulx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUlxPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PerspectiveTransformEffect_ulx_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PerspectiveTransformEffect_ulx_feature",
								"_UI_PerspectiveTransformEffect_type"),
						SnapshotPackage.Literals.PERSPECTIVE_TRANSFORM_EFFECT__ULX, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Uly feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PerspectiveTransformEffect_uly_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PerspectiveTransformEffect_uly_feature",
								"_UI_PerspectiveTransformEffect_type"),
						SnapshotPackage.Literals.PERSPECTIVE_TRANSFORM_EFFECT__ULY, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Urx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrxPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PerspectiveTransformEffect_urx_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PerspectiveTransformEffect_urx_feature",
								"_UI_PerspectiveTransformEffect_type"),
						SnapshotPackage.Literals.PERSPECTIVE_TRANSFORM_EFFECT__URX, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ury feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PerspectiveTransformEffect_ury_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PerspectiveTransformEffect_ury_feature",
								"_UI_PerspectiveTransformEffect_type"),
						SnapshotPackage.Literals.PERSPECTIVE_TRANSFORM_EFFECT__URY, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PerspectiveTransformEffect.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PerspectiveTransformEffect"));
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
		PerspectiveTransformEffect perspectiveTransformEffect = (PerspectiveTransformEffect) object;
		return getString("_UI_PerspectiveTransformEffect_type") + " " + perspectiveTransformEffect.getLlx();
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

		switch (notification.getFeatureID(PerspectiveTransformEffect.class)) {
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLX:
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLY:
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRX:
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRY:
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULX:
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULY:
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URX:
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URY:
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
