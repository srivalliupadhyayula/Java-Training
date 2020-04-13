package demo;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		for(;;)
		{
		System.out.println("Pls enter the number for which you want to perform the operations" );
		System.out.println("Enter first number");
		
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		
		int b = sc.nextInt();
		
		 System.out.println(
		"Enter the operation you want to perform "
		 + "\n + for Addition "
		 + "\n - for substraction"
		 + "\n * for multiplication"
		 + "\n / for division");
		 
		 char ops = sc.next().charAt(0);
		 
		 if (ops=='+')
			 System.out.println("the Answer is "+(a+b));
		 else if (ops=='-')
			 System.out.println("the Answer is "+ (a-b));
		 else  if (ops=='/')
			 System.out.println("the Answer is "+(a/b));
		 else if (ops=='*')
			 System.out.println("the Answer is "+(a*b));
		 else
			 System.out.println("invalid operation");
				 
		}
		 
		

	}

}
