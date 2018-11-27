package streams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.SecurityException;

public class PrintWriting {

	public void print() {

		/*
		 * FUNDAMENTALS
		 * -----------------------------------------------------------------------------
		 * -------
		 * 
		 * 1) We can "append the file" (add content to a file; thus, avoid overwriting
		 * previous data) by using one of FileOutputStream's constructors that accepts
		 * boolean true=>append false=>overwrite.
		 * 
		 * 2) the stream must be CLOSED. *** OR THE CHANGES WILL NOT BE SAVED. (remain
		 * in buffer)
		 * 
		 * Incidentally, it will trigger flush() => (physically write changes into text
		 * document. "save".
		 * 
		 * 3) You cannot connect to a text file if it is in "read-only mode"
		 * =>FileNotFoundException will be thrown.
		 * 
		 * 4) FileOutputStream can throw FileNotFoundException for ANY PROBLEMS RELATED
		 * TO FILE CREATION. // if the file didn't exist, it will create it => SO
		 * EXCEPTION IS NOT THROWN BECAUSE FILE DOESN'T EXIST!!!******
		 * 
		 * 
		 */

		// opening file error ---> verifying if error caused by Read-Only mode.
		// ----------------------------------------------------------------------
		
		
		// WRAPPING PrintWriter with BufferedWriter to avoid print() writing to disk everytime.
		PrintWriter f = null;

		File fileA = new File("C:\\Users\\2flare\\Desktop\\streams.txt");

		try {
			f = new PrintWriter(new BufferedWriter(new FileWriter(fileA)));
			
			f.write("h");
			
			f.close();
		} 
		catch(IOException g) {
			
		}
		
		
		//normally
		PrintWriter g=null;
		try {
			g=new PrintWriter(new FileWriter("data.txt"));
			
			
		}
		catch(IOException z) {
			
		}

	}
	
	
	
	

}
