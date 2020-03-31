package de.dc.minion.model.desk.controller;

import de.dc.minion.model.desk.model.EmfTouchManagerBinding;

public abstract class BaseBindingEmfTouchManagerController extends BaseEmfTouchManagerController{
	
	protected EmfTouchManagerBinding binding = new EmfTouchManagerBinding();
	
	@Override
	public void initialize() {
		textSearchTouch.textProperty().bindBidirectional(binding.textSearchTouchProperty());
		listViewTouch.setItems(binding.sortedDataListViewTouch());
		binding.selectedDataListViewTouch().bind(listViewTouch.getSelectionModel().selectedItemProperty());
	}
}
