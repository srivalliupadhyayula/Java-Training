package inheritance;

public class Programming {
	
	public Programming()
	{
		System.out.println("I love programming languages");
	}
	
	public Programming(String s)
	{
		System.out.println("I love "+ s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programming p = new Programming();
		
		 p = new Programming("Java");

	}

}
