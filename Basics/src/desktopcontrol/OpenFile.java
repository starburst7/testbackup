package desktopcontrol;

import java.awt.Desktop;

import java.io.File;
import java.io.IOException;

import com.sun.glass.events.KeyEvent;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.AWTException;


public class OpenFile {


	
	
	public static void main(String args[]) throws IOException, AWTException {    //throw is a requirement of .open method. 
		
		
		
		Robot robo = new Robot();	
		
		
if((Desktop.getDesktop().isSupported(Desktop.Action.OPEN)))   //test to see if opening a file is supported by current platform.		
{
	
try {	
File file= new File("C:\\Users\\2flare\\Desktop\\abc.txt");   //create object of type File to hold instance of target file

Desktop.getDesktop().open(file);  








}                                                                             



///// ***** IMPORTANT!!: What if file doesn't exist?  aHover mouse over .open to see all possible errors (Throws)
//... it mentions IllegalArgumentException  if file is not found.
//**Therefore, we need to use this parameter inside of our catch code below.
//the code will compile without it. However, it would crash if the file didn't exist.
catch (IllegalArgumentException e)
{
	// If the file could not be found, this code is executed
	// and then the program exits
	System.out.println("File not found.");
	System.exit(0);
}

	
	
}
	

else
System.out.print("This action is not supported by your current platform"); 






	}	

	}

