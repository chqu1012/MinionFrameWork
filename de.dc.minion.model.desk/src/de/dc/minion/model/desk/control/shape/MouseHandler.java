package de.dc.minion.model.desk.control.shape;
import javafx.scene.Node;

public class MouseHandler {

    private SelectionModel selectionModel;

    public MouseHandler( SelectionModel selectionModel) {
        this.selectionModel = selectionModel;
    }

    private class DragContext {
        double x;
        double y;
    }

    public void makeDraggable( final Node node) {
        final DragContext dragDelta = new DragContext();
        node.setOnMousePressed(mouseEvent -> {
        	if (!mouseEvent.isControlDown()) {
        		selectionModel.clear();
			}

            // add to selection model, create drag handles
            selectionModel.add(node);

            dragDelta.x = node.getTranslateX() - mouseEvent.getSceneX();
            dragDelta.y = node.getTranslateY() - mouseEvent.getSceneY();

            // consume event, so that scene won't get it (which clears selection)
            mouseEvent.consume();
        });

        node.setOnMouseDragged(mouseEvent -> {
            selectionModel.getSelection().forEach(n->{
            	n.setTranslateX(mouseEvent.getSceneX() + dragDelta.x);
                n.setTranslateY(mouseEvent.getSceneY() + dragDelta.y);
            });
        });

        node.setOnMouseReleased(mouseEvent -> fixPosition(node));
    }

    private void fixPosition( Node node) {
        double x = node.getTranslateX();
        double y = node.getTranslateY();
        node.relocate(node.getLayoutX() + x, node.getLayoutY() + y);
        node.setTranslateX(0);
        node.setTranslateY(0);
    }
}