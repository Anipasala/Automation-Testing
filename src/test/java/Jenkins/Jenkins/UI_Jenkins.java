package Jenkins.Jenkins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class UI_Jenkins {

    @Test
    public void Tc_001() throws InterruptedException {

        // Set up WebDriverManager to automatically manage the chromedriver
       WebDriverManager.chromedriver().setup();
        
        // Optional: Set ChromeOptions to make it headless or configure other settings
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Optional: to start the browser maximized
        
        // Initialize the WebDriver (ChromeDriver) with the ChromeOptions
        WebDriver d = new ChromeDriver(options);
        
        // Navigate to Amazon
        d.get("https://www.facebook.com/");
        
 
        d.findElement(By.id("email")).sendKeys("laptops");
    
        
        // Optionally, wait for some time to observe the result
        Thread.sleep(5000);
        
        // Close the browser
        d.quit();
    }
}
