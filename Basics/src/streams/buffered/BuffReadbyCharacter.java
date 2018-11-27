package streams.buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BuffReadbyCharacter {

	public static void main(String[] args) {
		
		
		






//					read entire document character by character.
//					------------------------------------------------
BufferedReader reader1= null;


try {

	File file = new File("C:/Users/2flare/Desktop/streams.txt");
	reader1=new BufferedReader(new FileReader(file));	
}
catch(FileNotFoundException e) {
	System.out.print("Error reading from file.");
	}


int str;
try {
while((str=reader1.read())!=-1) 
{         							 //note storing what is read into str is key!! it avoids having the while's boolean 															//      when it is verifying condition of loop.
	System.out.println((char)str);
	
}
reader1.close();
}

catch(IOException f) {
	

}






		


	
	
}


}


	
	
		
	
		
		
		
	


