package com.skilldistillery.blackjack.game;

public class Player {

	private Hand hand;

	public Player() {
		hand = new BlackjackHand();
	}

	public Player(Hand hand) {
		super();
		this.hand = hand;
	}

}
