package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 	Declare an array and take input from user
 * 	Ask user to enter an integer
 * 	Print index number of that integer
 * 
 * 	If number has a duplicate
 * 	Print all the indexes of that number
 * 
 */
public class Question15ArrayInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(8, 9, 1, 3, 4, 8, 6, 4));
		
		
		System.out.println("What index do you want to get outt of the array?");
		
		Integer indexGetter = numbers.get(scanner.nextInt() - 1);
		
		System.out.println("Value: " + indexGetter);
		
		scanner.close();
		
		
	}
}
