package de.dc.minion.model.desk.metro;

import de.dc.minion.model.desk.metro.component.MinionRibbonControl;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BaseMinionRibbon extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new MinionRibbonControl());

        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
	}

	public static void main(String[] args) {
		MinionPlatform.init();
		launch(args);
	}
}
