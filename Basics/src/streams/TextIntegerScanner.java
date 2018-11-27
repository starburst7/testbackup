package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class TextIntegerScanner
{
   //Scans file for tokens of integers and prints highest, lowest and the mean of the total.
	
	public static void main(String args[]) {
		
		Scanner fileIn= null;
		
		File file1=new File("C:\\Users\\2flare\\Desktop\\streams.txt");
		
		int largest=0;
		int smallest=0;
		int temp=0;
		double total=0;
		int counter=0;
		double mean=0;
		try {
		
			fileIn= new Scanner(new FileInputStream(file1));
			
			
			if(fileIn.hasNextInt())	
			{
			largest=fileIn.nextInt();
			smallest=largest;
			total=largest;
			counter++;
			
			while(fileIn.hasNext()) //next token. Assuming all tokens in file are integers.
			{
			temp=fileIn.nextInt();	
			total+=temp;
				if(temp>largest)
					largest=temp;
				
				if(temp<smallest)
					smallest=temp;
				
				counter++;
				
			}
			
			mean=total/counter;
			}
			
			
			
			else{//end program. No integers.
				System.out.print("There is no more integers");
				System.exit(0);
			}
			System.out.println("largest is:"+largest+" , smallest is:"+smallest+" , the mean is: "+mean);
		}
		
		
		
	catch(FileNotFoundException e) {
			
		}
		
		FileWriter file1Out =null;
		try {
			file1Out= new FileWriter(file1,true);
		}
		
	catch(IOException e) {
			
		}
		
		
		
	}
	

	
}
		
		
		

