package com.skilldistillery.blackjack.game;

import java.util.List;

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

	public void firstCardDown() {
		List<Card> dealersHand = hand.getCards();

		System.out.println("Dealer's hand: ");

		for (int i = 1; i < dealersHand.size(); i++) {
			System.out.println(dealersHand.get(i));
		}

	}

}
