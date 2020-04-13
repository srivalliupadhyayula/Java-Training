import java.util.HashMap;
import java.util.Scanner;
//Q5. Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers. 
public class Q5_arrayunique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println(" Enter the size of array");
		a = sc.nextInt();
		int [] arr = new int [a];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter the elements in Array: ");
				arr[i] = sc.nextInt();
		}
		System.out.print("["); 
		
		for(int element : arr){
		   System.out.print(element+",");		
		 }
		 System.out.print("] \n");
		HashMap <Integer,Integer> hcount = new HashMap<Integer,Integer>();
		
		for( int i : arr){
			
			Integer t = hcount.get(i);
			
			if(t == null){
				t = new Integer (1);
			}
			else 
				t = t+1;
			
			hcount.put(i, t);
			
		}
		
		System.out.println("Count of each occurances: "+hcount);
		System.out.println("Unique numbers of array are : "+hcount.keySet());
		//System.out.println(hcount.size());
	
	sc.close();
	}
}


	



