//Q30. Write a function to find out longest palindrome in a given string?
import java.util.Scanner;

public class Q30_LongestPalindrome {
	public String findTheLongestPalindrome(String str){
        if (str == null) {
            return null;
        }
        String longestPalindrome = String.valueOf(str.charAt(0));
        for (int i = 0; i < str.length() - 1; i++) {
            String returnedPalindrome = findLongestPalindromeWithSpecifiedParameter(str, i, i);
            if (returnedPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = returnedPalindrome;
            }
            returnedPalindrome = findLongestPalindromeWithSpecifiedParameter(str, i, i + 1);
            if (returnedPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = returnedPalindrome;
            }
        }
        return longestPalindrome;
    }

    public String findLongestPalindromeWithSpecifiedParameter(String str, int left, int right) {
        if (left > right)
            return null;

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to find the longest palindrome");
		String s = sc.nextLine();
		
		Q30_LongestPalindrome longestPalindrome = new Q30_LongestPalindrome();
		
		
        System.out.println("Longest palindrome in "+longestPalindrome.findTheLongestPalindrome(s) );
       // System.out.println("Longest palindrome in abcba is " + longestPalindrome.findTheLongestPalindrome("abcba"));
	sc.close();
	}

}
