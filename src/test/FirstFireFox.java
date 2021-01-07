package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstFireFox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\UiAutomation\\Drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.ae/");

        String expectedTitle = "Shop";  // i don't have create a String , i can pass it right away 
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }


         String expectedUrl = "amazon";
         String actualURL = driver.getCurrentUrl();
         if(actualURL.contains(expectedUrl)){
             System.out.println("URL verification PASSED");
         }else {
             System.out.println("URL verification FAILED");
         }
         driver.close();

    }
}
