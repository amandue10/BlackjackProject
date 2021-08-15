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

		playBlackjack(input);

	}

	private void playBlackjack(Scanner input) {

		player.addCardToPlayer(dealer.dealCards());
		System.out.println(player);

		dealer.addCardToPlayer(dealer.dealCards());
		dealer.firstCardDown();

		player.addCardToPlayer(dealer.dealCards());
		System.out.println(player);

		dealer.addCardToPlayer(dealer.dealCards());
		dealer.firstCardDown();

		showPlayersCurrentValue();
		System.out.println();
		System.out.println();
		hitOrStay(input);
	}

	private void showPlayersCurrentValue() {
		System.out.println("Player's hand value: " + player.askHandValue());
	}

	private void showDealersCurrentValue() {
		System.out.println("Dealer's hand value: " + " " + dealer.askHandValue());
	}

	private void hitOrStay(Scanner input) {
		System.out.println("Would you like to hit or stay?");
		System.out.println("Type Hit to Hit");
		System.out.println("Type Stay to Stay");
		System.out.println("Input is case sensetive.");
		String hitOrStay = input.next();
		input.nextLine();

		switch (hitOrStay) {
		case "Hit":
		case "H":
		case "hit":
		case "h":
			hit(input);
			break;
		case "Stay":
		case "S":
		case "stay":
		case "s":
			stay(input);
			break;
		default:
			System.out.println("Incorrect input type, please try again");
			break;

		}

	}

	private void hit(Scanner input) {

	}

	private void stay(Scanner input) {

	}
}
