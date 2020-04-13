package demo;

import java.util.Scanner;

public class PositiveorNegative_using_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter any Integer");
		int i = sc.nextInt();
		
		if(i>0){
			System.out.println("You entered a positive integer");
		}
		else if(i<0){
			System.out.println("You entered a Negative integer");
		}
		else
			System.out.println(" you entered Zero");
					
				

	}

}
