package de.dc.minion.model.addon.snapshot.component.model;

import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class BaseTextSnapshotLayerBinding  extends BaseSelectionSnapshotLayerBinding{
	private StringProperty textSearch = new SimpleStringProperty();
	private DoubleProperty sliderBlendOpacity = new SimpleDoubleProperty();
	private StringProperty labelBlendOpacity = new SimpleStringProperty();
	private DoubleProperty sliderBloomThreshold = new SimpleDoubleProperty();
	private StringProperty labelBloomThreshold = new SimpleStringProperty();
	private DoubleProperty sliderBoxBlurWidth = new SimpleDoubleProperty();
	private StringProperty labelBoxBlurWidth = new SimpleStringProperty();
	private DoubleProperty sliderBoxBlurHeight = new SimpleDoubleProperty();
	private StringProperty labelBoxBlurHeight = new SimpleStringProperty();
	private DoubleProperty sliderBoxBlurIteration = new SimpleDoubleProperty();
	private StringProperty labelBoxBlurIteration = new SimpleStringProperty();
	private DoubleProperty sliderColorAdjustContrast = new SimpleDoubleProperty();
	private StringProperty labelColorAdjustContrast = new SimpleStringProperty();
	private DoubleProperty sliderColorAdjustBrigthness = new SimpleDoubleProperty();
	private StringProperty labelColorAdjustBrigthness = new SimpleStringProperty();
	private DoubleProperty sliderColorAdjustHue = new SimpleDoubleProperty();
	private StringProperty labelColorAdjustHue = new SimpleStringProperty();
	private DoubleProperty sliderColorAdjustSaturation = new SimpleDoubleProperty();
	private StringProperty labelColorAdjustSaturation = new SimpleStringProperty();
	private DoubleProperty sliderDisplacementMapOffsetY = new SimpleDoubleProperty();
	private StringProperty labelDisplacementMapOffsetY = new SimpleStringProperty();
	private DoubleProperty sliderDisplacementMapOffsetX = new SimpleDoubleProperty();
	private StringProperty labelDisplacementMapOffsetX = new SimpleStringProperty();
	private DoubleProperty sliderDisplacementMapScaleX = new SimpleDoubleProperty();
	private StringProperty labelDisplacementMapScaleX = new SimpleStringProperty();
	private DoubleProperty sliderDisplacementMapScaleY = new SimpleDoubleProperty();
	private StringProperty labelDisplacementMapScaleY = new SimpleStringProperty();
	private DoubleProperty sliderGaussianBlurRadius = new SimpleDoubleProperty();
	private StringProperty labelGaussianBlurRadius = new SimpleStringProperty();
	private DoubleProperty sliderGlowLevel = new SimpleDoubleProperty();
	private StringProperty labelGlowLevel = new SimpleStringProperty();
	private DoubleProperty sliderLightningDiffuseConstant = new SimpleDoubleProperty();
	private StringProperty labelLightningDiffuseConstant = new SimpleStringProperty();
	private DoubleProperty sliderLightningSpectularConstant = new SimpleDoubleProperty();
	private StringProperty labelLightningSpectularConstant = new SimpleStringProperty();
	private DoubleProperty sliderLightningSpectularExponent = new SimpleDoubleProperty();
	private StringProperty labelLightningSpectularExponent = new SimpleStringProperty();
	private DoubleProperty sliderLightningsurcfaceScale = new SimpleDoubleProperty();
	private StringProperty labelLightningsurcfaceScale = new SimpleStringProperty();
	private ObjectProperty<javafx.scene.paint.Color> colorPickerLightning = new SimpleObjectProperty<>();
	private DoubleProperty sliderLightningAzimuth = new SimpleDoubleProperty();
	private DoubleProperty sliderLightningEvaluation = new SimpleDoubleProperty();
	private StringProperty labelLightningAzimuth = new SimpleStringProperty();
	private StringProperty labelLightningEvaluation = new SimpleStringProperty();
	private DoubleProperty sliderMotionBlurAngle = new SimpleDoubleProperty();
	private StringProperty labelMotionBlurAngel = new SimpleStringProperty();
	private DoubleProperty sliderMotionBlurRadius = new SimpleDoubleProperty();
	private StringProperty labelMotionBlurRadius = new SimpleStringProperty();
	private DoubleProperty sliderPerspectiveTransformLlx = new SimpleDoubleProperty();
	private StringProperty labelPerspectiveTransformLlx = new SimpleStringProperty();
	private DoubleProperty sliderPerspectiveTransformLly = new SimpleDoubleProperty();
	private StringProperty labelPerspectiveTransformLly = new SimpleStringProperty();
	private DoubleProperty sliderPerspectiveTransformLrx = new SimpleDoubleProperty();
	private StringProperty labelPerspectiveTransformLrx = new SimpleStringProperty();
	private DoubleProperty sliderPerspectiveTransformLry = new SimpleDoubleProperty();
	private StringProperty labelPerspectiveTransformLry = new SimpleStringProperty();
	private DoubleProperty sliderPerspectiveTransformUlx = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformUly = new SimpleDoubleProperty();
	private StringProperty labelPerspectiveTransformUlx = new SimpleStringProperty();
	private StringProperty labelPerspectiveTransformUly = new SimpleStringProperty();
	private DoubleProperty sliderPerspectiveTransformUrx = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformUry = new SimpleDoubleProperty();
	private StringProperty labelPerspectiveTransformUrx = new SimpleStringProperty();
	private StringProperty labelPerspectiveTransformUry = new SimpleStringProperty();
	private DoubleProperty sliderReflectionBottomOpacity = new SimpleDoubleProperty();
	private StringProperty labelReflectionBottomOpacity = new SimpleStringProperty();
	private DoubleProperty sliderReflectionTopOpacity = new SimpleDoubleProperty();
	private StringProperty labelReflectionTopOpacity = new SimpleStringProperty();
	private DoubleProperty sliderReflectionTopOffset = new SimpleDoubleProperty();
	private StringProperty labelReflectionTopOffset = new SimpleStringProperty();
	private DoubleProperty sliderReflectionFraction = new SimpleDoubleProperty();
	private StringProperty labelReflectionFraction = new SimpleStringProperty();
	private DoubleProperty sliderSepiaToneLevel = new SimpleDoubleProperty();
	private StringProperty labelsSepiaToneLevel = new SimpleStringProperty();
	private DoubleProperty sliderShadowHeight = new SimpleDoubleProperty();
	private StringProperty labelShadowHeight = new SimpleStringProperty();
	private DoubleProperty sliderShadowWidth = new SimpleDoubleProperty();
	private StringProperty labelShadowWidth = new SimpleStringProperty();
	private DoubleProperty sliderShadowRadius = new SimpleDoubleProperty();
	private StringProperty labelShadowRadius = new SimpleStringProperty();
	private ObjectProperty<javafx.scene.paint.Color> colorPickerShadow = new SimpleObjectProperty<>();
	private DoubleProperty sliderInnerShadowHeight = new SimpleDoubleProperty();
	private StringProperty labelInnerShadowHeight = new SimpleStringProperty();
	private DoubleProperty sliderInnerShadowWidth = new SimpleDoubleProperty();
	private StringProperty labelInnerShadowWidth = new SimpleStringProperty();
	private DoubleProperty sliderInnerShadowRadius = new SimpleDoubleProperty();
	private StringProperty labelInnerShadowRadius = new SimpleStringProperty();
	private DoubleProperty sliderInnerShadowOffsetX = new SimpleDoubleProperty();
	private StringProperty labelInnerShadowOffsetX = new SimpleStringProperty();
	private DoubleProperty sliderInnerShadowOffsetY = new SimpleDoubleProperty();
	private StringProperty labelInnerShadowOffsetY = new SimpleStringProperty();
	private DoubleProperty sliderInnerShadowSpread = new SimpleDoubleProperty();
	private StringProperty labelInnerShadowSpread = new SimpleStringProperty();
	private ObjectProperty<javafx.scene.paint.Color> colorPickerInnerShadow = new SimpleObjectProperty<>();
	private DoubleProperty sliderDropshadowHeight = new SimpleDoubleProperty();
	private StringProperty labelDropshadowHeight = new SimpleStringProperty();
	private DoubleProperty sliderDropshadowWidth = new SimpleDoubleProperty();
	private StringProperty labelDropshadowWidth = new SimpleStringProperty();
	private DoubleProperty sliderDropshadowRadius = new SimpleDoubleProperty();
	private StringProperty labelDropshadowRadius = new SimpleStringProperty();
	private DoubleProperty sliderDropshadowOffsetX = new SimpleDoubleProperty();
	private StringProperty labelDropshadowOffsetX = new SimpleStringProperty();
	private DoubleProperty sliderDropshadowOffsetY = new SimpleDoubleProperty();
	private StringProperty labelDropshadowOffsetY = new SimpleStringProperty();
	private DoubleProperty sliderDropshadowSpread = new SimpleDoubleProperty();
	private StringProperty labelDropshadowSpread = new SimpleStringProperty();
	private ObjectProperty<javafx.scene.paint.Color> colorPickerDropShadow = new SimpleObjectProperty<>();
	private DoubleProperty sliderColorInputHeight = new SimpleDoubleProperty();
	private StringProperty labelColorInputHeight = new SimpleStringProperty();
	private DoubleProperty sliderColorInputWidth = new SimpleDoubleProperty();
	private StringProperty labelColorInputWidth = new SimpleStringProperty();
	private DoubleProperty sliderColorInputX = new SimpleDoubleProperty();
	private StringProperty labelColorInputX = new SimpleStringProperty();
	private DoubleProperty sliderColorInputY = new SimpleDoubleProperty();
	private StringProperty labelColorInputY = new SimpleStringProperty();
	private ObjectProperty<javafx.scene.paint.Color> colorPickerColorInput = new SimpleObjectProperty<>();
	
	public String getTextSearch(){
		return this.textSearch.get();
	}
	
	public void setTextSearch(String textSearch){
		this.textSearch.set(textSearch);
	}
	
	public StringProperty textSearchProperty(){
		return this.textSearch;
	}
	
	public void setTextSearchProperty(StringProperty textSearch){
		this.textSearch=textSearch;
	}
	public Double getSliderBlendOpacity(){
		return this.sliderBlendOpacity.get();
	}
	
	public void setSliderBlendOpacity(Double sliderBlendOpacity){
		this.sliderBlendOpacity.set(sliderBlendOpacity);
	}
	
	public DoubleProperty sliderBlendOpacityProperty(){
		return this.sliderBlendOpacity;
	}
	
	public void setSliderBlendOpacityProperty(DoubleProperty sliderBlendOpacity){
		this.sliderBlendOpacity=sliderBlendOpacity;
	}
	public String getLabelBlendOpacity(){
		return this.labelBlendOpacity.get();
	}
	
	public void setLabelBlendOpacity(String labelBlendOpacity){
		this.labelBlendOpacity.set(labelBlendOpacity);
	}
	
	public StringProperty labelBlendOpacityProperty(){
		return this.labelBlendOpacity;
	}
	
	public void setLabelBlendOpacityProperty(StringProperty labelBlendOpacity){
		this.labelBlendOpacity=labelBlendOpacity;
	}
	public Double getSliderBloomThreshold(){
		return this.sliderBloomThreshold.get();
	}
	
	public void setSliderBloomThreshold(Double sliderBloomThreshold){
		this.sliderBloomThreshold.set(sliderBloomThreshold);
	}
	
	public DoubleProperty sliderBloomThresholdProperty(){
		return this.sliderBloomThreshold;
	}
	
	public void setSliderBloomThresholdProperty(DoubleProperty sliderBloomThreshold){
		this.sliderBloomThreshold=sliderBloomThreshold;
	}
	public String getLabelBloomThreshold(){
		return this.labelBloomThreshold.get();
	}
	
	public void setLabelBloomThreshold(String labelBloomThreshold){
		this.labelBloomThreshold.set(labelBloomThreshold);
	}
	
	public StringProperty labelBloomThresholdProperty(){
		return this.labelBloomThreshold;
	}
	
	public void setLabelBloomThresholdProperty(StringProperty labelBloomThreshold){
		this.labelBloomThreshold=labelBloomThreshold;
	}
	public Double getSliderBoxBlurWidth(){
		return this.sliderBoxBlurWidth.get();
	}
	
	public void setSliderBoxBlurWidth(Double sliderBoxBlurWidth){
		this.sliderBoxBlurWidth.set(sliderBoxBlurWidth);
	}
	
	public DoubleProperty sliderBoxBlurWidthProperty(){
		return this.sliderBoxBlurWidth;
	}
	
	public void setSliderBoxBlurWidthProperty(DoubleProperty sliderBoxBlurWidth){
		this.sliderBoxBlurWidth=sliderBoxBlurWidth;
	}
	public String getLabelBoxBlurWidth(){
		return this.labelBoxBlurWidth.get();
	}
	
	public void setLabelBoxBlurWidth(String labelBoxBlurWidth){
		this.labelBoxBlurWidth.set(labelBoxBlurWidth);
	}
	
	public StringProperty labelBoxBlurWidthProperty(){
		return this.labelBoxBlurWidth;
	}
	
	public void setLabelBoxBlurWidthProperty(StringProperty labelBoxBlurWidth){
		this.labelBoxBlurWidth=labelBoxBlurWidth;
	}
	public Double getSliderBoxBlurHeight(){
		return this.sliderBoxBlurHeight.get();
	}
	
	public void setSliderBoxBlurHeight(Double sliderBoxBlurHeight){
		this.sliderBoxBlurHeight.set(sliderBoxBlurHeight);
	}
	
	public DoubleProperty sliderBoxBlurHeightProperty(){
		return this.sliderBoxBlurHeight;
	}
	
	public void setSliderBoxBlurHeightProperty(DoubleProperty sliderBoxBlurHeight){
		this.sliderBoxBlurHeight=sliderBoxBlurHeight;
	}
	public String getLabelBoxBlurHeight(){
		return this.labelBoxBlurHeight.get();
	}
	
	public void setLabelBoxBlurHeight(String labelBoxBlurHeight){
		this.labelBoxBlurHeight.set(labelBoxBlurHeight);
	}
	
	public StringProperty labelBoxBlurHeightProperty(){
		return this.labelBoxBlurHeight;
	}
	
	public void setLabelBoxBlurHeightProperty(StringProperty labelBoxBlurHeight){
		this.labelBoxBlurHeight=labelBoxBlurHeight;
	}
	public Double getSliderBoxBlurIteration(){
		return this.sliderBoxBlurIteration.get();
	}
	
	public void setSliderBoxBlurIteration(Double sliderBoxBlurIteration){
		this.sliderBoxBlurIteration.set(sliderBoxBlurIteration);
	}
	
	public DoubleProperty sliderBoxBlurIterationProperty(){
		return this.sliderBoxBlurIteration;
	}
	
	public void setSliderBoxBlurIterationProperty(DoubleProperty sliderBoxBlurIteration){
		this.sliderBoxBlurIteration=sliderBoxBlurIteration;
	}
	public String getLabelBoxBlurIteration(){
		return this.labelBoxBlurIteration.get();
	}
	
	public void setLabelBoxBlurIteration(String labelBoxBlurIteration){
		this.labelBoxBlurIteration.set(labelBoxBlurIteration);
	}
	
	public StringProperty labelBoxBlurIterationProperty(){
		return this.labelBoxBlurIteration;
	}
	
	public void setLabelBoxBlurIterationProperty(StringProperty labelBoxBlurIteration){
		this.labelBoxBlurIteration=labelBoxBlurIteration;
	}
	public Double getSliderColorAdjustContrast(){
		return this.sliderColorAdjustContrast.get();
	}
	
	public void setSliderColorAdjustContrast(Double sliderColorAdjustContrast){
		this.sliderColorAdjustContrast.set(sliderColorAdjustContrast);
	}
	
	public DoubleProperty sliderColorAdjustContrastProperty(){
		return this.sliderColorAdjustContrast;
	}
	
	public void setSliderColorAdjustContrastProperty(DoubleProperty sliderColorAdjustContrast){
		this.sliderColorAdjustContrast=sliderColorAdjustContrast;
	}
	public String getLabelColorAdjustContrast(){
		return this.labelColorAdjustContrast.get();
	}
	
	public void setLabelColorAdjustContrast(String labelColorAdjustContrast){
		this.labelColorAdjustContrast.set(labelColorAdjustContrast);
	}
	
	public StringProperty labelColorAdjustContrastProperty(){
		return this.labelColorAdjustContrast;
	}
	
	public void setLabelColorAdjustContrastProperty(StringProperty labelColorAdjustContrast){
		this.labelColorAdjustContrast=labelColorAdjustContrast;
	}
	public Double getSliderColorAdjustBrigthness(){
		return this.sliderColorAdjustBrigthness.get();
	}
	
	public void setSliderColorAdjustBrigthness(Double sliderColorAdjustBrigthness){
		this.sliderColorAdjustBrigthness.set(sliderColorAdjustBrigthness);
	}
	
	public DoubleProperty sliderColorAdjustBrigthnessProperty(){
		return this.sliderColorAdjustBrigthness;
	}
	
	public void setSliderColorAdjustBrigthnessProperty(DoubleProperty sliderColorAdjustBrigthness){
		this.sliderColorAdjustBrigthness=sliderColorAdjustBrigthness;
	}
	public String getLabelColorAdjustBrigthness(){
		return this.labelColorAdjustBrigthness.get();
	}
	
	public void setLabelColorAdjustBrigthness(String labelColorAdjustBrigthness){
		this.labelColorAdjustBrigthness.set(labelColorAdjustBrigthness);
	}
	
	public StringProperty labelColorAdjustBrigthnessProperty(){
		return this.labelColorAdjustBrigthness;
	}
	
	public void setLabelColorAdjustBrigthnessProperty(StringProperty labelColorAdjustBrigthness){
		this.labelColorAdjustBrigthness=labelColorAdjustBrigthness;
	}
	public Double getSliderColorAdjustHue(){
		return this.sliderColorAdjustHue.get();
	}
	
	public void setSliderColorAdjustHue(Double sliderColorAdjustHue){
		this.sliderColorAdjustHue.set(sliderColorAdjustHue);
	}
	
	public DoubleProperty sliderColorAdjustHueProperty(){
		return this.sliderColorAdjustHue;
	}
	
	public void setSliderColorAdjustHueProperty(DoubleProperty sliderColorAdjustHue){
		this.sliderColorAdjustHue=sliderColorAdjustHue;
	}
	public String getLabelColorAdjustHue(){
		return this.labelColorAdjustHue.get();
	}
	
	public void setLabelColorAdjustHue(String labelColorAdjustHue){
		this.labelColorAdjustHue.set(labelColorAdjustHue);
	}
	
	public StringProperty labelColorAdjustHueProperty(){
		return this.labelColorAdjustHue;
	}
	
	public void setLabelColorAdjustHueProperty(StringProperty labelColorAdjustHue){
		this.labelColorAdjustHue=labelColorAdjustHue;
	}
	public Double getSliderColorAdjustSaturation(){
		return this.sliderColorAdjustSaturation.get();
	}
	
	public void setSliderColorAdjustSaturation(Double sliderColorAdjustSaturation){
		this.sliderColorAdjustSaturation.set(sliderColorAdjustSaturation);
	}
	
	public DoubleProperty sliderColorAdjustSaturationProperty(){
		return this.sliderColorAdjustSaturation;
	}
	
	public void setSliderColorAdjustSaturationProperty(DoubleProperty sliderColorAdjustSaturation){
		this.sliderColorAdjustSaturation=sliderColorAdjustSaturation;
	}
	public String getLabelColorAdjustSaturation(){
		return this.labelColorAdjustSaturation.get();
	}
	
	public void setLabelColorAdjustSaturation(String labelColorAdjustSaturation){
		this.labelColorAdjustSaturation.set(labelColorAdjustSaturation);
	}
	
	public StringProperty labelColorAdjustSaturationProperty(){
		return this.labelColorAdjustSaturation;
	}
	
	public void setLabelColorAdjustSaturationProperty(StringProperty labelColorAdjustSaturation){
		this.labelColorAdjustSaturation=labelColorAdjustSaturation;
	}
	public Double getSliderDisplacementMapOffsetY(){
		return this.sliderDisplacementMapOffsetY.get();
	}
	
	public void setSliderDisplacementMapOffsetY(Double sliderDisplacementMapOffsetY){
		this.sliderDisplacementMapOffsetY.set(sliderDisplacementMapOffsetY);
	}
	
	public DoubleProperty sliderDisplacementMapOffsetYProperty(){
		return this.sliderDisplacementMapOffsetY;
	}
	
	public void setSliderDisplacementMapOffsetYProperty(DoubleProperty sliderDisplacementMapOffsetY){
		this.sliderDisplacementMapOffsetY=sliderDisplacementMapOffsetY;
	}
	public String getLabelDisplacementMapOffsetY(){
		return this.labelDisplacementMapOffsetY.get();
	}
	
	public void setLabelDisplacementMapOffsetY(String labelDisplacementMapOffsetY){
		this.labelDisplacementMapOffsetY.set(labelDisplacementMapOffsetY);
	}
	
	public StringProperty labelDisplacementMapOffsetYProperty(){
		return this.labelDisplacementMapOffsetY;
	}
	
	public void setLabelDisplacementMapOffsetYProperty(StringProperty labelDisplacementMapOffsetY){
		this.labelDisplacementMapOffsetY=labelDisplacementMapOffsetY;
	}
	public Double getSliderDisplacementMapOffsetX(){
		return this.sliderDisplacementMapOffsetX.get();
	}
	
	public void setSliderDisplacementMapOffsetX(Double sliderDisplacementMapOffsetX){
		this.sliderDisplacementMapOffsetX.set(sliderDisplacementMapOffsetX);
	}
	
	public DoubleProperty sliderDisplacementMapOffsetXProperty(){
		return this.sliderDisplacementMapOffsetX;
	}
	
	public void setSliderDisplacementMapOffsetXProperty(DoubleProperty sliderDisplacementMapOffsetX){
		this.sliderDisplacementMapOffsetX=sliderDisplacementMapOffsetX;
	}
	public String getLabelDisplacementMapOffsetX(){
		return this.labelDisplacementMapOffsetX.get();
	}
	
	public void setLabelDisplacementMapOffsetX(String labelDisplacementMapOffsetX){
		this.labelDisplacementMapOffsetX.set(labelDisplacementMapOffsetX);
	}
	
	public StringProperty labelDisplacementMapOffsetXProperty(){
		return this.labelDisplacementMapOffsetX;
	}
	
	public void setLabelDisplacementMapOffsetXProperty(StringProperty labelDisplacementMapOffsetX){
		this.labelDisplacementMapOffsetX=labelDisplacementMapOffsetX;
	}
	public Double getSliderDisplacementMapScaleX(){
		return this.sliderDisplacementMapScaleX.get();
	}
	
	public void setSliderDisplacementMapScaleX(Double sliderDisplacementMapScaleX){
		this.sliderDisplacementMapScaleX.set(sliderDisplacementMapScaleX);
	}
	
	public DoubleProperty sliderDisplacementMapScaleXProperty(){
		return this.sliderDisplacementMapScaleX;
	}
	
	public void setSliderDisplacementMapScaleXProperty(DoubleProperty sliderDisplacementMapScaleX){
		this.sliderDisplacementMapScaleX=sliderDisplacementMapScaleX;
	}
	public String getLabelDisplacementMapScaleX(){
		return this.labelDisplacementMapScaleX.get();
	}
	
	public void setLabelDisplacementMapScaleX(String labelDisplacementMapScaleX){
		this.labelDisplacementMapScaleX.set(labelDisplacementMapScaleX);
	}
	
	public StringProperty labelDisplacementMapScaleXProperty(){
		return this.labelDisplacementMapScaleX;
	}
	
	public void setLabelDisplacementMapScaleXProperty(StringProperty labelDisplacementMapScaleX){
		this.labelDisplacementMapScaleX=labelDisplacementMapScaleX;
	}
	public Double getSliderDisplacementMapScaleY(){
		return this.sliderDisplacementMapScaleY.get();
	}
	
	public void setSliderDisplacementMapScaleY(Double sliderDisplacementMapScaleY){
		this.sliderDisplacementMapScaleY.set(sliderDisplacementMapScaleY);
	}
	
	public DoubleProperty sliderDisplacementMapScaleYProperty(){
		return this.sliderDisplacementMapScaleY;
	}
	
	public void setSliderDisplacementMapScaleYProperty(DoubleProperty sliderDisplacementMapScaleY){
		this.sliderDisplacementMapScaleY=sliderDisplacementMapScaleY;
	}
	public String getLabelDisplacementMapScaleY(){
		return this.labelDisplacementMapScaleY.get();
	}
	
	public void setLabelDisplacementMapScaleY(String labelDisplacementMapScaleY){
		this.labelDisplacementMapScaleY.set(labelDisplacementMapScaleY);
	}
	
	public StringProperty labelDisplacementMapScaleYProperty(){
		return this.labelDisplacementMapScaleY;
	}
	
	public void setLabelDisplacementMapScaleYProperty(StringProperty labelDisplacementMapScaleY){
		this.labelDisplacementMapScaleY=labelDisplacementMapScaleY;
	}
	public Double getSliderGaussianBlurRadius(){
		return this.sliderGaussianBlurRadius.get();
	}
	
	public void setSliderGaussianBlurRadius(Double sliderGaussianBlurRadius){
		this.sliderGaussianBlurRadius.set(sliderGaussianBlurRadius);
	}
	
	public DoubleProperty sliderGaussianBlurRadiusProperty(){
		return this.sliderGaussianBlurRadius;
	}
	
	public void setSliderGaussianBlurRadiusProperty(DoubleProperty sliderGaussianBlurRadius){
		this.sliderGaussianBlurRadius=sliderGaussianBlurRadius;
	}
	public String getLabelGaussianBlurRadius(){
		return this.labelGaussianBlurRadius.get();
	}
	
	public void setLabelGaussianBlurRadius(String labelGaussianBlurRadius){
		this.labelGaussianBlurRadius.set(labelGaussianBlurRadius);
	}
	
	public StringProperty labelGaussianBlurRadiusProperty(){
		return this.labelGaussianBlurRadius;
	}
	
	public void setLabelGaussianBlurRadiusProperty(StringProperty labelGaussianBlurRadius){
		this.labelGaussianBlurRadius=labelGaussianBlurRadius;
	}
	public Double getSliderGlowLevel(){
		return this.sliderGlowLevel.get();
	}
	
	public void setSliderGlowLevel(Double sliderGlowLevel){
		this.sliderGlowLevel.set(sliderGlowLevel);
	}
	
	public DoubleProperty sliderGlowLevelProperty(){
		return this.sliderGlowLevel;
	}
	
	public void setSliderGlowLevelProperty(DoubleProperty sliderGlowLevel){
		this.sliderGlowLevel=sliderGlowLevel;
	}
	public String getLabelGlowLevel(){
		return this.labelGlowLevel.get();
	}
	
	public void setLabelGlowLevel(String labelGlowLevel){
		this.labelGlowLevel.set(labelGlowLevel);
	}
	
	public StringProperty labelGlowLevelProperty(){
		return this.labelGlowLevel;
	}
	
	public void setLabelGlowLevelProperty(StringProperty labelGlowLevel){
		this.labelGlowLevel=labelGlowLevel;
	}
	public Double getSliderLightningDiffuseConstant(){
		return this.sliderLightningDiffuseConstant.get();
	}
	
	public void setSliderLightningDiffuseConstant(Double sliderLightningDiffuseConstant){
		this.sliderLightningDiffuseConstant.set(sliderLightningDiffuseConstant);
	}
	
	public DoubleProperty sliderLightningDiffuseConstantProperty(){
		return this.sliderLightningDiffuseConstant;
	}
	
	public void setSliderLightningDiffuseConstantProperty(DoubleProperty sliderLightningDiffuseConstant){
		this.sliderLightningDiffuseConstant=sliderLightningDiffuseConstant;
	}
	public String getLabelLightningDiffuseConstant(){
		return this.labelLightningDiffuseConstant.get();
	}
	
	public void setLabelLightningDiffuseConstant(String labelLightningDiffuseConstant){
		this.labelLightningDiffuseConstant.set(labelLightningDiffuseConstant);
	}
	
	public StringProperty labelLightningDiffuseConstantProperty(){
		return this.labelLightningDiffuseConstant;
	}
	
	public void setLabelLightningDiffuseConstantProperty(StringProperty labelLightningDiffuseConstant){
		this.labelLightningDiffuseConstant=labelLightningDiffuseConstant;
	}
	public Double getSliderLightningSpectularConstant(){
		return this.sliderLightningSpectularConstant.get();
	}
	
	public void setSliderLightningSpectularConstant(Double sliderLightningSpectularConstant){
		this.sliderLightningSpectularConstant.set(sliderLightningSpectularConstant);
	}
	
	public DoubleProperty sliderLightningSpectularConstantProperty(){
		return this.sliderLightningSpectularConstant;
	}
	
	public void setSliderLightningSpectularConstantProperty(DoubleProperty sliderLightningSpectularConstant){
		this.sliderLightningSpectularConstant=sliderLightningSpectularConstant;
	}
	public String getLabelLightningSpectularConstant(){
		return this.labelLightningSpectularConstant.get();
	}
	
	public void setLabelLightningSpectularConstant(String labelLightningSpectularConstant){
		this.labelLightningSpectularConstant.set(labelLightningSpectularConstant);
	}
	
	public StringProperty labelLightningSpectularConstantProperty(){
		return this.labelLightningSpectularConstant;
	}
	
	public void setLabelLightningSpectularConstantProperty(StringProperty labelLightningSpectularConstant){
		this.labelLightningSpectularConstant=labelLightningSpectularConstant;
	}
	public Double getSliderLightningSpectularExponent(){
		return this.sliderLightningSpectularExponent.get();
	}
	
	public void setSliderLightningSpectularExponent(Double sliderLightningSpectularExponent){
		this.sliderLightningSpectularExponent.set(sliderLightningSpectularExponent);
	}
	
	public DoubleProperty sliderLightningSpectularExponentProperty(){
		return this.sliderLightningSpectularExponent;
	}
	
	public void setSliderLightningSpectularExponentProperty(DoubleProperty sliderLightningSpectularExponent){
		this.sliderLightningSpectularExponent=sliderLightningSpectularExponent;
	}
	public String getLabelLightningSpectularExponent(){
		return this.labelLightningSpectularExponent.get();
	}
	
	public void setLabelLightningSpectularExponent(String labelLightningSpectularExponent){
		this.labelLightningSpectularExponent.set(labelLightningSpectularExponent);
	}
	
	public StringProperty labelLightningSpectularExponentProperty(){
		return this.labelLightningSpectularExponent;
	}
	
	public void setLabelLightningSpectularExponentProperty(StringProperty labelLightningSpectularExponent){
		this.labelLightningSpectularExponent=labelLightningSpectularExponent;
	}
	public Double getSliderLightningsurcfaceScale(){
		return this.sliderLightningsurcfaceScale.get();
	}
	
	public void setSliderLightningsurcfaceScale(Double sliderLightningsurcfaceScale){
		this.sliderLightningsurcfaceScale.set(sliderLightningsurcfaceScale);
	}
	
	public DoubleProperty sliderLightningsurcfaceScaleProperty(){
		return this.sliderLightningsurcfaceScale;
	}
	
	public void setSliderLightningsurcfaceScaleProperty(DoubleProperty sliderLightningsurcfaceScale){
		this.sliderLightningsurcfaceScale=sliderLightningsurcfaceScale;
	}
	public String getLabelLightningsurcfaceScale(){
		return this.labelLightningsurcfaceScale.get();
	}
	
	public void setLabelLightningsurcfaceScale(String labelLightningsurcfaceScale){
		this.labelLightningsurcfaceScale.set(labelLightningsurcfaceScale);
	}
	
	public StringProperty labelLightningsurcfaceScaleProperty(){
		return this.labelLightningsurcfaceScale;
	}
	
	public void setLabelLightningsurcfaceScaleProperty(StringProperty labelLightningsurcfaceScale){
		this.labelLightningsurcfaceScale=labelLightningsurcfaceScale;
	}
	public javafx.scene.paint.Color getColorPickerLightning(){
		return this.colorPickerLightning.get();
	}
	
	public void setColorPickerLightning(javafx.scene.paint.Color colorPickerLightning){
		this.colorPickerLightning.set(colorPickerLightning);
	}
	
	public ObjectProperty<javafx.scene.paint.Color> colorPickerLightningProperty(){
		return this.colorPickerLightning;
	}
	
	public void setColorPickerLightningProperty(ObjectProperty<javafx.scene.paint.Color> colorPickerLightning){
		this.colorPickerLightning=colorPickerLightning;
	}
	public Double getSliderLightningAzimuth(){
		return this.sliderLightningAzimuth.get();
	}
	
	public void setSliderLightningAzimuth(Double sliderLightningAzimuth){
		this.sliderLightningAzimuth.set(sliderLightningAzimuth);
	}
	
	public DoubleProperty sliderLightningAzimuthProperty(){
		return this.sliderLightningAzimuth;
	}
	
	public void setSliderLightningAzimuthProperty(DoubleProperty sliderLightningAzimuth){
		this.sliderLightningAzimuth=sliderLightningAzimuth;
	}
	public Double getSliderLightningEvaluation(){
		return this.sliderLightningEvaluation.get();
	}
	
	public void setSliderLightningEvaluation(Double sliderLightningEvaluation){
		this.sliderLightningEvaluation.set(sliderLightningEvaluation);
	}
	
	public DoubleProperty sliderLightningEvaluationProperty(){
		return this.sliderLightningEvaluation;
	}
	
	public void setSliderLightningEvaluationProperty(DoubleProperty sliderLightningEvaluation){
		this.sliderLightningEvaluation=sliderLightningEvaluation;
	}
	public String getLabelLightningAzimuth(){
		return this.labelLightningAzimuth.get();
	}
	
	public void setLabelLightningAzimuth(String labelLightningAzimuth){
		this.labelLightningAzimuth.set(labelLightningAzimuth);
	}
	
	public StringProperty labelLightningAzimuthProperty(){
		return this.labelLightningAzimuth;
	}
	
	public void setLabelLightningAzimuthProperty(StringProperty labelLightningAzimuth){
		this.labelLightningAzimuth=labelLightningAzimuth;
	}
	public String getLabelLightningEvaluation(){
		return this.labelLightningEvaluation.get();
	}
	
	public void setLabelLightningEvaluation(String labelLightningEvaluation){
		this.labelLightningEvaluation.set(labelLightningEvaluation);
	}
	
	public StringProperty labelLightningEvaluationProperty(){
		return this.labelLightningEvaluation;
	}
	
	public void setLabelLightningEvaluationProperty(StringProperty labelLightningEvaluation){
		this.labelLightningEvaluation=labelLightningEvaluation;
	}
	public Double getSliderMotionBlurAngle(){
		return this.sliderMotionBlurAngle.get();
	}
	
	public void setSliderMotionBlurAngle(Double sliderMotionBlurAngle){
		this.sliderMotionBlurAngle.set(sliderMotionBlurAngle);
	}
	
	public DoubleProperty sliderMotionBlurAngleProperty(){
		return this.sliderMotionBlurAngle;
	}
	
	public void setSliderMotionBlurAngleProperty(DoubleProperty sliderMotionBlurAngle){
		this.sliderMotionBlurAngle=sliderMotionBlurAngle;
	}
	public String getLabelMotionBlurAngel(){
		return this.labelMotionBlurAngel.get();
	}
	
	public void setLabelMotionBlurAngel(String labelMotionBlurAngel){
		this.labelMotionBlurAngel.set(labelMotionBlurAngel);
	}
	
	public StringProperty labelMotionBlurAngelProperty(){
		return this.labelMotionBlurAngel;
	}
	
	public void setLabelMotionBlurAngelProperty(StringProperty labelMotionBlurAngel){
		this.labelMotionBlurAngel=labelMotionBlurAngel;
	}
	public Double getSliderMotionBlurRadius(){
		return this.sliderMotionBlurRadius.get();
	}
	
	public void setSliderMotionBlurRadius(Double sliderMotionBlurRadius){
		this.sliderMotionBlurRadius.set(sliderMotionBlurRadius);
	}
	
	public DoubleProperty sliderMotionBlurRadiusProperty(){
		return this.sliderMotionBlurRadius;
	}
	
	public void setSliderMotionBlurRadiusProperty(DoubleProperty sliderMotionBlurRadius){
		this.sliderMotionBlurRadius=sliderMotionBlurRadius;
	}
	public String getLabelMotionBlurRadius(){
		return this.labelMotionBlurRadius.get();
	}
	
	public void setLabelMotionBlurRadius(String labelMotionBlurRadius){
		this.labelMotionBlurRadius.set(labelMotionBlurRadius);
	}
	
	public StringProperty labelMotionBlurRadiusProperty(){
		return this.labelMotionBlurRadius;
	}
	
	public void setLabelMotionBlurRadiusProperty(StringProperty labelMotionBlurRadius){
		this.labelMotionBlurRadius=labelMotionBlurRadius;
	}
	public Double getSliderPerspectiveTransformLlx(){
		return this.sliderPerspectiveTransformLlx.get();
	}
	
	public void setSliderPerspectiveTransformLlx(Double sliderPerspectiveTransformLlx){
		this.sliderPerspectiveTransformLlx.set(sliderPerspectiveTransformLlx);
	}
	
	public DoubleProperty sliderPerspectiveTransformLlxProperty(){
		return this.sliderPerspectiveTransformLlx;
	}
	
	public void setSliderPerspectiveTransformLlxProperty(DoubleProperty sliderPerspectiveTransformLlx){
		this.sliderPerspectiveTransformLlx=sliderPerspectiveTransformLlx;
	}
	public String getLabelPerspectiveTransformLlx(){
		return this.labelPerspectiveTransformLlx.get();
	}
	
	public void setLabelPerspectiveTransformLlx(String labelPerspectiveTransformLlx){
		this.labelPerspectiveTransformLlx.set(labelPerspectiveTransformLlx);
	}
	
	public StringProperty labelPerspectiveTransformLlxProperty(){
		return this.labelPerspectiveTransformLlx;
	}
	
	public void setLabelPerspectiveTransformLlxProperty(StringProperty labelPerspectiveTransformLlx){
		this.labelPerspectiveTransformLlx=labelPerspectiveTransformLlx;
	}
	public Double getSliderPerspectiveTransformLly(){
		return this.sliderPerspectiveTransformLly.get();
	}
	
	public void setSliderPerspectiveTransformLly(Double sliderPerspectiveTransformLly){
		this.sliderPerspectiveTransformLly.set(sliderPerspectiveTransformLly);
	}
	
	public DoubleProperty sliderPerspectiveTransformLlyProperty(){
		return this.sliderPerspectiveTransformLly;
	}
	
	public void setSliderPerspectiveTransformLlyProperty(DoubleProperty sliderPerspectiveTransformLly){
		this.sliderPerspectiveTransformLly=sliderPerspectiveTransformLly;
	}
	public String getLabelPerspectiveTransformLly(){
		return this.labelPerspectiveTransformLly.get();
	}
	
	public void setLabelPerspectiveTransformLly(String labelPerspectiveTransformLly){
		this.labelPerspectiveTransformLly.set(labelPerspectiveTransformLly);
	}
	
	public StringProperty labelPerspectiveTransformLlyProperty(){
		return this.labelPerspectiveTransformLly;
	}
	
	public void setLabelPerspectiveTransformLlyProperty(StringProperty labelPerspectiveTransformLly){
		this.labelPerspectiveTransformLly=labelPerspectiveTransformLly;
	}
	public Double getSliderPerspectiveTransformLrx(){
		return this.sliderPerspectiveTransformLrx.get();
	}
	
	public void setSliderPerspectiveTransformLrx(Double sliderPerspectiveTransformLrx){
		this.sliderPerspectiveTransformLrx.set(sliderPerspectiveTransformLrx);
	}
	
	public DoubleProperty sliderPerspectiveTransformLrxProperty(){
		return this.sliderPerspectiveTransformLrx;
	}
	
	public void setSliderPerspectiveTransformLrxProperty(DoubleProperty sliderPerspectiveTransformLrx){
		this.sliderPerspectiveTransformLrx=sliderPerspectiveTransformLrx;
	}
	public String getLabelPerspectiveTransformLrx(){
		return this.labelPerspectiveTransformLrx.get();
	}
	
	public void setLabelPerspectiveTransformLrx(String labelPerspectiveTransformLrx){
		this.labelPerspectiveTransformLrx.set(labelPerspectiveTransformLrx);
	}
	
	public StringProperty labelPerspectiveTransformLrxProperty(){
		return this.labelPerspectiveTransformLrx;
	}
	
	public void setLabelPerspectiveTransformLrxProperty(StringProperty labelPerspectiveTransformLrx){
		this.labelPerspectiveTransformLrx=labelPerspectiveTransformLrx;
	}
	public Double getSliderPerspectiveTransformLry(){
		return this.sliderPerspectiveTransformLry.get();
	}
	
	public void setSliderPerspectiveTransformLry(Double sliderPerspectiveTransformLry){
		this.sliderPerspectiveTransformLry.set(sliderPerspectiveTransformLry);
	}
	
	public DoubleProperty sliderPerspectiveTransformLryProperty(){
		return this.sliderPerspectiveTransformLry;
	}
	
	public void setSliderPerspectiveTransformLryProperty(DoubleProperty sliderPerspectiveTransformLry){
		this.sliderPerspectiveTransformLry=sliderPerspectiveTransformLry;
	}
	public String getLabelPerspectiveTransformLry(){
		return this.labelPerspectiveTransformLry.get();
	}
	
	public void setLabelPerspectiveTransformLry(String labelPerspectiveTransformLry){
		this.labelPerspectiveTransformLry.set(labelPerspectiveTransformLry);
	}
	
	public StringProperty labelPerspectiveTransformLryProperty(){
		return this.labelPerspectiveTransformLry;
	}
	
	public void setLabelPerspectiveTransformLryProperty(StringProperty labelPerspectiveTransformLry){
		this.labelPerspectiveTransformLry=labelPerspectiveTransformLry;
	}
	public Double getSliderPerspectiveTransformUlx(){
		return this.sliderPerspectiveTransformUlx.get();
	}
	
	public void setSliderPerspectiveTransformUlx(Double sliderPerspectiveTransformUlx){
		this.sliderPerspectiveTransformUlx.set(sliderPerspectiveTransformUlx);
	}
	
	public DoubleProperty sliderPerspectiveTransformUlxProperty(){
		return this.sliderPerspectiveTransformUlx;
	}
	
	public void setSliderPerspectiveTransformUlxProperty(DoubleProperty sliderPerspectiveTransformUlx){
		this.sliderPerspectiveTransformUlx=sliderPerspectiveTransformUlx;
	}
	public Double getSliderPerspectiveTransformUly(){
		return this.sliderPerspectiveTransformUly.get();
	}
	
	public void setSliderPerspectiveTransformUly(Double sliderPerspectiveTransformUly){
		this.sliderPerspectiveTransformUly.set(sliderPerspectiveTransformUly);
	}
	
	public DoubleProperty sliderPerspectiveTransformUlyProperty(){
		return this.sliderPerspectiveTransformUly;
	}
	
	public void setSliderPerspectiveTransformUlyProperty(DoubleProperty sliderPerspectiveTransformUly){
		this.sliderPerspectiveTransformUly=sliderPerspectiveTransformUly;
	}
	public String getLabelPerspectiveTransformUlx(){
		return this.labelPerspectiveTransformUlx.get();
	}
	
	public void setLabelPerspectiveTransformUlx(String labelPerspectiveTransformUlx){
		this.labelPerspectiveTransformUlx.set(labelPerspectiveTransformUlx);
	}
	
	public StringProperty labelPerspectiveTransformUlxProperty(){
		return this.labelPerspectiveTransformUlx;
	}
	
	public void setLabelPerspectiveTransformUlxProperty(StringProperty labelPerspectiveTransformUlx){
		this.labelPerspectiveTransformUlx=labelPerspectiveTransformUlx;
	}
	public String getLabelPerspectiveTransformUly(){
		return this.labelPerspectiveTransformUly.get();
	}
	
	public void setLabelPerspectiveTransformUly(String labelPerspectiveTransformUly){
		this.labelPerspectiveTransformUly.set(labelPerspectiveTransformUly);
	}
	
	public StringProperty labelPerspectiveTransformUlyProperty(){
		return this.labelPerspectiveTransformUly;
	}
	
	public void setLabelPerspectiveTransformUlyProperty(StringProperty labelPerspectiveTransformUly){
		this.labelPerspectiveTransformUly=labelPerspectiveTransformUly;
	}
	public Double getSliderPerspectiveTransformUrx(){
		return this.sliderPerspectiveTransformUrx.get();
	}
	
	public void setSliderPerspectiveTransformUrx(Double sliderPerspectiveTransformUrx){
		this.sliderPerspectiveTransformUrx.set(sliderPerspectiveTransformUrx);
	}
	
	public DoubleProperty sliderPerspectiveTransformUrxProperty(){
		return this.sliderPerspectiveTransformUrx;
	}
	
	public void setSliderPerspectiveTransformUrxProperty(DoubleProperty sliderPerspectiveTransformUrx){
		this.sliderPerspectiveTransformUrx=sliderPerspectiveTransformUrx;
	}
	public Double getSliderPerspectiveTransformUry(){
		return this.sliderPerspectiveTransformUry.get();
	}
	
	public void setSliderPerspectiveTransformUry(Double sliderPerspectiveTransformUry){
		this.sliderPerspectiveTransformUry.set(sliderPerspectiveTransformUry);
	}
	
	public DoubleProperty sliderPerspectiveTransformUryProperty(){
		return this.sliderPerspectiveTransformUry;
	}
	
	public void setSliderPerspectiveTransformUryProperty(DoubleProperty sliderPerspectiveTransformUry){
		this.sliderPerspectiveTransformUry=sliderPerspectiveTransformUry;
	}
	public String getLabelPerspectiveTransformUrx(){
		return this.labelPerspectiveTransformUrx.get();
	}
	
	public void setLabelPerspectiveTransformUrx(String labelPerspectiveTransformUrx){
		this.labelPerspectiveTransformUrx.set(labelPerspectiveTransformUrx);
	}
	
	public StringProperty labelPerspectiveTransformUrxProperty(){
		return this.labelPerspectiveTransformUrx;
	}
	
	public void setLabelPerspectiveTransformUrxProperty(StringProperty labelPerspectiveTransformUrx){
		this.labelPerspectiveTransformUrx=labelPerspectiveTransformUrx;
	}
	public String getLabelPerspectiveTransformUry(){
		return this.labelPerspectiveTransformUry.get();
	}
	
	public void setLabelPerspectiveTransformUry(String labelPerspectiveTransformUry){
		this.labelPerspectiveTransformUry.set(labelPerspectiveTransformUry);
	}
	
	public StringProperty labelPerspectiveTransformUryProperty(){
		return this.labelPerspectiveTransformUry;
	}
	
	public void setLabelPerspectiveTransformUryProperty(StringProperty labelPerspectiveTransformUry){
		this.labelPerspectiveTransformUry=labelPerspectiveTransformUry;
	}
	public Double getSliderReflectionBottomOpacity(){
		return this.sliderReflectionBottomOpacity.get();
	}
	
	public void setSliderReflectionBottomOpacity(Double sliderReflectionBottomOpacity){
		this.sliderReflectionBottomOpacity.set(sliderReflectionBottomOpacity);
	}
	
	public DoubleProperty sliderReflectionBottomOpacityProperty(){
		return this.sliderReflectionBottomOpacity;
	}
	
	public void setSliderReflectionBottomOpacityProperty(DoubleProperty sliderReflectionBottomOpacity){
		this.sliderReflectionBottomOpacity=sliderReflectionBottomOpacity;
	}
	public String getLabelReflectionBottomOpacity(){
		return this.labelReflectionBottomOpacity.get();
	}
	
	public void setLabelReflectionBottomOpacity(String labelReflectionBottomOpacity){
		this.labelReflectionBottomOpacity.set(labelReflectionBottomOpacity);
	}
	
	public StringProperty labelReflectionBottomOpacityProperty(){
		return this.labelReflectionBottomOpacity;
	}
	
	public void setLabelReflectionBottomOpacityProperty(StringProperty labelReflectionBottomOpacity){
		this.labelReflectionBottomOpacity=labelReflectionBottomOpacity;
	}
	public Double getSliderReflectionTopOpacity(){
		return this.sliderReflectionTopOpacity.get();
	}
	
	public void setSliderReflectionTopOpacity(Double sliderReflectionTopOpacity){
		this.sliderReflectionTopOpacity.set(sliderReflectionTopOpacity);
	}
	
	public DoubleProperty sliderReflectionTopOpacityProperty(){
		return this.sliderReflectionTopOpacity;
	}
	
	public void setSliderReflectionTopOpacityProperty(DoubleProperty sliderReflectionTopOpacity){
		this.sliderReflectionTopOpacity=sliderReflectionTopOpacity;
	}
	public String getLabelReflectionTopOpacity(){
		return this.labelReflectionTopOpacity.get();
	}
	
	public void setLabelReflectionTopOpacity(String labelReflectionTopOpacity){
		this.labelReflectionTopOpacity.set(labelReflectionTopOpacity);
	}
	
	public StringProperty labelReflectionTopOpacityProperty(){
		return this.labelReflectionTopOpacity;
	}
	
	public void setLabelReflectionTopOpacityProperty(StringProperty labelReflectionTopOpacity){
		this.labelReflectionTopOpacity=labelReflectionTopOpacity;
	}
	public Double getSliderReflectionTopOffset(){
		return this.sliderReflectionTopOffset.get();
	}
	
	public void setSliderReflectionTopOffset(Double sliderReflectionTopOffset){
		this.sliderReflectionTopOffset.set(sliderReflectionTopOffset);
	}
	
	public DoubleProperty sliderReflectionTopOffsetProperty(){
		return this.sliderReflectionTopOffset;
	}
	
	public void setSliderReflectionTopOffsetProperty(DoubleProperty sliderReflectionTopOffset){
		this.sliderReflectionTopOffset=sliderReflectionTopOffset;
	}
	public String getLabelReflectionTopOffset(){
		return this.labelReflectionTopOffset.get();
	}
	
	public void setLabelReflectionTopOffset(String labelReflectionTopOffset){
		this.labelReflectionTopOffset.set(labelReflectionTopOffset);
	}
	
	public StringProperty labelReflectionTopOffsetProperty(){
		return this.labelReflectionTopOffset;
	}
	
	public void setLabelReflectionTopOffsetProperty(StringProperty labelReflectionTopOffset){
		this.labelReflectionTopOffset=labelReflectionTopOffset;
	}
	public Double getSliderReflectionFraction(){
		return this.sliderReflectionFraction.get();
	}
	
	public void setSliderReflectionFraction(Double sliderReflectionFraction){
		this.sliderReflectionFraction.set(sliderReflectionFraction);
	}
	
	public DoubleProperty sliderReflectionFractionProperty(){
		return this.sliderReflectionFraction;
	}
	
	public void setSliderReflectionFractionProperty(DoubleProperty sliderReflectionFraction){
		this.sliderReflectionFraction=sliderReflectionFraction;
	}
	public String getLabelReflectionFraction(){
		return this.labelReflectionFraction.get();
	}
	
	public void setLabelReflectionFraction(String labelReflectionFraction){
		this.labelReflectionFraction.set(labelReflectionFraction);
	}
	
	public StringProperty labelReflectionFractionProperty(){
		return this.labelReflectionFraction;
	}
	
	public void setLabelReflectionFractionProperty(StringProperty labelReflectionFraction){
		this.labelReflectionFraction=labelReflectionFraction;
	}
	public Double getSliderSepiaToneLevel(){
		return this.sliderSepiaToneLevel.get();
	}
	
	public void setSliderSepiaToneLevel(Double sliderSepiaToneLevel){
		this.sliderSepiaToneLevel.set(sliderSepiaToneLevel);
	}
	
	public DoubleProperty sliderSepiaToneLevelProperty(){
		return this.sliderSepiaToneLevel;
	}
	
	public void setSliderSepiaToneLevelProperty(DoubleProperty sliderSepiaToneLevel){
		this.sliderSepiaToneLevel=sliderSepiaToneLevel;
	}
	public String getLabelsSepiaToneLevel(){
		return this.labelsSepiaToneLevel.get();
	}
	
	public void setLabelsSepiaToneLevel(String labelsSepiaToneLevel){
		this.labelsSepiaToneLevel.set(labelsSepiaToneLevel);
	}
	
	public StringProperty labelsSepiaToneLevelProperty(){
		return this.labelsSepiaToneLevel;
	}
	
	public void setLabelsSepiaToneLevelProperty(StringProperty labelsSepiaToneLevel){
		this.labelsSepiaToneLevel=labelsSepiaToneLevel;
	}
	public Double getSliderShadowHeight(){
		return this.sliderShadowHeight.get();
	}
	
	public void setSliderShadowHeight(Double sliderShadowHeight){
		this.sliderShadowHeight.set(sliderShadowHeight);
	}
	
	public DoubleProperty sliderShadowHeightProperty(){
		return this.sliderShadowHeight;
	}
	
	public void setSliderShadowHeightProperty(DoubleProperty sliderShadowHeight){
		this.sliderShadowHeight=sliderShadowHeight;
	}
	public String getLabelShadowHeight(){
		return this.labelShadowHeight.get();
	}
	
	public void setLabelShadowHeight(String labelShadowHeight){
		this.labelShadowHeight.set(labelShadowHeight);
	}
	
	public StringProperty labelShadowHeightProperty(){
		return this.labelShadowHeight;
	}
	
	public void setLabelShadowHeightProperty(StringProperty labelShadowHeight){
		this.labelShadowHeight=labelShadowHeight;
	}
	public Double getSliderShadowWidth(){
		return this.sliderShadowWidth.get();
	}
	
	public void setSliderShadowWidth(Double sliderShadowWidth){
		this.sliderShadowWidth.set(sliderShadowWidth);
	}
	
	public DoubleProperty sliderShadowWidthProperty(){
		return this.sliderShadowWidth;
	}
	
	public void setSliderShadowWidthProperty(DoubleProperty sliderShadowWidth){
		this.sliderShadowWidth=sliderShadowWidth;
	}
	public String getLabelShadowWidth(){
		return this.labelShadowWidth.get();
	}
	
	public void setLabelShadowWidth(String labelShadowWidth){
		this.labelShadowWidth.set(labelShadowWidth);
	}
	
	public StringProperty labelShadowWidthProperty(){
		return this.labelShadowWidth;
	}
	
	public void setLabelShadowWidthProperty(StringProperty labelShadowWidth){
		this.labelShadowWidth=labelShadowWidth;
	}
	public Double getSliderShadowRadius(){
		return this.sliderShadowRadius.get();
	}
	
	public void setSliderShadowRadius(Double sliderShadowRadius){
		this.sliderShadowRadius.set(sliderShadowRadius);
	}
	
	public DoubleProperty sliderShadowRadiusProperty(){
		return this.sliderShadowRadius;
	}
	
	public void setSliderShadowRadiusProperty(DoubleProperty sliderShadowRadius){
		this.sliderShadowRadius=sliderShadowRadius;
	}
	public String getLabelShadowRadius(){
		return this.labelShadowRadius.get();
	}
	
	public void setLabelShadowRadius(String labelShadowRadius){
		this.labelShadowRadius.set(labelShadowRadius);
	}
	
	public StringProperty labelShadowRadiusProperty(){
		return this.labelShadowRadius;
	}
	
	public void setLabelShadowRadiusProperty(StringProperty labelShadowRadius){
		this.labelShadowRadius=labelShadowRadius;
	}
	public javafx.scene.paint.Color getColorPickerShadow(){
		return this.colorPickerShadow.get();
	}
	
	public void setColorPickerShadow(javafx.scene.paint.Color colorPickerShadow){
		this.colorPickerShadow.set(colorPickerShadow);
	}
	
	public ObjectProperty<javafx.scene.paint.Color> colorPickerShadowProperty(){
		return this.colorPickerShadow;
	}
	
	public void setColorPickerShadowProperty(ObjectProperty<javafx.scene.paint.Color> colorPickerShadow){
		this.colorPickerShadow=colorPickerShadow;
	}
	public Double getSliderInnerShadowHeight(){
		return this.sliderInnerShadowHeight.get();
	}
	
	public void setSliderInnerShadowHeight(Double sliderInnerShadowHeight){
		this.sliderInnerShadowHeight.set(sliderInnerShadowHeight);
	}
	
	public DoubleProperty sliderInnerShadowHeightProperty(){
		return this.sliderInnerShadowHeight;
	}
	
	public void setSliderInnerShadowHeightProperty(DoubleProperty sliderInnerShadowHeight){
		this.sliderInnerShadowHeight=sliderInnerShadowHeight;
	}
	public String getLabelInnerShadowHeight(){
		return this.labelInnerShadowHeight.get();
	}
	
	public void setLabelInnerShadowHeight(String labelInnerShadowHeight){
		this.labelInnerShadowHeight.set(labelInnerShadowHeight);
	}
	
	public StringProperty labelInnerShadowHeightProperty(){
		return this.labelInnerShadowHeight;
	}
	
	public void setLabelInnerShadowHeightProperty(StringProperty labelInnerShadowHeight){
		this.labelInnerShadowHeight=labelInnerShadowHeight;
	}
	public Double getSliderInnerShadowWidth(){
		return this.sliderInnerShadowWidth.get();
	}
	
	public void setSliderInnerShadowWidth(Double sliderInnerShadowWidth){
		this.sliderInnerShadowWidth.set(sliderInnerShadowWidth);
	}
	
	public DoubleProperty sliderInnerShadowWidthProperty(){
		return this.sliderInnerShadowWidth;
	}
	
	public void setSliderInnerShadowWidthProperty(DoubleProperty sliderInnerShadowWidth){
		this.sliderInnerShadowWidth=sliderInnerShadowWidth;
	}
	public String getLabelInnerShadowWidth(){
		return this.labelInnerShadowWidth.get();
	}
	
	public void setLabelInnerShadowWidth(String labelInnerShadowWidth){
		this.labelInnerShadowWidth.set(labelInnerShadowWidth);
	}
	
	public StringProperty labelInnerShadowWidthProperty(){
		return this.labelInnerShadowWidth;
	}
	
	public void setLabelInnerShadowWidthProperty(StringProperty labelInnerShadowWidth){
		this.labelInnerShadowWidth=labelInnerShadowWidth;
	}
	public Double getSliderInnerShadowRadius(){
		return this.sliderInnerShadowRadius.get();
	}
	
	public void setSliderInnerShadowRadius(Double sliderInnerShadowRadius){
		this.sliderInnerShadowRadius.set(sliderInnerShadowRadius);
	}
	
	public DoubleProperty sliderInnerShadowRadiusProperty(){
		return this.sliderInnerShadowRadius;
	}
	
	public void setSliderInnerShadowRadiusProperty(DoubleProperty sliderInnerShadowRadius){
		this.sliderInnerShadowRadius=sliderInnerShadowRadius;
	}
	public String getLabelInnerShadowRadius(){
		return this.labelInnerShadowRadius.get();
	}
	
	public void setLabelInnerShadowRadius(String labelInnerShadowRadius){
		this.labelInnerShadowRadius.set(labelInnerShadowRadius);
	}
	
	public StringProperty labelInnerShadowRadiusProperty(){
		return this.labelInnerShadowRadius;
	}
	
	public void setLabelInnerShadowRadiusProperty(StringProperty labelInnerShadowRadius){
		this.labelInnerShadowRadius=labelInnerShadowRadius;
	}
	public Double getSliderInnerShadowOffsetX(){
		return this.sliderInnerShadowOffsetX.get();
	}
	
	public void setSliderInnerShadowOffsetX(Double sliderInnerShadowOffsetX){
		this.sliderInnerShadowOffsetX.set(sliderInnerShadowOffsetX);
	}
	
	public DoubleProperty sliderInnerShadowOffsetXProperty(){
		return this.sliderInnerShadowOffsetX;
	}
	
	public void setSliderInnerShadowOffsetXProperty(DoubleProperty sliderInnerShadowOffsetX){
		this.sliderInnerShadowOffsetX=sliderInnerShadowOffsetX;
	}
	public String getLabelInnerShadowOffsetX(){
		return this.labelInnerShadowOffsetX.get();
	}
	
	public void setLabelInnerShadowOffsetX(String labelInnerShadowOffsetX){
		this.labelInnerShadowOffsetX.set(labelInnerShadowOffsetX);
	}
	
	public StringProperty labelInnerShadowOffsetXProperty(){
		return this.labelInnerShadowOffsetX;
	}
	
	public void setLabelInnerShadowOffsetXProperty(StringProperty labelInnerShadowOffsetX){
		this.labelInnerShadowOffsetX=labelInnerShadowOffsetX;
	}
	public Double getSliderInnerShadowOffsetY(){
		return this.sliderInnerShadowOffsetY.get();
	}
	
	public void setSliderInnerShadowOffsetY(Double sliderInnerShadowOffsetY){
		this.sliderInnerShadowOffsetY.set(sliderInnerShadowOffsetY);
	}
	
	public DoubleProperty sliderInnerShadowOffsetYProperty(){
		return this.sliderInnerShadowOffsetY;
	}
	
	public void setSliderInnerShadowOffsetYProperty(DoubleProperty sliderInnerShadowOffsetY){
		this.sliderInnerShadowOffsetY=sliderInnerShadowOffsetY;
	}
	public String getLabelInnerShadowOffsetY(){
		return this.labelInnerShadowOffsetY.get();
	}
	
	public void setLabelInnerShadowOffsetY(String labelInnerShadowOffsetY){
		this.labelInnerShadowOffsetY.set(labelInnerShadowOffsetY);
	}
	
	public StringProperty labelInnerShadowOffsetYProperty(){
		return this.labelInnerShadowOffsetY;
	}
	
	public void setLabelInnerShadowOffsetYProperty(StringProperty labelInnerShadowOffsetY){
		this.labelInnerShadowOffsetY=labelInnerShadowOffsetY;
	}
	public Double getSliderInnerShadowSpread(){
		return this.sliderInnerShadowSpread.get();
	}
	
	public void setSliderInnerShadowSpread(Double sliderInnerShadowSpread){
		this.sliderInnerShadowSpread.set(sliderInnerShadowSpread);
	}
	
	public DoubleProperty sliderInnerShadowSpreadProperty(){
		return this.sliderInnerShadowSpread;
	}
	
	public void setSliderInnerShadowSpreadProperty(DoubleProperty sliderInnerShadowSpread){
		this.sliderInnerShadowSpread=sliderInnerShadowSpread;
	}
	public String getLabelInnerShadowSpread(){
		return this.labelInnerShadowSpread.get();
	}
	
	public void setLabelInnerShadowSpread(String labelInnerShadowSpread){
		this.labelInnerShadowSpread.set(labelInnerShadowSpread);
	}
	
	public StringProperty labelInnerShadowSpreadProperty(){
		return this.labelInnerShadowSpread;
	}
	
	public void setLabelInnerShadowSpreadProperty(StringProperty labelInnerShadowSpread){
		this.labelInnerShadowSpread=labelInnerShadowSpread;
	}
	public javafx.scene.paint.Color getColorPickerInnerShadow(){
		return this.colorPickerInnerShadow.get();
	}
	
	public void setColorPickerInnerShadow(javafx.scene.paint.Color colorPickerInnerShadow){
		this.colorPickerInnerShadow.set(colorPickerInnerShadow);
	}
	
	public ObjectProperty<javafx.scene.paint.Color> colorPickerInnerShadowProperty(){
		return this.colorPickerInnerShadow;
	}
	
	public void setColorPickerInnerShadowProperty(ObjectProperty<javafx.scene.paint.Color> colorPickerInnerShadow){
		this.colorPickerInnerShadow=colorPickerInnerShadow;
	}
	public Double getSliderDropshadowHeight(){
		return this.sliderDropshadowHeight.get();
	}
	
	public void setSliderDropshadowHeight(Double sliderDropshadowHeight){
		this.sliderDropshadowHeight.set(sliderDropshadowHeight);
	}
	
	public DoubleProperty sliderDropshadowHeightProperty(){
		return this.sliderDropshadowHeight;
	}
	
	public void setSliderDropshadowHeightProperty(DoubleProperty sliderDropshadowHeight){
		this.sliderDropshadowHeight=sliderDropshadowHeight;
	}
	public String getLabelDropshadowHeight(){
		return this.labelDropshadowHeight.get();
	}
	
	public void setLabelDropshadowHeight(String labelDropshadowHeight){
		this.labelDropshadowHeight.set(labelDropshadowHeight);
	}
	
	public StringProperty labelDropshadowHeightProperty(){
		return this.labelDropshadowHeight;
	}
	
	public void setLabelDropshadowHeightProperty(StringProperty labelDropshadowHeight){
		this.labelDropshadowHeight=labelDropshadowHeight;
	}
	public Double getSliderDropshadowWidth(){
		return this.sliderDropshadowWidth.get();
	}
	
	public void setSliderDropshadowWidth(Double sliderDropshadowWidth){
		this.sliderDropshadowWidth.set(sliderDropshadowWidth);
	}
	
	public DoubleProperty sliderDropshadowWidthProperty(){
		return this.sliderDropshadowWidth;
	}
	
	public void setSliderDropshadowWidthProperty(DoubleProperty sliderDropshadowWidth){
		this.sliderDropshadowWidth=sliderDropshadowWidth;
	}
	public String getLabelDropshadowWidth(){
		return this.labelDropshadowWidth.get();
	}
	
	public void setLabelDropshadowWidth(String labelDropshadowWidth){
		this.labelDropshadowWidth.set(labelDropshadowWidth);
	}
	
	public StringProperty labelDropshadowWidthProperty(){
		return this.labelDropshadowWidth;
	}
	
	public void setLabelDropshadowWidthProperty(StringProperty labelDropshadowWidth){
		this.labelDropshadowWidth=labelDropshadowWidth;
	}
	public Double getSliderDropshadowRadius(){
		return this.sliderDropshadowRadius.get();
	}
	
	public void setSliderDropshadowRadius(Double sliderDropshadowRadius){
		this.sliderDropshadowRadius.set(sliderDropshadowRadius);
	}
	
	public DoubleProperty sliderDropshadowRadiusProperty(){
		return this.sliderDropshadowRadius;
	}
	
	public void setSliderDropshadowRadiusProperty(DoubleProperty sliderDropshadowRadius){
		this.sliderDropshadowRadius=sliderDropshadowRadius;
	}
	public String getLabelDropshadowRadius(){
		return this.labelDropshadowRadius.get();
	}
	
	public void setLabelDropshadowRadius(String labelDropshadowRadius){
		this.labelDropshadowRadius.set(labelDropshadowRadius);
	}
	
	public StringProperty labelDropshadowRadiusProperty(){
		return this.labelDropshadowRadius;
	}
	
	public void setLabelDropshadowRadiusProperty(StringProperty labelDropshadowRadius){
		this.labelDropshadowRadius=labelDropshadowRadius;
	}
	public Double getSliderDropshadowOffsetX(){
		return this.sliderDropshadowOffsetX.get();
	}
	
	public void setSliderDropshadowOffsetX(Double sliderDropshadowOffsetX){
		this.sliderDropshadowOffsetX.set(sliderDropshadowOffsetX);
	}
	
	public DoubleProperty sliderDropshadowOffsetXProperty(){
		return this.sliderDropshadowOffsetX;
	}
	
	public void setSliderDropshadowOffsetXProperty(DoubleProperty sliderDropshadowOffsetX){
		this.sliderDropshadowOffsetX=sliderDropshadowOffsetX;
	}
	public String getLabelDropshadowOffsetX(){
		return this.labelDropshadowOffsetX.get();
	}
	
	public void setLabelDropshadowOffsetX(String labelDropshadowOffsetX){
		this.labelDropshadowOffsetX.set(labelDropshadowOffsetX);
	}
	
	public StringProperty labelDropshadowOffsetXProperty(){
		return this.labelDropshadowOffsetX;
	}
	
	public void setLabelDropshadowOffsetXProperty(StringProperty labelDropshadowOffsetX){
		this.labelDropshadowOffsetX=labelDropshadowOffsetX;
	}
	public Double getSliderDropshadowOffsetY(){
		return this.sliderDropshadowOffsetY.get();
	}
	
	public void setSliderDropshadowOffsetY(Double sliderDropshadowOffsetY){
		this.sliderDropshadowOffsetY.set(sliderDropshadowOffsetY);
	}
	
	public DoubleProperty sliderDropshadowOffsetYProperty(){
		return this.sliderDropshadowOffsetY;
	}
	
	public void setSliderDropshadowOffsetYProperty(DoubleProperty sliderDropshadowOffsetY){
		this.sliderDropshadowOffsetY=sliderDropshadowOffsetY;
	}
	public String getLabelDropshadowOffsetY(){
		return this.labelDropshadowOffsetY.get();
	}
	
	public void setLabelDropshadowOffsetY(String labelDropshadowOffsetY){
		this.labelDropshadowOffsetY.set(labelDropshadowOffsetY);
	}
	
	public StringProperty labelDropshadowOffsetYProperty(){
		return this.labelDropshadowOffsetY;
	}
	
	public void setLabelDropshadowOffsetYProperty(StringProperty labelDropshadowOffsetY){
		this.labelDropshadowOffsetY=labelDropshadowOffsetY;
	}
	public Double getSliderDropshadowSpread(){
		return this.sliderDropshadowSpread.get();
	}
	
	public void setSliderDropshadowSpread(Double sliderDropshadowSpread){
		this.sliderDropshadowSpread.set(sliderDropshadowSpread);
	}
	
	public DoubleProperty sliderDropshadowSpreadProperty(){
		return this.sliderDropshadowSpread;
	}
	
	public void setSliderDropshadowSpreadProperty(DoubleProperty sliderDropshadowSpread){
		this.sliderDropshadowSpread=sliderDropshadowSpread;
	}
	public String getLabelDropshadowSpread(){
		return this.labelDropshadowSpread.get();
	}
	
	public void setLabelDropshadowSpread(String labelDropshadowSpread){
		this.labelDropshadowSpread.set(labelDropshadowSpread);
	}
	
	public StringProperty labelDropshadowSpreadProperty(){
		return this.labelDropshadowSpread;
	}
	
	public void setLabelDropshadowSpreadProperty(StringProperty labelDropshadowSpread){
		this.labelDropshadowSpread=labelDropshadowSpread;
	}
	public javafx.scene.paint.Color getColorPickerDropShadow(){
		return this.colorPickerDropShadow.get();
	}
	
	public void setColorPickerDropShadow(javafx.scene.paint.Color colorPickerDropShadow){
		this.colorPickerDropShadow.set(colorPickerDropShadow);
	}
	
	public ObjectProperty<javafx.scene.paint.Color> colorPickerDropShadowProperty(){
		return this.colorPickerDropShadow;
	}
	
	public void setColorPickerDropShadowProperty(ObjectProperty<javafx.scene.paint.Color> colorPickerDropShadow){
		this.colorPickerDropShadow=colorPickerDropShadow;
	}
	public Double getSliderColorInputHeight(){
		return this.sliderColorInputHeight.get();
	}
	
	public void setSliderColorInputHeight(Double sliderColorInputHeight){
		this.sliderColorInputHeight.set(sliderColorInputHeight);
	}
	
	public DoubleProperty sliderColorInputHeightProperty(){
		return this.sliderColorInputHeight;
	}
	
	public void setSliderColorInputHeightProperty(DoubleProperty sliderColorInputHeight){
		this.sliderColorInputHeight=sliderColorInputHeight;
	}
	public String getLabelColorInputHeight(){
		return this.labelColorInputHeight.get();
	}
	
	public void setLabelColorInputHeight(String labelColorInputHeight){
		this.labelColorInputHeight.set(labelColorInputHeight);
	}
	
	public StringProperty labelColorInputHeightProperty(){
		return this.labelColorInputHeight;
	}
	
	public void setLabelColorInputHeightProperty(StringProperty labelColorInputHeight){
		this.labelColorInputHeight=labelColorInputHeight;
	}
	public Double getSliderColorInputWidth(){
		return this.sliderColorInputWidth.get();
	}
	
	public void setSliderColorInputWidth(Double sliderColorInputWidth){
		this.sliderColorInputWidth.set(sliderColorInputWidth);
	}
	
	public DoubleProperty sliderColorInputWidthProperty(){
		return this.sliderColorInputWidth;
	}
	
	public void setSliderColorInputWidthProperty(DoubleProperty sliderColorInputWidth){
		this.sliderColorInputWidth=sliderColorInputWidth;
	}
	public String getLabelColorInputWidth(){
		return this.labelColorInputWidth.get();
	}
	
	public void setLabelColorInputWidth(String labelColorInputWidth){
		this.labelColorInputWidth.set(labelColorInputWidth);
	}
	
	public StringProperty labelColorInputWidthProperty(){
		return this.labelColorInputWidth;
	}
	
	public void setLabelColorInputWidthProperty(StringProperty labelColorInputWidth){
		this.labelColorInputWidth=labelColorInputWidth;
	}
	public Double getSliderColorInputX(){
		return this.sliderColorInputX.get();
	}
	
	public void setSliderColorInputX(Double sliderColorInputX){
		this.sliderColorInputX.set(sliderColorInputX);
	}
	
	public DoubleProperty sliderColorInputXProperty(){
		return this.sliderColorInputX;
	}
	
	public void setSliderColorInputXProperty(DoubleProperty sliderColorInputX){
		this.sliderColorInputX=sliderColorInputX;
	}
	public String getLabelColorInputX(){
		return this.labelColorInputX.get();
	}
	
	public void setLabelColorInputX(String labelColorInputX){
		this.labelColorInputX.set(labelColorInputX);
	}
	
	public StringProperty labelColorInputXProperty(){
		return this.labelColorInputX;
	}
	
	public void setLabelColorInputXProperty(StringProperty labelColorInputX){
		this.labelColorInputX=labelColorInputX;
	}
	public Double getSliderColorInputY(){
		return this.sliderColorInputY.get();
	}
	
	public void setSliderColorInputY(Double sliderColorInputY){
		this.sliderColorInputY.set(sliderColorInputY);
	}
	
	public DoubleProperty sliderColorInputYProperty(){
		return this.sliderColorInputY;
	}
	
	public void setSliderColorInputYProperty(DoubleProperty sliderColorInputY){
		this.sliderColorInputY=sliderColorInputY;
	}
	public String getLabelColorInputY(){
		return this.labelColorInputY.get();
	}
	
	public void setLabelColorInputY(String labelColorInputY){
		this.labelColorInputY.set(labelColorInputY);
	}
	
	public StringProperty labelColorInputYProperty(){
		return this.labelColorInputY;
	}
	
	public void setLabelColorInputYProperty(StringProperty labelColorInputY){
		this.labelColorInputY=labelColorInputY;
	}
	public javafx.scene.paint.Color getColorPickerColorInput(){
		return this.colorPickerColorInput.get();
	}
	
	public void setColorPickerColorInput(javafx.scene.paint.Color colorPickerColorInput){
		this.colorPickerColorInput.set(colorPickerColorInput);
	}
	
	public ObjectProperty<javafx.scene.paint.Color> colorPickerColorInputProperty(){
		return this.colorPickerColorInput;
	}
	
	public void setColorPickerColorInputProperty(ObjectProperty<javafx.scene.paint.Color> colorPickerColorInput){
		this.colorPickerColorInput=colorPickerColorInput;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("textSearch: ").append(textSearch.get()+",\t");
		sb.append("sliderBlendOpacity: ").append(sliderBlendOpacity.get()+",\t");
		sb.append("sliderBloomThreshold: ").append(sliderBloomThreshold.get()+",\t");
		sb.append("sliderBoxBlurWidth: ").append(sliderBoxBlurWidth.get()+",\t");
		sb.append("sliderBoxBlurHeight: ").append(sliderBoxBlurHeight.get()+",\t");
		sb.append("sliderBoxBlurIteration: ").append(sliderBoxBlurIteration.get()+",\t");
		sb.append("sliderColorAdjustContrast: ").append(sliderColorAdjustContrast.get()+",\t");
		sb.append("sliderColorAdjustBrigthness: ").append(sliderColorAdjustBrigthness.get()+",\t");
		sb.append("sliderColorAdjustHue: ").append(sliderColorAdjustHue.get()+",\t");
		sb.append("sliderColorAdjustSaturation: ").append(sliderColorAdjustSaturation.get()+",\t");
		sb.append("sliderDisplacementMapOffsetY: ").append(sliderDisplacementMapOffsetY.get()+",\t");
		sb.append("sliderDisplacementMapOffsetX: ").append(sliderDisplacementMapOffsetX.get()+",\t");
		sb.append("sliderDisplacementMapScaleX: ").append(sliderDisplacementMapScaleX.get()+",\t");
		sb.append("sliderDisplacementMapScaleY: ").append(sliderDisplacementMapScaleY.get()+",\t");
		sb.append("sliderGaussianBlurRadius: ").append(sliderGaussianBlurRadius.get()+",\t");
		sb.append("sliderGlowLevel: ").append(sliderGlowLevel.get()+",\t");
		sb.append("sliderLightningDiffuseConstant: ").append(sliderLightningDiffuseConstant.get()+",\t");
		sb.append("sliderLightningSpectularConstant: ").append(sliderLightningSpectularConstant.get()+",\t");
		sb.append("sliderLightningSpectularExponent: ").append(sliderLightningSpectularExponent.get()+",\t");
		sb.append("sliderLightningsurcfaceScale: ").append(sliderLightningsurcfaceScale.get()+",\t");
		sb.append("sliderLightningAzimuth: ").append(sliderLightningAzimuth.get()+",\t");
		sb.append("sliderLightningEvaluation: ").append(sliderLightningEvaluation.get()+",\t");
		sb.append("sliderMotionBlurAngle: ").append(sliderMotionBlurAngle.get()+",\t");
		sb.append("sliderMotionBlurRadius: ").append(sliderMotionBlurRadius.get()+",\t");
		sb.append("sliderPerspectiveTransformLlx: ").append(sliderPerspectiveTransformLlx.get()+",\t");
		sb.append("sliderPerspectiveTransformLly: ").append(sliderPerspectiveTransformLly.get()+",\t");
		sb.append("sliderPerspectiveTransformLrx: ").append(sliderPerspectiveTransformLrx.get()+",\t");
		sb.append("sliderPerspectiveTransformLry: ").append(sliderPerspectiveTransformLry.get()+",\t");
		sb.append("sliderPerspectiveTransformUlx: ").append(sliderPerspectiveTransformUlx.get()+",\t");
		sb.append("sliderPerspectiveTransformUly: ").append(sliderPerspectiveTransformUly.get()+",\t");
		sb.append("sliderPerspectiveTransformUrx: ").append(sliderPerspectiveTransformUrx.get()+",\t");
		sb.append("sliderPerspectiveTransformUry: ").append(sliderPerspectiveTransformUry.get()+",\t");
		sb.append("sliderReflectionBottomOpacity: ").append(sliderReflectionBottomOpacity.get()+",\t");
		sb.append("sliderReflectionTopOpacity: ").append(sliderReflectionTopOpacity.get()+",\t");
		sb.append("sliderReflectionTopOffset: ").append(sliderReflectionTopOffset.get()+",\t");
		sb.append("sliderReflectionFraction: ").append(sliderReflectionFraction.get()+",\t");
		sb.append("sliderSepiaToneLevel: ").append(sliderSepiaToneLevel.get()+",\t");
		sb.append("sliderShadowHeight: ").append(sliderShadowHeight.get()+",\t");
		sb.append("sliderShadowWidth: ").append(sliderShadowWidth.get()+",\t");
		sb.append("sliderShadowRadius: ").append(sliderShadowRadius.get()+",\t");
		sb.append("sliderInnerShadowHeight: ").append(sliderInnerShadowHeight.get()+",\t");
		sb.append("sliderInnerShadowWidth: ").append(sliderInnerShadowWidth.get()+",\t");
		sb.append("sliderInnerShadowRadius: ").append(sliderInnerShadowRadius.get()+",\t");
		sb.append("sliderInnerShadowOffsetX: ").append(sliderInnerShadowOffsetX.get()+",\t");
		sb.append("sliderInnerShadowOffsetY: ").append(sliderInnerShadowOffsetY.get()+",\t");
		sb.append("sliderInnerShadowSpread: ").append(sliderInnerShadowSpread.get()+",\t");
		sb.append("sliderDropshadowHeight: ").append(sliderDropshadowHeight.get()+",\t");
		sb.append("sliderDropshadowWidth: ").append(sliderDropshadowWidth.get()+",\t");
		sb.append("sliderDropshadowRadius: ").append(sliderDropshadowRadius.get()+",\t");
		sb.append("sliderDropshadowOffsetX: ").append(sliderDropshadowOffsetX.get()+",\t");
		sb.append("sliderDropshadowOffsetY: ").append(sliderDropshadowOffsetY.get()+",\t");
		sb.append("sliderDropshadowSpread: ").append(sliderDropshadowSpread.get()+",\t");
		sb.append("sliderColorInputHeight: ").append(sliderColorInputHeight.get()+",\t");
		sb.append("sliderColorInputWidth: ").append(sliderColorInputWidth.get()+",\t");
		sb.append("sliderColorInputX: ").append(sliderColorInputX.get()+",\t");
		sb.append("sliderColorInputY: ").append(sliderColorInputY.get()+",\t");
		return super.toString();
	}
}
