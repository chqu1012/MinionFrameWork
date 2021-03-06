/**
 */
package de.dc.javafx.xcore.workbench.chart.provider;

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

import de.dc.javafx.xcore.workbench.chart.util.ChartAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartItemProviderAdapterFactory extends ChartAdapterFactory
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
	public ChartItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.ChartProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartProjectItemProvider chartProjectItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.ChartProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChartProjectAdapter() {
		if (chartProjectItemProvider == null) {
			chartProjectItemProvider = new ChartProjectItemProvider(this);
		}

		return chartProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.XYZSeriesFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XYZSeriesFXItemProvider xyzSeriesFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.XYZSeriesFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXYZSeriesFXAdapter() {
		if (xyzSeriesFXItemProvider == null) {
			xyzSeriesFXItemProvider = new XYZSeriesFXItemProvider(this);
		}

		return xyzSeriesFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.CategorySeriesFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorySeriesFXItemProvider categorySeriesFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.CategorySeriesFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategorySeriesFXAdapter() {
		if (categorySeriesFXItemProvider == null) {
			categorySeriesFXItemProvider = new CategorySeriesFXItemProvider(this);
		}

		return categorySeriesFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.CategoryRowSeriesFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryRowSeriesFXItemProvider categoryRowSeriesFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.CategoryRowSeriesFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategoryRowSeriesFXAdapter() {
		if (categoryRowSeriesFXItemProvider == null) {
			categoryRowSeriesFXItemProvider = new CategoryRowSeriesFXItemProvider(this);
		}

		return categoryRowSeriesFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.SeriesFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeriesFXItemProvider seriesFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.SeriesFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeriesFXAdapter() {
		if (seriesFXItemProvider == null) {
			seriesFXItemProvider = new SeriesFXItemProvider(this);
		}

		return seriesFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.XYValueFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XYValueFXItemProvider xyValueFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.XYValueFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXYValueFXAdapter() {
		if (xyValueFXItemProvider == null) {
			xyValueFXItemProvider = new XYValueFXItemProvider(this);
		}

		return xyValueFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.XYZValueFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XYZValueFXItemProvider xyzValueFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.XYZValueFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXYZValueFXAdapter() {
		if (xyzValueFXItemProvider == null) {
			xyzValueFXItemProvider = new XYZValueFXItemProvider(this);
		}

		return xyzValueFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.CategoryValueFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryValueFXItemProvider categoryValueFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.CategoryValueFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategoryValueFXAdapter() {
		if (categoryValueFXItemProvider == null) {
			categoryValueFXItemProvider = new CategoryValueFXItemProvider(this);
		}

		return categoryValueFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.LineChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineChartFXItemProvider lineChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.LineChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineChartFXAdapter() {
		if (lineChartFXItemProvider == null) {
			lineChartFXItemProvider = new LineChartFXItemProvider(this);
		}

		return lineChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.AreaChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaChartFXItemProvider areaChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.AreaChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAreaChartFXAdapter() {
		if (areaChartFXItemProvider == null) {
			areaChartFXItemProvider = new AreaChartFXItemProvider(this);
		}

		return areaChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.ScatterChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScatterChartFXItemProvider scatterChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.ScatterChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScatterChartFXAdapter() {
		if (scatterChartFXItemProvider == null) {
			scatterChartFXItemProvider = new ScatterChartFXItemProvider(this);
		}

		return scatterChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.BubbleChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BubbleChartFXItemProvider bubbleChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.BubbleChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBubbleChartFXAdapter() {
		if (bubbleChartFXItemProvider == null) {
			bubbleChartFXItemProvider = new BubbleChartFXItemProvider(this);
		}

		return bubbleChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.BarChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarChartFXItemProvider barChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.BarChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBarChartFXAdapter() {
		if (barChartFXItemProvider == null) {
			barChartFXItemProvider = new BarChartFXItemProvider(this);
		}

		return barChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.PieChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PieChartFXItemProvider pieChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.PieChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPieChartFXAdapter() {
		if (pieChartFXItemProvider == null) {
			pieChartFXItemProvider = new PieChartFXItemProvider(this);
		}

		return pieChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.AreaChart3dFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaChart3dFXItemProvider areaChart3dFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.AreaChart3dFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAreaChart3dFXAdapter() {
		if (areaChart3dFXItemProvider == null) {
			areaChart3dFXItemProvider = new AreaChart3dFXItemProvider(this);
		}

		return areaChart3dFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.BarChart3dFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarChart3dFXItemProvider barChart3dFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.BarChart3dFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBarChart3dFXAdapter() {
		if (barChart3dFXItemProvider == null) {
			barChart3dFXItemProvider = new BarChart3dFXItemProvider(this);
		}

		return barChart3dFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.LineChart3dFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineChart3dFXItemProvider lineChart3dFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.LineChart3dFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineChart3dFXAdapter() {
		if (lineChart3dFXItemProvider == null) {
			lineChart3dFXItemProvider = new LineChart3dFXItemProvider(this);
		}

		return lineChart3dFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.PieChart3dFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PieChart3dFXItemProvider pieChart3dFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.PieChart3dFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPieChart3dFXAdapter() {
		if (pieChart3dFXItemProvider == null) {
			pieChart3dFXItemProvider = new PieChart3dFXItemProvider(this);
		}

		return pieChart3dFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.ScatterChart3dFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScatterChart3dFXItemProvider scatterChart3dFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.ScatterChart3dFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScatterChart3dFXAdapter() {
		if (scatterChart3dFXItemProvider == null) {
			scatterChart3dFXItemProvider = new ScatterChart3dFXItemProvider(this);
		}

		return scatterChart3dFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.StackedBarChart3dFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackedBarChart3dFXItemProvider stackedBarChart3dFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.StackedBarChart3dFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStackedBarChart3dFXAdapter() {
		if (stackedBarChart3dFXItemProvider == null) {
			stackedBarChart3dFXItemProvider = new StackedBarChart3dFXItemProvider(this);
		}

		return stackedBarChart3dFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.XYZBarChart3dFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XYZBarChart3dFXItemProvider xyzBarChart3dFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.XYZBarChart3dFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXYZBarChart3dFXAdapter() {
		if (xyzBarChart3dFXItemProvider == null) {
			xyzBarChart3dFXItemProvider = new XYZBarChart3dFXItemProvider(this);
		}

		return xyzBarChart3dFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.XYZLineChart3dFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XYZLineChart3dFXItemProvider xyzLineChart3dFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.XYZLineChart3dFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXYZLineChart3dFXAdapter() {
		if (xyzLineChart3dFXItemProvider == null) {
			xyzLineChart3dFXItemProvider = new XYZLineChart3dFXItemProvider(this);
		}

		return xyzLineChart3dFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.SurfaceChart3dFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceChart3dFXItemProvider surfaceChart3dFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.SurfaceChart3dFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSurfaceChart3dFXAdapter() {
		if (surfaceChart3dFXItemProvider == null) {
			surfaceChart3dFXItemProvider = new SurfaceChart3dFXItemProvider(this);
		}

		return surfaceChart3dFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.PerlinNoiseChart3d} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerlinNoiseChart3dItemProvider perlinNoiseChart3dItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.PerlinNoiseChart3d}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerlinNoiseChart3dAdapter() {
		if (perlinNoiseChart3dItemProvider == null) {
			perlinNoiseChart3dItemProvider = new PerlinNoiseChart3dItemProvider(this);
		}

		return perlinNoiseChart3dItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartFXConfigItemProvider chartFXConfigItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChartFXConfigAdapter() {
		if (chartFXConfigItemProvider == null) {
			chartFXConfigItemProvider = new ChartFXConfigItemProvider(this);
		}

		return chartFXConfigItemProvider;
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
		if (chartProjectItemProvider != null)
			chartProjectItemProvider.dispose();
		if (xyzSeriesFXItemProvider != null)
			xyzSeriesFXItemProvider.dispose();
		if (categorySeriesFXItemProvider != null)
			categorySeriesFXItemProvider.dispose();
		if (categoryRowSeriesFXItemProvider != null)
			categoryRowSeriesFXItemProvider.dispose();
		if (seriesFXItemProvider != null)
			seriesFXItemProvider.dispose();
		if (xyValueFXItemProvider != null)
			xyValueFXItemProvider.dispose();
		if (xyzValueFXItemProvider != null)
			xyzValueFXItemProvider.dispose();
		if (categoryValueFXItemProvider != null)
			categoryValueFXItemProvider.dispose();
		if (lineChartFXItemProvider != null)
			lineChartFXItemProvider.dispose();
		if (areaChartFXItemProvider != null)
			areaChartFXItemProvider.dispose();
		if (scatterChartFXItemProvider != null)
			scatterChartFXItemProvider.dispose();
		if (bubbleChartFXItemProvider != null)
			bubbleChartFXItemProvider.dispose();
		if (barChartFXItemProvider != null)
			barChartFXItemProvider.dispose();
		if (pieChartFXItemProvider != null)
			pieChartFXItemProvider.dispose();
		if (areaChart3dFXItemProvider != null)
			areaChart3dFXItemProvider.dispose();
		if (barChart3dFXItemProvider != null)
			barChart3dFXItemProvider.dispose();
		if (lineChart3dFXItemProvider != null)
			lineChart3dFXItemProvider.dispose();
		if (pieChart3dFXItemProvider != null)
			pieChart3dFXItemProvider.dispose();
		if (scatterChart3dFXItemProvider != null)
			scatterChart3dFXItemProvider.dispose();
		if (stackedBarChart3dFXItemProvider != null)
			stackedBarChart3dFXItemProvider.dispose();
		if (xyzBarChart3dFXItemProvider != null)
			xyzBarChart3dFXItemProvider.dispose();
		if (xyzLineChart3dFXItemProvider != null)
			xyzLineChart3dFXItemProvider.dispose();
		if (surfaceChart3dFXItemProvider != null)
			surfaceChart3dFXItemProvider.dispose();
		if (perlinNoiseChart3dItemProvider != null)
			perlinNoiseChart3dItemProvider.dispose();
		if (chartFXConfigItemProvider != null)
			chartFXConfigItemProvider.dispose();
	}

}
