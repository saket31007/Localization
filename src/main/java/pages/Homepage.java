package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtil;

public class Homepage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	public Homepage(WebDriver driver) {
		
		this.driver = driver;
		
		elementUtil =new ElementUtil(driver);
	}

	private WebElement getHeaderElement(String headerValue) {
		
		 String headerValueXpath = "//a[contains(text(), '"+headerValue+"' )]";
		 return elementUtil.getElement("xpath", headerValueXpath);
	}
	
	
	public boolean isHeaderExist(String headerValue) {
		
		String header = getHeaderElement(headerValue).getText();
		System.out.println(header);
		
		return getHeaderElement(headerValue).isDisplayed();
	}
	
	
	
	private WebElement getContactElement(String contactValue) {
		
		 String contactValueXpath = "//a[contains(text(), '"+contactValue+"' )]";
		 return elementUtil.getElement("xpath", contactValueXpath);
	}
	
	public boolean isContactExist(String contactValue) {
		
		String contact = getHeaderElement(contactValue).getText();
		System.out.println(contact);
		
		return getContactElement(contactValue).isDisplayed();
	}
	
	
	
	
}
