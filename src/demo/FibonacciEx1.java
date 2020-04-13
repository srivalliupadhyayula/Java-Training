package demo;

import java.util.Scanner;

public class FibonacciEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n1=0,n2=1,n3,i,count;    
		 System.out.println("Enter the count of Fibonacci series ");
		 Scanner sc = new Scanner(System.in);
		 count = sc.nextInt();
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed . 
			 //if give 0 the count is disturbed and printing two more than the count   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}

}
