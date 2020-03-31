package de.dc.minion.model.desk.control;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;

import com.google.inject.Inject;

import de.dc.minion.fx.model.Command;
import de.dc.minion.fx.model.CommandTouch;
import de.dc.minion.fx.model.Deskman;
import de.dc.minion.fx.model.DeskmanTouch;
import de.dc.minion.fx.model.Landscape;
import de.dc.minion.fx.model.LandscapeTouch;
import de.dc.minion.fx.model.Minion;
import de.dc.minion.fx.model.PropertyVision;
import de.dc.minion.fx.model.RecentlyOpenVision;
import de.dc.minion.fx.model.Toady;
import de.dc.minion.fx.model.ToolbarItem;
import de.dc.minion.fx.model.ToolbarTouch;
import de.dc.minion.fx.model.Vision;
import de.dc.minion.fx.model.VisionTouch;
import de.dc.minion.fx.model.util.MinionSwitch;
import de.dc.minion.model.common.IControlManager;
import de.dc.minion.model.common.command.ICommandHandler;
import de.dc.minion.model.common.command.ICommandService;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.control.IEmfViewPart;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.common.file.IEmfFileManager;
import de.dc.minion.model.desk.controller.EmptyViewPart;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.Button;

public class MinionBuilder extends MinionSwitch<Object> {

	private Logger log = Logger.getLogger(MinionBuilder.class.getSimpleName());

	@Inject
	ISelectionService selectionService;
	@Inject
	IEventBroker eventBroker;
	@Inject
	IControlManager controlManager;
	@Inject
	IEmfFileManager fileManager;
	@Inject
	ICommandService commandService;

	private MinionDeskFX minionDesk;
	private Map<String, Landscape> landscapes = new HashMap<>();
	private Map<String, ILandscapeFX> landscapePages = new HashMap<>();

	@Override
	public Object caseMinion(Minion object) {
		object.getToadies().forEach(this::doSwitch);
		return super.caseMinion(object);
	}

	@Override
	public Object caseToady(Toady object) {
		object.getTouchPoints().forEach(this::doSwitch);
		return super.caseToady(object);
	}

	@Override
	public Object caseLandscapeTouch(LandscapeTouch object) {
		object.getLandscapes().forEach(this::doSwitch);
		return super.caseLandscapeTouch(object);
	}

	@Override
	public Object caseVisionTouch(VisionTouch object) {
		object.getVisions().forEach(this::doSwitch);
		return super.caseVisionTouch(object);
	}

	@Override
	public Object caseDeskmanTouch(DeskmanTouch object) {
		object.getDeskmans().forEach(e -> doSwitch(e));
		return super.caseDeskmanTouch(object);
	}

	@Override
	public Object caseToolbarTouch(ToolbarTouch object) {
		object.getToolbarItems().forEach(this::doSwitch);
		return super.caseToolbarTouch(object);
	}

	@Override
	public Object caseCommandTouch(CommandTouch object) {
		object.getCommands().forEach(this::doSwitch);
		return super.caseCommandTouch(object);
	}

	@Override
	public Object caseDeskman(Deskman object) {
		try {
			Class<IEmfEditorPart> clazz = (Class<IEmfEditorPart>) Class.forName(object.getUri());
			IEmfEditorPart<?> view = clazz.newInstance();
			MinionPlatform.inject(view);
			fileManager.register(view);
		} catch (NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return super.caseDeskman(object);
	}

	@Override
	public Object caseCommand(Command object) {
		String id = object.getId();
		String handler = object.getHandler();
		if (id != null && handler != null) {
			try {
				Class<ICommandHandler> handlerClass = (Class<ICommandHandler>) Class.forName(handler);
				ICommandHandler commandHandler = handlerClass.newInstance();
				MinionPlatform.inject(commandHandler);
				commandService.registrate(id, commandHandler);
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return super.caseCommand(object);
	}

	@Override
	public Object caseToolbarItem(ToolbarItem object) {
		Button button = new Button(object.getName());
		button.setMaxWidth(Double.MAX_VALUE);
		Command command = object.getCommand();
		if (command != null) {
			button.setOnAction(e -> commandService.execute(command.getId()));
		}
		minionDesk.getToolBar().getItems().add(button);

		controlManager.registrate(object.getId(), button);
		return super.caseToolbarItem(object);
	}

	@Override
	public Object caseLandscape(Landscape object) {
		if (object.isUseAsPage()) {
			String uri = object.getUri();
			try {
				Class<ILandscapeFX> clazz = (Class<ILandscapeFX>) Class.forName(uri);
				ILandscapeFX newInstance =  clazz.newInstance();
				MinionPlatform.inject(newInstance);
				newInstance.init();
				landscapePages.put(object.getId(), newInstance);
				minionDesk.addLandscapeFX(object.getId(), (ILandscapeFX)newInstance);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}else {
			Button perspectiveButton = new Button(object.getName());
			perspectiveButton.setId(object.getId());
			perspectiveButton.setOnAction(e -> minionDesk.switchPerspective(object));
			minionDesk.getPerspectiveToolBar().getItems().add(perspectiveButton);

			LandscapeFX landscape = new LandscapeFX();

			EList<Vision> rightPane = object.getRight();
			EList<Vision> leftPane = object.getLeft();
			EList<Vision> bottomPane = object.getBottom();
			
			if (leftPane.isEmpty()) {
				landscape.hideLeft(true);
			}
			for (Vision view : leftPane) {
				landscape.addToLeft((EmfViewPart) doSwitch(view));
			}
			if (rightPane.isEmpty()) {
				landscape.hideRight(true);
			}
			for (Vision view : rightPane) {
				landscape.addToRight((EmfViewPart) doSwitch(view));
			}
			if (bottomPane.isEmpty()) {
				landscape.hideBottom(true);
			}
			for (Vision view : bottomPane) {
				landscape.addToBottom((EmfViewPart) doSwitch(view));
			}

			landscape.hideEditorArea(object.isShowEditorArea());
			double leftDP = object.getLeftDividerPosition();
			double rightDP = object.getRightDividerPosition();
			double bottomDP = object.getBottomDividerPosition();
			double editorDP = object.getEditorDividerPosition();
			landscape.setDividerPositions(leftDP, editorDP, rightDP);
			landscape.setBottomDividerPosition(bottomDP);

			minionDesk.addLandscapeFX(object.getId(), landscape);

			landscapes.put(object.getId(), object);
			controlManager.registrate(object.getId(), perspectiveButton);
		}
		return super.caseLandscape(object);
	}

	@Override
	public Object caseVision(Vision object) {
		try {
			return createVision(object);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return new EmptyViewPart(object.getName());
	}

	@Override
	public Object casePropertyVision(PropertyVision object) {
		MinionPropertiesVision properties = new MinionPropertiesVision();
		MinionPlatform.inject(properties);
		properties.setVision(object);
		properties.initialize();
		return properties;
	}

	@Override
	public Object caseRecentlyOpenVision(RecentlyOpenVision object) {
		MinionRecentlyOpenVision view = new MinionRecentlyOpenVision();
		MinionPlatform.inject(view);
		view.setVision(object);
		view.initialize();
		return view;
	}

	private IEmfViewPart createVision(Vision object)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		if (object.getUri()==null) {
			return new EmptyViewPart(object.getName());
		}
		Class<IEmfViewPart> clazz = (Class<IEmfViewPart>) Class.forName(object.getUri());
		IEmfViewPart view = clazz.newInstance();
		MinionPlatform.inject(view);
		view.setVision(object);
		view.initialize();
		boolean isChangeListener = ChangeListener.class.isAssignableFrom(view.getClass());
		if (isChangeListener && object.isChangeListener()) {
			selectionService.addListener((ChangeListener<?>) view);
		}

		controlManager.registrate(object.getId(), view);
		return view;
	}

	public void setDesk(MinionDeskFX minionDesk) {
		this.minionDesk = minionDesk;
		controlManager.registrate(MinionDeskFX.ID, minionDesk);
	}
}
