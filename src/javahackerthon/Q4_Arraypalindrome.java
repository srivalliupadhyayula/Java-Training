import java.util.Scanner;

public class Q4_Arraypalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int a = sc.nextInt();
		int [] arr = new int [a];
		boolean palindrome = true;
		System.out.println(" Enter the elements in Array: ");
		for (int i = 0; i < arr.length; i++) {
		
				arr[i] = sc.nextInt();
		}
		
		System.out.print("Element of Array are : [");
		for (int i = 0; i < arr.length; i++){ 
			System.out.print(arr[i]+",");
		}
			System.out.print("]");
			int len = arr.length;
			
		for(int i =0 ; i < arr.length/2 ; i++){
			
			if(arr[i] != arr[(len-1)-i]){
				palindrome = false;
				break;
			}
				
			}
		// System.out.println(palindrome);
		if(palindrome == true)
			System.out.println(" the Array is Palindrome");
		else
			System.out.println(" the Array is not Palindrome");
		
	sc.close();
	
	}

	}



