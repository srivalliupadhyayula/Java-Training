package demo;

import java.util.Scanner;

public class Calculaterswitch {
	
	static void add(int a, int b){
		 System.out.println("the Answer is "+(a+b));
	}
	
	static void sub(int a, int b){
		 System.out.println("the Answer is "+(a-b));
	}
	static void mul(int a, int b){
		 System.out.println("the Answer is "+(a*b));
	}
	static void div(int a, int b){
		 System.out.println("the Answer is "+(a/b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Pls enter the number for which you want to perform the operations" );
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		 System.out.println(
		"Enter the operation you want to perform "
		 + "\n 1 for Addition "
		 + "\n 2 for substraction"
		 + "\n 3 for multiplication"
		 + "\n 4 for division");
		 int ops = sc.nextInt();
		 
		 switch (ops){
		 case 1:
			add(a,b);
			 break;
		 case 2:
			 sub(a,b);
			 break;
		 case 3:
			 mul(a,b);
			 break;
		 case 4:
			div(a,b);
			 break;
		default:
			 System.out.println("invalid operation");			 
		 }
	}
	
}


