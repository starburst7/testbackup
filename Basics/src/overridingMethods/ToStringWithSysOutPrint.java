package overridingMethods;

import java.util.Arrays;

public class ToStringWithSysOutPrint {

	private int x; // x-coordinate
	private int y; // y-coordinate
	
	
	/*   NOTE:  1) Println is overloaded:    println(Object)    &   println(String)     **we commonly used the String parameter
	  
	   			2) toString is descendant of Object class.
	   			
	   			
	   			3)  we can override toString in any class in order to print directly using an object name.
	   				 If we do not override it. Then, System.out.print(obj1) will print the memory address
	   			
	   			     ex:  System.out.print(OBJ1);       output=>  "obj 1 is class Dog".
	   			         
	   			          of obj1 by default.
	 
	 
	 HOW IT WORKS:  System.out.print(Obj1) => feed obj1 to the println(Object) parameter....
	 
	               public void println (Object theObject) {
	               																		RESULT:
	               																		-------
	               			System.out.println( theObject.toString() );         => System.out.println( obj1.toString() );  
	               			
	               																=> thus, use overridden toString method on object 1.
	               																	returns a String
	               																	
	               																=> println the string returned.	
	        
	               }																
	               
	               
	                														
	 
	 */
	
	
	
	
	public ToStringWithSysOutPrint(int x1, int y1) {  //constructor
	
		x=x1;
		y=y1;	
	}
	
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}


	// toString method
	public String toString(){
	return ("Coordinates of point are ("   + x +   ", "  + y +   ")");   
	}																	
	
	
	public int addCoordinateX(ToStringWithSysOutPrint otherCoordinate) {   // parameter creates an object called otherCoodinate
		
		
	return (this.x + otherCoordinate.x);	 //  .THIS   refers to the object that will be calling this addCoordinateX method(see below)
	}
												// will add instance variable of calling object   with instance variable of parameter object.
	
	

public static void main(String[] args)
{
// Declare 2 points (create 2 objects and initialize instance variables)
ToStringWithSysOutPrint p1 = new ToStringWithSysOutPrint(5,0);
ToStringWithSysOutPrint p2 = new ToStringWithSysOutPrint(2, 3);





// USING TOSTRING METHOD automatically within SYSTEM.OUT.PRINT to print from object directly.
System.out.println(p1);
System.out.println(p2);   //**note normally printing p1,p2  would print an address in memory for the object.




System.out.println(p1.addCoordinateX(p2));    // will perform addition of instance variable of calling object p1,   with the instance variable of parameter object p2.




//ALTERNATIVE to toString:   //The String Class has a constructor that can accept an array of characters which can be used inside System.out.print
char[] num= {'1','2','3'};
System.out.println(new String(num));       //without braces and without commas    123
      //  versus
System.out.println(Arrays.toString(num));   //with braces and commas  [1,2,3]








}
}