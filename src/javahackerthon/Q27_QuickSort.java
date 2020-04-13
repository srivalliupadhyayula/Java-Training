//Q27. WJP to perform ascending order Quick sort 
import java.util.Arrays;
import java.util.Scanner;

public class Q27_QuickSort {

	public static int[] QuickSort(int[] arr, int elements) {
	      if(elements < 2){     //Base Case
	          return arr;
	      }

	      int current_position=0;   //position of pivot element
	      int temp; //a temporary variable to assist in swapping

	      for(int i=1; i<elements; i++) //Partitioning loop
	      {
	          if(arr[i] <= arr[0])
	          {
	              current_position++;
	              temp = arr[i];
	              arr[i] = arr[current_position];
	              arr[current_position] = temp;

	          }
	      }
	      temp = arr[0]; 
	      arr[0] = arr[current_position]; 
	      arr[current_position] = temp; //Brings pivot to it's appropriate position
	      
	      int[] left = QuickSort(arr,current_position); //sorts the elements to the left of pivot
	      
	      int[] arr2 = Arrays.copyOfRange(arr, current_position+1, elements);//separates elements right of pivot
	      
	      int[] right = QuickSort(arr2, elements-current_position-1); //sorts the elements to the right of pivot
	      
	      int[] final_array = new int[elements]; //final array, to merge everything together
	      
	      for(int i=0; i<current_position; i++)
	      {
	          final_array[i] = left[i]; 
	      }
	      final_array[current_position] = arr[current_position];
	      for(int i=current_position+1; i<elements; i++)
	      {
	          final_array[i] = right[i-current_position-1];
	      }

	    return final_array;

	  }
	public static void main(String[] args) {
	 //array to be sorted
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println(" Enter the size of array");
		a = sc.nextInt();
		int [] array = new int [a];
		System.out.println(" Enter the elements in Array: ");
		for (int i = 0; i < array.length; i++) {
			
			array[i] = sc.nextInt();
		}
		//printing the original array
		System.out.print("Original Array: [");
        for(int i=0; i<array.length;i++)
        {   
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("]");



        array = QuickSort(array, array.length);//sorting 
        
        System.out.print("Sorted Array: ["); //printing the sorted array
        for(int i=0; i<array.length;i++)
        {   
            System.out.print(array[i]);
            System.out.print(" ");
        }
        
        System.out.print("]");
        sc.close();
	}

}
