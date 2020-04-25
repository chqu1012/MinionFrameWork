package de.dc.minion.model.addon.fileview.touch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Charsets;
import com.google.common.eventbus.Subscribe;

import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.scene.Parent;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class FilePreviewVision extends FileVision{

	private TextArea textArea;

	@Override
	public Parent create() {
		MinionPlatform.getInstance(IEventBroker.class).register(this);
		
		VBox fileView = createFileView();
		textArea = new TextArea();
		SplitPane splitpane = new SplitPane(fileView, textArea);
		return splitpane;
	}
	
	@Subscribe
	public void subscribeOpenFile(EventContext<File> context) {
		if (context.getEventId().equals("/open/file/from/file/vision")) {
			File input = context.getInput();
			if (input.isFile()) {
				try {
					String content = FileUtils.readFileToString(input, Charsets.UTF_8);
					textArea.setText(content);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
