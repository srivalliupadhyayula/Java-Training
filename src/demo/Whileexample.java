package demo;

import java.util.Scanner;

public class Whileexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pls enter the number of rows you want for lefttriangle");
		int n = sc.nextInt();
		
		int i=1;
		
	
		while(i<=n){
			int j=1;
			while( j<=i){
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
		}
		
//		for(int i =1;i<=n;i++){
//		
//			for(int j=1;j<=i;j++){
//				System.out.print("*");
//				}
//			System.out.println();
//			}
	}
}
	
	


