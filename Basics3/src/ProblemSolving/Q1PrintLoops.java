package ProblemSolving;

public class Q1PrintLoops {

	public static void main(String[] args) {

//		Print: 	1*****
//				12****
//				123***
//				1234**
//				12345*
//				123456
		
//		for(int i = 1; i <= 6; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			
//			for(int k= 6; k > i; k--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		
		
//		Print: 	12345&
//				1234&&
//				123&&&
//				12&&&&
//				1&&&&&
//				&&&&&&

		
//		for(int i = 6; i >= 1; i--) {
//			
//			for(int j = 1; j < i; j++) {
//				System.out.print(j);
//			}
//			
//			for(int k = 6; k >= i; k--) {
//				System.out.print("&");
//			}
//			System.out.println();
//		}
		
//		Print:	@
//				@@
//				@ @
//				@  @
//				@   @
//				@    @
//				@@@@@@@

	
		System.out.println("@");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("@");
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < 1; k++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println("@@@@@@@");
	}
}
