package Jenkins.Jenkins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UI_Jenkins {
    @Parameters ("Browser")
	@Test
	public void Tc_001(String browserName) {
    	
    	WebDriver d=null;
    	
    	if(browserName.contains("Chrome")) {
    		WebDriverManager.chromedriver().setup();
    		d =new ChromeDriver(); 
    	}
    	else if(browserName.contains("Edge")) {
    		WebDriverManager.edgedriver().setup(); 
    		d =new EdgeDriver();
    	}

		


		d.get("https://www.facebook.com/");


		d.findElement(By.id("email")).sendKeys("laptops");


		




		d.quit();
	}
}
