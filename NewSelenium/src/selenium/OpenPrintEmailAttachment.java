package selenium;


import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;

import org.openqa.selenium.*;

public class OpenPrintEmailAttachment {

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
        
        
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("loginfmt")));
        
        WebElement userN = driver.findElement(By.name("loginfmt"));
        userN.sendKeys(userIn);
        WebElement next = driver.findElement(By.id("idSIButton9"));
        next.click();
        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.name("passwd")));
       WebElement userPwd = driver.findElement(By.name("passwd"));
        userPwd.sendKeys("tew73vew");
        userPwd.click();
        userPwd.sendKeys(Keys.ENTER);
        
       
        
        
        
       
       
        //opens last e-mail in outlook
        Actions action = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("_3HQ_h7iVcVeOo03bOFpl__")));
        
        
        //Retrieve array with all elements with matching Class name
        //Then Loop through every element's text nodes until text node matches E-mail Title that is desired(ex: Print Job). 
        //Then click that element that has it.
        JavascriptExecutor js= (JavascriptExecutor)driver;     
js.executeScript("var x=0;\r\n" + 
        "var y=document.getElementsByClassName('UwIcdaU4OSkEo-8UcNQB-'); \r\n" + 
        "\r\n" + 
        "for(i=0 ;i<=y.length-1 ; i++){\r\n" + 
        "    var z= y[i].firstElementChild.firstChild.nodeValue.trim();\r\n" + 
        "   if(z ==='Print Job'){   \r\n" +                                  /// THE TEXTNODE IN QUESTION THAT IS SEARCHED FOR
        "    document.getElementsByClassName('UwIcdaU4OSkEo-8UcNQB-')[i].click();\r\n" + 
        "    }\r\n" + 
        "\r\n" + 
        "    else {\r\n" + 
        "        console.log('Attempt at accessing e-mail with the underlying Title failed. It was not found');\r\n" + 
        "    };\r\n" + 
        "}");
        
        
        //opens attachment of the email
        wait.until(ExpectedConditions.elementToBeClickable(By.className("_3FOG-LZJRKbKTlskWczqXJ")));
        action.moveToElement(driver.findElement(By.className("_3FOG-LZJRKbKTlskWczqXJ"))).perform();;
        action.click(driver.findElement(By.className("_3FOG-LZJRKbKTlskWczqXJ"))).perform();
        
        
        ///////get text from a div's text node(name of file). Then use this text(name of file) to launch a new window and then print that window
        //HOW use javascript to get text node from <div> and returns as Object to downcast into String.
        //then we will downcast it from Object to ArrayList of RemoteWebElement base in order to retrieve the element.
        Object textNodeForFileName=js.executeScript("return document.getElementsByClassName('_2rAN8ltsKDy-NItWETekFN _1uQGiBv-yESO7W9wcqabjy _2jA_Nob0bnzClVUjNJfDsr')[0].firstChild.nodeValue");
        System.out.println(textNodeForFileName);
        //click on download from dropdown caused by previous line of code
          action.moveToElement(driver.findElement(By.name("Download"))).perform();;
          action.click(driver.findElement(By.name("Download"))).perform();
          
 
          String fileNameString= (String)textNodeForFileName;    
          String fullPath1 = "C:\\\\Users\\\\2flare\\\\Downloads\\\\"+fileNameString;
          
         
         System.out.print(fullPath1);
         
        driver.get(fullPath1);
         js.executeScript("window.print()");
          
         
          
          
        
             
       
        /*wait 500 nanoseconds
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } */
        
       
        
      
        

        
        
       
        
        
    
       
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
          
          OpenPrintEmailAttachment.createAndStartService();
          OpenPrintEmailAttachment test = new OpenPrintEmailAttachment();
          test.createDriver();
          test.testGoogleSearch("dutt.a@live.ca","tew73Vew");
          
          
          
      }



    
}
