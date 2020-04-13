package java_hackerthon;
import java.util.HashMap;
import java.util.Scanner;

public class Q15_UniqueString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string:"); 
		str = sc.nextLine();
		String[] word = str.split(" ");
	// System.out.println("word length : "+word.length);
		
		HashMap<String,Integer> hcount = new HashMap<String,Integer>();
		
		for(String s : word){
			Integer t = hcount.get(s);			
			if(t == null){
				t = new Integer (1);
			}
			else 
				t = t+1;
			hcount.put(s, t);
		}
		System.out.println("Count of each word occurances: "+hcount);
		System.out.println("Unique words the string are : "+hcount.keySet());
		
		sc.close();
		
	}

}
