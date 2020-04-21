/**
 */
package de.dc.minion.model.addon.snapshot.provider;

import de.dc.minion.model.addon.snapshot.Layer;
import de.dc.minion.model.addon.snapshot.SnapshotFactory;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;

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

/**
 * This is the item provider adapter for a {@link de.dc.minion.model.addon.snapshot.Layer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Layer_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Layer_name_feature", "_UI_Layer_type"),
						SnapshotPackage.Literals.LAYER__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Layer_visible_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Layer_visible_feature", "_UI_Layer_type"),
						SnapshotPackage.Literals.LAYER__VISIBLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(SnapshotPackage.Literals.LAYER__EFFECTS);
			childrenFeatures.add(SnapshotPackage.Literals.LAYER__COLOR_GRADING);
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
	 * This returns Layer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Layer"));
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
		String label = ((Layer) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Layer_type")
				: getString("_UI_Layer_type") + " " + label;
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

		switch (notification.getFeatureID(Layer.class)) {
		case SnapshotPackage.LAYER__NAME:
		case SnapshotPackage.LAYER__VISIBLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case SnapshotPackage.LAYER__EFFECTS:
		case SnapshotPackage.LAYER__COLOR_GRADING:
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

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createBlendEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createBloomEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createBoxBlurEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createColorAdjustEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createColorInputEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createDisplacementMapEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createDropShadowEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createGaussianBlurEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createGlowEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createInnerShadowEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createLightingEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createMotionBlurEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createPerspectiveTransformEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createReflectionEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createSepiaToneEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__EFFECTS,
				SnapshotFactory.eINSTANCE.createShadowEffect()));

		newChildDescriptors.add(createChildParameter(SnapshotPackage.Literals.LAYER__COLOR_GRADING,
				SnapshotFactory.eINSTANCE.createColorGrading()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SnapshotEditPlugin.INSTANCE;
	}

}
