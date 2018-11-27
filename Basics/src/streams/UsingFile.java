package streams;
import java.util.Scanner;

import misc.InvalidIntException;
import misc.ZeroIntException;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.File;

/*
 * NOTE ABOUT PATH NAMES
 -------------------------------------------------------------------------------------------------------------
     It is best to not type out the full path name manually as moving the project folder(ex: reorganizing eclipse),
    will NOT update the code in your program.  Thus, use System.getProperty("user.dir") will automatically point
    to the directory of the current program. 
 
	File file = new File( System.getProperty("user.dir")  + "//streams.txt" );		
	System.out.println(file);
	
	
	
	simple path name
	----------------
	streams.txt    (assumes file is in Project folder)
	
	
	Relative Path Name (path starting from Project Folder => ex: Tools)
	-------------------------------------------------------------------
	  src\\streams\\streams.txt       (if file is in a subfolder of Project Folder, relative path name is useful)
	  
	 
	Full Path Name( path starting from root directory)
	----------------------------------------------------
	C:\\Users\\2flare\\Desktop\\Workspace\\Tools\\streams.txt    (this file is in project folder)
	
	or
	System.getProperty("user.dir")  + "//streams.txt"       note: System.getProperty("user.dir") will point to project folder.
	
  



NOTE ABOUT ERRORS OPENING THE FILE (ex: connecting to stream):
----------------------------------------------------------

You must include System.exit(0) in catch of FileNotFoundException to interrupt the program. (or the program will continue running)




*/



 // 				PURPOSE
//  ------------------------------------------------
//Opening a text file and reading it and analyzing content.
//Program verifies that values are ONLY integers and within a certain range.


public class UsingFile {

	
	public static void main(String[] args) {
		
		System.out.println("This program will be interrupted by errors if the text file\ncontains a line with 0 or a negative nb\n If a number is greater than 200 an error msg is displayed but program won't be interrupted.\n");
		
		
		
	//CONNECTING TO FILE & EXCEPTION HANDLING
		int Num2=0;
		Scanner textIn=null;
		File fileIn = new File("C:/Users/2flare/Desktop/streams.txt");        
		
		

		
	try
	
	{
			textIn=new Scanner(new FileInputStream(fileIn));                    //FileNotFoundException by FileInputStream
			
			
			while(textIn.hasNextLine()) {   //note* no exception thrown for HASNEXT. It is just a boolean
				
			String Num="";
				try {  
				
				Num=textIn.nextLine();
				Num2=Integer.parseInt(Num);    //  THROWS NumberFormatException
				
				if(Num2==0) 						throw new ZeroIntException("illegal. Unchecked exception was caught. So the rest of body of try block is skipped but program is uninterrupted\n");    //                   
				else if(Num2<0)						throw new InvalidIntException("illegal. Unchecked exception was caught. So the rest of body of try block is skipped but program is uninterrupted\n");  //  throw exceptions for related to content of the file itself            
				else if( (Num2<201)&&(Num2>0) )		System.out.println(Num2+" is legal");       								//            
				else 								System.out.println(Num2+" is not illegal but restricted. No exception is thrown.");	//  AND change content of inherited message String
				
				}
				
				// RELATED TO CONTENT:
				//----------------------------------------------------
				catch(ZeroIntException e) {         //catch most specific exception first(Zero is child of Invalid) and retrieve message.
					System.out.println(Num2+" is "+e.getMessage());
							
				}
					
				catch(InvalidIntException e) {
					System.out.println(Num2+" is "+e.getMessage());
				}
				
				
				catch(NumberFormatException g) {    // Scanner uses ParseInt() which requires Strings to be composed of characters that are numbers.
					// 
					System.out.print(Num+" is illegal value.  It was not of type integer. \n\n");
				}
				
				
				}
			
			
			textIn.close();	   // If no problems occur for first try block(file successfully connected)
								// then program DOES REACH this close() method and executes it.
			
								// if there was a problem connecting to file. ALL of the inner try was skipped and this close is NOT reached.
			
			
			
		} //Outter try block for opening file.
		
	
	
		 //If any problems occurred RELATED TO OPENING FILE:
		//---------------------------------------------------
		catch(FileNotFoundException e) {            //CATCH FOR THE FIRST TRY!!
			
			if(!fileIn.exists())                            // #1 : file doesn't exist. Standard Java "cannot find file specified"
			System.out.println(e.getMessage());
			
			else if(!fileIn.canRead())
			System.out.println("cannot read file");         //#2 file is protected. Cannot read.
			
			else
				System.out.println("Unknown file error");  //#3  All other unknown file errors.
			
			
			System.out.print("Aborting program");
			System.exit(0);         // 1) We should NOT continue program if FNF. Interrupt program here.
									// 2) also, *** stream was never opened so no close method is invoked before System.exit(0)
									// NOTE:  System.exit WILL BYPASS the Finally block!!!
			
		}
		
		
	
		
		

		
	
		
		
		finally {    //prints this no matter if program interrupted or not
			System.out.println("ENDING PROGRAM");
	
		}
			
		
		}
		
		
	}
	



