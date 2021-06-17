package ProblemSolving;

import java.util.Scanner;

/*	
 * 	Take two numbers from the user
 * 
 * 	Print the result of multiplication
 * 	Print the sum of all the numbers 
 * 	Between these two numbers
 * 	
 * 	Example: 
 * 	First input = 3
 * 	Second input = 8;
 * 
 * 	4+5+6+7 = 22
 * 	4*5*6*7 = 840
 * 
 * 	Restrict user that second numbers must be GREATER than first number
 * 
 */
public class Question10SumAndProduct {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int userInput1;
		int userInput2;
		
		int sum = 0;
		int product = 1;
		
		do {
			
			System.out.println("Please enter your first number: ");
			userInput1 = scanner.nextInt();
			
			System.out.println("Please enter your second number: ");
			userInput2 = scanner.nextInt();
			
			if(userInput1 > userInput2) {
				System.out.println("Error, second number must be greater than first number");
			}
			
			System.out.println();
			
		} while(userInput1 > userInput2);
		
		
		for(int i = userInput1 + 1; i < userInput2; i++) {
				sum += i;
				product *= i;
		}
		
		System.out.println(sum);
		
		System.out.println(product);
		scanner.close();
	}
}
