package inheritance;
;
public class Employee extends Person {
	
	int empId;
	Person empPerson;
	String empDesig;

	
	
	public Employee(Person p, int empId, String empDesig) {
		super(p.name, p.dob, p.address);
		
		this.empId = empId;
		this.empPerson = p;
		this.empDesig = empDesig;
	}

	public void displayDesig() {
		System.out.println("My desig is:"+empDesig);
	}
	
	public String toString() {
		return "Employee |"+empId+"|"+empPerson.toString()+"|"+empDesig;
	}
	
	
	public static void main(String[] args) {
//		Object o = new Object();
//		Object p = new Person("Srivalli","1986-04-27","Roanoke, TX");
//		Object e1 = new Employee((Person) p, 1, "QA");
//		
//		Person e2 = new Employee((Person) p,1,"QA");
//		
//		System.out.println(o.toString());
//		System.out.println(p.toString());
//		System.out.println(e1.toString());
//		System.out.println(e2.toString());
		
		
		Person p = new Person("Srivalli","1986-04-27","Roanoke, TX");
		
		// toString of Person is overriding toString of Object
		System.out.println(p.toString());
		
		
		Person e2 = new Employee((Person) p,1,"QA");
		
		// Here Late Binding of e2 to Employee happens and 
		// toString of Employee is gettig called
		System.out.println(e2.toString());
		
		
		
		
	}

}
