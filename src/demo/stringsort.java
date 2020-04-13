package demo;

public class stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "srivalli";
	    char temp = 0;

	    char arr[] = str.toCharArray();
	    for (int i = 0; i < arr.length; i++)
	    {
	      for (int j = 0; j < arr.length; j++)
	      {  
	        if (arr[j] > arr[i])
	        {
	            temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	        
	      }
	    }
	    System.out.println(arr);
	 }
	
	}


