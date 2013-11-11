package com.me.mygdxgame;

import net.jurasec.json.DateJsonTest;
import net.jurasec.json.JsonClient;
import net.jurasec.json.JsonClientException;
import net.jurasec.json.ResponseCallback;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Array;

public class SpriteCardsLoader {
	
	private int HEIGHT = 256;
	private int WIDTH = 128;
	private int FREEHEIGHT = 96;
	private int posYDeck = 20;
	private Array<CardActor> cards;
	private CardActor card;
	
	private TextureRegion C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12,
			C13, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11, D12, D13, H1,
			H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, S1, S2, S3, S4,
			S5, S6, S7, S8, S9, S10, S11, S12, S13;

	public Array<CardActor> loadCards() {
		Gdx.app.log("hearts", "dentro de SpriteCardsLoader");
		
		DateJsonTest dateJsonTest = new DateJsonTest();
		//
				ResponseCallback<DateJsonTest> callback = new ResponseCallback<DateJsonTest>() {
					public void onResponse(DateJsonTest returnObject) {
						Gdx.app.log("hearts", "Json request OK.");
						Gdx.app.log("hearts", returnObject.getDate());
						Gdx.app.log("hearts", returnObject.getTime());
						Gdx.app.log("hearts",
								returnObject.getMilliseconds_since_epoch() + "");
					}
		//
					public void onFail(JsonClientException exception) {
						Gdx.app.log("hearts",
								"Json request failed: " + exception.getMessage());
					}
					// @Override
					// public void onFail(JsonClientException t) {
					// // TODO Auto-generated method stub
					//
					// }
				};

				JsonClient.getInstance().sendRequest(dateJsonTest, "/", "GET",
		 				callback, DateJsonTest.class);
		
		
		
		
		
		
		
		int initialOffset = (int) (800 * 0.05) / 2;
		int posX = initialOffset;
		int overlapOffset = (int) ((800 - (WIDTH / 2)) - (800 * 0.05)) / 13;
		
		
		C1 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				0, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C2 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 1, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C3 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 2, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C4 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 3, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C5 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 4, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C6 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 5, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C7 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 6, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C8 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 7, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C9 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 8, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C10 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 9, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C11 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 10, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C12 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 11, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		C13 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 12, 0, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));

		D1 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				0, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D2 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 1, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D3 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 2, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D4 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 3, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D5 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 4, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D6 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 5, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D7 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 6, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D8 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 7, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D9 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 8, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D10 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 9, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D11 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 10, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D12 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 11, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		D13 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 12, HEIGHT * 1, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));		

		S1 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				0, HEIGHT * 3, WIDTH * 1, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S2 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 1, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S3 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 2, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S4 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 3, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S5 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 4, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S6 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 5, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S7 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 6, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S8 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 7, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S9 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 8, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S10 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 9, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S11 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 10, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S12 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 11, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		S13 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 12, HEIGHT * 3, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		
		H1 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				0, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H2 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 1, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H3 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 2, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H4 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 3, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H5 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 4, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H6 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 5, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H7 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 6, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H8 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 7, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H9 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 8, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H10 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 9, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H11 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 10, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H12 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 11, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));
		H13 = new TextureRegion(new Texture(Gdx.files.internal("sprite.png")),
				WIDTH * 12, HEIGHT * 2, WIDTH, (HEIGHT * 1) - (FREEHEIGHT * 1));

		cards = new Array<CardActor>();
		
		
		// Clubs		
		card = new CardActor(C1, 1, "C1");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX1: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(C2, 2, "C2");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX2: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(C3, 3, "C3");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX3: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(C4, 4, "C4");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(C5, 5, "C5");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(C6, 6, "C6");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(C7, 7, "C7");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(C8, 8, "C8");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(C9, 9, "C9");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(C10, 10, "C10");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(C11, 11, "C11");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(C12, 12, "C12");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(C13, 13, "C13");
		card.setPosition(posX, posYDeck);
		cards.add(card);
		
		
		
		//Diamonts
		posX = initialOffset;
		card = new CardActor(D1, 1, "D1");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX1: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(D2, 2, "D2");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX2: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(D3, 3, "D3");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX3: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(D4, 4, "D4");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(D5, 5, "D5");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(D6, 6, "D6");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(D7, 7, "D7");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(D8, 8, "D8");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(D9, 9, "D9");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(D10, 10, "D10");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(D11, 11, "D11");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(D12, 12, "D12");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(D13, 13, "D13");
		card.setPosition(posX, posYDeck);
		cards.add(card);
		
		
		
		//Spades
		posX = initialOffset;
		card = new CardActor(S1, 1, "S1");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX1: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(S2, 2, "S2");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX2: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(S3, 3, "S3");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX3: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(S4, 4, "S4");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(S5, 5, "S5");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(S6, 6, "S6");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(S7, 7, "S7");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(S8, 8, "S8");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(S9, 9, "S9");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(S10, 10, "S10");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(S11, 11, "S11");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(S12, 12, "S12");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(S13, 13, "S13");
		card.setPosition(posX, posYDeck);
		cards.add(card);
		
		
		//Hearts
		posX = initialOffset;
		card = new CardActor(H1, 1, "H1");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX1: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(H2, 2, "H2");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX2: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(H3, 3, "H3");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		Gdx.app.log("hearts", "posX3: " + posX);
		posX = posX + overlapOffset;
		card = new CardActor(H4, 4, "H4");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(H5, 5, "H5");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(H6, 6, "H6");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(H7, 7, "H7");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(H8, 8, "H8");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(H9, 9, "H9");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(H10, 10, "H10");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(H11, 11, "H11");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(H12, 12, "H12");
		card.setPosition(posX, posYDeck);
		cards.add(card);

		posX = posX + overlapOffset;
		card = new CardActor(H13, 13, "H3");
		card.setPosition(posX, posYDeck);
		cards.add(card);
		
		for(CardActor actor : cards){
			actor.setVisible(false);
			Gdx.app.log("hearts", "cardValue: " + actor.getCardValue() + " - Name: " + actor.getName());
		}
		
		return cards;
	}
}
