package classesAndmethods;

public final class PrivacyLeak {
	
	private String name="";
	private RandomObject z = new RandomObject();
	
	
	public PrivacyLeak(String name) {   //constructor for String.   (String is immutable. No need safe version)
	
		this.name=name;
		
	}
	
	public RandomObject getRandom()
	{
		return new RandomObject();     //safe version. Not return object itself but a copy of it; thus, safeguarding it's memory address
											//prevents a programmer from circumventing any private modifiers for instance variables within RandomObject class
											// (thus being able to modify a private instance variable)
	}
	
	
	public PrivacyLeak(PrivacyLeak a) { //copy constructor
	
		this.name= a.name;
		
		this.z=new RandomObject();    //Safe version.    versus   this.z = a.z   which would not be a copy but referring to same object.
		
	}
	
	public String getName() {   //accesor Method
	
		return this.name;    //String class is immutable so we can return "unsafe" version(original reference)
		
	}
	
	
	
	public static void main (String args[]) {
	
		PrivacyLeak obj1 = new PrivacyLeak("JK1");
		
		PrivacyLeak obj2 = new PrivacyLeak(obj1);    //copy obj1 using copy constructor.
		
		System.out.println(obj1.z);  //returns address of original
		
		System.out.println(obj1.getRandom());  //returns safe copy address of obj1     
		System.out.println(obj2.getRandom());  //returns safe copy address of obj2
		
		obj1.z.getItem();     //privacy leak.   getItem() is calling an instance variable object that was supposed to be private(within Random object)
		
		
	}

	
	
	
	}


	


