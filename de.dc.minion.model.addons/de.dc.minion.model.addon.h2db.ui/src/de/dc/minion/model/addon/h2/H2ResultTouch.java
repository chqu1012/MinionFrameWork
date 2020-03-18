package de.dc.minion.model.addon.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.addon.h2db.Column;
import de.dc.minion.model.addon.h2db.Config;
import de.dc.minion.model.addon.h2db.Table;
import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.VBox;

public class H2ResultTouch extends EmfViewPart implements ChangeListener<Object> {

	private TableView<ObservableList<String>> tableView;
	private ObservableList<ObservableList<String>> data = FXCollections.observableArrayList();
	
	@Override
	public Parent create() {
		VBox parent = new VBox(5);
		TextField textSearch = new TextField();
		parent.getChildren().add(textSearch);
		tableView = new TableView<>();
		parent.getChildren().add(tableView);
		return parent;
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue instanceof TreeItem) {
			TreeItem item = (TreeItem) newValue;
			Object value = item.getValue();
			if (value instanceof Table) {
				Table table = (Table) value;
				tableView.getColumns().clear();
				tableView.getItems().clear();
				data.clear();
				
				for (Column col : table.getColumns()) {
					TableColumn<ObservableList<String>, String> column = new TableColumn<>(col.getName());
					column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(
							param.getValue().get(table.getColumns().indexOf(col))));
					tableView.getColumns().add(column);
				}

				Config config = (Config) table.eContainer();

				try {
					Class.forName("org.h2.Driver");
					Connection c = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
					ResultSet rs = c.createStatement().executeQuery("SELECT * FROM " + table.getName());
					while (rs.next()) {
						// Iterate Row
						ObservableList<String> row = FXCollections.observableArrayList();
						for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
							// Iterate Column
							row.add(rs.getString(i));
						}
						System.out.println("Row [1] added " + row);
						data.add(row);

					}
					c.close();

					// FINALLY ADDED TO TableView
					tableView.setItems(data);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}
	}

}
