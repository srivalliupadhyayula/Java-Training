package java_hackerthon;
//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string
import java.util.HashMap;
import java.util.Scanner;

public class Q20_repeated_digs_chars {

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
		
		System.out.println("The characters which occur more than once are:");
		
		for (Character c : charCount.keySet()) {
			
			Integer count = charCount.get(c);
			
			if (count > 1) {
				System.out.println("'"+c+"':"+count+" times.");
			}
		}

			
		  sc.close();
	}

}
