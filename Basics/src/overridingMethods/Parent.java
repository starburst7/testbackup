package overridingMethods;

public class Parent {
	
protected int num =13;
	
	public static void testStatic() {
		System.out.println("Static method in Parent");
	}

	
	public void testInstanceMethod() {
		
		System.out.println("original instance method in Parent");
	}
	
	private void privateMethod() {
		
		System.out.print("private method");
	}
	
	protected void increaseVisibility() {
		
		System.out.print("Original method of Parent. You override a method to make it more public.  (Exception: Cannot override private methods");
	}
	
	
	
}
