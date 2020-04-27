package de.dc.minion.model.desk.metro.component;

import de.dc.minion.fx.model.Command;
import de.dc.minion.fx.model.Landscape;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public abstract class BaseMinionRibbonControl extends BorderPane{

	@FXML
	protected ProgressBar progressbar;
	
	@FXML
	protected ListView<Command> listViewCommands;
	
	@FXML
	protected TextField textSearchCommand;

	@FXML
	protected HBox hboxRegisteredCommands;
	
    @FXML
    protected ComboBox<?> comboBoxLandscapesOpen;

    @FXML
    protected TextField textSearchlandscapes;
	
    @FXML
    protected BorderPane tabRoot;

    @FXML
    protected Tab tabHome;

    @FXML
    protected Button buttonTouchManager;

    @FXML
    protected Button buttonOpen;

    @FXML
    protected Button buttonNew;

    @FXML
    protected Button buttonSave;

    @FXML
    protected Button buttonSaveAs;

    @FXML
    protected Button buttonPaste;

    @FXML
    protected Button buttonCopy;

    @FXML
    protected Button buttonCut;

    @FXML
    protected Button buttonDuplicate;

    @FXML
    protected Button buttonUndo;

    @FXML
    protected Button buttonRedo;

    @FXML
    protected ListView<Landscape> listViewLandscapes;

    @FXML
    protected StackPane stackPaneMain;

    @FXML
    protected Label labelSelection;

    @FXML
    protected Label labelLandscape;

    @FXML
    protected abstract void onButtonAction(ActionEvent event);
    
    @FXML
    protected abstract void onMouseClicked(MouseEvent event);

}
