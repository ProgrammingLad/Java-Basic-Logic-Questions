package ProblemSolving;

import java.util.Scanner;

/*
 *		Write a program that asks the base and exponent (power)
 *		from user and print the result
 *		using do while loop
 *		Example: Base 2 - Exponent 3
 *		2*2*2
 */
public class Q5BaseAndExponent {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Please enter a number base: ");
		int base = scanner.nextInt();
		
		
		System.out.println("Please enter a number exponent: ");
		int exponent = scanner.nextInt();
		

		int result = 1;
		int exponentTimes = 1;

		do {
			/* Example: Base 2 Exponent 3
			 * (result*base)
			 * 
			 * result = result(1) * base(2) = result(2)
			 * exponentTimes++ = 2
			 * 
			 * result = result(2) * base(2) = result(4)
			 * exponentTimes++ = 3
			 * 
			 * result = result(4) * base(2) = result(8)
			 * exponentTimes++ = 4
			 * 
			 * Why did exponentTimes reach 4 eventhough exponent is only 3?
			 * Because of <= (greater than or equal)
			 * 
			 * If exponentTimes 3 is equal to exponent 3,
			 * The code will execute one more time
			 * 
			 */
	
			result = result * base;


			exponentTimes++;
			
			System.out.println("exponentTimes inside loop: " + exponentTimes);
			System.out.println();
			
		} while (exponentTimes <= exponent);
		
		scanner.close();
		System.out.println("Base number is: " + base);
		System.out.println("Exponent number is: " + exponent);
		
		System.out.println();
		
		
		System.out.println("Result is:  " + result);

	}
}
