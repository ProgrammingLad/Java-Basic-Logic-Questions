package ProblemSolving;

import java.util.Scanner;

/*
 * 	Ask a user to enter a number/s
 * 	Print how many numbers did the user input
 * 
 * 	Example: 
 * 			12345 = 5 Numbers
 * 			8795  = 4 Numbers
 *  
 */
public class Q9Numbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int userInput = scanner.nextInt();

		String convert = Integer.toString(userInput);

		System.out.println(convert.length());

		scanner.close();

	}
}
