
package desktopcontrol;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadTextFile {

	public static void main(String[] args) {
		Scanner fileIn = null; // initializes fileIn to empty
		
		
		//NOTE:    try and catch must be BOTH included for error message.      
		
		try 
		{
			// connects the file as a input source to the Scanner object fileIn
			fileIn = new Scanner(new FileInputStream("C:\\Users\\2flare\\Desktop\\Java Applications\\websites.txt"));

		}                   /// ***** IMPORTANT!! What happens if File doesn't exist?
		                   //Hover mouse over fileInputStream... it mentions that if file not found then our THROWS is=>FileNotFoundException
								///                               Thus, we need to use it as our parameter for our CATCH.
		
		
		catch (FileNotFoundException e)      
		{
			// If the file could not be found, this code is executed
			System.out.println("File not found.");
			System.exit(0);
		}
		
		
		
		
		String name;
		System.out.println("Text that was read in file \"JavaTest\" and still has content to read?"
				+ " Answer is: " + fileIn.hasNextLine());
		name = fileIn.nextLine(); /*dummy*/

		System.out.println("url 1: " + name);
		
		System.out.println("Text left to read? " + fileIn.hasNextLine());
		name = fileIn.nextLine();
		System.out.println("url 2 is: "+name);
		fileIn.close();
	}
}

// Question