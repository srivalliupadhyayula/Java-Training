package demo;

import java.util.Arrays;
import java.util.Scanner;

public class stringassignment {
	
	static void duplicate(String s){
		int count = 0;
		char str[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			   for (int j = i+1 ; j < s.length(); j++) {
			    if (str[i] == str[j]) {
			     System.out.print(str[j]);
			     count++;
			     break;
			    }
			   }
		}
	System.out.println("\ntotal duplicate string count is "+count);
	}
	
	static void vowelandconsonants(String s){
		int vcount = 0;
		int ccount = 0;
		
		s = s.toLowerCase();
		s = s.replace(" ", "");
		char str[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if(str[i] == 'a' ||str[i] == 'e' ||str[i] == 'i' ||str[i] == 'o' ||str[i] == 'u'){
				vcount++;
	
			}
		
			else 
				ccount++;
		}
			System.out.println("vowels count is "+vcount);
			System.out.println("non vowel count is "+ccount);
	}	
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
	static void removeduplicatestrings(String s){
		String stemp = s;
		/*Im storing in temp string why because the s.length is getting altered 
		 in the second for loop when i replace the duplicate value due to which some 
		 char are not reading and missing eg: Shreenidhi 
		 due to length alteration i is not getting inside the for loop i
		 and is ben print twice  */
		char str[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			   for (int j = i+1 ; j < s.length(); j++) {
			    if (str[i] == str[j]) {
//			    		System.out.println(str[i]);
//			    		System.out.println(str[]);
						stemp = stemp.replaceFirst(Character.toString(str[j]),"" );
			    	
			    }
			   }
		}
		System.out.println(stemp);
	}
	static void containsdigits(String s){
		int i =0;
		for ( i = 0; i < s.length(); i++) {
			 if(s.charAt(i)>'0' && s.charAt(i)<'9'){
				 break;
			 }
		}
		if(i==s.length()){
			System.out.println("the string contains only digits");
		}
		else
			System.out.println("the string is non numeric");
		
			
			
		}
	static  void anagrams(String str1,String str2){
		
		boolean b = false;
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		char charstr1[] = str1.toCharArray();
		Arrays.sort(charstr1);
		char charstr2[] = str2.toCharArray();
		Arrays.sort(charstr2);
		int count=0;
		if(str1.length()==str2.length()){

			for (int i = 0; i < str1.length(); i++) {			   
			    if (charstr1[i] == charstr2[i]) {			        
			    	 count++;	 
			    	 b = true;
			   }			     
			}
			if(count == str1.length()){
				System.out.println(b);}
			else
				System.out.println(false);
		}
		else
				System.out.println(b);
		}
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation you want to perform on ur string"
						+"\n Press \n 1. To find the duplicate characters in a String"
						+ "\n 2. To count a number of vowels and consonants in a String"
						+"\n 3. To count the occurrence of a given character in String"
						+"\n 4. To check if two Strings are anagrams of each other"
						+"\n 5. TO  remove duplicate strings"
						+"\n 6. To check if a string contains only digits");
		int choice = sc.nextInt();
		 sc.nextLine();
		String str1;
		switch(choice){
		case 1:
			System.out.println("Enter the sentence to find");
			 str1 = sc.nextLine();
			//System.out.println(str1);
				duplicate(str1);
		break;
		case 2:
			System.out.println("Enter the sentence to find");
			str1 = sc.nextLine();
				vowelandconsonants(str1);
		break;
		case 3:
			System.out.println("Enter the sentence to find");
			str1 = sc.nextLine();
			System.out.println("Enter the char to find its occurance in the above string");
			char ch = sc.next().charAt(0);
				stringoccurance(str1,ch);
			break;
		case 4:
			System.out.println("Enter the first string to find if they are Anagrams");
			 str1 = sc.nextLine();
		
			System.out.println("Enter the secong string to find if they are Anagrams");
			String str2 = sc.nextLine();
		
				anagrams(str1,str2);
		break;
		case 5:
			System.out.println("Enter the sentence to find");
				 str1 = sc.nextLine();
				removeduplicatestrings(str1);
		break;		
		case 6:
			System.out.println("Enter the sentence to find");
				 str1 = sc.nextLine();
				 containsdigits(str1);
		break;
		default:
			 System.out.println("invalid operation");	
		}
sc.close();
	}

}
