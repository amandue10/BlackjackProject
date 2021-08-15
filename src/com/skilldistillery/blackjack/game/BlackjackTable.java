package com.skilldistillery.blackjack.game;

import java.util.Scanner;

import com.skilldistillery.blackjack.app.BlackjackApp;

public class BlackjackTable {
	private Dealer dealer;
	private Player player;
	private BlackjackApp blackjackApp = new BlackjackApp();

	public void startBlackjack(Scanner input) {

		// print out game information and greeting

		player = new Player();
		dealer = new Dealer();

	}

}
