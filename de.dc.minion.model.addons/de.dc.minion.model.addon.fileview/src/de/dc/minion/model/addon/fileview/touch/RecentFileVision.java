package de.dc.minion.model.addon.fileview.touch;

import de.dc.minion.model.desk.control.BaseMinionRecentlyOpenVision;

public class RecentFileVision extends BaseMinionRecentlyOpenVision{

	@Override
	protected String getFileType() {
		return "dcm";
	}
}
