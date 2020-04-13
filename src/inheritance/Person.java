package inheritance;

public class Person {
	
	String name;
	String dob;
	String address;
	
	
	public Person() {
		
	}
	
	public Person(String name, String dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	
	public String toString() {
		return "Person :"+name + ":" + dob + ":" + address;
	}

}
