package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question15ArrayInput {

	/*
	 * Declare an array and take input from user 
	 * Ask user to enter an integer 
	 * Print the index of that integer
	 * 
	 * If number has a duplicate 
	 * Print all the indexes of that number
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int userInput = scanner.nextInt();

		ArrayList<Integer> numbers = new ArrayList<>(List.of(8, 9, 1, 3, 4, 8, 6, 4, 16, 8));

		System.out.println("Output: ");

		for(int i = 0; i < numbers.size(); i++) {
		    if(numbers.get(i) == userInput)
		        System.out.println(i);
		 }
		
		scanner.close();

		System.out.println();
		System.out.printf("Desired output: \nFirst index of 8: %d\nSecond index of 8: %d\nThird index of 8: %d ", 0, 5, 9);
	}
}
