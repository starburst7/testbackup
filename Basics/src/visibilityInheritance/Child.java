package visibilityInheritance;

public class Child extends Parent {  //in same package(accessInheritance).

	/* 
	 * 
	 * inherited variables:
	 * 
	 * 							-public char letter= 'a';
	 *  
	 * 							-private String name="toby";
	
								-protected int age=6;
	 * 
	 * 							-double height= 40.50;   (no modifier)=>package access
	 */
	
	public static void main(String args[]) {
		
		Child kid= new Child();
		
		Parent uncle= new Parent();
		
		//Protected: 1- if class is in same package => has DIRECT access to BOTH:    parent's protected fields + it's own inherited protected fields.
		//           2- if it is not in same package but it is a subclass.         =>Then, only Child's inherited protected variables can be accessed DIRECTLY.
		//           3- The point of protected is to block DIRECT access to the original fields of the Parent when in another class. 
		//                                                               Yet it allows subclasses direct access to its own version in the subclass.
		
		System.out.println(kid.age);   // Child is in same package or is a subclass => yes can access it's own version of protected member
		System.out.println(uncle.age); // Child is in same package                  => yes can access the parent's version as well.
		
		
		//PROTECTED STATIC:  Same package=> access to both versions  => wait...it is also STATIC so there is only 1 version and it is shared.
		//         ( The same exact copy is the one that is shared among all subclasses.  So base class CAN access static variable directly
		//        
		//       It is possible to hide a Static variable by declaring another Static variable with the exact same signature& name within the derived class
		//       (This LOOKS similar to overriding but it is not as you cannot override a static method. The effect is called "hiding" because it does something else:
		//        it hides the Static variable of the base class( We can no longer access it by using the name only. We have to use ParentClass.variableName
		//        Because, using the name-only, will now point to a new static variable that exists only in the derived class. 
		//        
		
		//note how we have access to static variables inherited without needing the Classname.
		//But if we using "hiding", we will be forced to include class name first.
		System.out.println(staticNumber);
		System.out.println(staticNumber);
		
		
		//private:
		System.out.println(kid.getName());    //private.can't access directly. Need accessor.
		System.out.println(uncle.getName());
		
		
		//Package Access(No modifier)     //can access directly IF AND ONLY if same package.
		
		System.out.println(kid.height);
		System.out.println(uncle.height);  
		
		
		//Public                             //can access DIRECTLY BOTH:  it's own version of instance variable as well as Parent's.
		System.out.println(kid.letter);
		System.out.println(uncle.letter);
		
		
	
	
		
	}

	
	
	
	
}
