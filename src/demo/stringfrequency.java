package demo;

import java.util.Scanner;

public class stringfrequency {
	
	static void stringoccurance(String s, char ch){
		int count =0;
		char str[] = s.toCharArray();
		char chr = ch;
		for (int i = 0; i < s.length(); i++) {
			  
			    if (str[i] == chr) {
			    // System.out.println(str[i]);
			    	 count++;
			     
			     }
		}
		if (count != 0)
			System.out.print("It occured "+count+" times");
		else 
			System.out.print("this char doest exist");
			   
	}


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence to find");
		String str1 = sc.nextLine();
		System.out.println("Enter the char to find its occurance in the above string");
		char ch = sc.next().charAt(0);
			stringoccurance(str1,ch);
			
			sc.close();
}
	
	
}
