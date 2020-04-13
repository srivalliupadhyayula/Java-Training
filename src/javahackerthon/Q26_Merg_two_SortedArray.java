
import java.util.Arrays;
import java.util.Scanner;


public class Q26_Merg_two_SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in the 1st array:");
		int n1 = Integer.parseInt(sc.next());
		
		int[] arr1 = new int[n1];
		
		System.out.println("Enter number of elements in the 2nd array:");
		int n2 = Integer.parseInt(sc.next());
		
		int[] arr2 = new int[n2];
		

		System.out.println("Enter elements of 1st array in a loop (* to stop)");
		int i = 0;
		while (true) {
			String s = sc.next();
			
			if ( s.charAt(0) == '*')
				break;

			int n = Integer.parseInt(s);
			
			arr1[i] = n;
			i++;
			
			if (i == arr1.length) {
				System.out.println("Thank you Array1 is full. Now enter the 2nd array");
				break;
			}
		}
		
				
		System.out.println("Enter elements of 2nd array in a loop (* to stop)");
		i = 0;
		while (true) {
			String s = sc.next();
			
			if ( s.charAt(0) == '*')
				break;

			int n = Integer.parseInt(s);
			
			
			arr2[i] = n;
			i++;
			
			if (i == arr2.length) {
				System.out.println("Thank you. Array2 is full.");
				break;
			}
		}
		
		System.out.println("Before moving elements");
		
		for (int j : arr1) {
			System.out.print(j + " ");
		}
		
		System.out.println();
		
		for (int j : arr2) {
			System.out.print(j + " ");
		}

		System.out.println();

		// 1 3 5 7 9 0 0 0 0 0		-- 10
		// 2 4 6 8 10				-- 5
		
		for (i = 0 ; i < arr2.length ; i++) {
			arr1[n2+i] = arr2[i];
		}
		
		System.out.println("After moving elements");

		
		for (int j : arr1) {
			System.out.print(j + " ");
		}
		
		System.out.println();
		
		
		 Arrays.sort(arr1);
		 System.out.println("After sorting");
		 for (int j : arr1) {
				System.out.print(j + " ");
			}
		sc.close();	
	}

}
