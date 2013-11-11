package net.jurasec.json.vo;

import com.badlogic.gdx.utils.Array;

public class VOCards {
	private String cardValue;
	private int hand;
	private int dropped;
	private int idcard;
		
	public String getCardValue() {
		return cardValue;
	}
	public void setCardValue(String cardValue) {
		this.cardValue = cardValue;
	}
	public int getHand() {
		return hand;
	}
	public void setHand(int hand) {
		this.hand = hand;
	}
	public int getDropped() {
		return dropped;
	}
	public void setDropped(int dropped) {
		this.dropped = dropped;
	}
	public int getIdcard() {
		return idcard;
	}
	public void setIdcard(int idcard) {
		this.idcard = idcard;
	}
}
