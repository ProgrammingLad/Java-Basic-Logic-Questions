package ProblemSolving;

public class Q2IncrementDecrementLoop {

	public static void main(String[] args) {
		
//		Print:		1   10  11  20  21  30 
//					2   9   12  19  22  29 
//					3   8   13  18  23  28 
//					4   7   14  17  24  27 
//					5   6   15  16  25  26 
//					6   5   16  15  26  25 

		for(int i = 1, j = 10, k = 11, l = 20, m = 21, n = 30; i <= 6; i++,j--,k++,l--, m++, n--) {
			System.out.printf("%-3d %-3d %-3d %-3d %-3d %-3d",i ,j, k, l, m, n);
			System.out.println();
		}
	}
}
