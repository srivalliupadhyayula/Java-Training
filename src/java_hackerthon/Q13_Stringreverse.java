package java_hackerthon;
import java.util.Scanner;

public class Q13_Stringreverse {

	public static void main(String[] args) {
		
	
		        System.out.println("Enter the string to reverse it :");
		        
		        Scanner sc = new Scanner(System.in);
		        String str = sc.nextLine();
		        String reverse = "";
		        int n = str.length();
		        
		        for(int i = n - 1; i >= 0; i--)
		        {
		            reverse = reverse + str.charAt(i);
		        }
		        
		        System.out.println("Reversed string is:" + reverse);
		        
		        sc.close();
		    
		    }
		}

	
