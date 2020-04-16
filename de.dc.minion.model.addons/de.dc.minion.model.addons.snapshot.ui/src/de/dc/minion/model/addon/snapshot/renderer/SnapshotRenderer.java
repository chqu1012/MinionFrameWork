package de.dc.minion.model.addon.snapshot.renderer;

import java.io.File;
import java.net.MalformedURLException;

import de.dc.minion.model.addon.snapshot.ColorGrading;
import de.dc.minion.model.addon.snapshot.Layer;
import de.dc.minion.model.addon.snapshot.Snapshot;
import de.dc.minion.model.addon.snapshot.SnapshotFactory;
import de.dc.minion.model.addon.snapshot.util.SnapshotSwitch;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.scene.Node;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class SnapshotRenderer extends SnapshotSwitch<Node> {
	
	private StackPane parent = new StackPane();
	private ImageView imageView;
	private Pane currentLayer;
	
	public void clear(){}
	
	@Override
	public Node caseSnapshot(Snapshot object) {
		parent.getChildren().clear();
		Image image;
		try {
			image = new Image(new File(object.getImagePath()).toURI().toURL().toExternalForm());
			imageView = new ImageView(image);
			imageView.setOnMouseClicked(this::readColorGradingFromMouseCoordinateOnClick);
			imageView.setOnMouseMoved(this::readColorGradingFromMouseCoordinateOnHover);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		parent.getChildren().add(imageView);
		object.getLayers().forEach(e-> parent.getChildren().add(doSwitch(e)));
		return parent;
	}
	
	@Override
	public Node caseLayer(Layer object) {
		currentLayer = new Pane();
		ColorGrading colorGrading = object.getColorGrading();
		if (colorGrading!=null) {
			doSwitch(colorGrading);
		}
		return currentLayer;
	}
	
	@Override
	public Node caseColorGrading(ColorGrading object) {
		ColorAdjust adjust = new ColorAdjust();
		ColorInput input = new ColorInput();
		
		String STYLE = "-fx-background-color: rgb(%s,%s,%s); -fx-opacity: %s";
		String opacity = String.valueOf(object.getOpacity());
		String r = String.valueOf(object.getR());
		String g = String.valueOf(object.getG());
		String b = String.valueOf(object.getB());
		currentLayer.setStyle(String.format(STYLE, r,g,b,opacity));
		return super.caseColorGrading(object);
	}
	
	public void readColorGradingFromMouseCoordinateOnClick(MouseEvent e) {
		readColorGradingFromMouseCoordinate(e, "click");
	}
	
	public void readColorGradingFromMouseCoordinateOnHover(MouseEvent e) {
		readColorGradingFromMouseCoordinate(e, "hover");
		
	}
	
	public void readColorGradingFromMouseCoordinate(MouseEvent e, String action) {
		PixelReader pixelReader = imageView.getImage().getPixelReader();
		Color color = pixelReader.getColor((int) e.getX(), (int) e.getY());
		int argb = pixelReader.getArgb((int) e.getX(), (int) e.getY());
		int r = (0xff & (argb >> 16));
		int g = (0xff & (argb >> 8));
		int b = (0xff & argb);
		
		ColorGrading cg = SnapshotFactory.eINSTANCE.createColorGrading();
		cg.setR(r);
		cg.setG(g);
		cg.setB(b);
		cg.setOpacity(color.getOpacity());
		
		MinionPlatform.getInstance(IEventBroker.class).post(new EventContext<>("/update/snapshot/color/vision/"+action, cg));
	}
}
