package java_hackerthon;
import java.util.Scanner;

public class Q2_Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a;
		double fact =1;
		
		System.out.println("Enter a number to find its factorial: ");
		
		a = sc.nextInt();
		for (int i = 1; i<= a ; i++){
			fact = fact*i;
		}
			System.out.println(" Factorial of "+a+" is : "+fact);
		
		sc.close();
	}

}
