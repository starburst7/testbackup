package innerOuterClassdata;


import innerOuterClass.Outer;
import innerOuterClass.Outer.Inner1;
import innerOuterClass.Outer.Inner2;

public class ExtendedOuter extends Outer{

	public static void main(String[] args) {
	Outer a = new Outer();   
	Outer.Inner2 inObj = a.new Inner2();         //*NOTE: To access an inner class of some class, you must inherit that class first.

	
	Outer.Inner1 inObj2 = new Outer.Inner1();
	
	System.out.print(inObj.x);
}
}