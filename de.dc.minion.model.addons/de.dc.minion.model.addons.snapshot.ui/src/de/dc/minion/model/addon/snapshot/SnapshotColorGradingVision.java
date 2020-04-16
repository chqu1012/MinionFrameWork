package de.dc.minion.model.addon.snapshot;

import com.google.inject.Inject;

import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.file.IEmfFileManager;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.BorderPane;

public class SnapshotColorGradingVision extends EmfViewPart implements ChangeListener<Object> {

	@Inject
	protected IEmfFileManager emfFileManager;
	
	@Override
	public Parent create() {
		BorderPane parent = new BorderPane();
		return parent;
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem<Object> treeItem = (TreeItem<Object>) newValue;
				Object value = treeItem.getValue();
				if (value instanceof Layer) {
					Layer layer = (Layer) value;
					ColorGrading colorGrading = layer.getColorGrading();
					if (colorGrading == null) {
						IEmfEditorPart<?> editorPart = emfFileManager.getActiveEditor().get();
						colorGrading = (ColorGrading) editorPart.executeAddCommand(layer, "ColorGrading");
					}
				}
			}
		}
	}
}
