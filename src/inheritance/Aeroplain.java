package inheritance;
interface Flight {
	void takeOff();
	void landing();
}
public class Aeroplain {
	public static void main(String[] args) {

		Boeing b = new Boeing();
		b.takeOff();
		b.landing();
		
		Airbus a = new Airbus();
		a.takeOff();
		a.landing();
		
		

	}

}
