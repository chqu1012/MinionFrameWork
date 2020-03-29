package de.dc.minion.model.desk.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.fx.model.Minion;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.file.MinionFile;
import de.dc.minion.model.desk.control.ILandscapeFX;
import de.dc.minion.model.desk.control.feature.ToadyListCell;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;

public class EmfTouchManager extends BaseBindingEmfTouchManagerController implements ILandscapeFX{
	
	private static final Logger LOG = Logger.getLogger(EmfTouchManager.class.getSimpleName());
	
	@Inject
	IEventBroker eventBroker;
	
	private Map<Minion, String> minionRegistry = new HashMap<>();
	private MinionFile efile = new MinionFile();
	
	public EmfTouchManager() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/minion/model/desk/control/EmfTouchManager.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		
		MinionPlatform.inject(this);
		eventBroker.register(this);
	}
	
	@Subscribe
	public void subscribeUpdateToadyStatus(EventContext<Minion> context) {
		if (context.getEventId().equals("/minion/update/toady/status")) {
			Minion input = context.getInput();
			String path = minionRegistry.get(input);
			efile.write(input, path);
			listViewTouch.refresh();
			LOG.info("Updated status for "+path);
		}
	}
	
	@Subscribe
	public void subscribeRefreshList(EventContext<String> context) {
		if (context.getEventId().equals("/open/landscape/as/page") && context.getInput().equals("emf.touch.manager")) {
			refresh();
		}
	}
	
	@Override
	public void initialize(){
		super.initialize();
		
		listViewTouch.setCellFactory(p -> new ToadyListCell());
	}

	@Override
	public TabPane getEditorArea() {
		return null;
	}

	public void refresh() {
		binding.masterDataListViewTouch().clear();
		minionRegistry.clear();
		
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		URL[] urls = ((URLClassLoader) cl).getURLs();

		for (URL url : urls) {
			String file = url.getFile();
			file = file + "desk.minion";
			File minionFile = new File(file);
			if (minionFile.exists()) {
				Minion minion = efile.load(minionFile.getAbsolutePath());
				binding.masterDataListViewTouch().add(minion);
				minionRegistry.put(minion, file);
			}
		}
	}
	
	@Override
	public void hideRight(boolean hide) {
	}

	@Override
	public void hideLeft(boolean hide) {
	}

	@Override
	public void hideBottom(boolean hide) {
	}

	@Override
	public void init() {
	}

	@Override
	protected void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
		if (source == buttonRefresh) {
			refresh();
		}
	}
	
}
