package de.dc.minion.model.addon.pdfview.touch;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.rendering.RenderDestination;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.model.addon.pdfview.controller.PdfView;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PdfVision extends EmfViewPart {

	@Inject IEventBroker eventBroker;
	
	private final ObjectProperty<PDDocument> document = new SimpleObjectProperty<>(this, "document");
	private PDFRenderer renderer;

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
			renderPdf(context.getInput());
		}
		
	}

	private void renderPdf(String filepath) {
		PDDocument document = load(new File(filepath));
		renderer = new PDFRenderer(document);
		
		try {
			pdfView.setImage(createPdfPage(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public PDDocument load(File file) {
		Objects.requireNonNull(file, "file can not be null");
		try {
			PDDocument doc = PDDocument.load(file);
			setDocument(doc);
			return doc;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Image createPdfPage(int pageNumber) throws IOException {
		BufferedImage bufferedImage = renderer.renderImageWithDPI(1, 300);
		return SwingFXUtils.toFXImage(bufferedImage, null);
	}
}
