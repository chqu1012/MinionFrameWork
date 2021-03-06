package de.dc.minion.model.addon.chart.ui.control;

import javafx.scene.chart.Axis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class BaseBarChart<X, Y> extends BaseXYChart<X, Y> {

	public BaseBarChart(Axis<X> xAxis, Axis<Y> yAxis) {
		super(xAxis, yAxis);
	}
	
	@Override
	protected XYChart<X, Y> getChart(Axis<X> xAxis, Axis<Y> yAxis) {
		if (chart==null) {
			chart = new BarChart<X, Y>(xAxis, yAxis);
		}
		return chart;
	}

}
