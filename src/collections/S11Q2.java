package collections;

import java.util.ArrayList;

public class S11Q2 {

	public static void main(String[] args) {

		ArrayList<String>al = new ArrayList<String>();
		
		
		al.add("Dog");
		al.add("Cat");
		al.add("cow");
		al.add("Hen");
		al.add("Horse");
		
		System.out.println("The Elements in array list are "+ al);
		for(int i=0 ; i < al.size() ; i++)
		System.out.println("Index of "+al.get(i)+" is : "+al.indexOf(al.get(i)));
	}

}
