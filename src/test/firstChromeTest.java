package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstChromeTest {
    public static void main(String[] args) {
        // tell where is the driver that can talk to your specific browser
        // the name of the tech driver "webDriver.chrome.driver" --first parameter
        // second parameter path to your driver
        System.setProperty("webdriver.chrome.driver","C:\\UiAutomation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        // this line creates an instance of driver which means create an empty browser instance
        WebDriver driver = new ChromeDriver();
        // driver.get(url) tells the browser to go to the specific browser
        driver.get("https://www.google.com/");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }


        String expectedUrl = "google";
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains(expectedUrl)){
            System.out.println("Url verification PASS");
        }else {
            System.out.println("Url verification FAILED");
        }

        driver.close();
    }
}
