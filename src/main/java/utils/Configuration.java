package utils;

import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Configuration {

	private Properties properties = new Properties();
	
	// This is a default Constructor
	// Why I am putting loadProperty () method inside constructor
	// because when Configuration class is instantiated (means when it will create object)
	// then default Constructor will be initialized, the method loadproperty() present inside the Constructor will also be initialized, 
	// and help to load the config.properties file
	public Configuration() {
		loadProperty();
	}
	
	public void loadProperty() {
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	// Individual return type parameterized method created
	public String getProperties(String KEY) {	
		return properties.getProperty(KEY);
	}

}

