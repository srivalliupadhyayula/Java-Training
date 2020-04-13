import java.util.Scanner;

public class Q14_String_word_reverse {

	public static void main(String[] args) {

		System.out.println("Enter the string to reverse it :");
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] words = str.split(" ");
        
        int len = words.length;
        
        for (int i = len-1 ; i >= 0; i--){
        	System.out.print(words[i] + " ");
        }
        
        sc.close();

	}

}
