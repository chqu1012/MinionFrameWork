package de.dc.minion.model.desk.demo;

import de.dc.minion.model.desk.BaseMinionApplication;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.scene.Parent;

public class MinionDeskApp extends BaseMinionApplication{

	@Override
	protected Parent getRoot() {
		return MinionPlatform.getInstance(MinionDesk.class);
	}

	public static void main(String[] args) {
		MinionPlatform.init();
		launch(args);
	}
}
