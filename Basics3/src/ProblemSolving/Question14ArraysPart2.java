package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 	Initialize integer array with 10 random values
 * 
 * 	Print the second smallest value
 * 	Print the second largest  value
 * 
 */

public class Question14ArraysPart2 {

	public static void main(String[] args) {

		int[] array = { 1, 6, 2, 8, 5 };

		Integer intObj = 0;

		List<Integer> numbers = new ArrayList<>();

		for (int number : array) {

			intObj = (number);

			numbers.add(intObj);
		}

		Collections.sort(numbers);

		System.out.println("Second least value is: " + numbers.get(1));
		System.out.println("Second largest value is: " + numbers.get(3));

	}
}
