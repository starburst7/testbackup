package recursive;

import java.io.File;

public class SearchForFile{
	
	

//  feed path => check if its a directory => if yes, scan each item in inventory 
// 																				 => if an item is another directory=> recurse(feed directory)
//																						-return results if recursion returns non-empty
//																						- don't do anything if recursion is empty!!!  (no return stmt)
//																				=> else, item must be a file (verify name)
//                                                                                      -return if name matches
//																						-don't do anything if no match (no return stmt)
	
//            => if initial path wasn't directory => Error message "path is not a directory"	
		
	

	public static String searchForFile(File dir, String target) {
	String result = "";
	
	
	 // If dir is not a directory, return
	 if (!dir.isDirectory())
	 return "Path is not a directory.";
	
	 
	 
	 
// Check each item in the directory
for (File folderItem : dir.listFiles())    //for every element(file obj) in array  dir.listFiles()
{
		 
		 
 
	 if (folderItem.isDirectory())    // Recurse if it's a directory
	 {
	 result = searchForFile(folderItem,target);
	 // Return the result if it is not empty
	 if (!result.equals(""))
	 return result;
	 }
	 
	 
	 
	 else       // if its not a directory, then it's a file, check for a match
	 {
	 if (folderItem.getName().equals(target))    
	 return folderItem.getAbsolutePath();      //trigger return stmt ONLY if there's a match.  If there's no match NO return stmt.
	 }
	 
	 
}
	 // If we got here, nothing was found
	 return "";
}
	

	

	public static void main(String[] args) {
		
		
		// The root folder to search
		 File rootFolder = new File("C:\\Users\\2flare\\");
		 String result = searchForFile(rootFolder, "binary1.dat");
		 if (!result.equals(""))
		 System.out.println(result);
	 else
		 System.out.println("File not found.");
		
		
	}

}
