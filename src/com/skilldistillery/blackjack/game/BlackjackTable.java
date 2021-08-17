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
		showPlayersCurrentValue();

		dealer.addCardToPlayer(dealer.dealCards());
		dealer.firstCardDown();

		player.addCardToPlayer(dealer.dealCards());
		showPlayersCurrentValue();

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
		System.out.println("Type in the action you " + "would like to perform");
		System.out.println();
		System.out.println();
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
		player.addCardToPlayer(dealer.dealCards());
		printPlayersCurrentValue();
		checkValues(input);
		playersTurn(input);
	}

	private void stay(Scanner input) {
		dealersDecisions(input);
//		printPlayersCurrentValue();

	}

	private void printPlayersCurrentValue() {
		System.out.println("Player's hand value: " + player.askHandValue());
	}

	private void printDealersCurrentValue() {

		System.out.println("Dealer's hand vlaue: " + dealer.askHandValue());

	}

	private void playersTurn(Scanner input) {
		if (player.askHandValue() > 21) {// fix 21 to variable
			hitOrStay(input);
		} else {
			checkValues(input);
			checkForPush(input);
		}
	}

	private void dealersDecisions(Scanner input) {
		if (dealer.askHandValue() < 17) {// fix 17 , make variable
			dealer.addCardToPlayer(dealer.dealCards());
			dealer.firstCardDown();
		} else {
			checkValues(input);
			checkForPush(input);
		}
	}

	private void checkForPush(Scanner input) {
		if (player.askHandValue() == dealer.askHandValue()) {
			dealerShowsAllCards();
			System.out.println("It's a tie");
			playAgain(input);
		}
		checkForHighestScore(input);
	}

	private void dealerShowsAllCards() {
		printDealersCurrentValue();
	}

	private void checkForBlackjack(Scanner input) {
		if (player.isBLackjack()) {
			dealerShowsAllCards();
			System.out.println("You win");
			playAgain(input);

		} else if (dealer.isBLackjack()) {
			dealerShowsAllCards();
			System.out.println("Dealer wins");
			playAgain(input);

		} else if (player.isBLackjack() && dealer.isBLackjack()) {
			dealerShowsAllCards();
			System.out.println("Draw");
			playAgain(input);

		}

	}

	private void checkValues(Scanner input) {
		if (dealer.isBust()) {
			dealerShowsAllCards();
			System.out.println("Dealer is over 21, you win");
			playAgain(input);
		}

		else if (player.isBust()) {
			dealerShowsAllCards();
			System.out.println("Over 21. Dealer wins");
			playAgain(input);
		}

		else if (dealer.isTwentyOne()) {
			dealerShowsAllCards();
			System.out.println("Dealer wins with 21, you loose");
			playAgain(input);
		}

		else if (player.isTwentyOne()) {
			dealerShowsAllCards();
			System.out.println("Blackjack! You win with 21");
			playAgain(input);
		}
	}

	private void checkForHighestScore(Scanner input) {
		if (player.askHandValue() > dealer.askHandValue()) {
			dealerShowsAllCards();
			System.out.println("You have a higher hand value, you win");
			playAgain(input);
		} else {
			dealerShowsAllCards();
			System.out.println("You have the lowest hand value, you loose ");
			playAgain(input);

		}
	}

	private void playAgain(Scanner input) {
		System.out.println("Would you like to play again?");
		String playAgain = input.next();
		input.nextLine();

		switch (playAgain) {
		case "yes":
		case "Yes":
			player.clear();
			dealer.clear();
			dealer.callNewDeck();
		case "no":
		case "No":
			blackjackApp.BlackjackMenu(input);
			break;
		default:
			System.out.println("Invalid entry, please try again.");

		}

	}

}
