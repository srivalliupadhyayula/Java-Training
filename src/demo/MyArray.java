package demo;

import java.util.Arrays;
import java.util.HashMap;

public class MyArray {
	
	// Member variable
	private int[] arr;
	
	// Constructor
	public MyArray(int[] n) {
		arr = n;
	}
	
	// Member function
	public void displayArray() {
		System.out.println("You have invoked displayArray func");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
	public int size() {
		return arr.length;
	}
	
	
	public MyArray bubbleSort() {
		
		int[] copyArr = Arrays.copyOf(arr, arr.length);
		

		for (int i= 0 ; i < copyArr.length - 1 ; i++) {
			
			for (int j = i+1 ; j < copyArr.length ; j++) {
				
				if (copyArr[i] > copyArr[j]) {
					int t = copyArr[i];
					copyArr[i] = copyArr[j];
					copyArr[j] = t;
				}
				
			}
			
		}
			
		return new MyArray(copyArr);
		
	}
	
	
	// Calculate frequency
	public HashMap<Integer, Integer> calculateFrequency() {
		
		HashMap<Integer, Integer> myFreq = new HashMap<Integer, Integer>();
		
		for (int e : arr) {
			Integer freq = myFreq.get(e);
			
			if (freq == null) {
				myFreq.put(e, 1);
			} else {
				myFreq.put(e, freq+1);
			}
		}
		
		return myFreq;
	}
	
	public String toString() {
		System.out.println("You have invoked toString func");
		StringBuffer sb = new StringBuffer();
		
		for (int i : arr) {
			sb.append(i + " ");
		}
		
		return new String(sb);
	}
	
	
	// static void main
	public static void main(String[] args) {
		int[] n = {1,2,1,3,2,1,2,4,5,2,1};
		
		MyArray af = new MyArray(n);
		
		af.displayArray();
		
		System.out.println(af.size());
		
		System.out.println(af.calculateFrequency());
		
		System.out.println(af.bubbleSort());
		
		af.bubbleSort().displayArray();
		
	}

}
