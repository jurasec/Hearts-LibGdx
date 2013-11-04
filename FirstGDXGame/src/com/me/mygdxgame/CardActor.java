/**
 * 
 */
package com.me.mygdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;


/**
 * @author JuraseC
 *
 */
public class CardActor extends Actor {
	int cardValue = 0;
	TextureRegion region;
	float lastX;
	float lastY;
	Actor actor = this;
	
	public CardActor( TextureRegion region, int cardValue){
		this.region = region;
		this.cardValue = cardValue;
		setWidth(region.getRegionWidth());
		setHeight(region.getRegionHeight());

		addListener(new InputListener() {
			public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
				Gdx.app.log("touch", "Card [" + getCardValue()  + "] touched...");
				// we only care for the first finger to make things easier
				if (pointer != 0) return false;

				// record the coordinates the finger went down on. they
				// are given relative to the actor's upper left corner (0, 0)
				lastX = x;
				lastY = y;
				
				
				MoveToAction action = Actions.action(MoveToAction.class);
				action.setPosition(380, 180);
				action.setDuration(1);
				action.setInterpolation(Interpolation.swingOut);
				actor.setZIndex(13);
				actor.addAction(action);
				
				
				return true;
			}

			public void touchDragged (InputEvent event, float x, float y, int pointer) {
				// we only care for the first finger to make things easier
				if (pointer != 0) return;

				// adjust the actor's position by (current mouse position - last mouse position)
				// in the actor's coordinate system.
//				translate(x - lastX, y - lastY);

				// save the current mouse position as the basis for the next drag event.
				// we adjust by the same delta so next time drag is called, lastX/lastY
				// are in the actor's local coordinate system automatically.
				lastX = x - (x - lastX);
				lastY = y - (y - lastY);
			}
		});
	}

	public int getCardValue(){
		return cardValue;
	}
	
	@Override
	public void draw (SpriteBatch batch, float parentAlpha) {
//		Gdx.app.log("touch", "dibujando carta: "+this.getCardValue());
		batch.draw(region, getX(), getY());
	}
}
