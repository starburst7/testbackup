package interfaces;

public class ExtendTest  extends Test implements Cloneable {

	private double price;

	
	public Object clone() {    //Omitting this code would have the same effect. (no override means  super.clone() anyway)
		
		return super.clone();
		
	}

	public static void main(String[] args) {
		
		ExtendTest a = new ExtendTest() ;
		
		
		System.out.print(a.clone());
		
			
		
	}
	
	
	

	
	
	
	
}
