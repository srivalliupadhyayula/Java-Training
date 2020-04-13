package demo;

public class stringreplaceS5Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String: "Dog chases cat, Cat chases rat".
	String str = new String();
	str = "Dog chases cat, Cat chases rat";
	str = str.toUpperCase();
	str = str.replace("CAT", "RAT");
	str = str.replace("DOG", "CAT");
	System.out.println(str);
	
	}
}
