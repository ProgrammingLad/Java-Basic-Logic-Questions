package ProblemSolving2;

import java.util.Scanner;

public class Question5Vowels {

	// Q5: Check if there is a vowel inside a String

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type a word & we will check if it has a vowel: ");
		String userInput = scanner.nextLine();
		
		System.out.println(checkVowel(userInput));
		
		scanner.close();
	}

	public static boolean checkVowel(String input) {

		boolean condition = false;
		
		if(input.toLowerCase().matches(".*[a e i o u].*")) {
			condition = true;
		}
		return condition;

	}
}
