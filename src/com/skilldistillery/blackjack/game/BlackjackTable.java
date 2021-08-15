package com.skilldistillery.blackjack.game;

import java.util.Scanner;

import com.skilldistillery.blackjack.app.BlackjackApp;

public class BlackjackTable {
	private Dealer dealer;
	private Player player;
	private BlackjackApp blackjackApp = new BlackjackApp();

	public void blackjackRules(Scanner input) {
		player = new Player();
		dealer = new Dealer();

		System.out.println("Welcome to BlackJack");
		System.out.println();
		System.out.println("The rules are simple");
		System.out.println("The player closest to 21 without " + "going over, wins");
		System.out.println("Aces are high, worth 11 points");
		System.out.println("Jack, Queen, and King are worth" + " 10 points");
		System.out.println("Cards 1 through 10 are worth their " + "respective number");
		System.out.println();

	}

	private void playBlackjack(Scanner input) {

		player.addCardToPlayer(dealer.dealCards());
		System.out.println("player");

		dealer.addCardToPlayer(dealer.dealCards());
		System.out.println(player);

		player.addCardToPlayer(dealer.dealCards());
		System.out.println("player");

		dealer.addCardToPlayer(dealer.dealCards());
		System.out.println(player);

		showPlayersCurrentValue();

	}

	private void showPlayersCurrentValue() {
		System.out.println("Player's hand value: " + player.askHandValue());
	}

	private void showDealersCurrentValue() {
		System.out.println("Dealer's hand value: " + " " + dealer.askHandValue());
	}

}
