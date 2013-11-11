package net.jurasec.json.vo;

import com.badlogic.gdx.utils.Array;

public class DeckPlayer {
	private Array<VOCards> cards;

	public Array<VOCards> getCards() {
		return cards;
	}

	public void setCards(Array<VOCards> cards) {
		this.cards = cards;
	}	
}
