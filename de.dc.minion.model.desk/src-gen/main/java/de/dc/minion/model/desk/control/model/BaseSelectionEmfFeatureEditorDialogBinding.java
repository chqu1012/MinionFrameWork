package de.dc.minion.model.desk.control.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;

public class BaseSelectionEmfFeatureEditorDialogBinding{
	// Binding init for listViewSource
	private ObservableList masterDataListViewSource = FXCollections.observableArrayList();
	private FilteredList filteredDataListViewSource = new FilteredList<>(masterDataListViewSource);
	private SortedList sortedDataListViewSource = new SortedList<>(filteredDataListViewSource);
	private ObjectProperty selectedDataListViewSource = new SimpleObjectProperty<>();
	public ObservableList masterDataListViewSource() { return masterDataListViewSource; }
	public FilteredList filteredDataListViewSource() { return filteredDataListViewSource; }
	public SortedList sortedDataListViewSource() { return sortedDataListViewSource; }
	public ObjectProperty selectedDataListViewSource() { return selectedDataListViewSource;}
	
	// Binding init for listViewDestination
	private ObservableList masterDataListViewDestination = FXCollections.observableArrayList();
	private FilteredList filteredDataListViewDestination = new FilteredList<>(masterDataListViewDestination);
	private SortedList sortedDataListViewDestination = new SortedList<>(filteredDataListViewDestination);
	private ObjectProperty selectedDataListViewDestination = new SimpleObjectProperty<>();
	public ObservableList masterDataListViewDestination() { return masterDataListViewDestination; }
	public FilteredList filteredDataListViewDestination() { return filteredDataListViewDestination; }
	public SortedList sortedDataListViewDestination() { return sortedDataListViewDestination; }
	public ObjectProperty selectedDataListViewDestination() { return selectedDataListViewDestination;}
	
}
