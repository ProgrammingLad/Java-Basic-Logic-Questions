package ProblemSolving2;

public class Question2ReverseVariable {

	public static void main(String[] args) {
		
		
		//	Q #3) Write a Java Program to swap two numbers using the third variable.
		
		int x = 38;
		int y = 40;
		
		System.out.println("x: " + x + "\n" + "y: " + y);
		
		int store = x;
		x = y;
		y = store;
		
		System.out.println();
		System.out.println("x: " + x + "\n" + "y: " + y);
		
		System.out.println("\n");
		
		//	Q #4) Write a Java Program to swap two numbers without using the third variable.
		
		int x2 = 38;
		int y2 = 40;
		
		System.out.println("x: " + x2 + "\n" + "y: " + y2);
		
		System.out.println();
		
		x2 = x2 + y2;
		y2 = x2 - y2;
		x2 = x2 - y2;
		
		System.out.println("x: " + x2 + "\ny: " + y2);
		
		
	}
}
