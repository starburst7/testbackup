package innerOuterClass;


public class Outside1 {

	public static void main(String[] args) {
		//instantiate non-static inner class
		
			Outer a = new Outer();    
			Outer.Inner2 inObj = a.new Inner2();         //*NOTE: To access an inner class of some class, you must inherit that class first.

			
			Outer.Inner1 inObj2 = new Outer.Inner1();
			
			System.out.print(inObj.x);
			}
	
	
}
