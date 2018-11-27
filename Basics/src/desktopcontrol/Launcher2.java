package desktopcontrol;

//used for reading text file
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.AWTException;
//used for launching browser
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;






public class Launcher2  {


	
	public static void main(String[] args) throws IOException, AWTException {
		
		Scanner fileIn = null;
		
		
		
		
		 // initializes fileIn to empty
		try {
			// Attempt to open the file
			fileIn = new Scanner(new FileInputStream("C:\\Users\\2flare\\Desktop\\Java Applications\\websites.txt"));

		} catch (FileNotFoundException e) {
			// If the file could not be found, this code is executed
			// and then the program exits
			System.out.println("File not found.");
			System.exit(0);
		}
		
		
		
		//counts how many lines in textfile(each line is has a url)
		//creates array of the same size as number of lines, in order to store String for URLs
		//closes scanner.
		int counter=0;
		while(fileIn.hasNextLine())
		{
			counter++;
			fileIn.nextLine();
		}
		String[] links= new String[counter];
		System.out.println("SCANNING websites.txt ");
		System.out.println(links.length+" URL's found.");
		System.out.println();
		System.out.println("launching browser...please wait");
		System.out.println();
		System.out.println();
		fileIn.close();
		
		
	
	//OPEN another scanner because first one arrived at last line of document. So we had to reset to the begining.	
		Scanner fileIn2 = null; // initializes fileIn to empty
		try {
			// Attempt to open the file
			fileIn2 = new Scanner(new FileInputStream("C:\\Users\\2flare\\Desktop\\Java Applications\\websites.txt"));

		} catch (FileNotFoundException e) {
			// If the file could not be found, this code is executed
			// and then the program exits
			System.out.println("File not found.");
			System.exit(0);
		}
		
		
	//Loop through every line in text and store it into previously created array.	
		for (int i=0;i<=links.length-1;i++)
		{
		links[i] = "http://"+fileIn2.nextLine();
		System.out.println("url #"+i+" is: "+links[i]);
		}
		fileIn2.close();

//loop through array and launch browser
		if (Desktop.isDesktopSupported())
		{
			for (int i=0;i<=links.length-1;i++)
			{
			URI uri = URI.create(links[i]); 	
			Desktop.getDesktop().browse(uri); 
			}
		}
	
		
	
		
		
	}
}



