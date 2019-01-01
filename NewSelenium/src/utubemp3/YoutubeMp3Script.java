package utubemp3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.OpenPrintEmailAttachment;

public class YoutubeMp3Script extends InitiateBrowser {
/*inheritance
 *  protected static service ChromeDriverService 
 *  private WebDriver driver/
 */
    
    
    public void script() {
        
        driver.get("https://ytmp3.cc/");
         
        
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("video")));
        
        driver.findElement(By.name("video")).sendKeys(Keys.LEFT_CONTROL+"v");
        driver.findElement(By.name("video")).submit();
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("download")));
        driver.findElement(By.id("download")).click();
        
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    
    
    public static void main(String[] args) {
        
        YoutubeMp3Script.createAndStartService();
        YoutubeMp3Script UtubeMp3Obj = new YoutubeMp3Script();
        UtubeMp3Obj.createDriver();
        UtubeMp3Obj.script(); 
        
        
        
    }
    
    
}
