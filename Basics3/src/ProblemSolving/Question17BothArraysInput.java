package ProblemSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 	Print all the numbers/words which exist in both the arrays
 * 
 */

public class Question17BothArraysInput {

	public static void main(String[] args) {
		
		//First way of doing it using a set
		List<String> names1 = new ArrayList<>(List.of("Eugene", "Bryan", "Jeun", "Kenneth"));
		
		List<String> names2 = new ArrayList<>(List.of("Ed", "April", "Eugene", "Paul"));
		
		
		Set<String> intersection1 = new HashSet<>(names1);
		intersection1.retainAll(names2);
		
		System.out.println("Same names in both list: " + intersection1);
	
		
		System.out.println();
		
		//Second way of doing it using a for loop
		
		String[] employees1 = {"John", "Marc", "Raj", "Apri", "Eugene"};
		String[] employees2 = {"Eugene", "Kim", "Weng", "Yosh", "Dan", "Trebe", "Jam", "Josh", "Raine", "John"};
		
		
		
		for(int i = 0; i < employees1.length; i++) {
			
			for(int j = 0; j < employees2.length; j++) {
				
				if(employees1[i].equals(employees2[j])) {
					
					System.out.println("Intersection: " + employees1[i]);
				}
			}
		}
		
	
	}
	
}
