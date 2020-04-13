package collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Class9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<student> liStudent= new LinkedList<>();
		liStudent.add(new student("John", 010));
		liStudent.add(new student("Alex", 002));
		liStudent.add(new student("Bob", 321));
		liStudent.add(new student("Max", 004));
		liStudent.add(new student("Mary", 005));
		
		
		
		Iterator<student> It = liStudent.iterator();
		//liStudent.descendingIterator();
		while(It.hasNext()) {
			student temp = It.next();
				System.out.println("I found ID :: "+temp.Regno +"\t Name :: "+temp.name);
				
			
		}
		//Collections.sort(liStudent);
		
		
		
	}

}
