package java_hackerthon;
//Q17. WJP to find total number of integers, uppercase and lowercase character in the give string *
import java.util.HashMap;
import java.util.Scanner;

public class Q17_Types_of_chars {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		String s = sc.nextLine();
		
		HashMap<String, Integer> typesCount = new HashMap<String, Integer>();
		
		typesCount.put("Digits", 0);
		typesCount.put("Uppercase", 0);
		typesCount.put("Lowercase", 0);
		typesCount.put("Others", 0);
		
		for (int i = 0 ; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
			if (c >= '0' && c <= '9') {
				Integer digitCount = typesCount.get("Digits");
				digitCount++;
				typesCount.put("Digits", digitCount);
			} else if ( c >= 'A' && c<= 'Z') {
					Integer upperCount = typesCount.get("Uppercase");
					upperCount++;
					typesCount.put("Uppercase", upperCount);
			} else if (c >= 'a' && c<= 'z' ) {
						Integer lowerCount = typesCount.get("Lowercase");
						lowerCount++;
						typesCount.put("Lowercase", lowerCount);
			} else {
						Integer otherCharsCount = typesCount.get("Others");
						otherCharsCount++;
						typesCount.put("Others", otherCharsCount);
			}
				
			
		}
		
		System.out.println(typesCount);
		
		  sc.close();
		
	}

}
