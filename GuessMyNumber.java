package helloProgram;

import java.util.*;

public class GuessMyNumber {
	public static void main(String[] args) {
		// pick a random number
		Random random = new Random();
		int number = random.nextInt(100) + 1;

		int userGuess;
		int different;

		// Scanner
		Scanner in = new Scanner(System.in);

		System.out.println("I'm thinking of a number between 1 and 100, including both. Can you guess what it is?");
		System.out.print("Type a number: ");

		// get the number user guessed
		userGuess = in.nextInt();

		System.out.println("Your guess is: " + userGuess);
		System.out.println("The number I was thinking of is: " + number);

		// difference between random number and the number user guess
		different = Math.abs(number - userGuess);
		System.out.println("You were off by: " + different);
	}
}
