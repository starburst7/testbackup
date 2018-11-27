package CLONEwithMasterClone;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test  {

	public static void main(String[] args) {
	
		Dog dog1 = new Dog();
		Pomeranian puffy = new Pomeranian();



Pomeranian puffyCopy = puffy.clone();
//------------------------------------

	System.out.println(puffy);
	System.out.println(puffyCopy);
	
	
Dog dogCopy = dog1.clone();	
//-------------------------

	System.out.println(dog1);
	System.out.println(dogCopy);


}
	

	
	

	
}