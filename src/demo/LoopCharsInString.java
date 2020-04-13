package demo;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LoopCharsInString {
	
	public static void main(String[] args) {
		
		String s = "AllTheCharactersInMyString";
		
		
		// One way of looping through all characters in a string
		for (int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			System.out.println("Char at position "+i+" is: "+c);
		}
		
		
		System.out.println();
		
		// Another way is using enhanced for loop on char array.
		
		int i = 0;
		for (char c : s.toCharArray()) {
			System.out.println("Char at position "+i+" is: "+c);
			i++;
		}
		
		
	}

}
