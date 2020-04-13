package java_hackerthon;
//Q23. WJP to differentiate input as string, int or bool *
import java.util.Scanner;



public class Q23_Differentiate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		Boolean myBool = Boolean.parseBoolean(str);
		
		if (myBool) {
			System.out.println(str + " is a Boolean");
		} else {
//			System.out.println(str + " is NOT a Boolean");
			
			try {
				Integer myInt = Integer.parseInt(str);
				System.out.println(str + " is an Integer");
				
			} catch (NumberFormatException ne) {
//				System.out.println(str + " is NOT an Integer");
				System.out.println(str + " is a String");
			}
			
		}
		  sc.close();
	}

}
