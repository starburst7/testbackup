package upcastOrDowncast;

public class CastingObj {

	public static void main(String[] args) {
		
		
		
		
		
		Chocobo chocobo1 = new Chocobo();  //Chocobo constructor =>  invokes base default constructor(Animal), then rest of body of chocobo constructor!!
		
										  // invocation of Chocobo constructor {
		//                                                                        1. public Animal {  THIS.hello() } //  => THIS = Chocobo obj inside Animal type variable
		//																		  2. THIS.hello()					   } => THIS = Chocobo obj inside Chocobo type var  
				
		   																// since static method => execute by var type
			
		//     RESULT:  Animal version 1st and then Chocobo version of hello().
		
		
		
		
		
		
		System.out.println();
		//UPCasting.                                        upcasting is always done automatically. full code is:  Animal a = (Animal)chocobo1 ;
		Animal a = chocobo1;
		System.out.print(a.getClass().getSimpleName());      //note a is STILL a chocobo object.  We verify this with .getClass().
		
		
		//Downcasting                     -we cannot downcast automatically. It must be done manually with a full code.
		
		
		if(a instanceof Chocobo)
		{
	Chocobo choco = (Chocobo)a;      //full code. Manual downcast.
		}
		
		
		
		
		
	

	}
	


}
