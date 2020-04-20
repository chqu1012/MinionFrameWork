package de.dc.minion.model.addon.snapshot.component.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;

public class BaseSelectionSnapshotLayerBinding{
	// Binding init for listViewLayer
	private ObservableList masterDataListViewLayer = FXCollections.observableArrayList();
	private FilteredList filteredDataListViewLayer = new FilteredList<>(masterDataListViewLayer);
	private SortedList sortedDataListViewLayer = new SortedList<>(filteredDataListViewLayer);
	private ObjectProperty selectedDataListViewLayer = new SimpleObjectProperty<>();
	public ObservableList masterDataListViewLayer() { return masterDataListViewLayer; }
	public FilteredList filteredDataListViewLayer() { return filteredDataListViewLayer; }
	public SortedList sortedDataListViewLayer() { return sortedDataListViewLayer; }
	public ObjectProperty selectedDataListViewLayer() { return selectedDataListViewLayer;}
	
	// Binding init for comboBlendMode
	private ObservableList masterDataComboBlendMode = FXCollections.observableArrayList();
	private FilteredList filteredDataComboBlendMode = new FilteredList<>(masterDataComboBlendMode);
	private SortedList sortedDataComboBlendMode = new SortedList<>(filteredDataComboBlendMode);
	private ObjectProperty selectedDataComboBlendMode = new SimpleObjectProperty<>();
	public ObservableList masterDataComboBlendMode() { return masterDataComboBlendMode; }
	public FilteredList filteredDataComboBlendMode() { return filteredDataComboBlendMode; }
	public SortedList sortedDataComboBlendMode() { return sortedDataComboBlendMode; }
	public ObjectProperty selectedDataComboBlendMode() { return selectedDataComboBlendMode;}
	
	// Binding init for comboLightningLight
	private ObservableList masterDataComboLightningLight = FXCollections.observableArrayList();
	private FilteredList filteredDataComboLightningLight = new FilteredList<>(masterDataComboLightningLight);
	private SortedList sortedDataComboLightningLight = new SortedList<>(filteredDataComboLightningLight);
	private ObjectProperty selectedDataComboLightningLight = new SimpleObjectProperty<>();
	public ObservableList masterDataComboLightningLight() { return masterDataComboLightningLight; }
	public FilteredList filteredDataComboLightningLight() { return filteredDataComboLightningLight; }
	public SortedList sortedDataComboLightningLight() { return sortedDataComboLightningLight; }
	public ObjectProperty selectedDataComboLightningLight() { return selectedDataComboLightningLight;}
	
	// Binding init for comboIShadowBlurType
	private ObservableList masterDataComboIShadowBlurType = FXCollections.observableArrayList();
	private FilteredList filteredDataComboIShadowBlurType = new FilteredList<>(masterDataComboIShadowBlurType);
	private SortedList sortedDataComboIShadowBlurType = new SortedList<>(filteredDataComboIShadowBlurType);
	private ObjectProperty selectedDataComboIShadowBlurType = new SimpleObjectProperty<>();
	public ObservableList masterDataComboIShadowBlurType() { return masterDataComboIShadowBlurType; }
	public FilteredList filteredDataComboIShadowBlurType() { return filteredDataComboIShadowBlurType; }
	public SortedList sortedDataComboIShadowBlurType() { return sortedDataComboIShadowBlurType; }
	public ObjectProperty selectedDataComboIShadowBlurType() { return selectedDataComboIShadowBlurType;}
	
	// Binding init for comboInnerShadowBlurType
	private ObservableList masterDataComboInnerShadowBlurType = FXCollections.observableArrayList();
	private FilteredList filteredDataComboInnerShadowBlurType = new FilteredList<>(masterDataComboInnerShadowBlurType);
	private SortedList sortedDataComboInnerShadowBlurType = new SortedList<>(filteredDataComboInnerShadowBlurType);
	private ObjectProperty selectedDataComboInnerShadowBlurType = new SimpleObjectProperty<>();
	public ObservableList masterDataComboInnerShadowBlurType() { return masterDataComboInnerShadowBlurType; }
	public FilteredList filteredDataComboInnerShadowBlurType() { return filteredDataComboInnerShadowBlurType; }
	public SortedList sortedDataComboInnerShadowBlurType() { return sortedDataComboInnerShadowBlurType; }
	public ObjectProperty selectedDataComboInnerShadowBlurType() { return selectedDataComboInnerShadowBlurType;}
	
	// Binding init for comboDropShadowBlurType
	private ObservableList masterDataComboDropShadowBlurType = FXCollections.observableArrayList();
	private FilteredList filteredDataComboDropShadowBlurType = new FilteredList<>(masterDataComboDropShadowBlurType);
	private SortedList sortedDataComboDropShadowBlurType = new SortedList<>(filteredDataComboDropShadowBlurType);
	private ObjectProperty selectedDataComboDropShadowBlurType = new SimpleObjectProperty<>();
	public ObservableList masterDataComboDropShadowBlurType() { return masterDataComboDropShadowBlurType; }
	public FilteredList filteredDataComboDropShadowBlurType() { return filteredDataComboDropShadowBlurType; }
	public SortedList sortedDataComboDropShadowBlurType() { return sortedDataComboDropShadowBlurType; }
	public ObjectProperty selectedDataComboDropShadowBlurType() { return selectedDataComboDropShadowBlurType;}
	
}
