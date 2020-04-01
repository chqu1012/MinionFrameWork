package de.dc.minion.model.addon.pdfview.touch;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.pdfbox.pdmodel.PDDocument;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.model.addon.pdfview.controller.PdfView;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Parent;

public class PdfVision extends EmfViewPart {

	@Inject IEventBroker eventBroker;
	
	private final ObjectProperty<PDDocument> document = new SimpleObjectProperty<>(this, "document");

	private PdfView pdfView;

	public final ObjectProperty<PDDocument> documentProperty() {
		return document;
	}

	public final PDDocument getDocument() {
		return document.get();
	}

	public final void setDocument(PDDocument document) {
		this.document.set(document);
	}

	public PdfVision() {
		documentProperty().addListener((obs, oldDoc, newDoc) -> {
			if (oldDoc != null) {
				try {
					oldDoc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		MinionPlatform.inject(this);
		eventBroker.register(this);
		
		setOnCloseRequest(e-> {
			try {
				PDDocument doc = documentProperty().get();
				if (doc!=null) {
					doc.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
	}

	@Override
	public Parent create() {
		pdfView = new PdfView();
		return pdfView;
	}
	
	@Subscribe
	public void subscribeRenderPdf(EventContext<String> context) {
		if (context.getEventId().equals("/open/pdf/file")) {
			String input = context.getInput();
			Path path = Paths.get(input); 
	        Path fileName = path.getFileName(); 
			pdfView.renderPdf(input);
			
			setText(fileName.toString());
		}
		
	}
}
