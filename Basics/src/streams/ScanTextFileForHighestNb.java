package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanTextFileForHighestNb {

	public static void main(String[] args) {
	
		//Scan a text file composed of Strings representing numbers of type int. Contains nothing but Strings and only 1 token per line.
		
		
		
		
Scanner fileIn= null;
		
		//set partially dynamic string path
		String localDir = System.getProperty("user.dir");
		File file1=new File(localDir + "\\streams.txt");
		
		int largest=0;
		int smallest=0;
		int temp=0;
		try {
		
			fileIn= new Scanner(new FileInputStream(file1));
			
		
		
			
			if(fileIn.hasNext())	
			{
			largest=Integer.parseInt(fileIn.next());
			smallest=largest;
			
			while(fileIn.hasNext()) //next token. Assuming all tokens in file are integers.
			{
			temp=Integer.parseInt(fileIn.next());	
				if(temp>largest)
					largest=temp;
				
				if(temp<smallest)
					smallest=temp;
				
			}
			
			
			}
			
			
			
			else{//end program. No integers.
				System.out.print("There no integers");
				System.exit(0);
			}
			System.out.println("largest is:"+largest+" , smallest is:"+smallest);
		}
		
		
		
	catch(FileNotFoundException e) {
			
		}
			
		
	}
	
		
		

	}


