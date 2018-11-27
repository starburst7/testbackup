package exceptionHandling;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionTest extends Exception{

	

	
	
	
	
	
	public ExceptionTest(String s){
		
		super(s);
		
	}
	

	
	
	public static void main(String[] args) {
	
		
		
		//by appending via FileOutputStream constructor that accepts boolean for append.
		//definition of append: add content to a file; thus, avoid overwriting previous data
		
		//Structure used: try{throw},catch  with  FileNotFoundException on PrintWriter. 
		PrintWriter outputStream = null;
		
		try {
			
				outputStream=new PrintWriter(new FileOutputStream("sam.txt",false)); 
	
				throw new FileNotFoundException("error creating file\n");		
				
		}
		
		catch (FileNotFoundException e)
		{
			System.out.print(e.getMessage());
			outputStream.close();
		}
		
		outputStream.print("testing");
		outputStream.close();
		
		
		
		
		
		//
		int x=55;
			try
			{
				
			if(x==10)
				System.out.print("no");
			
			
				throw new ExceptionTest("error for exception 2");
			}

			catch(ExceptionTest e) {
				System.out.print(e.getMessage());
			}

	}

}
