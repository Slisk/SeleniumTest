package SeleniumPackage;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert; 

public class MyFirstTest {

	@Test
	public void startWebDriver() {
		WebDriver driver = new FirefoxDriver();  
		
		driver.navigate().to("https://www.youtube.com/");  
		
		Assert.assertTrue("title should start differently",
							driver.getTitle().startsWith("Facebook")); 
		driver.close();
	}

}
