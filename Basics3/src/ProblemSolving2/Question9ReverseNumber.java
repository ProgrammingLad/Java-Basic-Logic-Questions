package ProblemSolving2;

public class Question9ReverseNumber {

	public static void main(String[] args) {

		int numbers = 54321;

		String convertToString = String.valueOf(numbers);

		char[] charArray = convertToString.toCharArray();

		String reverse = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse += charArray[i];
		}

		int numbersReversed = Integer.parseInt(reverse);

		System.out.println(numbersReversed);

	}
}
