package desktopcontrol;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DecryptFile {

	public static void main(String[] args) {
		
		
Scanner fileIn = null; 
	
		
		try 
		{
			fileIn = new Scanner(new FileInputStream("C:\\Users\\2flare\\Dropbox\\New Folder\\New Text Document.txt"));

		}              
		
		
		catch (FileNotFoundException e)      
		{
			
			System.out.println("File not found.");
			System.exit(0);
		}
		
		String text="";
		
		while(fileIn.hasNextLine())
		{
		text+=fileIn.nextLine()+"\n";	
		}

		
	
	for (int i=0;i<=text.length()-1;i++)
	{
		text=(text.replace('!','w'));
	}

	String temp2="";
	for (int i=0;i<=text.length()-1;i++)
	{
		temp2+=(char)(text.charAt(i)-3);
	}
	
	for (int i=0;i<=text.length()-1;i++)
	{
		temp2=(temp2.replaceAll("\\p{C}","\n"));   //removes all [?] nonprintable unicode characters produced from initial encryption.
	}

	System.out.print(temp2);
	
	



	}
	
}
