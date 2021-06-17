package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*
 *  Declare array with random numbers
 *  Take two integer input from the user
 * 
 * 	Find index of those numbers
 * 	And change them with the number user input
 * 
 * 	If 98 is at index 2
 * 	& 
 * 	If 100 is at index 7
 * 
 * 	Index 2 should coultain 100
 * 	Index 7 should countain 98
 */
public class Question16ArrayReplaceIndex {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		List<Integer> numbers = new ArrayList<>(List.of(7, 2, 98, 48, 27, 34, 100, 48));
			
		System.out.println("Going through old array: ");

		for (Integer number : numbers) {
			System.out.printf("%d ", number);
		}

		System.out.println("\n");

		
		
		//First number
		System.out.println("First number you would like to replace? ");
		int userInput = scanner.nextInt();
		int value = userInput;
		
		System.out.println("Second number you would like to replace? ");
		int userInput2 = scanner.nextInt();
		int value2 = userInput2;
		
		ListIterator<Integer> it = numbers.listIterator();
		
		while (it.hasNext()) {

			if ((int) it.next() == userInput) {
				it.set(value2);
			}
			
			if ((int) it.next() == userInput2) {
				it.set(value);
			}
		}

		System.out.println();
		System.out.println("Going through new array: ");

		for (Integer number : numbers) {
			System.out.printf("%d ", number);
		}

		scanner.close();
	}
}
