package de.dc.minion.model.addon.mesh.ui;

import de.dc.minion.model.desk.BaseMinionApplication;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.scene.Parent;

public class MeshApplication extends BaseMinionApplication {

	@Override
	protected Parent getRoot() {
		MeshEditor meshEditor = new MeshEditor();
		meshEditor.getStylesheets().add(getClass().getResource("/de/dc/minion/model/desk/control/css/MinionDesk.css").toExternalForm());
		meshEditor.getStyleClass().add("root");
		return meshEditor;
	}
	
	public static void main(String[] args) {
		MinionPlatform.init();
		launch(args);
	}

}
