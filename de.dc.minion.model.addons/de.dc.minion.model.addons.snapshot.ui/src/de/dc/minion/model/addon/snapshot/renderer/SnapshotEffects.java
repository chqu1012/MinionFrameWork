package de.dc.minion.model.addon.snapshot.renderer;

import de.dc.minion.model.addon.snapshot.BlendEffect;
import de.dc.minion.model.addon.snapshot.DropShadowEffect;
import de.dc.minion.model.addon.snapshot.ShadowEffect;
import de.dc.minion.model.addon.snapshot.util.SnapshotSwitch;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
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
}
