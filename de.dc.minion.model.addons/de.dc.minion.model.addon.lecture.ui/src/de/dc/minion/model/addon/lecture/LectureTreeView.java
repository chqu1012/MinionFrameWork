package de.dc.minion.model.addon.lecture;

import de.dc.minion.model.addon.lecture.service.LectureManager;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.desk.controller.EmfModelTreeView;

public class LectureTreeView extends EmfModelTreeView<LectureProject>{

	@Override
	public IEmfManager<LectureProject> initEmfManager() {
		return new LectureManager();
	}
}
