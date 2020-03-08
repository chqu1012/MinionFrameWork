package de.dc.minion.model.desk;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class BaseMinionApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(getRoot(), 1200, 700));
		primaryStage.show();
	}

	protected abstract Parent getRoot();
}
