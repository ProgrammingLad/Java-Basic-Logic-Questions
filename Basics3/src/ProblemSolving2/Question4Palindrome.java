package ProblemSolving2;

import java.util.Scanner;

public class Question4Palindrome {

	public static void main(String[] args) {

		//	Q #4) Write a Java Program to find whether a string or number is palindrome or not.
		//		  Make the program NOT case sensitive
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word or number to check if its palindrome: ");
		
		String userInput = scanner.nextLine();
		
		String[] split = userInput.split("");
		
		String reverse = "";
		
		for(int i = split.length - 1; i >= 0; i--) {
			reverse = reverse + split[i];
		}
		
		System.out.println(reverse);
		
		if(reverse.equalsIgnoreCase(userInput)) {
			System.out.println("Word entered is palindrome");
		}
		else {
			System.out.println("Word entered is not palindrome");
		}
		
		scanner.close();
	}
}
