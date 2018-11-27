package streams.binaryStreams;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadDouble {

	public static void main(String[] args) {
	
		
		ObjectInputStream binaryIn=null;
		
		try {
			binaryIn= new ObjectInputStream(new FileInputStream("C:\\Users\\2flare\\Desktop\\binary1.dat"));
			
			try {
				System.out.println(binaryIn.readDouble() ) ;	
			}
			
			catch(EOFException g) {                        
				System.out.print("Error end of file");	 //catch if it is end of the file
			}
			catch(IOException h) {
				System.out.print("Error outputting value to file");  //catch if readDouble has issues
			}
				
			binaryIn.close();
			
		}
		
		
		
		catch(FileNotFoundException e) {                              //catch exception from FileOutputStream AND .close() binary stream.
			System.out.print("Cannot find file with that name");
			System.exit(0);
		
		}
		
		
		catch(IOException f) {											// catch error from ObjectOutputStream
			System.out.print("Unknown problem opening the file");
		}

	}

}
