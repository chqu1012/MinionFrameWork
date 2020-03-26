package de.dc.minion.model.addon.restaurant.reservation;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
import de.dc.minion.model.desk.controller.EmfModelTreeView;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.scene.control.TreeItem;
public class ReservationEditor extends EmfDetailedTreeView<Restaurant>{
	
	@Inject IEventBroker eventBroker;
	
	public ReservationEditor() {
		MinionPlatform.inject(this);
		eventBroker.register(this);
	}
	
	@Override
	protected EmfModelTreeView<Restaurant> initEmfModelTreeView() {
		return new ReservationTreeView();
	}
	
	@Subscribe
	public void subscribeTableSelection(EventContext<Table> context) {
		if (context.getEventId().equals("/reservation/table/select")) {
			Table input = context.getInput();
			TreeItem<Object> object = getTreeViewItem(treeView.getTreeView().getRoot(), input);
			if (object!=null) {
				treeView.getTreeView().getSelectionModel().clearSelection();
				treeView.getTreeView().getSelectionModel().select(object);
				treeView.getTreeView().scrollTo(treeView.getTreeView().getRow(object));
			}
		}
	}
	
	public static <T> TreeItem<T> getTreeViewItem(TreeItem<T> item, Table value) {
	    if (item != null) {
	    	T treeValue = item.getValue();
	    	if (treeValue instanceof Restaurant) {
	    		for (TreeItem<T> child : item.getChildren()) {
					TreeItem<T> s = getTreeViewItem(child, value);
					if (s != null) {
						return s;
					}
				}
			}else if (treeValue instanceof Table) {
				Table treeTable = (Table) treeValue;
				if (String.valueOf(treeTable.getNumber()).contains(String.valueOf(value.getNumber()))) return item;
			}
	    }
	    return null;
	}
}
