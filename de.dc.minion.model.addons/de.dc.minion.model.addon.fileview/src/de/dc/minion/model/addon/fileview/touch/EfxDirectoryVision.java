package de.dc.minion.model.addon.fileview.touch;

import java.nio.file.Paths;

import org.eclipse.fx.ui.controls.filesystem.DirectoryView;
import org.eclipse.fx.ui.controls.filesystem.IconSize;
import org.eclipse.fx.ui.controls.filesystem.ResourceItem;

import de.dc.minion.model.common.control.EmfViewPart;
import javafx.collections.ListChangeListener;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class EfxDirectoryVision extends EmfViewPart {

	@Override
	public Parent create() {
		DirectoryView view = new DirectoryView();
		view.setIconSize(IconSize.SMALL);
		view.setDir(ResourceItem.createObservedPath(Paths.get("C:\\Program Files (x86)")));
		VBox.setVgrow(view, Priority.ALWAYS);
		TextField textFileUri = new TextField();
		TextField textFileName = new TextField();

		VBox parent = new VBox(5);
		parent.getChildren().add(new Label("File Name"));
		parent.getChildren().add(textFileName);
		parent.getChildren().add(new Label("File Uri"));
		parent.getChildren().add(textFileUri);
		parent.getChildren().add(view);
		
		view.getSelectedItems().addListener(new ListChangeListener<ResourceItem>() {
			@Override
			public void onChanged(Change<? extends ResourceItem> c) {
				c.getList().parallelStream().forEach(e->{
					textFileName.setText(e.getName());
					textFileUri.setText(e.getUri());
				});
			}
		});
		return parent;
	}

}
