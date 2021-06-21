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

		int[] array = { 7, 2, 98, 48, 27, 34, 100, 48 };

		Integer intObj = 0;

		List<Integer> numbers = new ArrayList<>();

		System.out.println("Now displaying array list: ");

		for (int number : array) {
			intObj = number;

			numbers.add(intObj);

			System.out.println(number);
		}

		System.out.println();

		System.out.println("Please enter number to replace: ");
		int userInput = scanner.nextInt();

		System.out.println("Please enter second number to replace: ");
		int userInput2 = scanner.nextInt();

		ListIterator<Integer> it = numbers.listIterator();

		while (it.hasNext()) {
			Integer it2 = it.next();

			if (it2 == userInput) {
				it.set(userInput2);
			}

			if (it2 == userInput2) {
				it.set(userInput);
			}

		}

		System.out.println("Now displaying updated list with replacement: \n");
		for (Integer number : numbers) {
			System.out.println(number);
		}

	}
}
