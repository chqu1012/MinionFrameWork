package de.dc.minion.model.desk.control;

import java.util.EventObject;
import java.util.Optional;
import java.util.logging.Logger;

import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import com.google.common.eventbus.Subscribe;

import de.dc.minion.fx.model.EmfCommand;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.common.command.CommandStackImpl;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.desk.control.cell.CommandCellFactory;
import de.dc.minion.model.desk.module.MinionPlatform;
import de.dc.minion.model.desk.util.UIConstants;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class MinionCommandHistoryVision extends EmfViewPart implements CommandStackListener {

	private Logger log = Logger.getLogger(MinionCommandHistoryVision.class.getSimpleName());

	protected ListView<EmfCommand> historyList;
	protected IEmfManager<?> emfManager;

	private ComposedAdapterFactory adapterFactory;

	private CommandStackImpl commandStack;

	@Override
	public Parent create() {
		MinionPlatform.getInstance(IEventBroker.class).register(this);
		historyList = new ListView<>();
		return historyList;
	}
	
	private void initHistoryListView() {
		if (emfManager == null) {
			emfManager = MinionPlatform.getInstance(ISelectionService.class).getEmfManager().get();
			adapterFactory = emfManager.getAdapterFactory();
			commandStack = (CommandStackImpl) emfManager.getEditingDomain().getCommandStack();
			commandStack.addCommandStackListener(this);
			historyList.setCellFactory(param -> new CommandCellFactory(adapterFactory));
			historyList.setEditable(false);

			historyList.setOnMouseClicked(e -> onHistoryListViewClicked(e));
		}
	}

	protected void onHistoryListViewClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmation Dialog");
			alert.setHeaderText("Undo for current selection");
			alert.setContentText("Are you ok with this?");

			Optional<ButtonType> result = alert.showAndWait();
			result.ifPresent(res -> {
				if (res == ButtonType.OK) {
					EmfCommand selection = historyList.getSelectionModel().getSelectedItem();
					if (selection != null) {
						selection.undo();
						log.info("Undo successfully executed!");
					}
				}
			});
		}
	}

	@Override
	public void commandStackChanged(EventObject event) {
		updateHistoryListView(new EventContext<>(UIConstants.UPDATE_COMMAND_HISTORY.name(), null));
	}

	@Subscribe
	public void updateHistoryListView(EventContext<EmfCommand> context) {
		if (context.getEventId().equals(UIConstants.UPDATE_COMMAND_HISTORY.name())) {
			initHistoryListView();
			Object input = context.getInput();
			if (input instanceof EmfCommand) {
				historyList.getItems().add(0, (EmfCommand) input);
			}
		}
	}
}
