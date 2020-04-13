package demo;

public class StringSplit {
	
	public static void main(String[] args) {
		
		
		String s = "This is a string separated by spaces";
		
		String[] sarr1 = s.split(" ");
		display(sarr1);

		String[] sarr2 = s.split(" ", 3);
		display(sarr2);
		
		
		String s1 = "Srivalli,Upadhyayula,QA";
		
		String[] s1arr1 = s1.split(",");
		display(s1arr1);

		String[] s1arr2 = s1.split(",", 2);
		display(s1arr2);
		
	}
	
	public static void display(String[] myarr) {
		
		for (String s : myarr) {
			System.out.println(s);
		}
		
		System.out.println("The length of this array is:"+myarr.length);
		System.out.println();
	}

}
