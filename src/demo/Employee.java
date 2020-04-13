package demo;

public class Employee extends Object {
	
	// These are examples of class Attributes / Member Variables.
	int empId;
	String empFirstName;
	String empLastName;
	String dob;
	double salary;
	
	// THis is called a Default Constructor.
	public Employee() {
		System.out.println("Somebody called Default Constructor");
		empId = 0;
		empFirstName = "John";
		empLastName = "Doe";
		dob = "1900-01-01";
		salary = 0.0;
	}
	
	// This is a constructor with fields.
	public Employee(int eid, String efname, String elname, String dateofbirth, double sal) {
		System.out.println("Somebody called Constructor with fields");
		this.empId = eid;
		this.empFirstName = efname;
		this.empLastName = elname;
		this.dob = dateofbirth;
		this.salary = sal;
	}





	// This is an example of a Class Member Function
	public String getFullName() {
		return empLastName + ", " + empFirstName;
	}
	

	public String toString() {
		return "[ " + empId + " " + empFirstName + " " + empLastName + " " + dob + " " + salary + " ]";
	}


	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Kalyan","Rani","1983-01-01",120000.00);
		Employee e2 = new Employee();
		
		System.out.println(e1);
		
//		System.out.println(e.empFirstName);
//		System.out.println(e.getFullName());
		
	}
	
	

}
