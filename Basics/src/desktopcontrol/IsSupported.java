package desktopcontrol;

import java.awt.Desktop;

public class IsSupported {

	
	public static void main(String args[]){
		
		//FIRST THING TO ALWAYS VERIFY:  desktop control possible
		System.out.println(Desktop.isDesktopSupported());
		
		
		
		//Format to verify all others.    Desktop.getDesktop().isSupported( Desktop.Action.~~SCROLLTHELIST~~) )
		                                                                     //** just modify blue code below to verify any action**
		//browse file directories
	System.out.println(Desktop.getDesktop().isSupported(Desktop.Action.BROWSE_FILE_DIR));
	

	// launch browser to specific uri
	System.out.println(Desktop.getDesktop().isSupported(Desktop.Action.BROWSE));
	
	
	
	}
}
