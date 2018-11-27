package classesAndmethods;
import java.util.Random;


public final class RandomObject {

	
	private CopyConstructorAndClone acer = new CopyConstructorAndClone();   //not needed.    both are used for privacy leak class as experiment.
	

	
	
	
	public static void main(String[] args) {
	
		//USING RANDOM CLASS 
		Random dice=new Random();
		int number;
		
		
		for (int i=1;i<=10;i++)
		{								//always starts with 0
			number= 1+dice.nextInt(6);  // (6) options: 0,1,2,3,4,5
		System.out.println(number);   //but we want dice options: 1,2,3,4,5,6
		
		}                             //so  1 + dice.nextInt(6):  

	
	
		
		
		
	}
	
	
	
	
	public CopyConstructorAndClone getItem() {    ///NOT part of Random Algorithm. This is part of another experiment for privacy leak testing
		
		
		return acer;
	

	}	

}
