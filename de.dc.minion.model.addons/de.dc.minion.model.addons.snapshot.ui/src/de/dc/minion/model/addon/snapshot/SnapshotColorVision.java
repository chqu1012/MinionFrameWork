package de.dc.minion.model.addon.snapshot;

import com.google.common.eventbus.Subscribe;

import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SnapshotColorVision  extends EmfViewPart{

	private VBox parent;
	private TextField textFieldR;
	private TextField textFieldB;
	private TextField textFieldG;
	
	@Override
	public Parent create() {
		parent = new VBox(3.0);
		parent.setPadding(new Insets(10.0));
		parent.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		textFieldR = createTextField("R:");
		textFieldG = createTextField("G:");
		textFieldB = createTextField("B:");
		
		MinionPlatform.getInstance(IEventBroker.class).register(this);
		
		return parent;
	}

	private TextField createTextField(String value) {
		HBox hbox = new HBox();
		Label label = new Label(value);
		label.setPrefWidth(50);
		TextField textField = new TextField();
		hbox.getChildren().addAll(label, textField);
		parent.getChildren().add(hbox);
		return textField;
	}

	@Subscribe
	public void subscribeUpdateValue(EventContext<ColorGrading> context) {
		if (context.getEventId().equals("/update/snapshot/color/vision")) {
			ColorGrading cg = context.getInput();
			textFieldR.setText(String.valueOf(cg.getR()));
			textFieldG.setText(String.valueOf(cg.getG()));
			textFieldB.setText(String.valueOf(cg.getB()));
		}
	}
}
