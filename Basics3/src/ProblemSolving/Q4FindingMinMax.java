package ProblemSolving;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * 	Ask user to input 10 numbers
 * 	Store value inside array
 * 
 * 	Print out the smallest value
 * 	Print out the largest value
 * 
 * 	If user enters duplicate number
 * 	Remove duplicate number
 * 
 */
public class Q4FindingMinMax {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = 0;

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		Set<Integer> numbers = new TreeSet<>();

		while (count != 10) {

			System.out.println("Please enter a number: ");
			Integer userInput = scanner.nextInt();

			numbers.add(userInput);

			count++;

		}

		System.out.println("Now displaying numbers stored inside Set: ");

		for (var number : numbers) {
			System.out.println(number);

			min = number > min ? min : number;
			max = number < max ? max : number;
		}

		System.out.println();

		System.out.println("Least value inside array: " + min);
		System.out.println("Greatest value inside array: " + max);

		scanner.close();
	}
}
