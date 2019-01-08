
package utubemp3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.Server;

import selenium.OpenPrintEmailAttachment;
import org.apache.commons.io.FileUtils;

public class YoutubeMp3Script extends InitiateBrowser {
    /*
     * inheritance protected static service 
     * ChromeDriverService private WebDriver driver/
     */

    public void script() {
       //go to page
        driver.get("https://ytmp3.cc/");

        //click video
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("video")));
        driver.findElement(By.name("video")).sendKeys(Keys.LEFT_CONTROL + "v");
        driver.findElement(By.name("video")).submit();

        
        //wait, then click download
        wait.until(ExpectedConditions.elementToBeClickable(By.id("download")));
        driver.findElement(By.id("download")).click();

        //absolute path of download folder
        File dlDir = new File("C:\\Users\\2flare\\Downloads");
        
        //get text node of element containing the name of the file from the webpage.
        JavascriptExecutor js= (JavascriptExecutor)driver;     
        String fileName=(String) js.executeScript("return document.getElementById('title').firstChild.nodeValue;");
        
        //
       ScanDirChanges.getFullPathDownload(dlDir , fileName);
       
       
      driver.get("chrome://downloads/");
      
  
      
      
     
      service.stop();
     
    }

    public static void main(String[] args) {

        YoutubeMp3Script.createAndStartService();
        YoutubeMp3Script UtubeMp3Obj = new YoutubeMp3Script();
        UtubeMp3Obj.createDriver();
        UtubeMp3Obj.script();
        
    }

}
