package utubemp3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class InitiateBrowser {

    protected static ChromeDriverService service;
    protected WebDriver driver;

   
    
    public static void createAndStartService() {
      service = new ChromeDriverService.Builder()
          .usingDriverExecutable(new File("C:/Users/2flare/Desktop/selenium/chromedriver.exe"))
          .usingAnyFreePort()
          .build();
      try {
        service.start();
    } catch (IOException e) {
        System.out.println("caught error starting service");
        e.printStackTrace();
    }
    } 
    
    public static void createAndStopService() {
        service.stop();
      }

    
      public void createDriver() {
        driver = new RemoteWebDriver(service.getUrl(),
            DesiredCapabilities.chrome());
      }

    
      public void quitDriver() {
        driver.quit();
      }
       
    
}
