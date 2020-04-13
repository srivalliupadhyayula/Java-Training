//Q28. WJP to find factorial of a number using recursion *
import java.util.Scanner;

public class Q28_Fractorial_using_Recursion {
	static int factorial(int n){
		if (n == 0)
		return 1;
		else
		return(n * factorial(n-1));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to find the factorial: ");
		int n = sc.nextInt();
		System.out.println(	"Factorial of "+n+" is "+factorial(n));
	sc.close();
	}

}
