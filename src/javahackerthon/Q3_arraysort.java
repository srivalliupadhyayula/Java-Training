import java.util.Scanner;

public class Q3_arraysort {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int a = sc.nextInt();
		int [] arr = new int [a];
		int temp;
		
		
		System.out.println(" Enter the elements in Array: ");
		for (int i = 0; i < arr.length; i++) {
			
				arr[i] = sc.nextInt();
		}
		
		 System.out.print("Element of array before sort : [");
		for (int i = 0; i < arr.length; i++){ 
			System.out.print(arr[i]+","); }
		System.out.print("]");
		
	     
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0 ; j < arr.length ;  j++){
				
				if(arr[i]<arr[j]){
					
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println();
		System.out.print("Element of array After sort : [");
		for (int i = 0; i < arr.length; i++){ 
			System.out.print(arr[i]+","); }
		System.out.print("]");
	sc.close();
	}
}
