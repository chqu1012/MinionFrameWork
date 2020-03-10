package de.dc.minion.model.desk.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public abstract class BaseEmfDetailedTreeViewController extends SplitPane {

	@FXML
	protected HBox childToolbar;
	
	@FXML
	protected HBox toolbar;
	
	@FXML
	protected SplitPane root;
	
    @FXML
    protected AnchorPane emfModelTreeViewContainer;

    @FXML
    protected VBox attributeContainer;

    @FXML
    protected VBox childAttributeContainer;

    @FXML
    protected abstract void onAddNewValueAction(ActionEvent event);

    @FXML
    protected abstract void onDeleteSelectionValueAction(ActionEvent event);

    @FXML
    protected abstract void onEditValueAction(ActionEvent event);

}
