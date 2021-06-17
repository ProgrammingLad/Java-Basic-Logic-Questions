package ProblemSolving;

import java.util.Scanner;

/*
 * 
 * 	Write a program which asks the user
 * 	How many prime numbers you want to print
 * 	
 *	We have to print that much of prime numbers
 *	Also print the sum of all prime numbers displayed
 *	
 *	If user press 10:
 *	We have to display first 10 prime numbers
 *	
 *	Restrict the user such that input should NOT be negative
 *
 */
public class Question12PrimeAndSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long maxNumbers = 1_000_000_000L;
		int numberOfPrimeNumbers = 0;

		int result = 0;

		boolean isPrime = true;
		boolean running = true;

		System.out.println("How many prime numbers do you want to be printed? ");
		int userInput = scanner.nextInt();

		if (userInput > 0) {
			for (int i = 1; i < maxNumbers; i++) {

				isPrime = true;

				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}

				if (isPrime && i != 2) {
					System.out.println(i);

					result += i;

					numberOfPrimeNumbers++;

					if (numberOfPrimeNumbers == userInput) {
						running = false;
						break;
					}
				}
			}

		} else {
			System.out.println("Sorry, please enter a number that is greater than or equal to 1");
		}

		scanner.close();

		System.out.println();

		if (!running) {
			System.out.println("Number of prime numbers printed: " + numberOfPrimeNumbers);

			System.out.println("Sum of all prime numbers: " + result);
		}

	}
}
