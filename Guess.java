

/// Random Class 
package com;

import java.util.Random;
import java.util.Scanner;

public class random {
	Random rnd = new Random();

	int userNum;

	String message = "";
	String userAgain = "";
	public Scanner input = new Scanner(System.in);

	public void show(String x) {
		System.out.println(x);
	}

	public int rndGenerator(int minNumber, int maxNumber) {
		return rnd.nextInt(Math.max(minNumber, maxNumber));
	}

	public void guessNumber(int minNum, int maxNum) {
		int rndNum = rndGenerator(minNum, maxNum);

		while (userNum != rndNum) {
			show("Guess The Number Between " + minNum + " and " + maxNum);

			userNum = input.nextInt();

			if (userNum == rndNum) {
				show("Congratulations. You guessed the number!");

				show("to play Again type y");
				userAgain = input.next();

				if (userAgain.equals("y")) {
					rndNum = rndGenerator(minNum, maxNum);
				} else {
					show("Thank You ! Bye");
				}

			} else {
				if (userNum > rndNum) {
					message = "Too high";
				} else if (userNum < rndNum) {
					message = "Too Low";
				}
				show(message);
			}

		}

	}

}




/// main class
package com;

public class Test {

	public static void main(String[] args) {
		/*
		 * Write an application that plays “guess the number” as follows: Your
		 * program chooses the number to be guessed by selecting a random
		 * integer in the range 1 to 1000. The application displays the prompt
		 * Guess a number between 1 and 1000 . The player inputs a first guess.
		 * If the player's guess is incorrect, your program should display Too
		 * high. Try again. or Too low. Try again. to help the player “zero in”
		 * on the correct answer. The program should prompt the user for the
		 * next guess. When the user enters the correct answer, display
		 * Congratulations. You guessed the number! , and allow the user to
		 * choose whether to play again
		 * 
		 */

		random rnd1 = new random();

		rnd1.guessNumber(0, 20);

	}

}
