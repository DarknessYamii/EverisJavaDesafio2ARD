package operators;

import java.util.Scanner;

/**
 * Class which contains functions
 * 
 * @author aruidelg
 *
 */
public class Pinball {

	Scanner scanner = new Scanner(System.in);
	private int blueWins = 0, redWins = 0, dinero = 0;

	public Pinball() {

		this.blueWins = blueWins;
		this.redWins = redWins;
		this.dinero += dinero;

	}

	/**
	 * launchBall() 2 teams play, 1v1, the highest score marks 1 point
	 */
	public void launchBall() {

		int contBlue = 0, contRed = 0, red = 0, blue = 0, maxScore = 0;
		// You can modify this value to play more matches (Important: Odd/Uneven value)
		int bestOf = 5;

		for (int i = 0; i < bestOf; i++) {

			System.out.println("Red team launch");
			red = (int) (Math.random() * (200 - 0));
			System.out.println(red);
			maxScore = (red > maxScore) ? red : maxScore;

			System.out.println("Blue team launch");
			blue = (int) (Math.random() * (200 - 0));
			System.out.println(blue);
			// Find the highest score between bluePoints and redPoints
			maxScore = (blue > maxScore) ? blue : maxScore;
			// Count which team has more score than the other one
			if (red > blue)

				contRed++;

			else

				contBlue++;

		}
		int option;
		// Try: Throw error if you introduce a String or Char instead Integer
		try {
			do {
				System.out.println("What ratio was the highest score? (1.0-50/2.50-100/3.100-150/4.150-200)");
				option = scanner.nextInt();
				// Minigame to hit the ratio of highest score
				switch (option) {

				case 1: {

					if (maxScore >= 0 && maxScore < 50)
						System.out.println("You win, the highest score is: " + maxScore);
					else
						System.out.println("Sorry, that's not the highest score");

					break;
				}

				case 2: {
					if (maxScore >= 50 && maxScore < 100)
						System.out.println("You win, the highest score is: " + maxScore);
					else
						System.out.println("Sorry, that's not the highest score");

					break;

				}
				case 3: {
					if (maxScore >= 100 && maxScore < 150)
						System.out.println("You win, the highest score is: " + maxScore);
					else
						System.out.println("Sorry, that's not the highest score");

					break;

				}

				case 4: {
					if (maxScore >= 150 && maxScore <= 200)
						System.out.println("You win, the highest score is: " + maxScore);
					else
						System.out.println("Sorry, that's not the highest score");

					break;

				}

				default:

					System.err.println("Insert valid value");
					break;
				}
			} while (option > 4 || option < 1);
		} catch (Exception e) {
			System.err.println("Please, insert an Intenger value");
			scanner.next();
		}
		System.out.println("The highest score was " + maxScore);

		System.out.println("The match is over Blue: " + contBlue + " wins, y Red: " + contRed + " wins");
		// Show which team won
		if (contRed > contBlue) {

			System.out.println("Red wins");
			this.redWins = contRed;

		} else {

			System.out.println("Blue wins");
			this.blueWins = contBlue;

		}
	}
	
	/**
	 * Draft()
	 * The user must introduce which team won, to win a bet 
	 * @return boolean
	 */
	public boolean Draft() {
		try {
			int option;
			int correctAnswer;
			do {

				System.out.println("Which team won? (1. Red 2. Blue )");
				option = scanner.nextInt();
				if (option > 2 || option < 1)
					System.err.println("Please, insert valid value");

			} while (option != 1 && option != 2);

			if (this.blueWins > this.redWins)
				correctAnswer = 2;
			else
				correctAnswer = 1;

			if (correctAnswer == option)
				return true;

		} catch (Exception e) {
			System.err.println("Please, insert an Intenger value");
		}

		return false;

	}
	/**
	 * WinDraft()
	 * Give you money if you win the bet 
	 */
	public void WinDraft() {
		int bet = (int) (Math.random() * (500 - 1));
		int minBet = 100;
		// Use the method Draft() to compare if it return true or false
		if (Draft() == true) {

			this.dinero = bet + minBet;
			System.out.println("You won " + this.dinero + "$");

			if (this.dinero >= 200 && this.dinero < 500) {
				System.out.println("Good Luck");
			} else if (this.dinero < 200) {
				System.out.println("Bad luck");
			} else {
				System.out.println("God in the bets");
			}

		} else {
			System.out.println("You lose the draft");
		}

	}
}
