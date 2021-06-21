package ProblemSolving2;

import java.util.Scanner;




public class Question1StringReverse {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//		Q #1) Write a Java Program to reverse a string without using String inbuilt function.
		
//		String name = "Eugene";
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append(name);
//		sb.reverse();
//		
//		System.out.println(sb);
		
		
// 		Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse().

		//First method
		//Using split
		
		System.out.println("Please enter a text: ");
		
		String userInput1 = scanner.nextLine();
		
		String[] split = userInput1.split("");
		
		for(int i = split.length - 1; i >= 0; i--) {
			System.out.println(split[i]);
		}
		
		
		
		
		//Second method
		//Using char to seperate word into letters
		
		System.out.println("Please enter a text: ");
		String userInput2 = scanner.nextLine();
		
		char[] letters = userInput2.toCharArray();
		
		for(int i = letters.length -1; i >= 0; i--) {
			System.out.println(letters[i]);
		}
		
		//Third method
		//Using built it charAt
		
		System.out.println("Please enter a text: ");
		
		String reverse = "";
		String userInput3 = scanner.nextLine();
		
		int length = userInput3.length();
		
		for(int i = length -1; i >= 0; i--) {
			reverse = reverse + userInput3.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		
		scanner.close();
		
		
		
	}
}
