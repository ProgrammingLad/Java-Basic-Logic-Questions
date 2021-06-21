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
		
		int[] array = {8, 9, 1, 3, 4, 8, 6, 4, 16, 8};
		
		Integer intObj = 0;
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int number: array) {
			
			intObj = number;
			
			numbers.add(intObj);
		}
		
		for(int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i) == userInput) {
				System.out.println("Index of number inside array: " + i);
			}
		}
		
		scanner.close();
	}
}
