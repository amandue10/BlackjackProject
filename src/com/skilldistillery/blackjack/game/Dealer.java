package com.skilldistillery.blackjack.game;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class Dealer extends Player {

	private Hand hand;
	private Deck deck;

	public Dealer(Hand hand) {
		super(hand);
	}

	public Dealer() {
		super();
		deck = new Deck();
		deck.shuffle();
		hand = new BlackjackHand();

	}

	public Card dealCards() {
		System.out.println("Dealer deals");
		Card card = deck.dealCard();
		return card;
	}

}
