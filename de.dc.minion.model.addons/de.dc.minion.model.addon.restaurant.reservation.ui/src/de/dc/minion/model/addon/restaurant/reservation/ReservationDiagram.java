package de.dc.minion.model.addon.restaurant.reservation;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import de.dc.minion.model.addon.restaurant.reservation.renderer.ReservationRenderer;
import de.dc.minion.model.addon.restaurant.reservation.renderer.control.TableNode;
import de.dc.minion.model.addon.restaurant.reservation.renderer.control.WallNode;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.control.shape.ZoomableScrollPane;
import de.dc.minion.model.desk.util.DragResizeMod;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

public class ReservationDiagram extends EmfViewPart implements ChangeListener<Object> {

	protected static final Logger LOG = Logger.getLogger(ReservationDiagram.class.getSimpleName());

	private static final String CSS_SELECTED = ";-fx-border-color: yellow; -fx-border-width: 3";
	
	private ReservationRenderer renderer;
	private Pane parent;

	@Inject
	IEventBroker eventBroker;

	private boolean enableAddWall = false;
	private BooleanProperty pannableProperty;

	private double startY, startX;
	private Line line;

	@Override
	public Parent create() {
		pannableProperty = new SimpleBooleanProperty(false);
		
		VBox vBox = new VBox();

		ToolBar toolbar = new ToolBar();
		ToggleButton buttonAddWall = new ToggleButton("Add Wall");
		ToggleButton buttonPannable = new ToggleButton("Pannable");
		ToggleButton buttonLockScroll = new ToggleButton("Lock Scroll");
		buttonLockScroll.setSelected(true);
		buttonAddWall.setOnAction(e -> enableAddWall = buttonAddWall.isSelected());
		buttonPannable.setOnAction(e -> pannableProperty.set(buttonPannable.isSelected()));

		vBox.getChildren().add(toolbar);

		DragResizeMod.makeResizable(pane);

		renderer = new ReservationRenderer();
		parent = new Pane();
		parent.setPrefSize(2000, 2000);
		parent.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		parent.setStyle("-fx-border-color: lightgray");
		parent.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

		ZoomableScrollPane zoomablePane = new ZoomableScrollPane(parent);
		vBox.getChildren().add(zoomablePane);

		Button buttonZoomIn = new Button("+");
		TextField textZoom = new TextField();
		textZoom.setEditable(false);
		textZoom.setPrefWidth(60);
		textZoom.textProperty().bind(Bindings.format("%.2f", zoomablePane.scaleProperty().multiply(100)));
		Button buttonZoomOut = new Button("-");
		buttonZoomIn.setOnAction(e->{
			DoubleBinding scaleValue = zoomablePane.scaleProperty().multiply(1.1);
			zoomablePane.scaleProperty().set(scaleValue.get());
			zoomablePane.updateScale();
		});
		buttonZoomOut.setOnAction(e->{
			DoubleBinding scaleValue = zoomablePane.scaleProperty().multiply(0.9);
			zoomablePane.scaleProperty().set(scaleValue.get());
			zoomablePane.updateScale();
		});
		
		toolbar.getItems().addAll(buttonAddWall, buttonPannable, buttonLockScroll, buttonZoomIn, textZoom, buttonZoomOut);
		
		parent.addEventHandler(MouseEvent.MOUSE_PRESSED, ev -> {
			startX = ev.getX();
			startY = ev.getY();
		});

		parent.addEventHandler(MouseEvent.MOUSE_DRAGGED, ev -> {
			if (enableAddWall) {
				if (line == null) {
					line = new Line(startX, startY, ev.getX(), ev.getY());
					parent.getChildren().add(line);
				}else {
					line.setEndX(ev.getX());
					line.setEndY(ev.getY());
				}
			}
		});

		parent.addEventHandler(MouseEvent.MOUSE_RELEASED, ev -> {
			if (line!=null) {
				addLineToModel(line);
				line = null;
			}
		});
		
		zoomablePane.pannableProperty().bind(pannableProperty);
		zoomablePane.zoomingProperty().bind(buttonLockScroll.selectedProperty());
		return vBox;
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem item = (TreeItem) newValue;
				Object value = item.getValue();
				if (value instanceof EObject) {
					EObject eObject = (EObject) value;
					if (eObject instanceof Restaurant) {
						parent.getChildren().clear();
						Restaurant restaurant = (Restaurant) eObject;
						restaurant.getTables().forEach(e -> {
							TableNode node = (TableNode) renderer.doSwitch(e);
							if (node != null) {
								node.setOnMouseClicked(s -> selectNode(node, s));
								node.setOnMouseExited(s -> onMouseExited(node));
								parent.getChildren().add(node);
							}
						});
						Layout layout = restaurant.getLayout();
						if (layout != null) {
							layout.getItems().forEach(e -> {
								WallNode node = (WallNode) renderer.doSwitch(e);
								if (node != null) {
									parent.getChildren().add(node);
								}
							});
						}

					}
				}
			}
		}
	}

	public void addLineToModel(Line line) {
		Wall wall = ReservationFactory.eINSTANCE.createWall();
		wall.setStartx(line.getStartX());
		wall.setStartY(line.getStartY());
		wall.setEndx(line.getEndX());
		wall.setEndY(line.getEndY());
		eventBroker.post(new EventContext<>("/reservation/add/Wall", wall));
	}
	
	public void onMouseExited(TableNode node) {
		Double x = node.getLayoutX();
		Double y = node.getLayoutY();
		Double width = node.getWidth();
		Double height = node.getHeight();

		Table data = node.getData();
		data.setX(x);
		data.setY(y);
		data.setWidth(width);
		data.setHeight(height);
	}

	public void selectNode(TableNode node, MouseEvent s) {
		eventBroker.post(new EventContext<>("/reservation/table/select", node.getData()));
		for (Node childNode : parent.getChildren()) {
			if (childNode instanceof TableNode) {
				TableNode tableNode = (TableNode) childNode;
				tableNode.setStyle(tableNode.getStyle().replace(CSS_SELECTED, ""));				
			}
		}
		node.setStyle(node.getStyle()+CSS_SELECTED);
	}
}
