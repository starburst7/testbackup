package classesAndmethods;
//IMMUTABLE CLASS //
/*
1. make class final
2. make all fields final
3. No mutator/setter methods that can change variables

4. if any field is a mutable class:
    a) use a copy of the argument passed within constructor to initialize fields in constructors.
    b) if creating accessor methods, make sure to only return the cloned copy and
     		NOT the original passed argument
    

*/
public final class Immutable {

	private final int field1;
	private final double field2;
	private final String field3;
	
	private final Mutable field4;  //field with mutable class
	
	
	
	public Immutable(int field1,double field2, String field3, Mutable abc) {  //constructor
		
		this.field1=field1;
		this.field2=field2;
		this.field3=field3;
		this.field4= new Mutable(abc);     //uses copy constructor within Test class to clone abc to secure against leaks
		
	}
	
				//ACCESSOR METHODS:	
public int getField1() 
		{
		return this.field1;	
		}
	
public double getField2() {
	
	return this.field2;
	
}	
public String getField3() {
	
	return this.field3;
	
}	

public Mutable getTestObjField4() {
	
	return this.field4;
	
}
	
	
	
	public static void main(String[] args) {
		

	}

}
