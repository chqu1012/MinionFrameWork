package de.dc.minion.model.addon.snapshot.component.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public abstract class BaseSnapshotLayerController extends VBox{

	@FXML
	protected StackPane stackpaneEffects;
	@FXML
	protected VBox root;
	@FXML
	protected ToolBar toolbarEffects;
	@FXML
	protected TextField textSearch;
	@FXML
	protected Button buttonNew;
	@FXML
	protected Button buttonEdit;
	@FXML
	protected Button buttonDelete;
	@FXML
	protected Button buttonDuplicate;
	@FXML
	protected ListView listViewLayer;
	@FXML
	protected Button buttonBlend;
	@FXML
	protected Button buttonBloom;
	@FXML
	protected Button buttonBoxBlur;
	@FXML
	protected Button buttonColorAdjust;
	@FXML
	protected Button buttonColorInput;
	@FXML
	protected Button buttonDisplacement;
	@FXML
	protected Button buttonGaussianBlur;
	@FXML
	protected Button buttonGlow;
	@FXML
	protected Button buttonLightning;
	@FXML
	protected Button buttonMotionBlur;
	@FXML
	protected Button buttonPerspectiveTransform;
	@FXML
	protected Button buttonReflection;
	@FXML
	protected Button buttonSepiaTone;
	@FXML
	protected Button buttonShadow;
	@FXML
	protected GridPane gridpaneBlend;
	@FXML
	protected ComboBox comboBlendMode;
	@FXML
	protected Slider sliderBlendOpacity;
	@FXML
	protected Label labelBlendOpacity;
	@FXML
	protected GridPane gridpaneBloom;
	@FXML
	protected Slider sliderBloomThreshold;
	@FXML
	protected Label labelBloomThreshold;
	@FXML
	protected GridPane gridpaneBoxBlur;
	@FXML
	protected Slider sliderBoxBlurWidth;
	@FXML
	protected Label labelBoxBlurWidth;
	@FXML
	protected Slider sliderBoxBlurHeight;
	@FXML
	protected Label labelBoxBlurHeight;
	@FXML
	protected Slider sliderBoxBlurIteration;
	@FXML
	protected Label labelBoxBlurIteration;
	@FXML
	protected GridPane gridpaneColorAdjust;
	@FXML
	protected Slider sliderColorAdjustContrast;
	@FXML
	protected Label labelColorAdjustContrast;
	@FXML
	protected Slider sliderColorAdjustBrigthness;
	@FXML
	protected Label labelColorAdjustBrigthness;
	@FXML
	protected Slider sliderColorAdjustHue;
	@FXML
	protected Label labelColorAdjustHue;
	@FXML
	protected Slider sliderColorAdjustSaturation;
	@FXML
	protected Label labelColorAdjustSaturation;
	@FXML
	protected GridPane gridpaneDisplacement;
	@FXML
	protected Slider sliderDisplacementMapOffsetY;
	@FXML
	protected Label labelDisplacementMapOffsetY;
	@FXML
	protected Slider sliderDisplacementMapOffsetX;
	@FXML
	protected Label labelDisplacementMapOffsetX;
	@FXML
	protected Slider sliderDisplacementMapScaleX;
	@FXML
	protected Label labelDisplacementMapScaleX;
	@FXML
	protected Slider sliderDisplacementMapScaleY;
	@FXML
	protected Label labelDisplacementMapScaleY;
	@FXML
	protected GridPane gridpaneGaussianBlur;
	@FXML
	protected Slider sliderGaussianBlurRadius;
	@FXML
	protected Label labelGaussianBlurRadius;
	@FXML
	protected GridPane gridpaneGlow;
	@FXML
	protected Slider sliderGlowLevel;
	@FXML
	protected Label labelGlowLevel;
	@FXML
	protected GridPane gridpaneLightning;
	@FXML
	protected Slider sliderLightningDiffuseConstant;
	@FXML
	protected Label labelLightningDiffuseConstant;
	@FXML
	protected Slider sliderLightningSpectularConstant;
	@FXML
	protected Label labelLightningSpectularConstant;
	@FXML
	protected Slider sliderLightningSpectularExponent;
	@FXML
	protected Label labelLightningSpectularExponent;
	@FXML
	protected Slider sliderLightningsurcfaceScale;
	@FXML
	protected Label labelLightningsurcfaceScale;
	@FXML
	protected ComboBox comboLightningLight;
	@FXML
	protected ColorPicker colorPickerLightning;
	@FXML
	protected Slider sliderLightningAzimuth;
	@FXML
	protected Slider sliderLightningEvaluation;
	@FXML
	protected Label labelLightningAzimuth;
	@FXML
	protected Label labelLightningEvaluation;
	@FXML
	protected GridPane gridpaneMotionBlur;
	@FXML
	protected Slider sliderMotionBlurAngle;
	@FXML
	protected Label labelMotionBlurAngel;
	@FXML
	protected Slider sliderMotionBlurRadius;
	@FXML
	protected Label labelMotionBlurRadius;
	@FXML
	protected GridPane gridpanePerspectiveTransform;
	@FXML
	protected Slider sliderPerspectiveTransformLlx;
	@FXML
	protected Label labelPerspectiveTransformLlx;
	@FXML
	protected Slider sliderPerspectiveTransformLly;
	@FXML
	protected Label labelPerspectiveTransformLly;
	@FXML
	protected Slider sliderPerspectiveTransformLrx;
	@FXML
	protected Label labelPerspectiveTransformLrx;
	@FXML
	protected Slider sliderPerspectiveTransformLry;
	@FXML
	protected Label labelPerspectiveTransformLry;
	@FXML
	protected Slider sliderPerspectiveTransformUlx;
	@FXML
	protected Slider sliderPerspectiveTransformUly;
	@FXML
	protected Label labelPerspectiveTransformUlx;
	@FXML
	protected Label labelPerspectiveTransformUly;
	@FXML
	protected Slider sliderPerspectiveTransformUrx;
	@FXML
	protected Slider sliderPerspectiveTransformUry;
	@FXML
	protected Label labelPerspectiveTransformUrx;
	@FXML
	protected Label labelPerspectiveTransformUry;
	@FXML
	protected GridPane gridpaneReflection;
	@FXML
	protected Slider sliderReflectionBottomOpacity;
	@FXML
	protected Label labelReflectionBottomOpacity;
	@FXML
	protected Slider sliderReflectionTopOpacity;
	@FXML
	protected Label labelReflectionTopOpacity;
	@FXML
	protected Slider sliderReflectionTopOffset;
	@FXML
	protected Label labelReflectionTopOffset;
	@FXML
	protected Slider sliderReflectionFraction;
	@FXML
	protected Label labelReflectionFraction;
	@FXML
	protected GridPane gridpaneSepiaTone;
	@FXML
	protected Slider sliderSepiaToneLevel;
	@FXML
	protected Label labelsSepiaToneLevel;
	@FXML
	protected GridPane gridpaneShadow;
	@FXML
	protected Slider sliderShadowHeight;
	@FXML
	protected Label labelShadowHeight;
	@FXML
	protected Slider sliderShadowWidth;
	@FXML
	protected Label labelShadowWidth;
	@FXML
	protected Slider sliderShadowRadius;
	@FXML
	protected Label labelShadowRadius;
	@FXML
	protected ComboBox comboIShadowBlurType;
	@FXML
	protected ColorPicker colorPickerShadow;
	@FXML
	protected GridPane gridpaneInnerShadow;
	@FXML
	protected Slider sliderInnerShadowHeight;
	@FXML
	protected Label labelInnerShadowHeight;
	@FXML
	protected Slider sliderInnerShadowWidth;
	@FXML
	protected Label labelInnerShadowWidth;
	@FXML
	protected Slider sliderInnerShadowRadius;
	@FXML
	protected Label labelInnerShadowRadius;
	@FXML
	protected Slider sliderInnerShadowOffsetX;
	@FXML
	protected Label labelInnerShadowOffsetX;
	@FXML
	protected Slider sliderInnerShadowOffsetY;
	@FXML
	protected Label labelInnerShadowOffsetY;
	@FXML
	protected Slider sliderInnerShadowSpread;
	@FXML
	protected Label labelInnerShadowSpread;
	@FXML
	protected ComboBox comboInnerShadowBlurType;
	@FXML
	protected ColorPicker colorPickerInnerShadow;
	@FXML
	protected GridPane gridpaneDropshadow;
	@FXML
	protected Slider sliderDropshadowHeight;
	@FXML
	protected Label labelDropshadowHeight;
	@FXML
	protected Slider sliderDropshadowWidth;
	@FXML
	protected Label labelDropshadowWidth;
	@FXML
	protected Slider sliderDropshadowRadius;
	@FXML
	protected Label labelDropshadowRadius;
	@FXML
	protected Slider sliderDropshadowOffsetX;
	@FXML
	protected Label labelDropshadowOffsetX;
	@FXML
	protected Slider sliderDropshadowOffsetY;
	@FXML
	protected Label labelDropshadowOffsetY;
	@FXML
	protected Slider sliderDropshadowSpread;
	@FXML
	protected Label labelDropshadowSpread;
	@FXML
	protected ComboBox comboDropShadowBlurType;
	@FXML
	protected ColorPicker colorPickerDropShadow;
	@FXML
	protected GridPane gridpaneColorInput;
	@FXML
	protected Slider sliderColorInputHeight;
	@FXML
	protected Label labelColorInputHeight;
	@FXML
	protected Slider sliderColorInputWidth;
	@FXML
	protected Label labelColorInputWidth;
	@FXML
	protected Slider sliderColorInputX;
	@FXML
	protected Label labelColorInputX;
	@FXML
	protected Slider sliderColorInputY;
	@FXML
	protected Label labelColorInputY;
	@FXML
	protected ColorPicker colorPickerColorInput;

	public void initialize() {
	}

	@FXML
	protected abstract void onButtonAction(ActionEvent event);

}
