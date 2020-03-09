package de.dc.minion.model.common.file;

import java.io.File;
import java.util.Date;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.fx.model.MinionFactory;
import de.dc.minion.fx.model.MinionPackage;
import de.dc.minion.fx.model.RecentlyOpenFile;
import de.dc.minion.fx.model.RecentlyOpenVision;

public class RecentlyOpenFilesReader extends EmfFile<RecentlyOpenVision>{

	public static final String FILE_PATH = "./config/recentlyopenfiles.minion";
	
	@Override
	public EPackage getEPackageEInstance() {
		return MinionPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return MinionFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "minion";
	}
	
	public RecentlyOpenFile addFile(File file) {
		RecentlyOpenVision vision = load(FILE_PATH);
		RecentlyOpenFile openFile = MinionFactory.eINSTANCE.createRecentlyOpenFile();
		openFile.setName(file.getName());
		openFile.setPath(file.getAbsolutePath());
		openFile.setTimestamp(new Date());
		vision.getFiles().add(openFile);
		write(vision, FILE_PATH);
		return openFile;
	}

}
