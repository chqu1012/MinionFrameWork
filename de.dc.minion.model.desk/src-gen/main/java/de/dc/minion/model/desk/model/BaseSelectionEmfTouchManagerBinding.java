package de.dc.minion.model.desk.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;

public class BaseSelectionEmfTouchManagerBinding{
	// Binding init for listViewTouch
	private ObservableList<de.dc.minion.fx.model.Touch> masterDataListViewTouch = FXCollections.observableArrayList();
	private FilteredList<de.dc.minion.fx.model.Touch> filteredDataListViewTouch = new FilteredList<>(masterDataListViewTouch);
	private SortedList<de.dc.minion.fx.model.Touch> sortedDataListViewTouch = new SortedList<>(filteredDataListViewTouch);
	private ObjectProperty<de.dc.minion.fx.model.Touch> selectedDataListViewTouch = new SimpleObjectProperty<>();
	public ObservableList<de.dc.minion.fx.model.Touch> masterDataListViewTouch() { return masterDataListViewTouch; }
	public FilteredList<de.dc.minion.fx.model.Touch> filteredDataListViewTouch() { return filteredDataListViewTouch; }
	public SortedList<de.dc.minion.fx.model.Touch> sortedDataListViewTouch() { return sortedDataListViewTouch; }
	public ObjectProperty<de.dc.minion.fx.model.Touch> selectedDataListViewTouch() { return selectedDataListViewTouch;}
	
}
