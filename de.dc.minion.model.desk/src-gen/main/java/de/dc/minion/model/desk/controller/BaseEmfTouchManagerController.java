package de.dc.minion.model.desk.controller;
	
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
public abstract class BaseEmfTouchManagerController extends BorderPane{
	
	@FXML protected TextField textSearchTouch;
	@FXML protected ListView listViewTouch;
	@FXML protected Label labelTouchSize;
	@FXML protected TabPane tabPane;
	@FXML protected Button buttonRefresh;
	
	public void initialize(){}

	@FXML
    protected abstract void onButtonAction(ActionEvent event);
}
