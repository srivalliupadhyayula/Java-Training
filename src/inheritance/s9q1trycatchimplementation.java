package inheritance;

public class s9q1trycatchimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 22;
		int sum = a+b;
		int div = 0;
		
		try{
			
			div=sum/0;
			
		}
		catch (Exception e){
			
			System.out.println("this is catch block");
			System.out.println(e);
		}
		finally{
			System.out.println("this is final block");
		}
		
				
		

	}

}
