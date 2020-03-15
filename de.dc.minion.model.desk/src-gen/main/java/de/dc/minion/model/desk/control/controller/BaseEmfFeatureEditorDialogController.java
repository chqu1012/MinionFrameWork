package de.dc.minion.model.desk.control.controller;
	
import javafx.scene.image.ImageView;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
public abstract class BaseEmfFeatureEditorDialogController{
	
	@FXML protected BorderPane root;
	@FXML protected Label labelTitle;
	@FXML protected TextField textSearch;
	@FXML protected ListView listViewSource;
	@FXML protected ListView listViewDestination;
	@FXML protected Button buttonAdd;
	@FXML protected Button buttonAddAll;
	@FXML protected Button buttonRemove;
	@FXML protected Button buttonRemoveAll;
	@FXML protected Button buttonCancel;
	@FXML protected Button buttonOk;
	
	public void initialize(){}
	
	@FXML
	    protected abstract void onButtonAction(ActionEvent event);
	
	@FXML
	    protected abstract void onListViewMouseClicked(MouseEvent event);
	
}
