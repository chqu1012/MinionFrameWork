/**
 */
package de.dc.minion.model.addon.lecture.provider;

import de.dc.minion.model.addon.lecture.util.LectureAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LectureItemProviderAdapterFactory extends LectureAdapterFactory
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
	public LectureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.LectureProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LectureProjectItemProvider lectureProjectItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.LectureProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLectureProjectAdapter() {
		if (lectureProjectItemProvider == null) {
			lectureProjectItemProvider = new LectureProjectItemProvider(this);
		}

		return lectureProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.Section} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionItemProvider sectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSectionAdapter() {
		if (sectionItemProvider == null) {
			sectionItemProvider = new SectionItemProvider(this);
		}

		return sectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.OrderedListContent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedListContentItemProvider orderedListContentItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.OrderedListContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderedListContentAdapter() {
		if (orderedListContentItemProvider == null) {
			orderedListContentItemProvider = new OrderedListContentItemProvider(this);
		}

		return orderedListContentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.UnorderedListContent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnorderedListContentItemProvider unorderedListContentItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.UnorderedListContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnorderedListContentAdapter() {
		if (unorderedListContentItemProvider == null) {
			unorderedListContentItemProvider = new UnorderedListContentItemProvider(this);
		}

		return unorderedListContentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.FileContent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileContentItemProvider fileContentItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.FileContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileContentAdapter() {
		if (fileContentItemProvider == null) {
			fileContentItemProvider = new FileContentItemProvider(this);
		}

		return fileContentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.StringContent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringContentItemProvider stringContentItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.StringContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringContentAdapter() {
		if (stringContentItemProvider == null) {
			stringContentItemProvider = new StringContentItemProvider(this);
		}

		return stringContentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.Header} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderItemProvider headerItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.Header}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeaderAdapter() {
		if (headerItemProvider == null) {
			headerItemProvider = new HeaderItemProvider(this);
		}

		return headerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.Paragraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphItemProvider paragraphItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParagraphAdapter() {
		if (paragraphItemProvider == null) {
			paragraphItemProvider = new ParagraphItemProvider(this);
		}

		return paragraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.Span} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanItemProvider spanItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.Span}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpanAdapter() {
		if (spanItemProvider == null) {
			spanItemProvider = new SpanItemProvider(this);
		}

		return spanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.CodeBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBlockItemProvider codeBlockItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.CodeBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeBlockAdapter() {
		if (codeBlockItemProvider == null) {
			codeBlockItemProvider = new CodeBlockItemProvider(this);
		}

		return codeBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.minion.model.addon.lecture.ListItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemItemProvider listItemItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.minion.model.addon.lecture.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListItemAdapter() {
		if (listItemItemProvider == null) {
			listItemItemProvider = new ListItemItemProvider(this);
		}

		return listItemItemProvider;
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
		if (lectureProjectItemProvider != null)
			lectureProjectItemProvider.dispose();
		if (sectionItemProvider != null)
			sectionItemProvider.dispose();
		if (orderedListContentItemProvider != null)
			orderedListContentItemProvider.dispose();
		if (unorderedListContentItemProvider != null)
			unorderedListContentItemProvider.dispose();
		if (fileContentItemProvider != null)
			fileContentItemProvider.dispose();
		if (stringContentItemProvider != null)
			stringContentItemProvider.dispose();
		if (headerItemProvider != null)
			headerItemProvider.dispose();
		if (paragraphItemProvider != null)
			paragraphItemProvider.dispose();
		if (spanItemProvider != null)
			spanItemProvider.dispose();
		if (codeBlockItemProvider != null)
			codeBlockItemProvider.dispose();
		if (linkItemProvider != null)
			linkItemProvider.dispose();
		if (listItemItemProvider != null)
			listItemItemProvider.dispose();
	}

}
