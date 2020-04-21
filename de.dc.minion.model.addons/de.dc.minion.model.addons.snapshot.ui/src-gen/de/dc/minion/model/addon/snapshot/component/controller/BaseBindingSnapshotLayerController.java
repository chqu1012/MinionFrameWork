package de.dc.minion.model.addon.snapshot.component.controller;

import de.dc.minion.model.addon.snapshot.component.model.SnapshotLayerBinding;

public abstract class BaseBindingSnapshotLayerController extends BaseSnapshotLayerController{
	
	protected SnapshotLayerBinding binding = new SnapshotLayerBinding();
	
	@Override
	public void initialize() {
		textSearch.textProperty().bindBidirectional(binding.textSearchProperty());
		listViewLayer.setItems(binding.sortedDataListViewLayer());
		binding.selectedDataListViewLayer().bind(listViewLayer.getSelectionModel().selectedItemProperty());
	}
}
