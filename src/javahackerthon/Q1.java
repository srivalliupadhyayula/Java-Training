package javahackerthon;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		try{ // to catch the exception if the use inputs non boolean value
			boolean a,b,c;
			System.out.println(" Enter a Boolean value for A:");
			a = sc.nextBoolean();
			System.out.println(" Enter a Boolean value for B:");
			b= sc.nextBoolean();
			System.out.println(" Enter a Boolean value for C:");
			c= sc.nextBoolean();
			if ((a== true && b == true)||(c== true && b == true) ||(a== true && c == true))	{	
				System.out.println("Testcase pass");
			}
			else
				System.out.println("testcase failed");
		}
		catch (Exception e){
			System.out.println("An exception is thrown "+e);
		}
		finally{
		sc.close();
		}
	}

		
	
}
