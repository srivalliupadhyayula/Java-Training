package demo;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		int[] iArr = {1,3,5,7,9};
		
		
		for (int i : iArr) {
			System.out.println(i);
		}
		
		System.out.println();
		char[] cArr = {'a','e','i','o','u'};
		
		for (char c: cArr) {
			System.out.println(c);
		}
		
		
		String s = "qwerty keyboard";
		
		
		char[] stringCharArray = s.toCharArray();
		
		
		for (char c : stringCharArray) {
			System.out.println(c);
		}
		
		
		for (int i = 0 ; i < s.length() ; i++) {
			
			System.out.println(s.charAt(i) + " is same as "+ stringCharArray[i]);
		}
		
		
		// String s = "QWERTY";
		// char[] cArr = {'Q','W','E','R','T','Y'};
		
		// s.charAt(0);
		// cArr[0];
		
		
	}

}
