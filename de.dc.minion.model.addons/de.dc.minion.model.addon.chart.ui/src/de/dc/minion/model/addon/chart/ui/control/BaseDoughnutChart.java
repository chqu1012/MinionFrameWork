package de.dc.minion.model.addon.chart.ui.control;

import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Based on https://gist.github.com/jewelsea/b218c810b9d1009138bd
 * @author Dim
 *
 */
public abstract class BaseDoughnutChart extends BasePieChart {

	private final Circle innerCircle;
	
	public BaseDoughnutChart() {
		innerCircle = new Circle();
		innerCircle.setFill(Color.WHITESMOKE);
		innerCircle.setStroke(Color.WHITE);
		innerCircle.setStrokeWidth(3);
	}

	@Override
	protected void layoutChartChildren(double top, double left, double contentWidth, double contentHeight) {
		super.layoutChartChildren(top, left, contentWidth, contentHeight);

		addInnerCircleIfNotPresent();
		updateInnerCircleLayout();
	}

	private void addInnerCircleIfNotPresent() {
		if (getData().isEmpty()) {
			Node pie = getData().get(0).getNode();
			if (pie.getParent() instanceof Pane) {
				Pane parent = (Pane) pie.getParent();

				if (!parent.getChildren().contains(innerCircle)) {
					parent.getChildren().add(innerCircle);
				}
			}
		}
	}

	private void updateInnerCircleLayout() {
		double minX = Double.MAX_VALUE;
		double minY = Double.MAX_VALUE;
		double maxX = Double.MIN_VALUE;
		double maxY = Double.MIN_VALUE;
		for (PieChart.Data data : getData()) {
			Node node = data.getNode();

			Bounds bounds = node.getBoundsInParent();
			if (bounds.getMinX() < minX) {
				minX = bounds.getMinX();
			}
			if (bounds.getMinY() < minY) {
				minY = bounds.getMinY();
			}
			if (bounds.getMaxX() > maxX) {
				maxX = bounds.getMaxX();
			}
			if (bounds.getMaxY() > maxY) {
				maxY = bounds.getMaxY();
			}
		}

		innerCircle.setCenterX(minX + (maxX - minX) / 2);
		innerCircle.setCenterY(minY + (maxY - minY) / 2);
		innerCircle.setRadius((maxX - minX) / 4);
	}
}