package demo;

import java.util.Scanner;

public class FactorialGenerator {
	
//	int n;
//	
//	public FactorialGenerator(int n) {
//		this.n = n;
//	}
	
	public static double getFactorial(int n) {
		double fact = 1.0;
		
		for (int i = 1 ; i <= n ; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	public static int getIntFactorial(int n) {
		int fact = 1;
		
		for (int i = 1 ; i <= n ; i++) {
			fact *= i;
		}
		
		return fact;
	}
	

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number to know its factorial value");
		
//		FactorialGenerator f = new FactorialGenerator();
		
		System.out.println(FactorialGenerator.getFactorial(6));
		System.out.println(FactorialGenerator.getFactorial(7));
		System.out.println(FactorialGenerator.getFactorial(30));
		
		System.out.println(FactorialGenerator.getIntFactorial(6));
		System.out.println(FactorialGenerator.getIntFactorial(7));
		System.out.println(FactorialGenerator.getIntFactorial(30));
		
	}

}
