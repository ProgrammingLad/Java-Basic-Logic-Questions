package ProblemSolving2;

public class Question7Fibonacci {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 1;
		
		for(int i = 0; i < 20; i++) {
			a = b;
			b = c;
			c = a + b;
			
			System.out.print(a + " ");
		}
		
	}
}
