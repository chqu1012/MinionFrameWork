package de.dc.minion.model.addon.snapshot.component.model;

import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class BaseTextSnapshotLayerBinding  extends BaseSelectionSnapshotLayerBinding{
	private StringProperty textSearch = new SimpleStringProperty();
	private DoubleProperty sliderBlendOpacity = new SimpleDoubleProperty();
	private DoubleProperty sliderBloomThreshold = new SimpleDoubleProperty();
	private DoubleProperty sliderBoxBlurWidth = new SimpleDoubleProperty();
	private DoubleProperty sliderBoxBlurHeight = new SimpleDoubleProperty();
	private DoubleProperty sliderBoxBlurIteration = new SimpleDoubleProperty();
	private DoubleProperty sliderColorAdjustContrast = new SimpleDoubleProperty();
	private DoubleProperty sliderColorAdjustBrigthness = new SimpleDoubleProperty();
	private DoubleProperty sliderColorAdjustHue = new SimpleDoubleProperty();
	private DoubleProperty sliderColorAdjustSaturation = new SimpleDoubleProperty();
	private DoubleProperty sliderDisplacementMapOffsetY = new SimpleDoubleProperty();
	private DoubleProperty sliderDisplacementMapOffsetX = new SimpleDoubleProperty();
	private DoubleProperty sliderDisplacementMapScaleX = new SimpleDoubleProperty();
	private DoubleProperty sliderDisplacementMapScaleY = new SimpleDoubleProperty();
	private DoubleProperty sliderGaussianBlurRadius = new SimpleDoubleProperty();
	private DoubleProperty sliderGlowLevel = new SimpleDoubleProperty();
	private DoubleProperty sliderLightningDiffuseConstant = new SimpleDoubleProperty();
	private DoubleProperty sliderLightningSpectularConstant = new SimpleDoubleProperty();
	private DoubleProperty sliderLightningSpectularExponent = new SimpleDoubleProperty();
	private DoubleProperty sliderLightningsurcfaceScale = new SimpleDoubleProperty();
	private DoubleProperty sliderLightningAzimuth = new SimpleDoubleProperty();
	private DoubleProperty sliderLightningEvaluation = new SimpleDoubleProperty();
	private DoubleProperty sliderMotionBlurAngle = new SimpleDoubleProperty();
	private DoubleProperty sliderMotionBlurRadius = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformLlx = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformLly = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformLrx = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformLry = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformUlx = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformUly = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformUrx = new SimpleDoubleProperty();
	private DoubleProperty sliderPerspectiveTransformUry = new SimpleDoubleProperty();
	private DoubleProperty sliderReflectionBottomOpacity = new SimpleDoubleProperty();
	private DoubleProperty sliderReflectionTopOpacity = new SimpleDoubleProperty();
	private DoubleProperty sliderReflectionTopOffset = new SimpleDoubleProperty();
	private DoubleProperty sliderReflectionFraction = new SimpleDoubleProperty();
	private DoubleProperty sliderSepiaToneLevel = new SimpleDoubleProperty();
	private DoubleProperty sliderShadowHeight = new SimpleDoubleProperty();
	private DoubleProperty sliderShadowWidth = new SimpleDoubleProperty();
	private DoubleProperty sliderShadowRadius = new SimpleDoubleProperty();
	private DoubleProperty sliderInnerShadowHeight = new SimpleDoubleProperty();
	private DoubleProperty sliderInnerShadowWidth = new SimpleDoubleProperty();
	private DoubleProperty sliderInnerShadowRadius = new SimpleDoubleProperty();
	private DoubleProperty sliderInnerShadowOffsetX = new SimpleDoubleProperty();
	private DoubleProperty sliderInnerShadowOffsetY = new SimpleDoubleProperty();
	private DoubleProperty sliderInnerShadowSpread = new SimpleDoubleProperty();
	private DoubleProperty sliderDropshadowHeight = new SimpleDoubleProperty();
	private DoubleProperty sliderDropshadowWidth = new SimpleDoubleProperty();
	private DoubleProperty sliderDropshadowRadius = new SimpleDoubleProperty();
	private DoubleProperty sliderDropshadowOffsetX = new SimpleDoubleProperty();
	private DoubleProperty sliderDropshadowOffsetY = new SimpleDoubleProperty();
	private DoubleProperty sliderDropshadowSpread = new SimpleDoubleProperty();
	private DoubleProperty sliderColorInputHeight = new SimpleDoubleProperty();
	private DoubleProperty sliderColorInputWidth = new SimpleDoubleProperty();
	private DoubleProperty sliderColorInputX = new SimpleDoubleProperty();
	private DoubleProperty sliderColorInputY = new SimpleDoubleProperty();
	
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
