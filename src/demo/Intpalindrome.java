package demo;

public class Intpalindrome {
	
	public static void main(String[] args) {
		
		int num = 1221;
		
		
		String s = "" + num;
		
		int n = s.length();

		// -----------------------------------------------------
		
		// Compare 1st char with last char, 2nd with 2nd last and so on... 
		
		boolean palin = true;
		
		for (int i = 0 ; i < n/2 ; i++) {
			if (s.charAt(i) != s.charAt(n-1-i)) {
				palin = false;
				break;
			}
		}
		
		System.out.println(palin);
		
		
		// -----------------------------------------------------
		
		// Or reverse the string and do compareEquals
		
		String sRev = new String(new StringBuilder(s).reverse());
		
		if (s.compareTo(sRev) == 0) {
			System.out.println(true);
		} else 
			System.out.println(false);
			
		
		
		
	}

}
