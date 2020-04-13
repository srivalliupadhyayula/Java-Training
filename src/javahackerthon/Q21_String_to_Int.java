//Q21. WJP to convert string to int.
import java.util.Scanner;

public class Q21_String_to_Int {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String (number): ");
		String s = sc.nextLine();
		
		int num = Integer.parseInt(s);
		
		System.out.println(num);
		  sc.close();
	}

}
