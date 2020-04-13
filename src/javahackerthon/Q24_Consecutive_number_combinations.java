/*Q24. Write a program which inputs a positive natural number N and 
 * prints the possible consecutive number combinations, 
 * which when added give N. INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4 */
import java.util.ArrayList;
import java.util.Scanner;

public class Q24_Consecutive_number_combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find its consecutive number combinations :");
		
		int num = sc.nextInt();
		int total;
		
		for (int i = 1; i<=num/2 ; i++){
			total = 0;
			int j = i;
			ArrayList<Integer> combi = new ArrayList<Integer>();
			//combi.add(i);
			
			while(total <= num ){
				
				total = total+j;
				combi.add(j);
				if(total==num){
				
					System.out.println(combi);
					break;
				} else {
					if(total<num){
						j++;
						
					}else{
						break;
					}
				}
			}
			
		}
			
		
		
		sc.close();
		
	}

}
