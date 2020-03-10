package de.dc.minion.model.common;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import de.dc.minion.model.common.command.CommandStackImpl;
import de.dc.minion.model.common.file.IEmfFile;

public interface IEmfManager<T> {

	T getRoot();

	void setRoot(T root);
	
	EditingDomain getEditingDomain();

	ComposedAdapterFactory getAdapterFactory();

	ChangeRecorder getChangeRecorder();

	CommandStackImpl getCommandStack();

	/**
	 * Get the instance of the generated model package, e.g. ModelPackage.eINSTANCE
	 * 
	 * @return
	 */
	EPackage getModelPackage();

	/**
	 * Get the instance of the extended generated model factory, the extended class
	 * ExtendedModelFactory.eINSTANCE is required for creating EObjects by
	 * classifierId, the base ModelFactory supported only EOBject creation via
	 * EClass.
	 * 
	 * ExtendedModelFactory extends ModelFactory implements ExtendedFactory
	 * 
	 * @return
	 */
	EFactory getExtendedModelFactory();
	
	IEmfFile<T> getFile();

	IEmfFile<T> initFile();

	IItemLabelProvider getLabelProvider(Object object);
}