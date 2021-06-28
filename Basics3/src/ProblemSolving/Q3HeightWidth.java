package ProblemSolving;

import java.util.Scanner;

/*
 * 	Ask user input that takes height and width
 * 	Print user input pattern
 * 	Should resemble a square/rectangle
 * 	Print using letter: B
 * 
 * 	Restrict user:
 * 	Input should not be equal to 0
 * 
 */
public class Q3HeightWidth {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Height: ");
		int userInput = scanner.nextInt();

		if(userInput == 0) {
			System.out.println("Error, you cant type 0.");
			System.exit(0);
		}
		
		System.out.println("Width: ");
		int userInput2 = scanner.nextInt();
		
		if(userInput2 == 0) {
			System.out.println("Error, you cant type 0.");
			System.exit(0);
		}
		
		for(int i = 0; i < userInput; i++) {
			System.out.print("B");
			for(int j = 1; j < userInput2; j++) {
				System.out.print("B");
			}
			System.out.println();
		}
		scanner.close();
		
	}
}
