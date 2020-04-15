package de.dc.minion.model.addon.snapshot.renderer;

import java.io.File;
import java.net.MalformedURLException;

import de.dc.minion.model.addon.snapshot.ColorGrading;
import de.dc.minion.model.addon.snapshot.Layer;
import de.dc.minion.model.addon.snapshot.Snapshot;
import de.dc.minion.model.addon.snapshot.util.SnapshotSwitch;
import javafx.scene.Node;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
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
			imageView.setOnMouseClicked(e->{
				Color color = imageView.getImage().getPixelReader().getColor((int) e.getX(), (int) e.getY());
				int argb = imageView.getImage().getPixelReader().getArgb((int) e.getX(), (int) e.getY());
				int r = (0xff & (argb >> 16));
				int g = (0xff & (argb >> 8));
				int b = (0xff & argb);
				System.out.println("R: "+r);
				System.out.println("G: "+g);
				System.out.println("B: "+b);
			});
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
}
