package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class SystemClass {

	public static void main(String[] args) {
		
		InputStream textIn = null;
		PrintStream textOut=null;
		
		try {
			textIn= new FileInputStream("sam.txt");                        //note InputStream is an abstract class. So we aren't instantiating.
																		//note incidentally that FileInputStream is a descendant of InputStream
																		//      		=> thus, we can store FileInputStream obj inside InputStream type variable.
			
			textOut=new PrintStream(new FileOutputStream("sam.txt"));     //note PrintStream can be instantiated(not an abstract class) so "new" operator was okay to put.
		}																 //note  , we couldn't store FileOutPutStream inside of PrintStream as an alternative(for example if PrintStream was abstract and couldn't be instantiated)
																				//   because one is not of the other type.
		
		catch(FileNotFoundException e) {
		}
		
		
		
		System.setIn(textIn);
		
		try {
			
		System.out.print(System.in.read());
		System.out.print(System.in.read());
		
		
		textIn.close();
		}
		catch(IOException e) {
			
		}
		
	}
	

	

}
