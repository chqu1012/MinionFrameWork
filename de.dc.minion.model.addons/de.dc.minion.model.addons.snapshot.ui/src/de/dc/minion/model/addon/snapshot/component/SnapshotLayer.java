package de.dc.minion.model.addon.snapshot.component;

import java.io.IOException;

import de.dc.minion.model.addon.snapshot.component.controller.BaseBindingSnapshotLayerController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class SnapshotLayer extends BaseBindingSnapshotLayerController {

	public SnapshotLayer() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/minion/model/addons/snapshot/ui/SnapshotLayer.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize() {
		super.initialize();
		toolbarEffects.getItems().forEach(node->{
			if (node instanceof Button) {
				Button button = (Button) node;
				String text = "gridpane"+button.getText();
				
				Node gridpane = stackpaneEffects.lookup("#"+text);
				if (gridpane != null) {
					button.setOnAction(e-> gridpane.toFront());
				}
			}
		});
	}

	@Override
	protected void onButtonAction(ActionEvent event) {
	}

}
