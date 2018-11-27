package classesAndmethods;


//NOTE: We create public methods called accessors and mutators in order to access or modify fields from classes when they were set to private.
        // this process is called ENCAPSULATION
      // this allows us to increase security, yet allow access to user where needed.

public class AccessorMutator {

	private int x=2; // x-coordinate private
	private int y=3; // y-coordinate

	
	
	
	AccessorMutator(int x,int y) {  //constructor to initialize instance variables to specified values.
		
		this.x=x;
		this.y=y;
	}
	
	AccessorMutator() {      //empty constructor for object creation without changing values of class fields
		
	}
	
		
	
		
		
public int getX() {   //accessor to return value of instance variable
	
	return this.x;
}

public int getY() {  //accessor to return value of instance variable
	
	return this.y;
}


public void setX(int a)   //mutator to change value inside instance variable
{
	this.x=a;
}

public void setY(int a)   //mutator to change value inside instance variable
{
	this.y=a;
}
	
public boolean getAnswerSameCoordinates() {

	return(this.x==this.y);
}


public void setMoveBy(int a)
{
	
	this.x+=a;
	this.y+=a;
	
}

public void setToString()
{
System.out.println("Coordinates of point are ("+this.x+", "+this.y+")");
	
}
	
	


	
	
			 public static void main(String[] args) {
				 
				 AccessorMutator obj1 = new AccessorMutator();
				 
		System.out.println(obj1.x);
		
		
		System.out.println(obj1.getX());
		System.out.println(obj1.getY());
		
		
		obj1.setX(5);                 //mutator methods
		obj1.setY(6);
		System.out.println(obj1.x);   //same as accessor method
		System.out.println(obj1.y);  //same as accessor method
		
		
		System.out.println(obj1.getX());  //accessor methods
		System.out.println(obj1.getY());
		
		System.out.println(obj1.getAnswerSameCoordinates());
		
		obj1.setMoveBy(10);
		System.out.println(obj1.x+" "+obj1.y);
		
		
		obj1.setToString();
		
		
		AccessorMutator obj2 = new AccessorMutator(7,8);
		
		System.out.println(obj2);
		
					}
			 
					
				
					
					
				
					
					
			 }
			 
			 
				
				
				
				
				
			 
				
			 
			 
			 



				 
				 
				
			 
			
		
		
		
	
	

