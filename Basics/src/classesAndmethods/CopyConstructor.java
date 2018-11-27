package classesAndmethods;

				//COPY CONSTRUCTOR:  Creates a duplicate Object

public class CopyConstructor {   

	
	//instance variables of class(fields)
	private int x=12;
	private int y=14;
	private Born z= new Born();
    private String name="roger";
	
	CopyConstructor(CopyConstructor original) {  //copy constructor: Creates a seperate Object and initialize instance variables to same values.
		
		this.x= original.x;
		this.y=original.y;
		this.z= new Born();       //Born is Mutable so must create a defensive copy.
		
								//  DO NOT USE:   z=original.z    this would copy the reference; thus, not create new object.
											//try switching it. You'll see memory address is going to print out the same. WE DO NOT WANT THIS!!!
													//  Since Born is mutable, this would cause a Privacy leak (security issue!!)
		
															 //    VERSUS           IMPORTANT !!!!!
		this.name=original.name;        //here note that although we want to copy an object String(and not reference), String is an immutable class.
										//so it is not necessary to do: this.name= new String(a.name);    ( a class which is "final" is immutable)
	}
	
	
	CopyConstructor() {		//no argument constructor. 
	
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		
		//create obj1 and initialize it. 
		CopyConstructor obj1= new CopyConstructor();
		
		//Use Constructor:   Create new obj2 and initialize it to same values as object 1.
		CopyConstructor obj2= new CopyConstructor(obj1);
		
		
		
	}
}



class Born {
	
String d= "hello";
	
}

	


	
	
	

