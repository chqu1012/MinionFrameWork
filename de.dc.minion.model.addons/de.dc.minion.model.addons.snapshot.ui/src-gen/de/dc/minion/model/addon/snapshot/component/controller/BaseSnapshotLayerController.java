package de.dc.minion.model.addon.snapshot.component.controller;
	
import de.dc.minion.model.addon.snapshot.Layer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
public abstract class BaseSnapshotLayerController extends VBox{
	
	@FXML protected GridPane gridpaneEffects;
	@FXML protected VBox root;
	@FXML protected TextField textSearch;
	@FXML protected Button buttonNew;
	@FXML protected Button buttonEdit;
	@FXML protected Button buttonDelete;
	@FXML protected Button buttonDuplicate;
	@FXML protected ListView<Layer> listViewLayer;
	@FXML protected ToolBar toolbarEffects;
	@FXML protected Button buttonBlend;
	@FXML protected Button buttonDropshadow;
	@FXML protected Button buttonBloom;
	@FXML protected Button buttonBoxBlur;
	@FXML protected Button buttonColorAdjust;
	@FXML protected Button buttonColorInput;
	@FXML protected Button buttonDisplacement;
	@FXML protected Button buttonGaussianBlur;
	@FXML protected Button buttonGlow;
	@FXML protected Button buttonLighting;
	@FXML protected Button buttonMotionBlur;
	@FXML protected Button buttonPerspectiveTransform;
	@FXML protected Button buttonReflection;
	@FXML protected Button buttonSepiaTone;
	@FXML protected Button buttonShadow;
	
	public void initialize(){}
	
	@FXML
	protected abstract void onButtonAction(ActionEvent event);
	
}
