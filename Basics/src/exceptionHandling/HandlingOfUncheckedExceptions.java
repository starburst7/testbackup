package exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HandlingOfUncheckedExceptions {

	
	// DEFINITION OF UNCHECKED:    Exception does not need to have a catch block proceeding it (the code will STILL compile).
							//   **however, the exception might disrupt the program as soon as it is thrown(so no code after it will be executed)
	
	
	
	public static void main(String[] args)
	{
	
		
	Scanner keyIn = null;
	
	try {
		keyIn= new Scanner(new FileInputStream("C:\\Users\\2flare\\Desktop\\streams.txt"));
		
		
	}
catch(FileNotFoundException e) {
	
	System.out.print("Error opening file");
	System.exit(0);   //important! Must interrupt program if FNF.  If not the second try block will be executed.
	}
		
	
	try {
	System.out.print(keyIn.nextInt());
	}
	
	
	catch(InputMismatchException e) {   //whenever the next token is NOT an integer, inputmismatch is thrown.
										//
										//  it is caught so that program does not crash... thus executing any code after(see below)
		
		
		
		System.out.println("caught");
		
		
		
		
		
		keyIn.close();  // if code made it this far, it means stream was actually connected.  (i.e  it wouldn't have arrived here if FNF was thrown)
	}

		

	System.out.print("This error message should still print. Due to having caught the Unchecked Exception");

	
	
	
		
	
	
	
	
	
	}
	
	

	}
	


	
	

