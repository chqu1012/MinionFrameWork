package de.dc.minion.model.addon.snapshot.renderer;

import de.dc.minion.model.addon.snapshot.BlendEffect;
import de.dc.minion.model.addon.snapshot.BloomEffect;
import de.dc.minion.model.addon.snapshot.BoxBlurEffect;
import de.dc.minion.model.addon.snapshot.ColorAdjustEffect;
import de.dc.minion.model.addon.snapshot.ColorGrading;
import de.dc.minion.model.addon.snapshot.ColorInputEffect;
import de.dc.minion.model.addon.snapshot.DisplacementMapEffect;
import de.dc.minion.model.addon.snapshot.DropShadowEffect;
import de.dc.minion.model.addon.snapshot.GaussianBlurEffect;
import de.dc.minion.model.addon.snapshot.GlowEffect;
import de.dc.minion.model.addon.snapshot.InnerShadowEffect;
import de.dc.minion.model.addon.snapshot.LightingEffect;
import de.dc.minion.model.addon.snapshot.MotionBlurEffect;
import de.dc.minion.model.addon.snapshot.PerspectiveTransformEffect;
import de.dc.minion.model.addon.snapshot.ReflectionEffect;
import de.dc.minion.model.addon.snapshot.SepiaToneEffect;
import de.dc.minion.model.addon.snapshot.ShadowEffect;
import de.dc.minion.model.addon.snapshot.util.SnapshotSwitch;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.effect.DisplacementMap;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.effect.Reflection;
import javafx.scene.effect.SepiaTone;
import javafx.scene.effect.Shadow;
import javafx.scene.paint.Color;

public class SnapshotEffects extends SnapshotSwitch<Effect>{

	@Override
	public Effect caseShadowEffect(ShadowEffect object) {
		Shadow effect = new Shadow();
		if (object.getColor()!=null) {
			effect.setColor(Color.valueOf(object.getColor()));
		}
		effect.setHeight(object.getHeight());
		effect.setWidth(object.getWidth());
		effect.setRadius(object.getRadius());
		return effect;
	}
	
	@Override
	public Effect caseBlendEffect(BlendEffect object) {
		Blend effect = new Blend();
		effect.setOpacity(object.getOpacity());
		effect.setMode(BlendMode.valueOf(object.getMode().getName()));
		return effect;
	}
	
	@Override
	public Effect caseDropShadowEffect(DropShadowEffect object) {
		DropShadow effect = new DropShadow();
		effect.setBlurType(BlurType.valueOf(object.getBlurType().getName()));
		effect.setHeight(object.getHeight());
		effect.setWidth(object.getWidth());
		effect.setOffsetX(object.getOffsetX());
		effect.setOffsetY(object.getOffsetY());
		effect.setRadius(object.getRadius());
		effect.setSpread(object.getSpread());
		return effect;
	}
	
	@Override
	public Effect caseBloomEffect(BloomEffect object) {
		return new Bloom(object.getThreshold());
	}
	
	@Override
	public Effect caseBoxBlurEffect(BoxBlurEffect object) {
		return new BoxBlur(object.getWidth(), object.getHeight(), object.getIterations());
	}
	
	@Override
	public Effect caseColorAdjustEffect(ColorAdjustEffect object) {
		return new ColorAdjust(object.getHue(), object.getSaturation(), object.getBrightness(), object.getContrast());
	}
	
	@Override
	public Effect caseColorInputEffect(ColorInputEffect object) {
		return new ColorInput(object.getX(), object.getY(), object.getWidth(), object.getHeight(), Color.web(object.getColor()));
	}
	
	@Override
	public Effect caseDisplacementMapEffect(DisplacementMapEffect object) {
		DisplacementMap effect = new DisplacementMap();
		effect.setOffsetX(object.getOffsetX());
		effect.setOffsetX(object.getOffsetX());
		effect.setScaleX(object.getScaleX());
		effect.setScaleY(object.getScaleY());
		return effect;
	}
	
	@Override
	public Effect caseGaussianBlurEffect(GaussianBlurEffect object) {
		return new GaussianBlur(object.getRadius());
	}
	
	@Override
	public Effect caseGlowEffect(GlowEffect object) {
		return new Glow(object.getLevel());
	}
	
	@Override
	public Effect caseInnerShadowEffect(InnerShadowEffect object) {
		BlurType blurType = BlurType.valueOf(object.getBlurType().getName());
		Color color = Color.web(object.getColor());
		return new InnerShadow(blurType, color, object.getRadius(), object.getChoke(), object.getOffsetX(), object.getOffsetY());
	}
	
	@Override
	public Effect caseLightingEffect(LightingEffect object) {
		Lighting effect = new Lighting();
		effect.setDiffuseConstant(object.getDiffuseConstant());
		effect.setSpecularConstant(object.getSpecularConstant());
		effect.setSpecularExponent(object.getSpecularExponent());
		effect.setSurfaceScale(object.getSurfaceScale());
		return effect;
	}
	
	@Override
	public Effect caseMotionBlurEffect(MotionBlurEffect object) {
		return new MotionBlur(object.getAngle(), object.getRadius());
	}
	
	@Override
	public Effect casePerspectiveTransformEffect(PerspectiveTransformEffect object) {
		return new PerspectiveTransform(object.getUlx(), object.getUly(), object.getUrx(), object.getUry(), object.getLrx(), object.getLry(), object.getLlx(), object.getLly());
	}
	
	@Override
	public Effect caseReflectionEffect(ReflectionEffect object) {
		return new Reflection(object.getTopOffset(), object.getFraction(), object.getTopOpacity(), object.getBottomOpacity());
	}
	
	@Override
	public Effect caseSepiaToneEffect(SepiaToneEffect object) {
		return new SepiaTone(object.getLevel());
	}
}
