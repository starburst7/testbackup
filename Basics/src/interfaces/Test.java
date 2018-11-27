package interfaces;

public class Test implements Cloneable{

	private int number;
	private String name;
	
public static class Test2{
	
	
	
}
	
	public void setNumber(int newNumber) {
		
		number=newNumber;
	}
	
	//redefining Parent class's clone method inherited from Object class
	public Object clone() {
		
		try {
			return super.clone();    //INVOCATION OF CLONE FROM MASTER CLASS OBJECT => Throws CNSE
		}
		
		catch(CloneNotSupportedException e) {
			return null;
		}
		
	}
	
	

	
	public static void main(String[] args) {
		
		

	}

}
