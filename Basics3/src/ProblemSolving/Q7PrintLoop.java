package ProblemSolving;

/*
 * 	print- using loops:      
 * 	  						 $$
 *   				   	    $$$$
 *   				  	   $$$$$$
 *  				 	  $$$$$$$$
 * 						 $$$$$$$$$$
 * 				   		$$$$$$$$$$$$
 */
public class Q7PrintLoop {

	public static void main(String[] args) {

		for (int column = 6; column >= 1; column--) {
			for(int row = 1; row <= column; row++) {
				System.out.print(" ");
			}
			
			for(int row2 = 6; row2 >= column; row2--) {
				System.out.print("$");
			}
			for(int row3 = 6; row3 >= column; row3--) {
				System.out.print("$");
			}
			
			
			System.out.println();

		}

	}
}
