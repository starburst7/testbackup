package accessInheritance.protected1;

   

import visibilityInheritance.Parent;

public class HidingStaticMembers extends Parent {
	
	
	protected static long staticNumber= 7;   // Hides static long variable inherited from Parent class.
			                                 //  **using name only, within program will now refer to this newer variable
	
											// using Parent.staticNumber will still give full access to the inherited static variable.
	
	
	                                       //**SAME LOGIC for Static method HIDING**
	
	

	public static void main(String[] args) {
	
	
		System.out.println(staticNumber);
		
		System.out.println(Parent.staticNumber);
		
		
		displayMsg();   
		
		Parent.displayMsg();
		
	}
	
	
public static void displayMsg() {
		
		System.out.println("Static method that is hiding the inherited static method. Note the hidden method is still fully accessible.");
	}
	
	
	





}