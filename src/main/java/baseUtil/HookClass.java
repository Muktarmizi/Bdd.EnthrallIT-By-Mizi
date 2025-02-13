package baseUtil;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Configuration;
import static utils.IConstant.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class HookClass {
	static BaseClass baseClass;

	@BeforeAll
	public static void beforeAllTest() {
		baseClass = new BaseClass();
	}

	@Before
	public void beforeEachTest() {
		baseClass.setUp();
	}

	@After
	public void afterEachTest(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] bytes = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(bytes, "image/png", "error.png");
		}
		baseClass.tearUp();
	}

	@AfterAll
	public static void afterAllTest() {
		baseClass = null;
	}

}
