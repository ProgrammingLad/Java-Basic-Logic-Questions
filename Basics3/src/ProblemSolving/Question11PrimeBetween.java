package ProblemSolving;

import java.util.Scanner;

/*
 * 		Take an integer input from the user 
 * 		Count all prime numbers from 1 up to that number
 * 
 * 		Example:
 * 		If user inputs 20
 * 		Total prime numbers are 8: 1, 3, 5, 7, 11, 13, 17, 19
 * 
 * 		Print smallest prime number = 1
 * 		Print largest prime number = 19
 */
public class Question11PrimeBetween {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please put a number: ");

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int userInput = scanner.nextInt();
		int count = 0;

		boolean isPrime = true;

		System.out.println("Prime numbers between 1-20:" );
		for (int i = 1; i < userInput; i++) {
			isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime && i != 2) {
				System.out.println(i);
				count++;
				
				min = min < i ? min : i;
				max = max > i ? max : i;
			}
			
			
		} 
		scanner.close();
		
		System.out.println();
		
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
		
		System.out.println("Number of prime numbers between 1-20: " + count);
	}
}
