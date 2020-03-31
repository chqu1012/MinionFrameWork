package de.dc.minion.model.addon.pdfview.controller;

import java.io.IOException;

import javafx.beans.InvalidationListener;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
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

	@FXML
	protected void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
		if (source == buttonExport) {

		} else if (source == buttonNextPage) {

		} else if (source == buttonOpen) {

		} else if (source == buttonPreviousPage) {

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
		imageView.preserveRatioProperty().set(true);
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
	}

	public void setImage(Image createPdfPage) {
		imageView.setImage(createPdfPage);
	}

}
