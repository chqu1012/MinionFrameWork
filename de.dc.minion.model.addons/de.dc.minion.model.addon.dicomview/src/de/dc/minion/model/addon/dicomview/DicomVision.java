package de.dc.minion.model.addon.dicomview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FilenameUtils;

import com.google.common.eventbus.Subscribe;

import de.dc.minion.model.addon.dicomview.controller.DICOMView;
import de.dc.minion.model.addon.fileview.touch.FileVision;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import ij.plugin.DICOM;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Parent;
import javafx.scene.control.SplitPane;
import javafx.scene.image.WritableImage;

public class DicomVision extends FileVision{

	private DICOMView dicomView;

	@Override
	public Parent create() {
		MinionPlatform.getInstance(IEventBroker.class).register(this);
		
		SplitPane parent = new SplitPane();
		parent.getItems().add(createFileView());
		dicomView = new DICOMView();
		parent.getItems().add(dicomView);
		parent.setDividerPosition(0, 0.2);
		
		setRoot("C:\\Development\\Repository\\MinionFrameWork\\de.dc.minion.model.addons\\de.dc.minion.model.addon.dicomview\\resources");
		return parent;
	}
	
	@Subscribe
	public void subscribeOpenFile(EventContext<File> context) {
		if (context.getEventId().equals("/open/file/from/file/vision")) {
			File input = context.getInput();
			if (FilenameUtils.getExtension(input.getName()).equals("dcm")) {
				try {
					DICOM dicom = new DICOM(new FileInputStream(input));
					dicom.run(input.getAbsolutePath());
					WritableImage image = SwingFXUtils.toFXImage(dicom.getBufferedImage(), null);
					dicomView.setImage(image);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
