package codes;

import java.util.Scanner;

public class Menu {
	private int PLAYER_NUMBER;
	private int DECK_NUMBER;
	private int MONEY;
	
	public void askPlayerNumber() {
		boolean playerDone = false;
		while (!playerDone) {
			try {
				System.out.println("How many players are playing?");
				Scanner playerNumber = new Scanner(System.in);
				PLAYER_NUMBER = playerNumber.nextInt();
				if (PLAYER_NUMBER > 0 && PLAYER_NUMBER < 8) {
					System.out.println("We have " + PLAYER_NUMBER + " player(s) with us today");
					playerDone = true;
				}
				else
					throw new ArithmeticException ("Please enter a positive integar between 1-7");
			}
			catch(Exception e) {
				System.out.println("Please enter a positive integar between 1-7");
			}
		}
	}

	public void askDeckNumber() {
		boolean deckDone = false;
		while (!deckDone) {
			try {
				System.out.println("How many decks are we using?");
				Scanner deckNumber = new Scanner(System.in);
				DECK_NUMBER = deckNumber.nextInt();
				if (DECK_NUMBER > 0 && DECK_NUMBER != 3 && DECK_NUMBER < 9) {
					System.out.println("The number of decks we are using is " + DECK_NUMBER);
					deckDone = true;	
				}
				else 
					throw new ArithmeticException ("Please enter a positive integar between 1-8 with an exception of 3");
			}
			catch(Exception e) {
				System.out.println("Please enter a positive integar between 1-8 with an exception of 3");
			}
		}
	}
	/*
	public void askMoney() {
		Scanner moneyAmount = new Scanner(System.in);
		System.out.println("How much money are you going to be betting?");
		MONEY = moneyAmount.nextInt();
		
		System.out.println("You will playing with " + MONEY + " today");
	}
	*/
	public int getPLAYER_NUMBER() {
		return PLAYER_NUMBER;
	}

	public int getDECK_NUMBER() {
		return DECK_NUMBER;
	}
	/*
	public int getMONEY() {
		return MONEY;
	}
*/
}