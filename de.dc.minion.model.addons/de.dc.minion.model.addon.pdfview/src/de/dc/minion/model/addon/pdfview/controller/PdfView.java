package de.dc.minion.model.addon.pdfview.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Objects;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javafx.beans.InvalidationListener;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.BorderPane;

public class PdfView extends BorderPane {

	@FXML
	protected Button buttonOpen;

	@FXML
	protected Button buttonExport;

	@FXML
	protected Button buttonPreviousPage;

	@FXML
	protected TextField textPageIndex;

	@FXML
	protected TextField textPageCount;

	@FXML
	protected TextField textDpi;

	@FXML
	protected Button buttonNextPage;

	@FXML
	protected Button buttonZoomIn;

	@FXML
	protected Button buttonZoomOut;

	@FXML
	protected ScrollPane scrolledPane;

	@FXML
	protected ImageView imageView;

	final DoubleProperty zoomProperty = new SimpleDoubleProperty(200);
	final IntegerProperty currentPageProperty = new SimpleIntegerProperty();
	final IntegerProperty pageSizeProperty = new SimpleIntegerProperty();
	final IntegerProperty dpiProperty = new SimpleIntegerProperty(300);
	
	private PDFRenderer renderer;

	@FXML
	protected void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
		if (source == buttonExport) {

		} else if (source == buttonNextPage) {
			boolean isEquals = currentPageProperty.get() < pageSizeProperty.get();
			if (isEquals) {
				currentPageProperty.set(currentPageProperty.add(1).get());
				try {
					setImage(createPdfPage(currentPageProperty.get()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else if (source == buttonOpen) {

		} else if (source == buttonPreviousPage) {
			boolean isEquals = currentPageProperty.get() > 0;
			if (isEquals) {
				currentPageProperty.set(currentPageProperty.subtract(1).get());
				try {
					setImage(createPdfPage(currentPageProperty.get()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else if (source == buttonZoomIn) {
			imageView.setScaleX(imageView.getScaleX() * 1.02);
			imageView.setScaleY(imageView.getScaleY() * 1.02);
		} else if (source == buttonZoomOut) {
			imageView.setScaleX(imageView.getScaleX() * 0.98);
			imageView.setScaleY(imageView.getScaleY() * 0.98);
		}
	}

	public PdfView() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/dc/minion/model/addon/pdfview/PdfView.fxml"));
		try {
			loader.setController(this);
			loader.setRoot(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		imageView.preserveRatioProperty().set(false);
		zoomProperty.addListener((InvalidationListener) arg0 -> {
			imageView.setFitWidth(zoomProperty.get() * 4);
			imageView.setFitHeight(zoomProperty.get() * 3);
		});

		scrolledPane.addEventFilter(ScrollEvent.ANY, event -> {
			if (event.getDeltaY() > 0) {
				zoomProperty.set(zoomProperty.get() * 1.1);
			} else if (event.getDeltaY() < 0) {
				zoomProperty.set(zoomProperty.get() / 1.1);
			}
		});
		
		textPageCount.textProperty().bind(pageSizeProperty.asString());
		textPageIndex.textProperty().bind(currentPageProperty.add(1).asString());
		textDpi.textProperty().bindBidirectional(dpiProperty, NumberFormat.getInstance());
	}

	public void setImage(Image createPdfPage) {
		imageView.setPreserveRatio(false);
		imageView.setFitWidth(createPdfPage.getWidth());
		imageView.setFitHeight(createPdfPage.getHeight());
		imageView.setPreserveRatio(true);
		imageView.setImage(createPdfPage);
	}
	
	public IntegerProperty pageSizeProperty() {
		return pageSizeProperty;
	}

	public IntegerProperty currentPageProperty() {
		return currentPageProperty;
	}
	
	public void renderPdf(String filepath) {
		PDDocument document = load(new File(filepath));
		renderer = new PDFRenderer(document);
		
		try {
			currentPageProperty.set(0);
			setImage(createPdfPage(0));
			pageSizeProperty().set(document.getNumberOfPages());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public PDDocument load(File file) {
		Objects.requireNonNull(file, "file can not be null");
		try {
			PDDocument doc = PDDocument.load(file);
			return doc;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Image createPdfPage(int pageNumber) throws IOException {
		BufferedImage bufferedImage = renderer.renderImageWithDPI(pageNumber, dpiProperty.get());
		return SwingFXUtils.toFXImage(bufferedImage, null);
	}

}
