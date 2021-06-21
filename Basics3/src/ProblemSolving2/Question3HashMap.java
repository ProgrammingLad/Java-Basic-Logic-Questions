package ProblemSolving2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Question3HashMap {

	public static void main(String[] args) {

		// Q #5) Write a Java Program to count the number of words in a string using
		// HashMap.

//		String longText = "Can you count how many words are here in long text";
//		
//		String[] split = longText.split(" ");
//		
//		Integer count = 0;
//		
//		Map<Integer, String> numberCounter = new HashMap<>();
//		
//		
//		for(int i = 0; i < split.length; i++) {
//			count++;
//			numberCounter.put(count, split[i]);
//		}
//		
//		System.out.println("Now displaying number of words inside map: ");
//		
//		for(var map: numberCounter.entrySet()) {
//			int key = map.getKey();
//			String value = map.getValue();
//			
//			System.out.printf("%d: %-10s \n" ,key, value);
//		}
//		
//		System.out.println("\n");
//		
//		System.out.println("Number of words inside the map: " + split.length);

//		Q #5) Write a Java Program to count the number of words in a string using HashMap.

		String duplicateText = "Hello hello hello Eugene eugene EugEne Hey hEy HEY";
		String[] split = duplicateText.toLowerCase().split(" ");

		int count = 1;

		Map<String, Integer> words = new HashMap<>();

		for (int i = 0; i < split.length; i++) {

			if (words.containsKey(split[i])) {

				count = words.get(split[i]);
				words.put(split[i], count + 1);
				
			} else {
				words.put(split[i], 1);
			}

		}

		for (var word : words.entrySet()) {

			String text = word.getKey();
			int numberOfWords = word.getValue();

			System.out.println("Word: " + text + "\tCount: " + numberOfWords);
		}
		
		
	}
}
