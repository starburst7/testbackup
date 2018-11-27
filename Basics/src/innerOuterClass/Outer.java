package innerOuterClass;



public class Outer {
	

public static class Inner1{	

	
	
}

public class Inner2{
	
	public int x=10;
}



public static void main(String[] args) {
	
	
	//instantiate non-static inner class		
		Outer outObj = new Outer();    //to instantiate inner instantiable class, the outer must be instantiated first.
		
		Outer.Inner2  obj1 = outObj.new Inner2();
		
		
	//instantiate static inner class
		Outer.Inner1 obj2= new Outer.Inner1();

		}


}