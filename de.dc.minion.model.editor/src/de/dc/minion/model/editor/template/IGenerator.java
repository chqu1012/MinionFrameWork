package de.dc.minion.model.editor.template;

import de.dc.minion.model.editor.model.IdeModel;

public interface IGenerator<T> {

	String path(IdeModel model);
	
	String gen(IdeModel model);
}
