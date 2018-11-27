package overridingMethods;



public class Child extends Parent{
	
	
	public int x=10;
	
	public static void main(String args[]) {
		
		Child myChild = new Child() ;
		Parent myParentVar = myChild;      //child object stored inside Parent variable type (automatic type upcasting)
		
		Parent parentObj = new Parent();
		
		
		//NO SUCH THING AS OVERRIDING STATIC METHODS
		//-------------------------------------------------------
		// We cannot override static methods. The process is termed "the subclass method HIDES the superclass method"
		// the version of the hidden static method that gets invoked depends whether it is invoked from super class or subclass.
		
		Child.testStatic();  //-> uses Child's definition
		Parent.testStatic(); // -> uses Parent's definition

		
		// OVERRIDING INSTANCE METHODS:
		//-------------------------------------
		myChild.testInstanceMethod();
		myParentVar.testInstanceMethod();
	
		// note: Parent retains access to its own original method even if Child overrides it for itself.
		parentObj.testInstanceMethod();
		
		
		
		//NO SUCH THING AS OVERRIDING PRIVATE METHODS
		//----------------------------------------------
		//private methods cannot be accessed outside of their original class; therefore, they are not visible to any other classes
		// therefore they are not inherited=> no possibility of overwriting.
		//If a private method with the same signature and name is defined in Child class, it is ENTIRELY A DIFFERENT METHOD!!! 
		myChild.privateMethod();

		
		
		//OVERRIDE VISIBILITY OF METHOD
		//---------------------------------
		// You can make a method more public.  (Exception: cannot override Private methods at all)
	
		myChild.increaseVisibility();
		
	}
	
	
	public void increaseVisibility() {
		
		System.out.println("Overriden method from Child => Yes. You override a method to make it more public.  (Exception: Cannot override private methods");
	}
	
	
	//Although the following has EXACTLY the same signature as privateMethod() in Parent class, it is ENTIRELY A DIFFERENT METHOD.
	// IT IS NOT OVERRIDING IT !!!!
	private void privateMethod() {
		
		System.out.println("We cannot Override a private method. This is ENTIRELY a new method with the same signature and name");
	}
	
	
	
	public static void testStatic() {
		
		System.out.println("Static method in Child(parent static method NOT overidden)");
	
	}

	
	public void testInstanceMethod() {
		
		System.out.println("Instance method in Child(parent method was overriden)");
	}
	
	
	
	

	
}
