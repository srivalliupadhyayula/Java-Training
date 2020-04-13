package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class S11Q1  {

	public static void main(String[] args) {
	
		LinkedList<S11Q1student> liStudent= new LinkedList<>();
		liStudent.add(new S11Q1student("John", 24));
		liStudent.add(new S11Q1student("Sara", 22));
		liStudent.add(new S11Q1student("Bob", 20));
		liStudent.add(new S11Q1student("skylar", 19));
		liStudent.add(new S11Q1student("Annie", 25));
		
		System.out.println("The Student details before sort:");
		Iterator<S11Q1student> It = liStudent.iterator();
		while(It.hasNext()) {
			S11Q1student temp = It.next();
				System.out.println(" StudentId:"+temp.iId+"\t Name :: "+temp.sName);
			
		}
		System.out.println("---------------------------");
		Collections.sort(liStudent);
		System.out.println("The Student details after sort:");
		Iterator<S11Q1student> It1 = liStudent.iterator();
		while(It1.hasNext()) {
			S11Q1student temp = It1.next();
				System.out.println("StudentId: "+temp.iId+"\t Name :: "+temp.sName);
				 
				
		}
			
	}
}
