package streams.binaryStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



//writing to a binary file.  Using a serializable class object and writing it to the file.



public class WriteObjectSerializable {

	

	
	public static void main(String args[]) {

		
	
		
		
// WRITING THE OBJECT IN BINARY		
		
		ObjectOutputStream binaryOut=null;
		
		UsingSerializable obj1 = new UsingSerializable();    
		UsingSerializable obj2 = new UsingSerializable(); 
		
	//connecting output stream
	try 
	{
		binaryOut= new ObjectOutputStream(new FileOutputStream("C:\\Users\\2flare\\Desktop\\binary.txt"));   //throws 2 exceptions(FNF/IOE)
	
			try {
		
				binaryOut.writeObject(obj1);    					// write throws IOException
				}
		
				catch(IOException d)    
				{
					System.out.print("Unknown Error writing object to binary");
				}
		
		binaryOut.close();    //if all goes well above. this becomes last line of code. 
	}
	
	catch(FileNotFoundException e)
	{
		System.out.print("unknown error creating file");
		System.exit(0);
	}
	
	catch(IOException f)                //note1: constructor of ObjectOutputStream throws IOException  but  FileOutPutStream throws FileNotFOundEx
	{								  
		System.out.print("unknown error creating file");
		System.exit(0);                              
	}
	
	

	
	
	
	
	
	
	
//READING A BINARY FILE AND RETRIEVING AN OBJECT:	
	ObjectInputStream binaryIn=null;
	
	
	
	try
	{
		binaryIn = new ObjectInputStream(new FileInputStream("C:\\Users\\2flare\\Desktop\\binary.txt"));    //=> IOE & FNF
		
		
		//note: if exception is thrown from ObjectInputSream or FileInputStream the following try would not even execute...
		//            also note, there would be no need to close stream since it isn't opened at all.
		
			UsingSerializable obj3 = (UsingSerializable) binaryIn.readObject();    /* note 1) readObject() => ClassNotFoundEx & IOException
																					                             
																					  note 2)  readObject returns object so it must be cast
			 																							into a java object                         */
		
			System.out.println(obj3.y); 
			obj3.notRetrieved();
			
			
			binaryIn.close();            //won't reach this code if there was any problems 
	}		
		
						
			
		
		catch(FileNotFoundException i)
			{                            //from FileInputStream 
				System.out.print("Cannot find file with that name");
				System.exit(0);
			}
		
		catch (ClassNotFoundException e)   //for readObject() method
			{
					// 
			System.out.print("Error while reading file");
						e.printStackTrace();
						System.exit(0);
			}
	
	
			catch(IOException i)    ////for exception from ObjectInputStream  AND for using .close() for binary streams.
			{
					System.out.print("Problem reading from file");
					System.exit(0);
			}
	
	

		
		
		
		
	
	
	
	       
	
	

		
	
	
	
	
	
	
	
	}
}
