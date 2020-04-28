package de.dc.minion.model.addon.fileview.touch;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.fx.ui.controls.filesystem.DirectoryTreeView;
import org.eclipse.fx.ui.controls.filesystem.DirectoryView;
import org.eclipse.fx.ui.controls.filesystem.IconSize;
import org.eclipse.fx.ui.controls.filesystem.ResourceItem;
import org.eclipse.fx.ui.controls.filesystem.ResourcePreview;
import org.eclipse.fx.ui.controls.filesystem.RootDirItem;

import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener.Change;
import javafx.scene.Parent;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class EfxDirectoryTreeResourceVision extends EmfViewPart {

	private TextField textFileUri;
	private TextField textFileName;
	private DirectoryView v;
	private ResourcePreview prev;
	private DirectoryTreeView view;

	@Override
	public Parent create() {
		Path rootPath = Paths.get("C:\\Development");
		RootDirItem rootItem = ResourceItem.createObservedPath(rootPath);

		view = new DirectoryTreeView();
		view.setIconSize(IconSize.SMALL);
		view.setRootDirectories(FXCollections.observableArrayList(rootItem));
		VBox.setVgrow(view, Priority.ALWAYS);
		textFileUri = new TextField();
		textFileName = new TextField();

		v = new DirectoryView();
		v.setIconSize(IconSize.SMALL);


		prev = new ResourcePreview();

		SplitPane parent = new SplitPane(view, v, prev);
		parent.setDividerPositions(0.3, 0.8);

		v.getSelectedItems().addListener(this::onResourcePreviewChanged);
		view.getSelectedItems().addListener(this::onDirectoryTreeChanged);
		view.getSelectedItems().addListener(this::onDirectoryTreeInvalidationChanged);
		return parent;
	}


	private void onResourcePreviewChanged(Observable observable) {
		if (v.getSelectedItems().size() == 1) {
			prev.setItem(v.getSelectedItems().get(0));
		} else {
			prev.setItem(null);
		}
	}

	private void onDirectoryTreeInvalidationChanged(Observable observable) {
		if (!view.getSelectedItems().isEmpty()) {
			v.setDir(view.getSelectedItems().get(0));
		} else {
			v.setDir(null);
		}
	}
		
	private void onDirectoryTreeChanged(Change<? extends ResourceItem> c) {
		c.getList().parallelStream().forEach(e -> {
			textFileName.setText(e.getName());
			textFileUri.setText(e.getUri());
		});
	}

}
