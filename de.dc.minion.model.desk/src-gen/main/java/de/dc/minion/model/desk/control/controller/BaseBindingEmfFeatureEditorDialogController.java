package de.dc.minion.model.desk.control.controller;

import de.dc.minion.model.desk.model.EmfFeatureEditorDialogBinding;

public abstract class BaseBindingEmfFeatureEditorDialogController extends BaseEmfFeatureEditorDialogController{
	
	protected EmfFeatureEditorDialogBinding binding = new EmfFeatureEditorDialogBinding();
	
	@Override
	public void initialize() {
		textSearch.textProperty().bindBidirectional(binding.textSearchProperty());
		listViewSource.setItems(binding.sortedDataListViewSource());
		binding.selectedDataListViewSource().bind(listViewSource.getSelectionModel().selectedItemProperty());
		listViewDestination.setItems(binding.sortedDataListViewDestination());
		binding.selectedDataListViewDestination().bind(listViewDestination.getSelectionModel().selectedItemProperty());
	}
}
