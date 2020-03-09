package de.dc.minion.model.desk.control;

import java.io.File;

import org.eclipse.emf.common.util.EList;

import com.google.inject.Inject;

import de.dc.minion.fx.model.Minion;
import de.dc.minion.fx.model.RecentlyOpenFile;
import de.dc.minion.fx.model.RecentlyOpenVision;
import de.dc.minion.fx.model.Toady;
import de.dc.minion.fx.model.TouchPoint;
import de.dc.minion.fx.model.Vision;
import de.dc.minion.fx.model.VisionTouch;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.file.MinionFile;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

public class MinionRecentlyOpenVision extends EmfViewPart{

	@Inject
	MinionFile minionFile;
	
	@Override
	public Parent create() {
		ListView<RecentlyOpenFile> listView = new ListView<RecentlyOpenFile>();
		return listView;
	}
	
	@Override
	public void initialize() {
		File fileRecentlyOpenFiles = new File("recentlyopenfiles.minion");
		if (fileRecentlyOpenFiles.exists()) {
			Minion minion = minionFile.load(fileRecentlyOpenFiles.getAbsolutePath());
			System.out.println(minionFile);
			System.out.println(minion);
			for (Toady toady : minion.getToadies()) {
				EList<TouchPoint> touchPoints = toady.getTouchPoints();
				for (TouchPoint touchpoint : touchPoints) {
					if (touchpoint instanceof VisionTouch) {
						VisionTouch visionTouch = (VisionTouch) touchpoint;
						for (Vision vision : visionTouch.getVisions()) {
							if (vision instanceof RecentlyOpenVision) {
								RecentlyOpenVision recentlyOpenVision = (RecentlyOpenVision) vision;
								recentlyOpenVision.getFiles();
							}
						}
					}
				}
			}
		}
	}

}
