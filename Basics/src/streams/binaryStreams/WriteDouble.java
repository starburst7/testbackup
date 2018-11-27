package streams.binaryStreams;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

public class WriteDouble {
	
	public static void main(String args[]) {
	
	ObjectOutputStream binaryOut=null;
	
	try {
		binaryOut= new ObjectOutputStream(new FileOutputStream("C:\\Users\\2flare\\Desktop\\binary1.dat"));
		
		try {
		binaryOut.writeByte(4);
		
	
		}
		
		catch(EOFException g) {                         //catch if writeDouble has issues
			System.out.print("Error end of file");	
		}
		catch(IOException h) {
			System.out.print("Error outputting value to file");  //catch if it is end of the file
		}
			
		binaryOut.close();
		
	}
	
	catch(FileNotFoundException e) {                              //catch exception from FileOutputStream
		System.out.print("Cannot find file with that name");
		System.exit(0);
	
	}
	
	
	catch(IOException f) {											// catch error from ObjectOutputStream
		System.out.print("Unknown problem opening the file");
	}
	
	
			
	
}
}
