package accessInheritance;




public class Parent {

	private String name="toby";  //private
	
	protected int age=6;   //protected access
	
	double height= 40.50;  //package access
	
	
	public double getHeight() {
		return this.height;
	}
	
	
	public String getName() {
		
		return this.name; 
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	public static void main(String args[]) {
		
		
		
	}
	
}
