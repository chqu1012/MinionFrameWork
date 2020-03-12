package de.dc.minion.model.addon.chart.ui.control;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class BaseLineChart<X, Y> extends BaseXYChart<X, Y> {

	public BaseLineChart(Axis<X> xAxis, Axis<Y> yAxis) {
		super(xAxis, yAxis);
	}

	@Override
	protected XYChart<X, Y> getChart(Axis<X> xAxis, Axis<Y> yAxis) {
		if (chart==null) {
			chart = new LineChart<X, Y>(xAxis, yAxis);
		}
		return chart;
	}
}