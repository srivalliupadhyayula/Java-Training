package demo;

import java.util.Arrays;

public class stringanagram1 {

	public static void main(String[] args) {
		
		String str1 = "keep";
		String str2 = "peek";
		char charstr1[] = str1.toCharArray();
		//Arrays.sort(charstr1);
		
		char charstr2[] = str2.toCharArray();
		//Arrays.sort(charstr2);
		
		for (int i = 0; i < str1.length(); i++) {
			   for (int j = 0 ; j < str2.length(); j++) {
			    if (charstr1[i] == charstr2[j]) {
			    		charstr2[j] = 0;
			    		
			    }
			   }
		}
		

	}
}
