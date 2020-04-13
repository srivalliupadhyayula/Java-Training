package demo;


public class evenoroddarray {
	
	static int[] arr = {3,5,7,9,11,2,4,6,8,10,};
	
	 static void oddarr()
	 {
		 for(int i=0;i<arr.length;i++){
			 if((arr[i]%2) != 0){
				 System.out.println(arr[i]);
			 }
			
		 }
	 	}
	 static void evenarray()
	 {
		 for(int i=0;i<arr.length;i++){
			 if((arr[i]%2) == 0){
				 System.out.println(arr[i]);
			 }
		
				 
		 }
	 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("odd numbers in the array are");
		oddarr();
		//System.out.println("even numbers in the array are");
		//evenarray();
	}

}
