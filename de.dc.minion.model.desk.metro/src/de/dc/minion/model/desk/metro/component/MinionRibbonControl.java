package de.dc.minion.model.desk.metro.component;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;

import com.google.inject.Inject;

import de.dc.minion.fx.model.Landscape;
import de.dc.minion.fx.model.Minion;
import de.dc.minion.fx.model.Toady;
import de.dc.minion.fx.model.ToadyStatus;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.common.file.MinionFile;
import de.dc.minion.model.desk.control.ILandscapeFX;
import de.dc.minion.model.desk.control.MinionBuilder;
import de.dc.minion.model.desk.metro.MinionRibbonBuilder;
import de.dc.minion.model.desk.metro.component.cell.LandscapeListCell;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;

public class MinionRibbonControl extends BaseMinionRibbonControl{

	public static final String ID = "de.dc.minion.model.desk.metro.component.MinionRibbonControl";
	
	protected ObservableList<Landscape> landscapes = FXCollections.observableArrayList();
	protected FilteredList<Landscape> filteredLandscapes = new FilteredList<Landscape>(landscapes);
	
	@Inject
	protected MinionFile minionFile;

	@Inject
	protected IEventBroker eventBroker;

	@Inject
	protected ISelectionService selectionService;
	
	@Inject
	protected MinionRibbonBuilder minionBuilder;
	
	public MinionRibbonControl() {
		MinionPlatform.inject(this);
		eventBroker.register(this);

		loadFxml();
		registerTourches();
	}
	
	public void initialize() {
		listViewLandscapes.setItems(filteredLandscapes);
		listViewLandscapes.setCellFactory(param -> new LandscapeListCell());
		
		textSearchlandscapes.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue!=null) {
					filteredLandscapes.setPredicate(p->{
						boolean isEmpty = p.getName().isEmpty() || p.getName()==null;
						boolean containsName = p.getName().toLowerCase().contains(newValue.toLowerCase());
						return isEmpty || containsName;
					});
				}
			}
		});
	}

	private void loadFxml() {
		String fxmlName = "/de/dc/minion/model/desk/metro/MinionRibbon.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlName));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
//			log.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}		
	}

	public void registerTourches() {
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		URL[] urls = ((URLClassLoader) cl).getURLs();

		for (URL url : urls) {
			String file = url.getFile();
			file = file + "desk.minion";
			File minionFile = new File(file);
			if (minionFile.exists()) {
				MinionFile efile = new MinionFile();
				Minion minion = efile.load(minionFile.getAbsolutePath());
				Toady toady = minion.getToadies().get(0);
				if (toady.getStatus()==ToadyStatus.STARTED) {
					minionBuilder.setDesk(this);
					minionBuilder.doSwitch(minion);
				}
			}
		}
	}
	
	@Override
	protected void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
		if (source == buttonOpen) {
			stackPaneMain.getChildren().add(new Button("Open"));
		}
		else if (source == buttonNew) {
			stackPaneMain.getChildren().add(new Button("New"));
		}
	}

	public void addLandscapeFX(Landscape landscape, ILandscapeFX newInstance) {
		landscapes.add(landscape);
	}
}
