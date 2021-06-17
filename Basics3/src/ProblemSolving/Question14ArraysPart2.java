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

		// First way of doing it

		List<Integer> arrayList = new ArrayList<>(List.of(1, 9, 18, 16, 81, 64, 37, 419, 48, 891));

		Collections.sort(arrayList);

		System.out.println("Arrays are now sorted from least to greatest value\n");

		System.out.println("Now going through values of first array....");

		for (Integer number : arrayList) {

			System.out.print(number + " ");
		}

		System.out.println("\n");

		System.out.printf("Size of array: %d \n\n", arrayList.size());

		System.out.println("Second smallest value inside array: " + arrayList.get(1));
		System.out.println("Second largest value inside array: " + arrayList.get(8));

		System.out.println("\n");
		
	}
}
