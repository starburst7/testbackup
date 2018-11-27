package CLONEwithMasterClone;

public class Pomeranian extends Dog{     //Note a child class inherits all implemented methods from its Parent class 
	                                      //            that implemented an interface

protected int age=5;

protected String race = "pomeranianBlue";


public Pomeranian clone() {
	
	Pomeranian copy = (Pomeranian)super.clone();      //calls clone( ) from Parent class Dog which itself catches CloneNotSuppException
	
	return copy;
	
}

	
	public static void main(String args[]) {
		
	Pomeranian pom1 = new Pomeranian();
	
	pom1.clone();
	}
	
	
	
	
}
