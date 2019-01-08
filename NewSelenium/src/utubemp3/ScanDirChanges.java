package utubemp3;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

public class ScanDirChanges {  //Purpose:  1) return File obj with path of downloaded file from chrome
                               //          2) to help pause and wait for a download to be finished
                              //               (reusable code for other programs)

    public static File getFullPathDownload(File directory, String fileName) {
    
        
    File filePath= new File(directory.getAbsolutePath()+"\\"  +fileName+".mp3.crdownload");
  
 
   //path of temporary download file. Once download completes, it no longer exists
   // then the true file appears.
 
    System.out.println(filePath.toString());
    

    
    
    
    
    //delay a little bit
    try {
        TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    //loop->wait.  until chrome temporary download file is replaced by actual file when dLoading finished
    while(filePath.exists()==true )
        try {
            if(filePath.exists()==true ) 
            System.out.println("building temporary crdownload file...please wait.");
            TimeUnit.SECONDS.sleep(2);
            
            if(filePath.exists()==false )
            System.out.println("deleted crdownload file");
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    System.out.println("done...\n"+fileName+".mp3 created!");
    
    //returns File for actual file.
    return filePath;
    
   
    

  
    
}

}