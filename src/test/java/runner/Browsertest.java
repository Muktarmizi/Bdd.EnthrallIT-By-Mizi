package runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Browsertest {


	    WebDriver driver;

	    @Before
	    public void setUp() {
	        WebDriverManager.chromedriver().setup(); // WebDriverManager handles ChromeDriver installation
	        driver = new ChromeDriver();
	    }

	    @Test
	    public void openGoogleTest() {
	        driver.get("https://www.google.com");
	        System.out.println("Title of the page: " + driver.getTitle());
	    }

	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
	
