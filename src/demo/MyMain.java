package demo;

public class MyMain {
	
	public static void main(String[] args) {
		
		StaticVsNonStatic s1 = new StaticVsNonStatic();
		
//		s1.n1;
		
		StaticVsNonStatic.counter++;
		
	}

}
