package interfaces;

public class Pomeranian extends Dog{

	
	public static void main(String[] args) {
	
		//Note how a derived class inherits all implemented methods from base class (since they must all be public)
		Pomeranian puffy = new Pomeranian();
		puffy.canineThreatlevel("low");
		puffy.setID(10001);
		
		
		
		Caninable interfaceVar = new Dog();
	
	Dog b = (Dog)interfaceVar;
	
	interfaceVar = new Pomeranian(); 
		
		
		

		
		
		System.out.print(puffy);

	}
	
	public String toString() {
		
		return "threat level: "+getLevel()+",   ID: "+ID+",   CanineID: "+CANINE_ID;
	}

}
