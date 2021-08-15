package com.skilldistillery.blackjack.game;

import com.skilldistillery.blackjack.entities.Card;

public class Player {

	private Hand hand;

	public Player(Hand hand) {
		super();
		this.hand = hand;
	}

	public Player() {
		hand = new BlackjackHand();
	}

	public void addCardToPlayer(Card card) {
		hand.addCard(card);

	}

	public int askHandValue() {

		return hand.getHandValue();
	}

	@Override
	public String toString() {
		return "Player [hand=" + hand + "]";
	}

}
