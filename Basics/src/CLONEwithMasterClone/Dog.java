package CLONEwithMasterClone;

public class Dog implements Cloneable{

public int age;
	
	private String name;
	private String ID;
	
	protected Date dateObj= new Date();      //*** note Mutable class!!  Must have it's own defined Clone method ***
	
	//Note Clone from MasterClass will safely copy all Object attributes that are IMMUTABLE.(Example:  String)
	//It will copy primitive data with no issues.
	

	
	public Dog clone() {
		
		
			try 
			{
				Dog copy= (Dog)super.clone();     //Master Class Object's clone throws "CloneNotSupportedException"
				
				copy.dateObj= dateObj.clone();    // create a safe copy for the Dog object's attribute. (clone in Date
//														must have been previously defined)
				
				return copy;
			} 
			
			
			catch (CloneNotSupportedException e) 
			{
			return null;
			}
			
		
		
	}
	

	
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		Dog dog2= dog1.clone();
		
		System.out.print(dog2.getClass().getSimpleName());
	}

	

}

