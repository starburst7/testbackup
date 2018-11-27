package desktopcontrol;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedWriter;

public class Encryptor2 {
	
	static String address="";
	static String text="";

	public static void main(String[] args) {
		
		Scanner userIn= new Scanner(System.in);
		
		//Welcome message
		System.out.println("Commencing Encrypting Program...\n");
		System.out.print("If you would like to encrypt your file enter 1.\nIf you would like to Decrypt your file press 2\nIf you would like to abort press 3\n\n");
		int option= userIn.nextInt();
	
		//invalid option error message
		while(option!=1&&option!=2&&option!=3)
		{
			System.out.print("Error. Option is invalid. Please try again: ");
			option= userIn.nextInt();
		}
		
		//quit option
		if (option==3)
		{
			System.out.print("Aborting program...thank you");
			System.exit(0);
		}	
		
		//encryption option
		if(option==1)
		{
		System.out.print("Please enter the system address of the file you want to encrypt (Ex: C:\\xx\\New Text Document.txt): ");
		System.out.println();
		encryptor();
		writing();
		System.out.print(text);
	}
	//decryption option
	if(option==2)
	{
	System.out.print("Please enter the system address of the file you want to decrypt (ex:  C:\\xxx\\New Text Document.txt    ): ");
	System.out.println();
	decryptor();
	writing();
	System.out.print(text);
	}
	
	userIn.close();
}
	
	
	
	public static String decryptor()
	{
		
Scanner keyIn = new Scanner(System.in);
address= keyIn.nextLine();

String temp="";
for (int i=0;i<=address.length()-1;i++)
{
temp=address.replace('\\', '*');
temp=temp.replace("*", "\\\\");

}
address=temp;

Scanner fileIn2 = null; // initializes fileIn to empty
		
		
		//NOTE:    try and catch must be BOTH included for error message.      
		
		try 
		{
			// connects the file as a input source to the Scanner object fileIn
			fileIn2 = new Scanner(new FileInputStream(address));

		}                   /// ***** IMPORTANT!! What happens if File doesn't exist?
		                   //Hover mouse over fileInputStream... it mentions that if file not found then our THROWS is=>FileNotFoundException
								///                               Thus, we need to use it as our parameter for our CATCH.
		
		
		catch (FileNotFoundException e)      
		{
			// If the file could not be found, this code is executed
			System.out.println("File not found.");
			System.exit(0);
		}
		
		
		
		while(fileIn2.hasNextLine())
		{
		text+=fileIn2.nextLine()+"\n";	
		}
		
		
		for (int i=0;i<=text.length()-1;i++)
		{
			text=text.replace('!','w');
		}
		
		String temp2="";
		for (int i=0;i<=text.length()-1;i++)
		{
			temp2+=(char)(text.charAt(i)-3);
		}
		
		for (int i=0;i<=text.length()-1;i++)
		{
			temp2=(temp2.replaceAll("\\p{C}","  "));   //removes all [?] nonprintable unicode characters produced from initial encryption.
		}
		
		fileIn2.close();
		keyIn.close();
text=temp2;
		return (text);
		
		// C:\\Users\\2flare\\Desktop\\fab.txt
	}
	
	
	
	public static String encryptor() {
		
		Scanner keyIn2 = new Scanner(System.in);
		address= keyIn2.nextLine();
		
		String temp="";
		for (int i=0;i<=address.length()-1;i++)
		{
		temp=address.replace('\\', '*');
		temp=temp.replace("*", "\\\\");

		}
		address=temp;
		

Scanner fileIn = null; // initializes fileIn to empty
		
		
		//NOTE:    try and catch must be BOTH included for error message.      
		
		try 
		{
			// connects the file as a input source to the Scanner object fileIn
			fileIn = new Scanner(new FileInputStream(address));

		}                   /// ***** IMPORTANT!! What happens if File doesn't exist?
		                   //Hover mouse over fileInputStream... it mentions that if file not found then our THROWS is=>FileNotFoundException
								///                               Thus, we need to use it as our parameter for our CATCH.
		
		
		catch (FileNotFoundException e)      
		{
			// If the file could not be found, this code is executed
			System.out.println("File not found.");
			System.exit(0);
		}
		
		
		
		while(fileIn.hasNextLine())
		{
		text+=fileIn.nextLine()+"\n";	
		}
		
		
		String temp2="";
		for (int i=0;i<=text.length()-1;i++)
		{
			temp2+=(char)(text.charAt(i)+3);
		}
		
		
		for (int i=0;i<=temp2.length()-1;i++)
		{
			text=(temp2.replace('w','!'));
		}


keyIn2.close();
fileIn.close();
		return (text);
		
		
		
		
	
		
	}
	
	
	public static void writing() {
		
	
        try {
        	
        	
        	//Whatever the file path is.
            File statText = new File(address);
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            w.write(text);
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file");
        }
    }

 
      
    
}


