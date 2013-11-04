package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.FileTextureData;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Array;

public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	private CardActor card; //1, card2, card3, card4, card5;
	private Array<CardActor> cards;
	private TextureRegion c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13;
	private Stage stage;
	private int HEIGHT = 256;
	private int WIDTH = 128;
	private int FREEHEIGHT = 96;
	private int posYDeck = 20;

	@Override
	public void create() {
		// Texture.setEnforcePotImages(false);

		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		Gdx.app.log("hearts", "screen width: "+ w);
		Gdx.app.log("hearts", "screen height "+ h);

		// texture = new Texture(Gdx.files.internal("C1.png"));
		c1 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				0, 0, WIDTH * 1, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c2 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 1, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c3 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 2, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c4 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 3, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c5 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 4, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c6 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 5, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c7 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 6, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c8 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 7, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c9 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 8, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c10 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 9, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c11 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 10, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c12 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 11, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		c13 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 12, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		// region.flip(false, true);

		int initialOffset = (int) (800 * 0.05) / 2;
		int posX = initialOffset;
		int overlapOffset = (int) ((800 - (WIDTH/2))  - (800 * 0.05))/13;//((( WIDTH * 13 ) - (800 - (initialOffset*2))) / 13);
		
		Gdx.app.log("hearts", "initialOffset: "+ initialOffset);
		Gdx.app.log("hearts", "overlapOffset: "+ overlapOffset);		
		
		// create the camera and the SpriteBatch
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		batch = new SpriteBatch();
		
		cards = new Array<CardActor>();
		
		card = new CardActor(c1, 1);
		card.setPosition( posX, posYDeck);
		cards.add( card );	
		
		Gdx.app.log("hearts", "posX1: "+ posX);
		posX = posX + overlapOffset;
		card = new CardActor(c2, 2);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		Gdx.app.log("hearts", "posX2: "+ posX);
		posX = posX + overlapOffset;
		card = new CardActor(c3, 3);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		Gdx.app.log("hearts", "posX3: "+ posX);
		posX = posX + overlapOffset;
		card = new CardActor(c4, 4);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		posX = posX + overlapOffset;
		card = new CardActor(c5, 5);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		posX = posX + overlapOffset;
		card = new CardActor(c6, 6);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		posX = posX + overlapOffset;
		card = new CardActor(c7, 7);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		posX = posX + overlapOffset;
		card = new CardActor(c8, 8);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		posX = posX + overlapOffset;
		card = new CardActor(c9, 9);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		posX = posX + overlapOffset;
		card = new CardActor(c10, 10);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		posX = posX + overlapOffset;
		card = new CardActor(c11, 11);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		posX = posX + overlapOffset;
		card = new CardActor(c12, 12);
		card.setPosition(posX, posYDeck);
		cards.add( card );
		
		posX = posX + overlapOffset;
		card = new CardActor(c13, 13);
		card.setPosition(posX, posYDeck);
		cards.add( card );

		// which uses the flipped region. The key here is to
		// set our y-down camera on the stage, the rest is just for demo
		// purposes.
		stage = new Stage(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(),
				true);
		stage.setCamera(camera);
//
		for(CardActor card: cards)
			stage.addActor( card );
		
		Gdx.input.setInputProcessor(stage);

	}

	@Override
	public void dispose() {
		stage.dispose();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		// tell the camera to update its matrices.
		camera.update();

		// tell the SpriteBatch to render in the
		// coordinate system specified by the camera.
		batch.setProjectionMatrix(camera.combined);

		// begin a new batch and draw the bucket and
		// all drops
//		batch.begin();
		// batch.draw(region, 400, 200);
//		batch.end();

		// tell the stage to act and draw itself
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
