package de.dc.minion.model.editor.handler;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jdt.internal.core.PackageFragmentRoot;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import de.dc.minion.fx.model.EmfProject;
import de.dc.minion.fx.model.MinionFactory;
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
//					EmfProject project = MinionFactory.eINSTANCE.createEmfProject();
//					project.setEfactory(model.geteFactory());
//					project.setEPackage(model.getePackage());
//					project.setModelItemProviderAdapterFactory(model.getItemProviderAdapterFactory());
//					project.setRootElement(model.getRootModel());
					
					for (Templates tpl : Templates.values()) {
						try {
							String content = tpl.getTemplate().gen(model);
							String filename = tpl.getTemplate().path(model);
							FileUtils.write(new File(path+"/"+filename), content, StandardCharsets.UTF_8);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}
}