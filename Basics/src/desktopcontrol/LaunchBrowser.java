package desktopcontrol;

import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

public class LaunchBrowser {

		

	public static void main(String[] args) throws IOException   {  //note throws mandatory for the .browse method(hover over it to verify)
			
			Scanner keyIn = new Scanner(System.in);
			System.out.println("Enter a website url");
			String url="http://www."+keyIn.next()+".com";	
			keyIn.close();
			System.out.print(url);
				
	System.out.println();
	URI uri = URI.create(url);   //parses(using .create method of URI class) the url into URI type. 

	if (Desktop.isDesktopSupported())
	  Desktop.getDesktop().browse(uri); 

		
		}
		}
