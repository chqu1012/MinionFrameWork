package de.dc.minion.model.addon.snapshot.component.controller;

import de.dc.minion.model.addon.snapshot.component.model.*;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public abstract class BaseBindingSnapshotLayerController extends BaseSnapshotLayerController{
	
	protected SnapshotLayerBinding binding = new SnapshotLayerBinding();
	
	@Override
	public void initialize() {
		textSearch.textProperty().bindBidirectional(binding.textSearchProperty());
		listViewLayer.setItems(binding.sortedDataListViewLayer());
		binding.selectedDataListViewLayer().bind(listViewLayer.getSelectionModel().selectedItemProperty());
		comboBlendMode.setItems(binding.sortedDataComboBlendMode());
		binding.selectedDataComboBlendMode().bind(comboBlendMode.getSelectionModel().selectedItemProperty());
		comboLightningLight.setItems(binding.sortedDataComboLightningLight());
		binding.selectedDataComboLightningLight().bind(comboLightningLight.getSelectionModel().selectedItemProperty());
		comboIShadowBlurType.setItems(binding.sortedDataComboIShadowBlurType());
		binding.selectedDataComboIShadowBlurType().bind(comboIShadowBlurType.getSelectionModel().selectedItemProperty());
		comboInnerShadowBlurType.setItems(binding.sortedDataComboInnerShadowBlurType());
		binding.selectedDataComboInnerShadowBlurType().bind(comboInnerShadowBlurType.getSelectionModel().selectedItemProperty());
		comboDropShadowBlurType.setItems(binding.sortedDataComboDropShadowBlurType());
		binding.selectedDataComboDropShadowBlurType().bind(comboDropShadowBlurType.getSelectionModel().selectedItemProperty());
	}
}
