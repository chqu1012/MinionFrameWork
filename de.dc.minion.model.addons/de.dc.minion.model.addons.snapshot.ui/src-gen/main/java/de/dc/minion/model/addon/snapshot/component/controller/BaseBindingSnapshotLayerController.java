package de.dc.minion.model.addon.snapshot.component.controller;

import de.dc.minion.model.addon.snapshot.component.model.*;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public abstract class BaseBindingSnapshotLayerController extends BaseSnapshotLayerController{
	
	protected SnapshotLayerBinding binding = new SnapshotLayerBinding();
	
	@Override
	public void initialize() {
		textSearch.textProperty().bindBidirectional(binding.textSearchProperty());
		listViewLayer.setItems(binding.sortedDataListViewLayer());
		binding.selectedDataListViewLayer().bind(listViewLayer.getSelectionModel().selectedItemProperty());
		comboBlendMode.setItems(binding.sortedDataComboBlendMode());
		binding.selectedDataComboBlendMode().bind(comboBlendMode.getSelectionModel().selectedItemProperty());
		sliderBlendOpacity.valueProperty().bindBidirectional(binding.sliderBlendOpacityProperty());
		sliderBloomThreshold.valueProperty().bindBidirectional(binding.sliderBloomThresholdProperty());
		sliderBoxBlurWidth.valueProperty().bindBidirectional(binding.sliderBoxBlurWidthProperty());
		sliderBoxBlurHeight.valueProperty().bindBidirectional(binding.sliderBoxBlurHeightProperty());
		sliderBoxBlurIteration.valueProperty().bindBidirectional(binding.sliderBoxBlurIterationProperty());
		sliderColorAdjustContrast.valueProperty().bindBidirectional(binding.sliderColorAdjustContrastProperty());
		sliderColorAdjustBrigthness.valueProperty().bindBidirectional(binding.sliderColorAdjustBrigthnessProperty());
		sliderColorAdjustHue.valueProperty().bindBidirectional(binding.sliderColorAdjustHueProperty());
		sliderColorAdjustSaturation.valueProperty().bindBidirectional(binding.sliderColorAdjustSaturationProperty());
		sliderDisplacementMapOffsetY.valueProperty().bindBidirectional(binding.sliderDisplacementMapOffsetYProperty());
		sliderDisplacementMapOffsetX.valueProperty().bindBidirectional(binding.sliderDisplacementMapOffsetXProperty());
		sliderDisplacementMapScaleX.valueProperty().bindBidirectional(binding.sliderDisplacementMapScaleXProperty());
		sliderDisplacementMapScaleY.valueProperty().bindBidirectional(binding.sliderDisplacementMapScaleYProperty());
		sliderGaussianBlurRadius.valueProperty().bindBidirectional(binding.sliderGaussianBlurRadiusProperty());
		sliderGlowLevel.valueProperty().bindBidirectional(binding.sliderGlowLevelProperty());
		sliderLightningDiffuseConstant.valueProperty().bindBidirectional(binding.sliderLightningDiffuseConstantProperty());
		sliderLightningSpectularConstant.valueProperty().bindBidirectional(binding.sliderLightningSpectularConstantProperty());
		sliderLightningSpectularExponent.valueProperty().bindBidirectional(binding.sliderLightningSpectularExponentProperty());
		sliderLightningsurcfaceScale.valueProperty().bindBidirectional(binding.sliderLightningsurcfaceScaleProperty());
		comboLightningLight.setItems(binding.sortedDataComboLightningLight());
		binding.selectedDataComboLightningLight().bind(comboLightningLight.getSelectionModel().selectedItemProperty());
		sliderLightningAzimuth.valueProperty().bindBidirectional(binding.sliderLightningAzimuthProperty());
		sliderLightningEvaluation.valueProperty().bindBidirectional(binding.sliderLightningEvaluationProperty());
		sliderMotionBlurAngle.valueProperty().bindBidirectional(binding.sliderMotionBlurAngleProperty());
		sliderMotionBlurRadius.valueProperty().bindBidirectional(binding.sliderMotionBlurRadiusProperty());
		sliderPerspectiveTransformLlx.valueProperty().bindBidirectional(binding.sliderPerspectiveTransformLlxProperty());
		sliderPerspectiveTransformLly.valueProperty().bindBidirectional(binding.sliderPerspectiveTransformLlyProperty());
		sliderPerspectiveTransformLrx.valueProperty().bindBidirectional(binding.sliderPerspectiveTransformLrxProperty());
		sliderPerspectiveTransformLry.valueProperty().bindBidirectional(binding.sliderPerspectiveTransformLryProperty());
		sliderPerspectiveTransformUlx.valueProperty().bindBidirectional(binding.sliderPerspectiveTransformUlxProperty());
		sliderPerspectiveTransformUly.valueProperty().bindBidirectional(binding.sliderPerspectiveTransformUlyProperty());
		sliderPerspectiveTransformUrx.valueProperty().bindBidirectional(binding.sliderPerspectiveTransformUrxProperty());
		sliderPerspectiveTransformUry.valueProperty().bindBidirectional(binding.sliderPerspectiveTransformUryProperty());
		sliderReflectionBottomOpacity.valueProperty().bindBidirectional(binding.sliderReflectionBottomOpacityProperty());
		sliderReflectionTopOpacity.valueProperty().bindBidirectional(binding.sliderReflectionTopOpacityProperty());
		sliderReflectionTopOffset.valueProperty().bindBidirectional(binding.sliderReflectionTopOffsetProperty());
		sliderReflectionFraction.valueProperty().bindBidirectional(binding.sliderReflectionFractionProperty());
		sliderSepiaToneLevel.valueProperty().bindBidirectional(binding.sliderSepiaToneLevelProperty());
		sliderShadowHeight.valueProperty().bindBidirectional(binding.sliderShadowHeightProperty());
		sliderShadowWidth.valueProperty().bindBidirectional(binding.sliderShadowWidthProperty());
		sliderShadowRadius.valueProperty().bindBidirectional(binding.sliderShadowRadiusProperty());
		comboIShadowBlurType.setItems(binding.sortedDataComboIShadowBlurType());
		binding.selectedDataComboIShadowBlurType().bind(comboIShadowBlurType.getSelectionModel().selectedItemProperty());
		sliderInnerShadowHeight.valueProperty().bindBidirectional(binding.sliderInnerShadowHeightProperty());
		sliderInnerShadowWidth.valueProperty().bindBidirectional(binding.sliderInnerShadowWidthProperty());
		sliderInnerShadowRadius.valueProperty().bindBidirectional(binding.sliderInnerShadowRadiusProperty());
		sliderInnerShadowOffsetX.valueProperty().bindBidirectional(binding.sliderInnerShadowOffsetXProperty());
		sliderInnerShadowOffsetY.valueProperty().bindBidirectional(binding.sliderInnerShadowOffsetYProperty());
		sliderInnerShadowSpread.valueProperty().bindBidirectional(binding.sliderInnerShadowSpreadProperty());
		comboInnerShadowBlurType.setItems(binding.sortedDataComboInnerShadowBlurType());
		binding.selectedDataComboInnerShadowBlurType().bind(comboInnerShadowBlurType.getSelectionModel().selectedItemProperty());
		sliderDropshadowHeight.valueProperty().bindBidirectional(binding.sliderDropshadowHeightProperty());
		sliderDropshadowWidth.valueProperty().bindBidirectional(binding.sliderDropshadowWidthProperty());
		sliderDropshadowRadius.valueProperty().bindBidirectional(binding.sliderDropshadowRadiusProperty());
		sliderDropshadowOffsetX.valueProperty().bindBidirectional(binding.sliderDropshadowOffsetXProperty());
		sliderDropshadowOffsetY.valueProperty().bindBidirectional(binding.sliderDropshadowOffsetYProperty());
		sliderDropshadowSpread.valueProperty().bindBidirectional(binding.sliderDropshadowSpreadProperty());
		comboDropShadowBlurType.setItems(binding.sortedDataComboDropShadowBlurType());
		binding.selectedDataComboDropShadowBlurType().bind(comboDropShadowBlurType.getSelectionModel().selectedItemProperty());
		sliderColorInputHeight.valueProperty().bindBidirectional(binding.sliderColorInputHeightProperty());
		sliderColorInputWidth.valueProperty().bindBidirectional(binding.sliderColorInputWidthProperty());
		sliderColorInputX.valueProperty().bindBidirectional(binding.sliderColorInputXProperty());
		sliderColorInputY.valueProperty().bindBidirectional(binding.sliderColorInputYProperty());
	}
}
