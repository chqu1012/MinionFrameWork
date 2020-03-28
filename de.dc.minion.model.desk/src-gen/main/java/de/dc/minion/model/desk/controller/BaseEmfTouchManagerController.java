package de.dc.minion.model.desk.controller;
	
import de.dc.minion.fx.model.Touch;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
public abstract class BaseEmfTouchManagerController extends BorderPane{
	
	@FXML protected TextField textSearchTouch;
	@FXML protected ListView<Touch> listViewTouch;
	@FXML protected Label labelTouchSize;
	@FXML protected TabPane tabPane;
	
	public void initialize(){}
	
}
