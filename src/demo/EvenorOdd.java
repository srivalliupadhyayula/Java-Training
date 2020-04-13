package demo;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number to find if its an Even number or an Odd number");
			int i = sc.nextInt();
			int a = i%2;
//					System.out.println(a);
			if ((a)== 0)
			{
				
				System.out.println(i+" is an even number");
			}
			else 
				System.out.println(i+" is an odd number");
	}

}
