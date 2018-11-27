package classesAndmethods;


//MUTABLE class

public class Mutable {
	  
private int num;
private String name;

Mutable(Mutable a) {    //copy constructor
	
	this.num=a.num;
	this.name=a.name;
}

Mutable()  { 
	//default constructor empty	
}


public void setNum(int num) {
	this.num=num;
}
public void setName(String name) {
	this.name=name;
}
public int getNum() {
	return this.num;
}
public String getName() {
	return this.name;
}

	  public static void main(String[] args) {
	    
	  }
	}
				
				
				
				
				
				
				
				
		
	
	

		
		
	
		
		
	
	
