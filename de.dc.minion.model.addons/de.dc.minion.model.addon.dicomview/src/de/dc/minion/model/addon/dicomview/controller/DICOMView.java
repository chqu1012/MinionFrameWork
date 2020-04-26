package de.dc.minion.model.addon.dicomview.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Objects;

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.BorderPane;

public class DICOMView extends BorderPane {

	@FXML
	protected CheckBox buttonZoomOnScroll;
	
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
	final IntegerProperty dpiProperty = new SimpleIntegerProperty(150);
	
	@FXML
	protected void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
		if (source == buttonExport) {

		} else if (source == buttonNextPage) {
			dispatchOnPreviousPage();
		} else if (source == buttonOpen) {

		} else if (source == buttonPreviousPage) {
			dispatchOnNextPage();
		} else if (source == buttonZoomIn) {
			imageView.setScaleX(imageView.getScaleX() * 1.02);
			imageView.setScaleY(imageView.getScaleY() * 1.02);
		} else if (source == buttonZoomOut) {
			imageView.setScaleX(imageView.getScaleX() * 0.98);
			imageView.setScaleY(imageView.getScaleY() * 0.98);
		}
	}

	private void dispatchOnPreviousPage() {
		boolean isEquals = currentPageProperty.get() < pageSizeProperty.get();
		if (isEquals) {
//			currentPageProperty.set(currentPageProperty.add(1).get());
//			try {
//				setImage(createPdfPage(currentPageProperty.get()));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			scrolledPane.setVvalue(0);
		}
	}

	private void dispatchOnNextPage() {
		boolean isEquals = currentPageProperty.get() > 0;
		if (isEquals) {
//			currentPageProperty.set(currentPageProperty.subtract(1).get());
//			try {
//				setImage(createPdfPage(currentPageProperty.get()));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			scrolledPane.setVvalue(0);
		}
	}

	public DICOMView() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/dc/minion/model/addon/dicomview/DICOMView.fxml"));
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
			if (buttonZoomOnScroll.isSelected()) {
				if (event.getDeltaY() > 0) {
					zoomProperty.set(zoomProperty.get() * 1.1);
				} else if (event.getDeltaY() < 0) {
					zoomProperty.set(zoomProperty.get() * 0.9);
				}
			}else {
				if (event.getDeltaY() > 0) {
					dispatchOnNextPage();
				}else if (event.getDeltaY() < 0) {
					dispatchOnPreviousPage();
				}
			}
		});
		
		textPageCount.textProperty().bind(pageSizeProperty.asString());
		textPageIndex.textProperty().bind(currentPageProperty.add(1).asString());
		textDpi.textProperty().bindBidirectional(dpiProperty, NumberFormat.getInstance());
		
		dpiProperty.set(300);
	}

	public void setImage(Image createPdfPage) {
		imageView.setPreserveRatio(false);
		imageView.setFitWidth(createPdfPage.getWidth()*2);
		imageView.setFitHeight(createPdfPage.getHeight()*2);
		imageView.setPreserveRatio(true);
		imageView.setImage(createPdfPage);
	}
	
	public IntegerProperty pageSizeProperty() {
		return pageSizeProperty;
	}

	public IntegerProperty currentPageProperty() {
		return currentPageProperty;
	}
}
