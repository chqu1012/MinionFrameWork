package de.dc.minion.model.addon.fileview.component;
import java.io.File;

public class FileTreeItem extends FilterableTreeItem<File> {

    public FileTreeItem(File value) {
		super(value);
	}

	public void addChild(FileTreeItem item) {
        getInternalChildren().add(item);
    }

    @Override
    public boolean isLeaf() {
        return getValue().isFile();
    }
}