package java_hackerthon;
import java.util.Scanner;

public class Q12_Stringpalindrome {

	public boolean palin = true;
	public  boolean Stringpal(String s){
		
		int n = s.length();
		
		for (int i = 0 ; i < n/2 ; i++) {
			if (s.charAt(i) != s.charAt(n-1-i)) {
				palin = false;
				break;
			}
		}
		System.out.println(palin);
		return palin;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println(" Enter the string to find if its palindrome");
		s = sc.nextLine();
		s = s.toLowerCase();
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s = s.replaceAll("[-+^]*", "");
		s = s.replaceAll(" ", "");
		Q12_Stringpalindrome sp1 = new Q12_Stringpalindrome();
		sp1.Stringpal(s);
		
		int num;
		System.out.println(" Enter a number to find if its palindrome");
		num = sc.nextInt();
		 s = "" + num;
		
		sp1.Stringpal(s);
		
		sc.close();
	}

}
