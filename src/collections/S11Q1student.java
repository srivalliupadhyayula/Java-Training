package collections;

public class S11Q1student implements Comparable< S11Q1student>{
	public String sName;
	public int iId;
	
	

	public S11Q1student(String name, int id) {
		// TODO Auto-generated constructor stub
		this.sName=name;
		this.iId=id;
	}

	@Override
	public int compareTo( S11Q1student obj) {
		return this.sName.compareTo(obj.sName);	
	}
}
