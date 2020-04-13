package inheritance;

public class StudentS8Q2 
{
  public static String sname;
	
	public StudentS8Q2()
	{
		sname = "Unknown";
	}
	
	public StudentS8Q2(String sname) {
		this.sname = sname;
	}
	
	public void studentprint(){
		System.out.println(sname);
	}
	
	public static void main(String[] args) {
		//try{
		StudentS8Q2 s = new StudentS8Q2();
		s.studentprint();
		
		StudentS8Q2 s1 = new StudentS8Q2("Srivalli");
		s1.studentprint(); 
		
//			}
	
//		catch (Exception e){}
//	
//		finally {
//		
//	System.out.println("finally block");
//	}

}
}
