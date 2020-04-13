package demo;
import java.util.Scanner;



public class stringreverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hi I am Srinidhi";
		
//		System.out.print(str.substring(8, 15)+ " ");
//		System.out.print(str.substring(5, 7) );
//		System.out.print(str.substring(2, 5) );
//		System.out.print(str.substring(0, 2));
		
		String strar[] = str.split("");
//				for(String str1 : strar){
//					System.out.print(str1);
//		  }
	for(int i = (strar.length-1) ; i <=0; i++){
		 
		System.out.print(strar[i]);
	}

	
	
	
	}

}
