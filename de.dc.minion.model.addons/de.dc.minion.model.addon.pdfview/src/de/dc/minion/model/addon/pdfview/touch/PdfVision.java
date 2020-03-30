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
import javafx.scene.layout.VBox;

public class PdfVision extends EmfViewPart {

	@Inject IEventBroker eventBroker;
	
	private final ObjectProperty<PDDocument> document = new SimpleObjectProperty<>(this, "document");
	private PDFRenderer renderer;
	private ImageView imageView;

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
	}

	@Override
	public Parent create() {
		VBox parent = new VBox();
		imageView = new ImageView();
		parent.setStyle("-fx-background-color: white");
		parent.getChildren().add(imageView);
		return parent;
	}
	
	@Subscribe
	public void subscribeRenderPdf(EventContext<String> context) {
		if (context.getEventId().equals("/open/pdf/file")) {
			renderPdf(context.getInput());
		}
		
	}

	private void renderPdf(String filepath) {
		PDDocument document = load(new File(filepath));
		if (renderer == null) {
			renderer = new PDFRenderer(document);
		}
		
		try {
			imageView.setImage(createPdfPage(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public PDDocument load(File file) {
		Objects.requireNonNull(file, "file can not be null");
		try {
			return PDDocument.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Image createPdfPage(int pageNumber) throws IOException {
		BufferedImage bufferedImage = renderer.renderImage(pageNumber, 1.0f, ImageType.ARGB, RenderDestination.VIEW);
		return SwingFXUtils.toFXImage(bufferedImage, null);
	}
}
