package ProblemSolving2;

public class Question9CapitalizeFirstLetter {

	public static void main(String[] args) {

		String name = "eugene symone reyes";
		
		char[] split = name.toCharArray();
		
		boolean foundSpace = true;
		
		for(int i = 0; i < split.length; i++) {
			
			if(Character.isLetter(split[i])) {
				
				if(foundSpace) {
					split[i] = Character.toUpperCase(split[i]);
					foundSpace = false;
				}
			}
			else {
				foundSpace = true;
			}
		}
		
		name = String.valueOf(split);
		
		System.out.println(name);

	}
}
