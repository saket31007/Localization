package mytests;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfigReader.ConfigPropReader;
import Factory.DriverFactory;
import pages.Homepage;

public class HomePageTest {
	
	DriverFactory df;
	
	ConfigPropReader cp;
	Properties prop;
	WebDriver driver;
	Homepage homepage;
	
	@BeforeTest
	public void setup() {
		
		cp = new ConfigPropReader();
		prop =cp.initLangProp("french");
		df =new DriverFactory();
		driver = df.initDriver("chrome", prop);
		homepage = new Homepage(driver);
		
	
		
	}
	
	
	
	@Test
	public void headerTest() {
		
	 Assert.assertTrue(homepage.isHeaderExist(prop.getProperty("header")));
		
	}
	
	
	@Test
	public void contactFooterTest() {
		
	 Assert.assertTrue(homepage.isContactExist(prop.getProperty("contact")));
		
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.quit();
		
	}

}
