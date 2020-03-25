package de.dc.minion.model.desk.control.controller;

import org.eclipse.emf.ecore.EObject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public abstract class BaseEmfFeatureEditorDialogController extends BorderPane{

	@FXML
	protected BorderPane root;
	@FXML
	protected Label labelTitle;
	@FXML
	protected TextField textSearch;
	@FXML
	protected ListView<EObject> listViewSource;
	@FXML
	protected ListView<EObject> listViewDestination;
	@FXML
	protected Button buttonAdd;
	@FXML
	protected Button buttonAddAll;
	@FXML
	protected Button buttonRemove;
	@FXML
	protected Button buttonRemoveAll;
	@FXML
	protected Button buttonCancel;
	@FXML
	protected Button buttonOk;

	public void initialize() {
	}

	@FXML
	protected abstract void onButtonAction(ActionEvent event);

	@FXML
	protected abstract void onListViewMouseClicked(MouseEvent event);

}
