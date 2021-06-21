package ProblemSolving2;

public class Question6Factorial {

	/*
	 * Factorial = (!) 
	 * 				!4 = 4x3x2x1 
	 * 				!5 = 5x4x3x2x1
	 */

	public static void main(String[] args) {
		
		int result = 1;
		
		for (int i = 5; i > 0; i--) {
			result *= i;	
		}
		
		System.out.println(result);

	}
}
