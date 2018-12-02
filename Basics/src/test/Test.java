package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = null;
		PrintWriter pw=null;
		
		File fIn = new File("C:\\Users\\2flare\\Desktop\\bookmdata.txt");
		File fOut = new File("C:\\Users\\2flare\\Desktop\\bookmdataUpd.txt");
try
	{
			sc = new Scanner(fIn);
			pw = new PrintWriter(new FileOutputStream(fOut));
			
			String line="";
			
while(sc.hasNextLine()==true)
   {			
		line=sc.nextLine();
	
		if(line.contains("Chapter"))
            pw.println(line);
		
		else {
			
			line=line.replace(".","");
			pw.println(line);
		}
		pw.flush();
	}


}
		
		
		
		catch(FileNotFoundException e)
		{
			System.out.print("FNFE");
		}
 catch(NoSuchElementException f)
 {
pw.close();
 sc.close();
	 
 }
	
	
	}

	}
