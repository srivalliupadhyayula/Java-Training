package demo;

public class Swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 99;
		int b = 4;

		System.out.println("value of a and b before swapping, a: " + a +" b: " + b);

		a = a*b; 
		b = a/b; 
		a = a/b; 

		System.out.println("value of a and b after swapping , a: " + a +" b: " + b);


	}

}
