package de.dc.minion.model.editor.template;

import de.dc.minion.model.editor.model.IdeModel;

public enum Templates {
	DIAGRAM(new DiagramTemplate()),
	EMF_FILE(new EmfFileTemplate()),
	EMF_MANAGER(new EmfManagerTemplate()),
	EMF_MODEL_DETAILED_TREE_VIEW(new EmfModelDetailedTreeViewTemplate()),
	EMF_MODEL_TREE_VIEW(new EmfModelTreeViewTemplate()),
	RENDERER(new RendererTemplate());
	
	private IGenerator<IdeModel> template;

	private Templates(IGenerator<IdeModel> template) {
		this.template = template;
	}
	
	public IGenerator<IdeModel> getTemplate(){
		return template;
	}
}
