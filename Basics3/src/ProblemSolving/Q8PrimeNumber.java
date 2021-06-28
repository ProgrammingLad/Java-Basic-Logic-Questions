package ProblemSolving;

import java.util.Scanner;

/*	Take an integer input from the user
 * 	Print YES if it is a print number 
 * 	Print NO if it is not a prime number
 * 
 */
public class Q8PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input a number: ");
		int userInput = scanner.nextInt();

		boolean primeNumber = true;

		for (int i = 2; i < userInput / 2; i++) {

			if (userInput % i == 0) {
				primeNumber = false;
				break;
			}
		}

		if (!primeNumber) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

		scanner.close();
	}
}