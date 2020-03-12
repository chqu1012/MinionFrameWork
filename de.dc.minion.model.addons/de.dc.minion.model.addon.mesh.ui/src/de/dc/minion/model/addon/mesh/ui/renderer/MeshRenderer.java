package de.dc.minion.model.addon.mesh.ui.renderer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.dc.minion.model.addon.mesh.Box;
import de.dc.minion.model.addon.mesh.Circle;
import de.dc.minion.model.addon.mesh.MeshContainer;
import de.dc.minion.model.addon.mesh.Rectangle;
import de.dc.minion.model.addon.mesh.util.MeshSwitch;
import de.dc.minion.model.desk.control.shape.MouseHandler;
import de.dc.minion.model.desk.control.shape.SelectionModel;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class MeshRenderer extends MeshSwitch<Object> {

	private Group selectionLayer = new Group();
	private Group root = new Group(selectionLayer);
	private SelectionModel selectionModel = new SelectionModel(selectionLayer);
	private MouseHandler mouseHandler = new MouseHandler(selectionModel);
	private double anchorX, anchorY;
	private double anchorAngleX = 0;
	private double anchorAngleY = 0;
	
	private final DoubleProperty angleX = new SimpleDoubleProperty(0);
	private final DoubleProperty angleY = new SimpleDoubleProperty(0);
	
	private Map<de.dc.minion.model.addon.mesh.Shape, Shape> shapeManager = new HashMap<>();
	private HBox hboxTimeline = new HBox(5);
	
	private List<Transition> runningTransitions = new ArrayList<>();
	
	public MeshRenderer() {
		root.prefHeight(800);
		root.prefWidth(1200);
		root.maxHeight(Double.MAX_VALUE);
		root.maxWidth(Double.MAX_VALUE);
		
		Rotate xRotate = new Rotate(0, Rotate.X_AXIS);
		Rotate yRotate = new Rotate(0, Rotate.Y_AXIS);
		selectionLayer.getTransforms().addAll(xRotate, yRotate);
		yRotate.angleProperty().bind(angleY);
		xRotate.angleProperty().bind(angleX);

//		selectionLayer.setOnMousePressed(event -> {
//			anchorX = event.getSceneX();
//			anchorY = event.getSceneY();
//			anchorAngleX = angleX.get();
//			anchorAngleY = angleY.get();
//		});
//
//		selectionLayer.setOnMouseDragged(event -> {
//			angleX.set(anchorAngleX - (anchorY - event.getSceneY()));
//			angleY.set(anchorAngleY + anchorX - event.getSceneX());
//		});
		
		hboxTimeline.setLayoutX(10);
		hboxTimeline.setLayoutY(10);
		root.getChildren().add(hboxTimeline);
	}
	
	@Override
	public Object caseMeshContainer(MeshContainer object) {
		object.getShapes().forEach(this::doSwitch);
		object.getTimelines().forEach(this::doSwitch);
		return super.caseMeshContainer(object);
	}

	@Override
	public Object caseTimeline(de.dc.minion.model.addon.mesh.Timeline object) {
		final Button buttonPlay = new Button("Play "+ object.getName());
		buttonPlay.setOnMouseClicked(e->{
			for (de.dc.minion.model.addon.mesh.Transition transition : object.getPlay()) {
				for (de.dc.minion.model.addon.mesh.Shape s : transition.getTransitionShapes()) {
					FadeTransition t = (FadeTransition) doSwitch(transition);
					t.setNode(shapeManager.get(s));
					t.play();
					
					runningTransitions.add(t);
					buttonPlay.setDisable(true);
				}
			}
			
		});
		hboxTimeline.getChildren().add(buttonPlay);
		
		Button buttonStop = new Button("Stop "+ object.getName());
		buttonStop.setOnMouseClicked(e->{
			for (Transition transition : runningTransitions) {
				transition.stop();
			}
			runningTransitions.clear();
			buttonPlay.setDisable(false);
		});
		hboxTimeline.getChildren().add(buttonStop);
		return super.caseTimeline(object);
	}
	
	@Override
	public Node caseRectangle(Rectangle object) {
		javafx.scene.shape.Rectangle r = new javafx.scene.shape.Rectangle();
		r.setX(object.getPositionX());
		r.setY(object.getPositionY());
		r.setWidth(object.getWidth());
		r.setHeight(object.getHeight());
		setStyle(object, r);
		selectionLayer.getChildren().add(r);
		mouseHandler.makeDraggable(r);
		
		shapeManager.put(object, r);
		return r;
	}

	@Override
	public Node caseBox(Box object) {
		javafx.scene.shape.Box r = new javafx.scene.shape.Box();
		r.setWidth(object.getWidth());
		r.setHeight(object.getHeight());
		r.setDepth(object.getDepth());
		setStyle(object, r);
		selectionLayer.getChildren().add(r);
		return r;
	}

	@Override
	public Transition caseFadeTransition(de.dc.minion.model.addon.mesh.FadeTransition object) {
		FadeTransition ft = new FadeTransition(Duration.millis(500));
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		return ft;
	}
	
	private void setStyle(de.dc.minion.model.addon.mesh.Shape object, Node r) {
		String background = object.getColorBackground() == null ? "gray" : object.getColorBackground();
		String border = object.getColorBorder() == null ? "green" : object.getColorBorder();
		r.setStyle("-fx-fill: " + background + "; -fx-stroke-color: " + border);
	}

	@Override
	public Node caseCircle(Circle object) {
		javafx.scene.shape.Circle c = new javafx.scene.shape.Circle();
		c.setRadius(object.getRadius());
		setStyle(object, c);
		selectionLayer.getChildren().add(c);
		mouseHandler.makeDraggable(c);
		return c;
	}

	public void clear() {
		hboxTimeline.getChildren().clear();
		selectionLayer.getChildren().clear();
	}

	public Group getRoot() {
		return root;
	}
}
