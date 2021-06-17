package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 	Create two arrays
 * 	Put random values in both arrays
 * 
 * 	Swap values of both arrays
 */
public class Question18SwapArrayValues {

	public static void main(String[] args) {
		
		List<Integer> oddNumbers = new ArrayList<>(List.of(1, 3, 5, 7, 9));
		
		List<Integer> evenNumbers = new ArrayList<>(List.of(2, 4, 6, 8, 10));
	
		List<Integer> storage = new ArrayList<>();
		storage.addAll(evenNumbers);
		
		
		evenNumbers.removeAll(evenNumbers);
		evenNumbers.addAll(oddNumbers);
		
		
		oddNumbers.removeAll(oddNumbers);
		oddNumbers.addAll(storage);
		
		
		System.out.println("Now going through even numbers: ");
		for(Integer number: evenNumbers) {
			System.out.println(number);
		}
		
		System.out.println();
		
		System.out.println("Now going through all odd numbers: ");
		for(Integer number: oddNumbers) {
			System.out.println(number);
		}
	}

}
