package de.dc.minion.model.addon.snapshot;

import com.google.common.eventbus.Subscribe;

import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SnapshotColorVision extends EmfViewPart{

	private VBox parent;
	private TextField textFieldR;
	private TextField textFieldB;
	private TextField textFieldG;
	private TextField textFieldOpacity;

	private TextField textFieldROnClick;
	private TextField textFieldBOnClick;
	private TextField textFieldGOnClick;
	private Label labelRGB;
	private Label labelRGBOnClick;
	
	@Override
	public Parent create() {
		parent = new VBox(3.0);
		parent.setPadding(new Insets(10.0));
		parent.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		HBox hboxRGB = new HBox(3d);
		
		labelRGB = new Label();
		labelRGB.setPrefWidth(200);
		labelRGB.setPrefHeight(Double.MAX_VALUE);
		labelRGB.setStyle("-fx-border-color: white;");
		hboxRGB.getChildren().add(labelRGB);
		textFieldR = createTextField(hboxRGB, "R:");
		textFieldG = createTextField(hboxRGB, "G:");
		textFieldB = createTextField(hboxRGB, "B:");
		textFieldOpacity = createTextField(hboxRGB, "Opacity:");
		
		parent.getChildren().add(hboxRGB);
		parent.getChildren().add(new Label("Values on Mouse Click"));
		HBox hboxRGBOnClick = new HBox(3d);
		parent.getChildren().add(hboxRGBOnClick);

		labelRGBOnClick = new Label();
		labelRGBOnClick.setPrefWidth(200);
		labelRGBOnClick.setPrefHeight(Double.MAX_VALUE);
		labelRGBOnClick.setStyle("-fx-border-color: white;");
		hboxRGBOnClick.getChildren().add(labelRGBOnClick);

		textFieldROnClick = createTextField(hboxRGBOnClick, "R:");
		textFieldGOnClick = createTextField(hboxRGBOnClick, "G:");
		textFieldBOnClick = createTextField(hboxRGBOnClick, "B:");
		
		MinionPlatform.getInstance(IEventBroker.class).register(this);
		
		return parent;
	}

	private TextField createTextField(HBox parent, String value) {
		Label label = new Label(value);
		label.setPrefHeight(Double.MAX_VALUE);
		label.setAlignment(Pos.BASELINE_RIGHT);
		TextField textField = new TextField();
		textField.setPrefWidth(50);
		
		parent.getChildren().addAll(label, textField);
		return textField;
	}

	@Subscribe
	public void subscribeUpdateValue(EventContext<ColorGrading> context) {
		if (context.getEventId().equals("/update/snapshot/color/vision/hover")) {
			ColorGrading cg = context.getInput();
			String r = String.valueOf(cg.getR());
			String g = String.valueOf(cg.getG());
			String b = String.valueOf(cg.getB());
			textFieldR.setText(r);
			textFieldG.setText(g);
			textFieldB.setText(b);
			textFieldOpacity.setText(String.valueOf(cg.getOpacity()));
			
			labelRGB.setStyle("-fx-background-color: rgb("+r+","+g+","+b+"); -fx-border-color: white;");
		}else if (context.getEventId().equals("/update/snapshot/color/vision/click")) {
			ColorGrading cg = context.getInput();
			String r = String.valueOf(cg.getR());
			String g = String.valueOf(cg.getG());
			String b = String.valueOf(cg.getB());
			textFieldROnClick.setText(r);
			textFieldGOnClick.setText(g);
			textFieldBOnClick.setText(b);
			labelRGBOnClick.setStyle("-fx-background-color: rgb("+r+","+g+","+b+"); -fx-border-color: white;");
		}
	}
}
