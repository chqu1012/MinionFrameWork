package de.dc.minion.model.addon.snapshot.component;

import javafx.scene.chart.XYChart;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;

public class Histogram {

	private long alpha[] = new long[256];
	private long red[] = new long[256];
	private long green[] = new long[256];
	private long blue[] = new long[256];

	private XYChart.Series seriesAlpha;
	private XYChart.Series seriesRed;
	private XYChart.Series seriesGreen;
	private XYChart.Series seriesBlue;

	public Histogram() {
		for (int i = 0; i < 256; i++) {
			alpha[i] = red[i] = green[i] = blue[i] = 0;
		}

		seriesAlpha = new XYChart.Series();
		seriesRed = new XYChart.Series();
		seriesGreen = new XYChart.Series();
		seriesBlue = new XYChart.Series();
		seriesAlpha.setName("alpha");
		seriesRed.setName("red");
		seriesGreen.setName("green");
		seriesBlue.setName("blue");
	}

	public void update(Image image) {
		seriesAlpha.getData().clear();
		seriesRed.getData().clear();
		seriesGreen.getData().clear();
		seriesBlue.getData().clear();
		
		PixelReader pixelReader = image.getPixelReader();
		if (pixelReader == null) {
			return;
		}

		for (int y = 0; y < image.getHeight(); y++) {
			for (int x = 0; x < image.getWidth(); x++) {
				int argb = pixelReader.getArgb(x, y);
				int a = (0xff & (argb >> 24));
				int r = (0xff & (argb >> 16));
				int g = (0xff & (argb >> 8));
				int b = (0xff & argb);

				alpha[a]++;
				red[r]++;
				green[g]++;
				blue[b]++;
			}
		}
		
		for (int i = 0; i < 256; i++) {
			seriesAlpha.getData().add(new XYChart.Data<String, Long>(String.valueOf(i), alpha[i]));
			seriesRed.getData().add(new XYChart.Data<String, Long>(String.valueOf(i), red[i]));
			seriesGreen.getData().add(new XYChart.Data<String, Long>(String.valueOf(i), green[i]));
			seriesBlue.getData().add(new XYChart.Data<String, Long>(String.valueOf(i), blue[i]));
		}
	}

	public XYChart.Series getSeriesAlpha() {
		return seriesAlpha;
	}

	public XYChart.Series getSeriesRed() {
		return seriesRed;
	}

	public XYChart.Series getSeriesGreen() {
		return seriesGreen;
	}

	public XYChart.Series getSeriesBlue() {
		return seriesBlue;
	}
}