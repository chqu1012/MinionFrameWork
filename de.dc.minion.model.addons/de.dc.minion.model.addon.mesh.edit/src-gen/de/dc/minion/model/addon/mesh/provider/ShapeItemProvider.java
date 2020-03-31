/**
 */
package de.dc.minion.model.addon.mesh.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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

import de.dc.minion.model.addon.mesh.MeshPackage;
import de.dc.minion.model.addon.mesh.Shape;

/**
 * This is the item provider adapter for a {@link de.dc.minion.model.addon.mesh.Shape} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeItemProvider(AdapterFactory adapterFactory) {
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

			addPositionXPropertyDescriptor(object);
			addPositionYPropertyDescriptor(object);
			addColorBackgroundPropertyDescriptor(object);
			addColorBorderPropertyDescriptor(object);
			addWidthBorderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Position X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Shape_positionX_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Shape_positionX_feature",
								"_UI_Shape_type"),
						MeshPackage.Literals.SHAPE__POSITION_X, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Position Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionYPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Shape_positionY_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Shape_positionY_feature",
								"_UI_Shape_type"),
						MeshPackage.Literals.SHAPE__POSITION_Y, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Color Background feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorBackgroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Shape_colorBackground_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Shape_colorBackground_feature",
								"_UI_Shape_type"),
						MeshPackage.Literals.SHAPE__COLOR_BACKGROUND, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Color Border feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorBorderPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Shape_colorBorder_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Shape_colorBorder_feature",
								"_UI_Shape_type"),
						MeshPackage.Literals.SHAPE__COLOR_BORDER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Width Border feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthBorderPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Shape_widthBorder_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Shape_widthBorder_feature",
								"_UI_Shape_type"),
						MeshPackage.Literals.SHAPE__WIDTH_BORDER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
		Double labelValue = ((Shape) object).getPositionX();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_Shape_type")
				: getString("_UI_Shape_type") + " " + label;
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

		switch (notification.getFeatureID(Shape.class)) {
		case MeshPackage.SHAPE__POSITION_X:
		case MeshPackage.SHAPE__POSITION_Y:
		case MeshPackage.SHAPE__COLOR_BACKGROUND:
		case MeshPackage.SHAPE__COLOR_BORDER:
		case MeshPackage.SHAPE__WIDTH_BORDER:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MeshEditPlugin.INSTANCE;
	}

}
