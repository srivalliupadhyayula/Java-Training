
//Write a Java program to find the average score of two students in three papers. NOTE:
//Given, score of first student is 60, 55 and 70 while 
//score of the second student is 80, 60 and 41. 
//i.e. int[][] score = { {60, 55, 70}, {80, 60, 41} };  

package demo;

public class avgscorearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] score = { {60, 55, 70}, {80, 60, 41} }; 
		int sum=0;
				

		for (int i=0;i<score.length;i++) {
			for(int j =0;j<3;j++){
				sum = sum+score[i][j];
			}
			double avg = sum/3.0;
			System.out.println("sum of the student  "+sum);
			System.out.printf("avg : %.4f ",+avg );// formating the output, 
			System.out.println();
			
			sum=0;
		}
		
//				
	}

}
