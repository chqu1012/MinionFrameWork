package de.dc.minion.model.addon.h2.command;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.tools.Server;

import com.google.inject.Inject;

import de.dc.minion.model.addon.h2db.Config;
import de.dc.minion.model.addon.h2db.SQLStatement;
import de.dc.minion.model.addon.h2db.Status;
import de.dc.minion.model.common.command.ICommandHandler;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.control.TreeItem;

public class StartH2Handler implements ICommandHandler {

	@Inject
	ISelectionService selectionService;
	
	@Inject
	IEventBroker eventBroker;
	
	private Server server;
	private Connection conn;

	@Override
	public void execute() {
		selectionService.getSelection().ifPresent(s -> {
			if (s instanceof TreeItem) {
				TreeItem item = (TreeItem) s;
				Object value = item.getValue();
				if (value instanceof Config) {
					Config h2s = (Config) value;
					Service<Void> service = new Service<Void>() {
						@Override
						protected Task<Void> createTask() {
							return new Task<Void>() {
								@Override
								protected Void call() throws Exception {
									if (h2s.getStatus()==Status.STOPPED) {
										startServer(h2s);
									}else {
										
									}
									return null;
								}
							};
						}
					};
					service.restart();
				}else if (value instanceof SQLStatement) {
					SQLStatement content = (SQLStatement) value;
					try {
						String contentSql = content.getStatment();
						if (!contentSql.isEmpty() && conn !=null) {
							Statement statment = conn.createStatement();
							statment.execute(contentSql);
							eventBroker.post(new EventContext<>("/update/status/label", "Statement "+content.getName()+" executed!"));
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		});
	}

	private void startServer(Config h2s) {
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(h2s.getUrl(), h2s.getUser(),
					h2s.getPassword());
//			server = Server.createWebServer(new String[] {"-web", "-webAllowOthers",
//					"-webPort", String.valueOf(h2s.getPort())});
//			server.start();
			Server.startWebServer(conn, true);
			h2s.setStatus(Status.STARTED);
			
			eventBroker.post(new EventContext<>("/update/status/label", "H2 Server "+h2s.getUrl()+" started!"));
		} catch (Exception e) {
			h2s.setStatus(Status.STOPPED);
			eventBroker.post(new EventContext<>("/update/status/label", "H2 Server "+h2s.getUrl()+" stopped!"));
			e.printStackTrace();
		}
	}
}
