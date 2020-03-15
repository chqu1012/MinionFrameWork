package de.dc.minion.model.addon.lecture;

import de.dc.minion.model.addon.lecture.LectureProject;
import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
import de.dc.minion.model.desk.controller.EmfModelTreeView;
public class LectureEditor extends EmfDetailedTreeView<LectureProject>{

	@Override
	protected EmfModelTreeView<LectureProject> initEmfModelTreeView() {
		return new LectureTreeView();
	}
}
