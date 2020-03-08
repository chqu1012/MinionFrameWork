package de.dc.minion.model.desk.control;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
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
import de.dc.minion.fx.model.Toady;
import de.dc.minion.fx.model.ToolbarItem;
import de.dc.minion.fx.model.ToolbarTouch;
import de.dc.minion.fx.model.Vision;
import de.dc.minion.fx.model.VisionTouch;
import de.dc.minion.fx.model.util.MinionSwitch;
import de.dc.minion.model.common.IControlManager;
import de.dc.minion.model.common.command.ICommandHandler;
import de.dc.minion.model.common.command.ICommandService;
import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.common.file.IEmfFileManager;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.value.ChangeListener;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class MinionBuilder extends MinionSwitch<Node>{
	
	private Logger log = Logger.getLogger(MinionBuilder.class.getSimpleName());
	
	@Inject ISelectionService selectionService;
	@Inject IEventBroker eventBroker;
	@Inject IControlManager controlManager;
	@Inject IEmfFileManager fileManager;
	@Inject ICommandService commandService;
	
	private MinionDeskFX minionDesk;
	private Map<String, Landscape> landscapes = new HashMap<>();

	@Override
	public Node caseMinion(Minion object) {
		object.getToadies().forEach(this::doSwitch);
		return super.caseMinion(object);
	}

	@Override
	public Node caseToady(Toady object) {
		object.getTouchPoints().forEach(this::doSwitch);
		return super.caseToady(object);
	}
	
	@Override
	public Node caseLandscapeTouch(LandscapeTouch object) {
		object.getLandscapes().forEach(this::doSwitch);
		return super.caseLandscapeTouch(object);
	}
	
	@Override
	public Node caseVisionTouch(VisionTouch object) {
		object.getVisions().forEach(this::doSwitch);
		return super.caseVisionTouch(object);
	}
	
	@Override
	public Node caseDeskmanTouch(DeskmanTouch object) {
		object.getDeskmans().forEach(e->doSwitch(e));
		return super.caseDeskmanTouch(object);
	}
	
	@Override
	public Node caseToolbarTouch(ToolbarTouch object) {
		object.getToolbarItems().forEach(this::doSwitch);
		return super.caseToolbarTouch(object);
	}
	
	@Override
	public Node caseCommandTouch(CommandTouch object) {
		object.getCommands().forEach(this::doSwitch);
		return super.caseCommandTouch(object);
	}

	@Override
	public Node caseDeskman(Deskman object) {
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
	public Node caseCommand(Command object) {
		String id = object.getId();
		String handler = object.getHandler();
		if (id!=null && handler!=null) {
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
	public Node caseToolbarItem(ToolbarItem object) {
		Button button = new Button(object.getName());
		Command command = object.getCommand();
		if (command!=null) {
			button.setOnAction(e-> commandService.execute(command.getId()));
		}
		minionDesk.getToolBar().getItems().add(button);
		
		controlManager.registrate(object.getId(), button);
		return super.caseToolbarItem(object);
	}
	
	@Override
	public Node caseLandscape(Landscape object) {
		Button perspectiveButton = new Button(object.getName());
		perspectiveButton.setId(object.getId());
		perspectiveButton.setOnAction(e -> minionDesk.switchPerspective(object));
		minionDesk.getPerspectiveToolBar().getItems().add(perspectiveButton);
		
		LandscapeFX LandscapeFX = new LandscapeFX();
		
		EList<Vision> rightPane = object.getRight();
		EList<Vision> leftPane = object.getLeft();
		EList<Vision> bottomPane = object.getBottom();
		
		if (leftPane != null) {
			for (Vision view : leftPane) {
				LandscapeFX.addToLeft(createTab(view));
			}
		}
		if (rightPane != null) {
			for (Vision view : rightPane) {
				LandscapeFX.addToRight(createTab(view));
			}
		}
		if (bottomPane != null) {
			for (Vision view : bottomPane) {
				LandscapeFX.addToBottom(createTab(view));
			}
		}
		
		minionDesk.addLandscapeFX(object.getId(), LandscapeFX);
		
		landscapes.put(object.getId(), object);
		controlManager.registrate(object.getId(), perspectiveButton);
		return super.caseLandscape(object);
	}
	
	@Override
	public Node caseVision(Vision object) {
		Node view = controlManager.findBy(object.getId());
		try {
			if (view==null) {
				view = createVision(object);
			}
			return view;
		} catch (NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			log.log(Level.SEVERE, "Viewpart cannot created (id: " + object.getId() + "instance: "
					+ object.getUri() + ", name: " + object.getName() + ") ");
		}
		return new TextArea("ViewPart cannot be created!");
	}

	private Node createVision(Vision object)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Node view;
		Class<?> clazz = Class.forName(object.getUri());
		view = (Node) clazz.newInstance();
		MinionPlatform.inject(view);
		
		boolean isChangeListener = ChangeListener.class.isAssignableFrom(view.getClass());
		if (isChangeListener && object.isChangeListener()) {
			selectionService.addListener((ChangeListener<?>) view);
		}
		
		controlManager.registrate(object.getId(), view);
		return view;
	}
	
	private Tab createTab(Vision e) {
		String id = e.getId();
		
		Tab tab = new Tab(e.getName());
		tab.setClosable(true);
		BorderPane pane = new BorderPane();
		pane.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		Node node = caseVision(e);
		pane.setCenter(node);
		tab.setContent(pane);
		
		if (id==null) {
			return tab;
		}
		if (controlManager.findBy(id)!=null) {
			return controlManager.findBy(id);
		}
		return tab;
	}

	public void setDesk(MinionDeskFX minionDesk) {
		this.minionDesk = minionDesk;
		controlManager.registrate(MinionDeskFX.ID, minionDesk);
	}
}
