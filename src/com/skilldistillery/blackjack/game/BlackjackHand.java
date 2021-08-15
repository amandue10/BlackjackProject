package com.skilldistillery.blackjack.game;

import com.skilldistillery.blackjack.entities.Card;

public class BlackjackHand extends Hand {

	private final int twentyOne = 21;

	public BlackjackHand() {
		super();
	}

	public int getHandValue() {
		int handValue = 0;

		for (Card card : cards) {
			handValue += card.getValue();
		}
		return handValue;

	}

	public boolean isBlackjack() {
		if (getHandValue() == twentyOne) {
			return true;
		}
		return false;
	}

	public boolean isBust() {
		if (getHandValue() > twentyOne) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "BlackjackHand [twentyOne=" + twentyOne + "]";
	}

}
