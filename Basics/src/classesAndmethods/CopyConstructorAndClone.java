package classesAndmethods;

import overridingMethods.RetrievingMembers;

//COPY CONSTRUCTOR:  Creates a duplicate Object

public class CopyConstructorAndClone {   

	
	//instance variables of class(fields)
	private int x=12;
	private int y=14;
	private ClassBRelatedtoA date = new ClassBRelatedtoA();
    private String name="roger";
	
	CopyConstructorAndClone(CopyConstructorAndClone original) {  //copy constructor: Creates a seperate Object and initialize instance variables to same values.
		
		if(original==null)
			System.exit(0);   // First step in creating a copy constructor.
		
		this.name=original.name;
		this.x= original.x;
		this.y=original.y;
		this.date= new ClassBRelatedtoA(original.date);       //ClassBRelatedtoA is Mutable so must create a defensive copy.
		
		                                                      //  IMPORTANT=> One of the fields is an Object.  Thus, we also need a defensive copy of this object also!!! 
		
		//                                This means that this object(of type ClassBRelatedtoA WOULD HAVE TO HAVE ITS OWN Copy Constructor (it does already).
														      //           Thus, we will copy the member original.date using the copy constructor within ClassBRelatedtoA
																//         The final result is that we have created a copy constructor for "CopyConstructor" class itself.
		
		
								//  DO NOT USE:   date=original.date    this would copy the reference; thus, not create new object.
											//try switching it. You'll see memory address is going to print out the same. WE DO NOT WANT THIS!!!
													//  Since ClassBRelatedtoA is mutable, this would cause a Privacy leak (security issue!!)
		
															 //    VERSUS           IMPORTANT !!!!!
		this.name=original.name;        //here note that although we want to copy an object String(and not reference), String is an immutable class.
										//so it is not necessary to do: this.name= new String(a.name);    ( a class which is "final" is immutable)
	}
	
	
	
	
	
	public CopyConstructorAndClone clone() {   //clone() method using copy constructor
		
		
		return new CopyConstructorAndClone(this);   //invokes copy constructor
		
		
	}
	
	
	public boolean equals(Object otherObj) {  //override equals() in order to test our copy constructor and clone and make sure all is well.
		
		if(otherObj==null)
			return false;
		
		else if (otherObj.getClass()!=this.getClass())
			return false;
		
		else
		{
			CopyConstructorAndClone b= (CopyConstructorAndClone)otherObj;
			
		
			// IMPORTANT!! note the last boolean:  It concerns an object. Thus, we needed another equals method for that object before being able to complete this one.
			return ( (this.name.equals(b.name)) && (this.x==b.x  )  && (this.y==b.y) && (this.date.equals(b.date))  )  ;
			
			
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	CopyConstructorAndClone() {		//no argument constructor. 
	
	}
	
	
	public static void main(String[] args) {
	
		
		//create obj1 and initialize it. 
		CopyConstructorAndClone obj1= new CopyConstructorAndClone();
		
		//Use Constructor:   Create new obj2 and initialize it to same values as object 1.
		CopyConstructorAndClone obj2= new CopyConstructorAndClone(obj1);
		
		//Verify copy constructor to see if it worked properly:
		System.out.println("obj2 equals obj1: "+obj2.equals(obj1));
		
		
		
		//Use Clone() to copy obj1: 
		CopyConstructorAndClone obj3 = obj1.clone();
		
		//verify clone object to see if it worked properly.
		System.out.println("obj3 equals obj1: "+obj3.equals(obj1));
		
		
//use a method to retrieve primitive type members of an object.
		RetrievingMembers.pullMembers(obj3);
		
		

		
		
	}
}



	


	
	
	

