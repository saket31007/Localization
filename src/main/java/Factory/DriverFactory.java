package Factory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public WebDriver initDriver(String browser, Properties prop) {
		
		System.out.println("Browser name is : " + browser );
		
		switch (browser.toLowerCase()) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
			break;
		case "firefox":
			
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;	

		default:
			System.out.println("please pass the right browser name...." + browser);
			break;
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
		
		
	}
	
	

}
