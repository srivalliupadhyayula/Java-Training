package demo;

import javax.net.ssl.SSLEngineResult.Status;

public class StaticVsNonStatic {
	
	//nonstatic
	int n1=10;
	
	//static
	static int counter=0;
	
	public StaticVsNonStatic() {
		counter++;
	}
	
	

}
