package de.dc.minion.model.addon.fileview.touch;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.fx.ui.controls.filesystem.DirectoryTreeView;
import org.eclipse.fx.ui.controls.filesystem.IconSize;
import org.eclipse.fx.ui.controls.filesystem.ResourceItem;
import org.eclipse.fx.ui.controls.filesystem.RootDirItem;

import de.dc.minion.model.common.control.EmfViewPart;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class EfxDirectoryTreeVision extends EmfViewPart {

	@Override
	public Parent create() {
		DirectoryTreeView view = new DirectoryTreeView();
		view.setIconSize(IconSize.SMALL);
		Path rootPath = Paths.get("C:\\Program Files (x86)");
		RootDirItem rootItem = ResourceItem.createObservedPath(rootPath);
		view.setRootDirectories(FXCollections.observableArrayList(rootItem));
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
