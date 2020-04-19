package de.dc.minion.model.addon.snapshot.component;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class SnapshotLayer extends VBox {

	public SnapshotLayer() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"/de/dc/minion/model/addons/snapshot/ui/" + SnapshotLayer.class.getSimpleName() + ".fxml"));
		loader.setRoot(this);
		loader.setController(this);
		try {
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	protected void onButtonClicked(ActionEvent event) {
		
	}
}
