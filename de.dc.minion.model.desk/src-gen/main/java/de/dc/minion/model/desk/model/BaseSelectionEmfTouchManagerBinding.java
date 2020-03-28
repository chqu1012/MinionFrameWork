package de.dc.minion.model.desk.model;

import de.dc.minion.fx.model.Minion;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;

public class BaseSelectionEmfTouchManagerBinding{
	// Binding init for listViewTouch
	private ObservableList<Minion> masterDataListViewTouch = FXCollections.observableArrayList();
	private FilteredList<Minion> filteredDataListViewTouch = new FilteredList<>(masterDataListViewTouch);
	private SortedList<Minion> sortedDataListViewTouch = new SortedList<>(filteredDataListViewTouch);
	private ObjectProperty<Minion> selectedDataListViewTouch = new SimpleObjectProperty<>();
	public ObservableList<Minion> masterDataListViewTouch() { return masterDataListViewTouch; }
	public FilteredList<Minion> filteredDataListViewTouch() { return filteredDataListViewTouch; }
	public SortedList<Minion> sortedDataListViewTouch() { return sortedDataListViewTouch; }
	public ObjectProperty<Minion> selectedDataListViewTouch() { return selectedDataListViewTouch;}
	
}
