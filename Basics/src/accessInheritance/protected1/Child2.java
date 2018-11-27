package accessInheritance.protected1;


import visibilityInheritance.Parent;


//GOAL:   The point of protected access is to block access to the original members of the Parent class(unless in the same package)
//        but allow access to the subclasses version of the members ONLY.

// Protected means that denying DIRECT access to fields of the Parent class from classes OUTSIDE the package(i.e from subclasses that are NOT in same package)
//   However, any subclasses that are not in the same package can still access their own versions of these protected members directly(just not the parent's version).
//   Thus, only classes that are within the same package can access protected variables of the Parent class DIRECTLY.
 


public class Child2 extends Parent {   // Parent and Child in different package.

	
	
	/*   If you cannot access a member(directly by name), you can always use the accessor method if it was created in the base class. 
	 * 
	 *			 inherited variables:
	 * 							
	 *							- public char letter='a';   
	 *
	 * 							-private String name="toby";
	
								-protected int age=6;         
	 * 
	 * 							-double height= 40.50;   (no modifier)=>package access
	 * 
	 * 							-static protected long staticNumber= 10;
	 */							
	

	public static void main(String args[]) {
		
	
	Child2 kid= new Child2();
	Parent uncle= new Parent();
	
	
//PROTECTED:  protected int age=6;    Child2 is at least a subclass of Parent class. Yes, can access the variable BUT
	                                //       can not access the Parent's version (unless both classes are also in same package).
	                     
	System.out.println(kid.age);    		//-> yes, as long as it is a subclass it can access DIRECTLY it's own version of inherited protected variables.
												//(it doesn't need to be in same package)
											  
	
	System.out.println(uncle.age);   //->No, the original members of the Parent class are not accessible directly within Child2(it is not in the same package.)
	                                  
	//                                                               
										 
		System.out.println(uncle.getAge());   //note, we can always use accessor methods for protected variables that are outside the package.				
		
		

		
		
                                   	
	
	
//PRIVATE:   Cannot access a private member directly from another class definition. Must use accessor.
	System.out.print(kid.getName());
	
	System.out.println(uncle.getName());      
	
	
		
//DEFAULT:  Package Access Only.			
		System.out.print(uncle.height);    //package access=> height as defined in Parent, can only be accessed by an object of the same package as Parent.
												//   NO => Child2 is NOT the same package as height
		
	System.out.print(kid.height);       //package access=> height as defined in Parent can only be accessed by a class of the same package
									    //                     No=> Child2 is not in the same package as Parent class.
	
	
	}
	
}
