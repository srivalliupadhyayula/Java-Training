import java.util.Scanner;

public class Q6_Selection_Sort {

	void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q6_Selection_Sort ob = new Q6_Selection_Sort(); 
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println(" Enter the size of array");
		a = sc.nextInt();
		int [] array = new int [a];
		System.out.println(" Enter the elements in Array: ");
		for (int i = 0; i < array.length; i++) {
			
			array[i] = sc.nextInt();
		}
		
       
        ob.sort(array); 
        System.out.println("Sorted array"); 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
        
        sc.close();
	}

}
