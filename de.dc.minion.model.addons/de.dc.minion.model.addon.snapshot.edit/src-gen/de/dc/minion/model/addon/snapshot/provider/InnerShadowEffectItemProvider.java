/**
 */
package de.dc.minion.model.addon.snapshot.provider;

import de.dc.minion.model.addon.snapshot.BlurType;
import de.dc.minion.model.addon.snapshot.InnerShadowEffect;
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
 * This is the item provider adapter for a {@link de.dc.minion.model.addon.snapshot.InnerShadowEffect} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InnerShadowEffectItemProvider extends FXEffectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerShadowEffectItemProvider(AdapterFactory adapterFactory) {
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

			addBlurTypePropertyDescriptor(object);
			addChangeIsLocalPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addChokePropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addOffsetXPropertyDescriptor(object);
			addOffsetYPropertyDescriptor(object);
			addRadiusPropertyDescriptor(object);
			addSpreadPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Blur Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlurTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InnerShadowEffect_blurType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_blurType_feature",
								"_UI_InnerShadowEffect_type"),
						SnapshotPackage.Literals.INNER_SHADOW_EFFECT__BLUR_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Change Is Local feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeIsLocalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InnerShadowEffect_changeIsLocal_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_changeIsLocal_feature",
						"_UI_InnerShadowEffect_type"),
				SnapshotPackage.Literals.INNER_SHADOW_EFFECT__CHANGE_IS_LOCAL, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InnerShadowEffect_color_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_color_feature",
								"_UI_InnerShadowEffect_type"),
						SnapshotPackage.Literals.INNER_SHADOW_EFFECT__COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Choke feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChokePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InnerShadowEffect_choke_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_choke_feature",
								"_UI_InnerShadowEffect_type"),
						SnapshotPackage.Literals.INNER_SHADOW_EFFECT__CHOKE, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InnerShadowEffect_height_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_height_feature",
								"_UI_InnerShadowEffect_type"),
						SnapshotPackage.Literals.INNER_SHADOW_EFFECT__HEIGHT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Offset X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InnerShadowEffect_offsetX_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_offsetX_feature",
								"_UI_InnerShadowEffect_type"),
						SnapshotPackage.Literals.INNER_SHADOW_EFFECT__OFFSET_X, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Offset Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetYPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InnerShadowEffect_offsetY_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_offsetY_feature",
								"_UI_InnerShadowEffect_type"),
						SnapshotPackage.Literals.INNER_SHADOW_EFFECT__OFFSET_Y, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InnerShadowEffect_radius_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_radius_feature",
								"_UI_InnerShadowEffect_type"),
						SnapshotPackage.Literals.INNER_SHADOW_EFFECT__RADIUS, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Spread feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpreadPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InnerShadowEffect_spread_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_spread_feature",
								"_UI_InnerShadowEffect_type"),
						SnapshotPackage.Literals.INNER_SHADOW_EFFECT__SPREAD, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InnerShadowEffect_width_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InnerShadowEffect_width_feature",
								"_UI_InnerShadowEffect_type"),
						SnapshotPackage.Literals.INNER_SHADOW_EFFECT__WIDTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns InnerShadowEffect.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InnerShadowEffect"));
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
		BlurType labelValue = ((InnerShadowEffect) object).getBlurType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_InnerShadowEffect_type")
				: getString("_UI_InnerShadowEffect_type") + " " + label;
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

		switch (notification.getFeatureID(InnerShadowEffect.class)) {
		case SnapshotPackage.INNER_SHADOW_EFFECT__BLUR_TYPE:
		case SnapshotPackage.INNER_SHADOW_EFFECT__CHANGE_IS_LOCAL:
		case SnapshotPackage.INNER_SHADOW_EFFECT__COLOR:
		case SnapshotPackage.INNER_SHADOW_EFFECT__CHOKE:
		case SnapshotPackage.INNER_SHADOW_EFFECT__HEIGHT:
		case SnapshotPackage.INNER_SHADOW_EFFECT__OFFSET_X:
		case SnapshotPackage.INNER_SHADOW_EFFECT__OFFSET_Y:
		case SnapshotPackage.INNER_SHADOW_EFFECT__RADIUS:
		case SnapshotPackage.INNER_SHADOW_EFFECT__SPREAD:
		case SnapshotPackage.INNER_SHADOW_EFFECT__WIDTH:
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
