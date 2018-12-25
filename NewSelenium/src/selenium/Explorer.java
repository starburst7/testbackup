package selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.*;

public class Explorer {

    private static ChromeDriverService service;
    private WebDriver driver;

    
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

    
      public void testGoogleSearch(String userIn,String passwdN) {
          
        driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1545765971&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fRpsCsrfState%3db11f4bde-cefb-f842-6d5a-c116807b1107&id=292841&aadredir=1&whr=live.ca&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
        
        //wait 500 nanoseconds
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        WebElement userN = driver.findElement(By.name("loginfmt"));
        userN.sendKeys(userIn);
        WebElement next = driver.findElement(By.id("idSIButton9"));
        next.click();
        
        
        //wait 500 nanoseconds
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       WebElement userPwd = driver.findElement(By.name("passwd"));
        
        userPwd.sendKeys("tew73vew");
        userPwd.click();
        userPwd.sendKeys(Keys.ENTER);
        
        
        
        
        
        
     
    
       
        /*FOR GOOGLE
          driver.get("https://www.google.com");
       WebElement google = driver.findElement(By.name("q"));
        google.sendKeys("apple");
        google.submit();
        */
      }

      public static void main(String[] args) {
          

         /* Scanner keyIn = new Scanner(System.in); 
          System.out.print("Enter your email: ");
          String userIn=keyIn.nextLine();
          System.out.print("Enter your pwd: ");
          String pwd=keyIn.nextLine();
          System.out.println("ok...please wait");
          */
          
          Explorer.createAndStartService();
          Explorer test = new Explorer();
          test.createDriver();
          test.testGoogleSearch("dutt.a@live.ca","tew73Vew");
          
          
          
      }



    
}
