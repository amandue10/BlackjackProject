package com.skilldistillery.blackjack.app;

import java.util.Scanner;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.run();

	}

	public void run() {
		Scanner input = new Scanner(System.in);
		BlackjackMenu(input);
	}

	public void BlackjackMenu(Scanner input) {

		System.out.println("Would you like to play a game... " + "of Blackjack?");
		System.out.println("Press 1 to play");
		System.out.println("Press 2 to Quit");
		System.out.println();
		System.out.println("Enter a choice: ");
		System.out.println("---------------------");
		System.out.println();

		int menuChoice = 0;
		menuChoice = input.nextInt();
// Need to add try catch block for input
		switch (menuChoice) {
		case 1:
			break;
		case 2:
			System.out.println("Thanks for playing, come again!");
			System.exit(0);
			break;
		default:
			System.out.println("Choose a number 1 to play or" + " 2 to quit");
			System.out.println();
			System.out.println();
			run();
		}

	}
}
