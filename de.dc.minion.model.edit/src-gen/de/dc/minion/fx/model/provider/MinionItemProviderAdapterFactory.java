/**
 */
package de.dc.minion.fx.model.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.dc.minion.fx.model.util.MinionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MinionItemProviderAdapterFactory extends MinionAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.Minion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinionItemProvider minionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.Minion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinionAdapter() {
		if (minionItemProvider == null) {
			minionItemProvider = new MinionItemProvider(this);
		}

		return minionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.Toady} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToadyItemProvider toadyItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.Toady}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToadyAdapter() {
		if (toadyItemProvider == null) {
			toadyItemProvider = new ToadyItemProvider(this);
		}

		return toadyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.ToolbarItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolbarItemItemProvider toolbarItemItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.ToolbarItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolbarItemAdapter() {
		if (toolbarItemItemProvider == null) {
			toolbarItemItemProvider = new ToolbarItemItemProvider(this);
		}

		return toolbarItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.ToolbarTouch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolbarTouchItemProvider toolbarTouchItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.ToolbarTouch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolbarTouchAdapter() {
		if (toolbarTouchItemProvider == null) {
			toolbarTouchItemProvider = new ToolbarTouchItemProvider(this);
		}

		return toolbarTouchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.CommandTouch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandTouchItemProvider commandTouchItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.CommandTouch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandTouchAdapter() {
		if (commandTouchItemProvider == null) {
			commandTouchItemProvider = new CommandTouchItemProvider(this);
		}

		return commandTouchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.VisionTouch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionTouchItemProvider visionTouchItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.VisionTouch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisionTouchAdapter() {
		if (visionTouchItemProvider == null) {
			visionTouchItemProvider = new VisionTouchItemProvider(this);
		}

		return visionTouchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.DeskmanTouch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeskmanTouchItemProvider deskmanTouchItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.DeskmanTouch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeskmanTouchAdapter() {
		if (deskmanTouchItemProvider == null) {
			deskmanTouchItemProvider = new DeskmanTouchItemProvider(this);
		}

		return deskmanTouchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.LandscapeTouch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandscapeTouchItemProvider landscapeTouchItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.LandscapeTouch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLandscapeTouchAdapter() {
		if (landscapeTouchItemProvider == null) {
			landscapeTouchItemProvider = new LandscapeTouchItemProvider(this);
		}

		return landscapeTouchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.Vision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionItemProvider visionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.Vision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisionAdapter() {
		if (visionItemProvider == null) {
			visionItemProvider = new VisionItemProvider(this);
		}

		return visionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.Deskman} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeskmanItemProvider deskmanItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.Deskman}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeskmanAdapter() {
		if (deskmanItemProvider == null) {
			deskmanItemProvider = new DeskmanItemProvider(this);
		}

		return deskmanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.Landscape} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandscapeItemProvider landscapeItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.Landscape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLandscapeAdapter() {
		if (landscapeItemProvider == null) {
			landscapeItemProvider = new LandscapeItemProvider(this);
		}

		return landscapeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.RecentlyOpenVision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecentlyOpenVisionItemProvider recentlyOpenVisionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.RecentlyOpenVision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecentlyOpenVisionAdapter() {
		if (recentlyOpenVisionItemProvider == null) {
			recentlyOpenVisionItemProvider = new RecentlyOpenVisionItemProvider(this);
		}

		return recentlyOpenVisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.RecentlyOpenFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecentlyOpenFileItemProvider recentlyOpenFileItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.RecentlyOpenFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecentlyOpenFileAdapter() {
		if (recentlyOpenFileItemProvider == null) {
			recentlyOpenFileItemProvider = new RecentlyOpenFileItemProvider(this);
		}

		return recentlyOpenFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.PropertyVision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyVisionItemProvider propertyVisionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.PropertyVision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyVisionAdapter() {
		if (propertyVisionItemProvider == null) {
			propertyVisionItemProvider = new PropertyVisionItemProvider(this);
		}

		return propertyVisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.FileVision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileVisionItemProvider fileVisionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.FileVision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileVisionAdapter() {
		if (fileVisionItemProvider == null) {
			fileVisionItemProvider = new FileVisionItemProvider(this);
		}

		return fileVisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.UndoRedoVision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndoRedoVisionItemProvider undoRedoVisionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.UndoRedoVision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUndoRedoVisionAdapter() {
		if (undoRedoVisionItemProvider == null) {
			undoRedoVisionItemProvider = new UndoRedoVisionItemProvider(this);
		}

		return undoRedoVisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.ChangeListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeListenerItemProvider changeListenerItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.ChangeListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangeListenerAdapter() {
		if (changeListenerItemProvider == null) {
			changeListenerItemProvider = new ChangeListenerItemProvider(this);
		}

		return changeListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.CommandHistoryTouch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandHistoryTouchItemProvider commandHistoryTouchItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.CommandHistoryTouch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandHistoryTouchAdapter() {
		if (commandHistoryTouchItemProvider == null) {
			commandHistoryTouchItemProvider = new CommandHistoryTouchItemProvider(this);
		}

		return commandHistoryTouchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.EmfCommand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfCommandItemProvider emfCommandItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.EmfCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmfCommandAdapter() {
		if (emfCommandItemProvider == null) {
			emfCommandItemProvider = new EmfCommandItemProvider(this);
		}

		return emfCommandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.EmfResult} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfResultItemProvider emfResultItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.EmfResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmfResultAdapter() {
		if (emfResultItemProvider == null) {
			emfResultItemProvider = new EmfResultItemProvider(this);
		}

		return emfResultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.EmfProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfProjectItemProvider emfProjectItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.EmfProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmfProjectAdapter() {
		if (emfProjectItemProvider == null) {
			emfProjectItemProvider = new EmfProjectItemProvider(this);
		}

		return emfProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.fx.model.EmfAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfAttributeItemProvider emfAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.fx.model.EmfAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmfAttributeAdapter() {
		if (emfAttributeItemProvider == null) {
			emfAttributeItemProvider = new EmfAttributeItemProvider(this);
		}

		return emfAttributeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (minionItemProvider != null)
			minionItemProvider.dispose();
		if (toadyItemProvider != null)
			toadyItemProvider.dispose();
		if (commandItemProvider != null)
			commandItemProvider.dispose();
		if (toolbarItemItemProvider != null)
			toolbarItemItemProvider.dispose();
		if (toolbarTouchItemProvider != null)
			toolbarTouchItemProvider.dispose();
		if (commandTouchItemProvider != null)
			commandTouchItemProvider.dispose();
		if (visionTouchItemProvider != null)
			visionTouchItemProvider.dispose();
		if (deskmanTouchItemProvider != null)
			deskmanTouchItemProvider.dispose();
		if (landscapeTouchItemProvider != null)
			landscapeTouchItemProvider.dispose();
		if (visionItemProvider != null)
			visionItemProvider.dispose();
		if (deskmanItemProvider != null)
			deskmanItemProvider.dispose();
		if (landscapeItemProvider != null)
			landscapeItemProvider.dispose();
		if (recentlyOpenVisionItemProvider != null)
			recentlyOpenVisionItemProvider.dispose();
		if (recentlyOpenFileItemProvider != null)
			recentlyOpenFileItemProvider.dispose();
		if (propertyVisionItemProvider != null)
			propertyVisionItemProvider.dispose();
		if (fileVisionItemProvider != null)
			fileVisionItemProvider.dispose();
		if (undoRedoVisionItemProvider != null)
			undoRedoVisionItemProvider.dispose();
		if (changeListenerItemProvider != null)
			changeListenerItemProvider.dispose();
		if (commandHistoryTouchItemProvider != null)
			commandHistoryTouchItemProvider.dispose();
		if (emfCommandItemProvider != null)
			emfCommandItemProvider.dispose();
		if (emfResultItemProvider != null)
			emfResultItemProvider.dispose();
		if (emfProjectItemProvider != null)
			emfProjectItemProvider.dispose();
		if (emfAttributeItemProvider != null)
			emfAttributeItemProvider.dispose();
	}

}
