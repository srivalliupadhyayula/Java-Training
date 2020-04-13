import java.util.Scanner;

// Write a method that will remove given character from the String
public class Q16_RemoveString {
	public static String charRemoveAt(String str, char ch) {  
		
		StringBuffer sb1 = new StringBuffer();
		
		for (int i = 0 ; i < str.length() ; i++) {

			char c = str.charAt(i);
			
			if (c != ch) {
				sb1.append(c);
			}	
		}
		return new String(sb1);				
     }  
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		System.out.println("Enter the char to be removed");
		char ch = sc.next().charAt(0);
		
		String newString = charRemoveAt(str, ch);
		
		System.out.println(newString);
		
		sc.close();
	}
}
