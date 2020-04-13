package demo;

public class Constr {
	
	public int i=0;
	
	public Constr() {
		
		System.out.println("Constr called.");
		
	}
	
	static {
		System.out.println("SIB");
	}
	
	
	
	
	
	{
		System.out.println("IIB");
	}
	
	public static void main(String[] args) {
		
		System.out.println("1st line of the code...");
		
		Constr c = new Constr();
		
		
	}

}
