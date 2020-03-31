package de.dc.minion.model.editor.handler;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.internal.core.PackageFragmentRoot;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import de.dc.minion.fx.model.Deskman;
import de.dc.minion.fx.model.DeskmanTouch;
import de.dc.minion.fx.model.EmfProject;
import de.dc.minion.fx.model.Landscape;
import de.dc.minion.fx.model.LandscapeTouch;
import de.dc.minion.fx.model.Minion;
import de.dc.minion.fx.model.MinionFactory;
import de.dc.minion.fx.model.Toady;
import de.dc.minion.fx.model.Vision;
import de.dc.minion.fx.model.VisionTouch;
import de.dc.minion.model.common.file.EmfProjectFile;
import de.dc.minion.model.common.file.MinionFile;
import de.dc.minion.model.editor.CreateIdeFileDialog;
import de.dc.minion.model.editor.model.IdeModel;
import de.dc.minion.model.editor.template.Templates;
public class CreateIdeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection("org.eclipse.jdt.ui.PackageExplorer");
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object firstElement = ss.getFirstElement();
			if (firstElement instanceof PackageFragmentRoot) {
				PackageFragmentRoot root = (PackageFragmentRoot) firstElement;
				String path = root.getResource().getLocation().toString();
				CreateIdeFileDialog dialog = new CreateIdeFileDialog(new Shell());
				int code = dialog.open();
				if (code == 0) {
					IdeModel model = dialog.getModel();
					path = path +"/"+model.getPackagePath().replace('.', '/');
					
					createEmfProject(path, model);
					createToady(path, model.getPackagePath(), StringUtils.capitalize(model.getName()));
				}
				
				try {
					root.getResource().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
				}
			}
		}
		return null;
	}

	private void createToady(String path, String packagePath, String name) {
		Minion minion = MinionFactory.eINSTANCE.createMinion();
		
		Toady toady = MinionFactory.eINSTANCE.createToady();
		VisionTouch touchVision = MinionFactory.eINSTANCE.createVisionTouch();

		Vision visionRecentFiles = MinionFactory.eINSTANCE.createVision();
		visionRecentFiles.setId("de.dc.minion.model.desk.control.MinionRecentlyOpenVision");
		visionRecentFiles.setUri("de.dc.minion.model.desk.control.MinionRecentlyOpenVision");
		visionRecentFiles.setName("Recent Files");
		touchVision.getVisions().add(visionRecentFiles);
		
		Vision visionDiagram = MinionFactory.eINSTANCE.createVision();
		visionDiagram.setId(packagePath+"."+name+"Diagram");
		visionDiagram.setUri(packagePath+"."+name+"Diagram");
		visionDiagram.setName(name+"Diagram");
		touchVision.getVisions().add(visionDiagram);
		
		LandscapeTouch touchLandscape = MinionFactory.eINSTANCE.createLandscapeTouch();
		Landscape landscape = MinionFactory.eINSTANCE.createLandscape();
		landscape.setId(packagePath+"landscape."+name);
		landscape.setName(name+" Landscape");
		landscape.getRight().add(visionDiagram);
		landscape.getLeft().add(visionRecentFiles);
		touchLandscape.getLandscapes().add(landscape);
		
		DeskmanTouch touchDeskman = MinionFactory.eINSTANCE.createDeskmanTouch();
		Deskman deskman = MinionFactory.eINSTANCE.createDeskman();
		deskman.setId(packagePath+"."+name+"Editor");
		deskman.setName(name+"Editor");
		deskman.setUri(packagePath+"."+name+"Editor");
		touchDeskman.getDeskmans().add(deskman);
		
		toady.getTouchPoints().add(touchVision);
		toady.getTouchPoints().add(touchDeskman);
		toady.getTouchPoints().add(touchLandscape);
		
		minion.getToadies().add(toady);
		
		new MinionFile().write(minion, path+"/desk.minion");
	}

	private void createEmfProject(String path, IdeModel model) {
		EmfProject project = MinionFactory.eINSTANCE.createEmfProject();
		project.setEfactory(model.geteFactory());
		project.setEPackage(model.getePackage());
		project.setModelItemProviderAdapterFactory(model.getItemProviderAdapterFactory());
		project.setRootElement(model.getRootModel());
		project.setRootElementPackage(model.getRootModelPackage());
		project.setExportPath(path);
		
		for (Templates tpl : Templates.values()) {
			try {
				String content = tpl.getTemplate().gen(model);
				String filename = tpl.getTemplate().path(model);
				FileUtils.write(new File(path+"/"+filename), content, StandardCharsets.UTF_8);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		new EmfProjectFile().write(project, path+"/generation-config.minion");
	}
}