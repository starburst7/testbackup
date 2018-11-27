package accessInheritance;

public class Child extends Parent {  //in same package(accessInheritance).

	/* 
	 * 
	 * inherited variables:
	 * 							-private String name="toby";
	
								-protected int age=6;
	 * 
	 * 							-double height= 40.50;   (no modifier)=>package access
	 */
	
	public static void main(String args[]) {
		
		Child kid= new Child();
		
		Parent uncle= new Parent();
		
		//Protected: 1-It is also a Package Access. => if class is in same package => has direct access to parent's version as well as subclasses' version of the protected member defined In Parent.
		//           2- if it is not in same package but it is a subclass.         =>Then, child's version can be accessed but not parent's.
		//           3- The point of protected is to block access to the original members of the Parent class and allow access to the subclasses version of the members.
		
		System.out.println(kid.age);   // Child is in same package and is a subclass of Parent=> can access it's own version of protected member
		System.out.println(uncle.age); // Child is in same package and is a subclass of Parent=> can access the parent's version as well.
		
		
		//private:
		System.out.println(kid.getName());    //can't access directly. Need accessor.
		System.out.println(uncle.getName());
		
		
		//Package Access(No modifier)     //can access directly IF AND ONLY if same package.
		
		System.out.println(kid.height);
		System.out.println(uncle.height);  //has access to parent's version as well as subclasses's version of the protected member defined in Parent.
		
		
		
		
		

		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

	
	
	
}
