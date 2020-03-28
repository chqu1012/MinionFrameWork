package de.dc.minion.model.desk.control.feature;

import de.dc.minion.fx.model.Minion;
import de.dc.minion.fx.model.Toady;
import de.dc.minion.fx.model.ToadyStatus;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ToadyListCell extends ListCell<Minion>{

	private BooleanProperty enabledProperty = new SimpleBooleanProperty();
	
	@Override
	protected void updateItem(Minion item, boolean empty) {
		super.updateItem(item, empty);
		if (item==null || empty) {
			setText(null);
			setGraphic(null);
		}else {
			VBox vbox = new VBox(3);
			
			Toady toady = item.getToadies().get(0);
			
			Label labelName = new Label(toady.getName()==null?"No name" : toady.getName());
			labelName.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, 12));
			vbox.getChildren().add(labelName);
			
			Label labelDescription = new Label(toady.getDescription()==null? "":toady.getDescription());
			labelDescription.setFont(Font.font("arial", FontWeight.MEDIUM, 11));
			vbox.getChildren().add(labelDescription);
			
			HBox hbox = new HBox(5);
			hbox.setAlignment(Pos.BASELINE_LEFT);
			boolean isStarted = toady.getStatus()==ToadyStatus.STARTED;
			enabledProperty.set(isStarted);
			
			Label labelStatus = new Label(isStarted? "Enabled" : "Disabled");
			StringBinding styleStatus = Bindings.when(enabledProperty).then("-fx-background-color: green; -fx-text-fill: white").otherwise("-fx-background-color: red; -fx-text-fill: white");
			labelStatus.styleProperty().bind(styleStatus);
			labelStatus.setFont(Font.font(9));
			HBox.setHgrow(labelStatus, Priority.ALWAYS);
			hbox.getChildren().add(labelStatus);
			Button buttonEnable = new Button("Enable");
			buttonEnable.setOnAction(e->{
				toady.setStatus(ToadyStatus.STARTED);
				enabledProperty.set(true);
				MinionPlatform.getInstance(IEventBroker.class).post(new EventContext<>("/minion/update/toady/status", item));
			});
			Button buttonDisable = new Button("Disable");
			buttonDisable.setOnAction(e->{
				toady.setStatus(ToadyStatus.STOPPED);
				enabledProperty.set(false);
				MinionPlatform.getInstance(IEventBroker.class).post(new EventContext<>("/minion/update/toady/status", item));
			});

			buttonEnable.disableProperty().bind(enabledProperty);
			buttonDisable.disableProperty().bind(enabledProperty.not());
			
			hbox.getChildren().add(buttonEnable);
			hbox.getChildren().add(buttonDisable);
			vbox.getChildren().add(hbox);
			
			setGraphic(vbox);
		}
	}
}
