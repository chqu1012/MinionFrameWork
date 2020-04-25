package de.dc.minion.model.addon.fileview.touch;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.fx.ui.controls.tree.FilterableTreeItem;
import org.eclipse.fx.ui.controls.tree.TreeItemPredicate;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.model.addon.fileview.component.FileTreeItem;
import de.dc.minion.model.addon.fileview.component.SimpleFileTreeItem;
import de.dc.minion.model.addon.fileview.component.cell.FileTreeCell;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class FileVision extends EmfViewPart {

	@Inject
	IEventBroker eventBroker;
	private TreeView<File> fileView;
	private TextField textSearch;

	@Override
	public Parent create() {
		VBox vbox = new VBox(1);

		HBox hBox = new HBox();
		TextField textPath = new TextField();
		textSearch = new TextField();
		textSearch.setPromptText("Enter filter text ...");

		HBox.setHgrow(textPath, Priority.ALWAYS);
		hBox.getChildren().addAll(textPath, textSearch);
		textPath.setText("C:\\Development\\Repository\\MinionFrameWork\\de.dc.minion.model.addons\\de.dc.minion.model.addon.chart");

		String currentPath = "C:\\Development\\Repository\\MinionFrameWork\\de.dc.minion.model.addons\\de.dc.minion.model.addon.chart";
		FileTreeItem rootItem = new FileTreeItem(new File(currentPath));
		getTreeModel(rootItem);
		
		fileView = new TreeView<>(rootItem);
		fileView.setCellFactory(cell -> new FileTreeCell());
		fileView.setShowRoot(true);
		
		VBox.setVgrow(fileView, Priority.ALWAYS);
		vbox.getChildren().addAll(hBox, fileView);
		fileView.getSelectionModel().selectedItemProperty()
				.addListener((ChangeListener<TreeItem<File>>) (observable, oldValue, newValue) -> {
					if (newValue != null) {
						textPath.setText(newValue.getValue().getAbsolutePath());
					}
				});

		rootItem.predicateProperty().bind(
                Bindings.createObjectBinding(this::searchTreeItemPredicate, textSearch.textProperty()));
		return vbox;
	}

	private FileTreeItem getTreeModel(FileTreeItem rootItem) {
		buildChildren(rootItem);
		rootItem.setExpanded(true);
		
		return rootItem;
	}

    private FileTreeItem.Predicate<File> searchTreeItemPredicate() {
        if ((textSearch.getText() == null) || (textSearch.getText().isEmpty())) {
            return null;
        }
        return this::onSearch;
    }

    private boolean onSearch(TreeItem<File> parent, File file) {
        String searchString = textSearch.getText().toLowerCase();
        return file.getName().toLowerCase().contains(searchString);
    }
	
	private ObservableList<TreeItem<File>> buildChildren(FileTreeItem root) {
		File f = root.getValue();
		if (f != null && f.isDirectory()) {
			File[] files = f.listFiles();
			if (files != null) {
				for (File childFile : files) {
					FileTreeItem childItem = new FileTreeItem(childFile);
					buildChildren(childItem);					
					root.addChild(childItem);
				}

			}
		}

		return FXCollections.emptyObservableList();
	}

	@Subscribe
	public void subscribeRenderPdf(EventContext<String> context) {
		if (context.getEventId().equals("/open/file")) {
			String input = context.getInput();
			Path path = Paths.get(input);
			Path fileName = path.getFileName();

			setText(fileName.toString());
		}
	}
}
