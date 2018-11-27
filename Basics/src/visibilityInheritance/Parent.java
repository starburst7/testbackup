package visibilityInheritance;




public class Parent {
	
	public char letter='a';    //public

	private String name="toby";  //private
	
	protected int age=6;   //protected access
	
	double height= 40.50;  //package access
	
	 protected static long staticNumber= 10;   //static.     
	
	
	public double getHeight() {
		return this.height;
	}
	
	
	public String getName() {
		
		return this.name; 
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	
	public static void displayMsg() {
		
		System.out.print("Static method to be hidden");
	}
	
	
	public static void main(String args[]) {
		
		Parent parentObj = new Parent();
		
		
		//PROTECTED= > note all classes have full access to their own variables regardless of visibility.
		//              visibility only applies towards other classes.
		System.out.print(parentObj.age);
		
	}
	
	
	
	
}
