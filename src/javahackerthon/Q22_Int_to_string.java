//Q22. WJP to convert int to string *
import java.util.Scanner;

public class Q22_Int_to_string {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your num: ");
		int num = sc.nextInt();
		
		String s = "" + num;
		
		System.out.println(s);
		  sc.close();
	}

}
