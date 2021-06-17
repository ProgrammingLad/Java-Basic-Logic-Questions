package ProblemSolving;



/* 
 * 	Take two integer arrays of 10 indices each and initialize them
 * 
 * 	Copy the contents of both of the arrays in a third array
 * 	Consecutive index from one array at a time
 * 	
 */
public class Question13Arrays {

	public static void main(String[] args) {

		int arrayIndex = 0;

		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array2 = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		

		int arraySize = array1.length + array2.length;
		int[] array3 = new int[arraySize];
		

		for (int i = 0; i < array1.length; i++) {
			array3[arrayIndex++] = array1[i];
			array3[arrayIndex++] = array2[i];
		}
		

		for (int number : array3) {
			System.out.println(number);
		}

	}
	
}
