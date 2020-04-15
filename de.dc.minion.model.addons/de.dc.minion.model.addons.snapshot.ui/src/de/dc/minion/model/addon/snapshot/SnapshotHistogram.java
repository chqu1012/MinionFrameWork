package de.dc.minion.model.addon.snapshot;

import java.io.File;
import java.net.MalformedURLException;

import org.gillius.jfxutils.chart.ChartPanManager;
import org.gillius.jfxutils.chart.JFXChartUtil;

import de.dc.minion.model.addon.snapshot.component.Histogram;
import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;

public class SnapshotHistogram extends EmfViewPart implements ChangeListener<Object> {

	private AreaChart<String, Number> chartHistogram;
	private Histogram histogram;

	@Override
	public Parent create() {
		CategoryAxis xAxis = new CategoryAxis();
		NumberAxis yAxis = new NumberAxis();
		
		histogram = new Histogram();
		
		chartHistogram = new AreaChart<>(xAxis, yAxis);
		chartHistogram.setCreateSymbols(false);
		
		chartHistogram.getData().add(histogram.getSeriesBlue());
		chartHistogram.getData().add(histogram.getSeriesGreen());
		chartHistogram.getData().add(histogram.getSeriesRed());
		return chartHistogram;
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem<Object> treeItem = (TreeItem<Object>) newValue;
				Object value = treeItem.getValue();
				
				if (value instanceof Snapshot) {
					Snapshot s = (Snapshot) value;
					try {
						histogram.update(new Image(new File(s.getImagePath()).toURI().toURL().toExternalForm()));
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
