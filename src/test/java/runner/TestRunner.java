package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@login",
		features = "src/test/java/feature",
		glue = {"stepDefinition" , "baseUtil" }, 
		//monochrome = true,
		//dryRun = false,
		plugin = {"pretty", "html:target/report.html", "json:target/report.json", "junit:target/report.xml"}
		)
public class TestRunner {

}

/*
 * html:target/cucumber-reports/report.html", 
        "json:target/cucumber-reports/report.json"
    
    html:target/report.html", "json:target/report.json", "junit:target/report.xml
 */


 // "@smoke or @sanity or @regression or @login",