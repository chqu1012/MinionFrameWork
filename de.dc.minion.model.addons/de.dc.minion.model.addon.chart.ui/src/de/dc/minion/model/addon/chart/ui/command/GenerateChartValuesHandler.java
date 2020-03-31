package de.dc.minion.model.addon.chart.ui.command;

import java.util.Random;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.minion.model.common.IControlManager;
import de.dc.minion.model.common.command.ICommandHandler;
import de.dc.minion.model.common.event.ISelectionService;
import javafx.scene.control.TreeItem;

public class GenerateChartValuesHandler implements ICommandHandler{

	@Inject IControlManager controlManager;
	@Inject ISelectionService selectionService;
	
	@Override
	public void execute() {
		Random random = new Random();
		selectionService.getSelection().ifPresent(selection->{
			if (selection instanceof TreeItem) {
				TreeItem item = (TreeItem) selection;
				Object value = item.getValue();
				if (value instanceof SeriesFX) {
					SeriesFX serieFX = (SeriesFX) value;
					System.out.println(serieFX);
					for (int i = 0; i < 20; i++) {
						XYValueFX xy = ChartFactory.eINSTANCE.createXYValueFX();
						xy.setX(i);
						xy.setY(random.nextDouble());
						serieFX.getValues().add(xy);					
					}
				}
			}
		});
	}
}
