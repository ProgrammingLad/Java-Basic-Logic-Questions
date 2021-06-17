package ProblemSolving;

/*
 * 	Using for loop:
 * 	Print the Product of all odd numbers 
 * 	From 1 to 20
 * 	
 *	Print the Sum of all even numbers	
 *	From 1 to 100
 *
 */
public class Q6OddNumbers {

	public static void main(String[] args) {

		int result1 = 1;
		
		System.out.println("Printing odd numbers from 1-20");

		for (int i = 1; i <= 20; i++) {
			
			if (i % 2 == 1) {
				System.out.println(i);
				result1 = result1 * i;
			}
		}
		
		System.out.println("Product of all odd numbers from 1-20: " + result1);

		System.out.println("\n");

		int result2 = 0;
		
		System.out.println("Printing even numbers from 1-100");
		
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
				result2 += i;
			}
		}
		
		System.out.println("Sum of all even numbers from 1-100: " + result2);
	}
}
