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
		
		System.out.println("Please enter height: ");
		int heightInput = scanner.nextInt();
		
		System.out.println("Please enter box width: ");
		int widthInput = scanner.nextInt();
		
		
		for(int i = 0; i < heightInput; i++) {
			System.out.print("B");
			for(int j = 0; j < widthInput; j++) {
				System.out.print("B");
			}
			System.out.println();
		}
		scanner.close();
		
	}
}
