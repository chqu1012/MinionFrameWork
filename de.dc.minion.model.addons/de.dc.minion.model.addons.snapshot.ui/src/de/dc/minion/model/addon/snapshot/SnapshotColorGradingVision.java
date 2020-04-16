package de.dc.minion.model.addon.snapshot;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.google.inject.Inject;
import com.sun.javafx.scene.control.skin.CustomColorDialog;

import de.dc.minion.model.addon.snapshot.renderer.SnapshotFormRenderer;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.file.IEmfFileManager;
import de.dc.minion.model.desk.module.MinionPlatform;
import de.dc.minion.model.desk.util.EAttributeFormSwitch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SnapshotColorGradingVision extends EmfViewPart implements ChangeListener<Object> {

	@Inject
	protected IEmfFileManager emfFileManager;

	private EAttributeFormSwitch renderer;

	private VBox parent;
	
	private Map<String, Slider> sliderMap;
	private Layer selectedLayer;

	@Override
	public Parent create() {
		parent = new VBox(3);
		parent.setPadding(new Insets(10d));
		
		sliderMap = new HashMap<>();
		
		ColorGrading colorGrading = SnapshotFactory.eINSTANCE.createColorGrading();
		EList<EAttribute> attributes = colorGrading.eClass().getEAllAttributes();
		for (EAttribute eAttribute : attributes) {
			HBox hbox = new HBox(5.0);
			Label label = new Label(eAttribute.getName());
			label.setPrefWidth(100);
			hbox.getChildren().add(label);

			Slider node = new Slider();
			hbox.getChildren().add(node);
			
			Label labelValue = new Label();
			labelValue.textProperty().bind(node.valueProperty().asString());
			hbox.getChildren().add(labelValue);
			
			parent.getChildren().add(hbox);
			
			sliderMap.put(eAttribute.getName(), node);
		}
		
		CustomColorDialog dialog = new CustomColorDialog(new Stage());
		parent.getChildren().add(dialog);
		
		return parent;
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem<Object> treeItem = (TreeItem<Object>) newValue;
				Object value = treeItem.getValue();
				if (value instanceof Layer) {
					selectedLayer = (Layer) value;
					if (selectedLayer.getColorGrading() == null) {
						IEmfEditorPart<?> editorPart = emfFileManager.getActiveEditor().get();
						editorPart.executeAddCommand(selectedLayer, "ColorGrading");
					}else {
						setSlider("r", () -> selectedLayer.getColorGrading().getR(), r -> selectedLayer.getColorGrading().setR(r.intValue())).setMax(255);
						setSlider("g", () -> selectedLayer.getColorGrading().getG(), r -> selectedLayer.getColorGrading().setG(r.intValue())).setMax(255);
						setSlider("b", () -> selectedLayer.getColorGrading().getB(), r -> selectedLayer.getColorGrading().setB(r.intValue())).setMax(255);
						setSlider("opacity", () -> selectedLayer.getColorGrading().getOpacity(), r -> selectedLayer.getColorGrading().setOpacity(r)).setMax(1.0);
					}
				}else if (value instanceof ShadowEffect) {
					ShadowEffect effect = (ShadowEffect) value;
					
				}
			}
		}
	}

	private Slider setSlider(String sliderName, Supplier<Double> supplier, Consumer<Double> consumer) {
		Slider slider = sliderMap.get(sliderName);
		slider.setValue(supplier.get());
		slider.valueChangingProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
					Boolean newValue) {
				if (newValue==false) {
					consumer.accept(slider.getValue());
					MinionPlatform.getInstance(IEventBroker.class).post(new EventContext<>("/update/snapshot/diagram", ""));
				}
			}
		});
		return slider;
	}
}
