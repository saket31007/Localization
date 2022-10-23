package mytests;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
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
	@Parameters({"lang" , "browser"})
	
	
	
	public void setup(String lang, String browser) {
		
		cp = new ConfigPropReader();
		prop =cp.initLangProp(lang);
		df =new DriverFactory();
		driver = df.initDriver( browser , prop);
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
