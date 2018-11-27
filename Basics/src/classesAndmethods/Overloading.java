package classesAndmethods;

public class Overloading {

	int c;
	String z;

	
					//Class Constructor Overloading: for java to recognize constructor, must be named same as Class
	
					// Constructors allows initializing field variables(variables' of objects) at object creation phase.
	
					// constructors DO NOT have void  or return type.
	
	
	
	
	
public Overloading() {  				 //default constructor(No parameter)      Can be used to initialize instance variables without specifying a parameter.
	c=3;
}
														//** note constructors may have public modifier
	

Overloading(int number) {	   //constructor 1 with one int parameter

	c=number;

	}
	



Overloading(String country){    //constructor 2
	
	z=country;
}




Overloading(int number, String country){     //constructor 3       **has both parameters included at same time**  **order matters

	c=number;
	z=country;
	
}
			




	public static void main(String args[]) {
		
		
		// invoking constructor WITHOUT naming an object.  Used when constructor's instance variables will not be used at a later point.
		// perhaps the code within this constructor is self sufficient to perform some sort of VOID type action such as printing a msg.
		new Overloading(5);
		
		
		
		///////  CONSTRUCTOR RESULTS  //////
	
		Overloading abc = new Overloading(3);				//note, both objects abc and cbd have acces to instance variables c and z.
		Overloading cbd = new Overloading("Canada");				//because they are created from the same class Test1. but each has ITS OWN.
		
		System.out.println(abc.c);						//however, when constructing an instance, we are forced to specify either constructor 1 or 2:
		System.out.println(abc.z);							//this means that either object will have 1 of its fields NOT initialized.
		
		
		System.out.println();		
		System.out.println(cbd.c);
		System.out.println(cbd.z);
		
		
		System.out.println();
		System.out.println();
		
		Overloading def = new Overloading(23,"Puerto Rico");
		System.out.println(def.c);
		System.out.println(def.z);
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		//Calling method that is overloaded
	
	System.out.println(abc.overloads('e'));    //overloads method with configuration 1
	
	abc.overloads("Amit",30);                 //overloads method with configuration 2
	
	
	}
	
	
	
	
                //METHOD OVERLOADING:    
	//Same method but with different possibilities of parameters (different function signatures)
	// give same name for each.
	
	void overloads(String a, int b) {         //configuration 1
		
		String word= a;
		int number=b;
		
		System.out.println();
		System.out.println("The number is "+number+" the string is "+word);	
	}
	
	
	 public int overloads(char d) {     //configuration 2
		
		int f=(int)(d);
		return f;
	}
	
	 
	 
}
