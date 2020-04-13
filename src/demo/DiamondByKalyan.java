package demo;

import java.util.Scanner;

public class DiamondByKalyan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
//		i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
//        space = n - 1;
//        for (j = 1; j <= n; j++) 
//        {
//            for (i = 1; i <= space; i++) 
//            {
//                System.out.print(" ");
//            }
//            space--;
//            for (i = 1; i <= 2 * j - 1; i++) 
//            {
//                System.out.print("*");                
//            }
//            System.out.println("");
//        }
//        space = 1;
//        for (j = 1; j <= n - 1; j++) 
//        {
//            for (i = 1; i <= space; i++) 
//            {
//                System.out.print(" ");
//            }
//            space++;
//            for (i = 1; i <= 2 * (n - j) - 1; i++) 
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
     
        
        
        for (int i = 1 ; i < 2*n + 1 ; i++) {
        	
        	for (int j = 1 ; j < 2*n + 1 ; j++) {
        		
            	if (i + j >= n+1 && j - i <= n-1 && i - j <= n -1 && i + j <= 3*n -1 ) {
        			System.out.print("*");
        		}
        		else
        			System.out.print(" ");
        	}
        	
        	System.out.println();
        	
        }
        
        
	}

}

