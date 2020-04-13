package demo;

import java.util.Scanner;

public class largest_of_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		System.out.println("To find the largest number");
	System.out.println("Pls enter first number");
	int a = sc.nextInt();
	System.out.println("Pls enter second number");
	int b = sc.nextInt();
	System.out.println("Pls enter third number");
	int c = sc.nextInt();
	
	
	
		  if(a>b && a>c){
			  	
			  		System.out.println(a+" is largest of all three numbers");
		  }
		 else if(b>c) {
			  	System.out.println(b+" is largest of all three numbers");
	}
		  else 
			  System.out.println(c+ " is largest of all three numbers");
	}
	}


