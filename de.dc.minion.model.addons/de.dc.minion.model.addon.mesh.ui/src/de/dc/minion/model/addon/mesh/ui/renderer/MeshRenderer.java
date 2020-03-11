package de.dc.minion.model.addon.mesh.ui.renderer;

import de.dc.minion.model.addon.mesh.Circle;
import de.dc.minion.model.addon.mesh.MeshContainer;
import de.dc.minion.model.addon.mesh.Rectangle;
import de.dc.minion.model.addon.mesh.util.MeshSwitch;
import de.dc.minion.model.desk.control.shape.MouseHandler;
import de.dc.minion.model.desk.control.shape.SelectionModel;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.Shape;

public class MeshRenderer extends MeshSwitch<Node>{

	private Group selectionLayer = new Group();
	private Group root = new Group(selectionLayer);
	private SelectionModel selectionModel = new SelectionModel(selectionLayer);
	private MouseHandler mouseHandler = new MouseHandler(selectionModel);
	
	@Override
	public Node caseMeshContainer(MeshContainer object) {
		object.getShapes().forEach(e->doSwitch(e));
		return super.caseMeshContainer(object);
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
		return r;
	}

	private void setStyle(de.dc.minion.model.addon.mesh.Shape object, Shape r) {
		String background = object.getColorBackground()==null? "gray" :object.getColorBackground();
		String border = object.getColorBorder()==null? "green" : object.getColorBorder();
		r.setStyle("-fx-fill: "+background+"; -fx-stroke-color: "+border);
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
		selectionLayer.getChildren().clear();
	}
	
	public Group getRoot() {
		return root;
	}
}
