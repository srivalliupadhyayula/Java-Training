//Q19. WJP to display number of occurrence of all character *

import java.util.HashMap;
import java.util.Scanner;

public class Q19_Freq_chars {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		String s = sc.nextLine();
		
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for (int i = 0 ; i < s.length() ; i++) {
			
			Integer count = charCount.get(s.charAt(i));
			
			if (count == null) {
				count = 1;
			} else {
				count++;
			}
			
			charCount.put(s.charAt(i), count);
		}
		
		System.out.println(charCount);
		System.out.println();
		  sc.close();
	}

}
