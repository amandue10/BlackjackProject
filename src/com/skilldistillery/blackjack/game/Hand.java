package com.skilldistillery.blackjack.game;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.blackjack.entities.Card;

public abstract class Hand {

	protected List<Card> cards;

	public Hand() {
		cards = new ArrayList<Card>();
	}

	public Hand(List<Card> cards) {
		super();
		this.cards = cards;
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public void clear() {
		cards.clear();
	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}

}
