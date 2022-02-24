package Alibaba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	//Declare a WebDriver class variable which name is 'browser"
	static WebDriver browser;
	
	static void  browser_set() {
		
		// Set ChromeDriver.exe path as property
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Driver\\chromedriver.exe");

		
		//instantiate browser by ChromeDriver() Constructor
		browser = new ChromeDriver();
		browser.manage().window().maximize();
	}//main
	static void click(String xPath) {
		browser.findElement(By.xpath(xPath)).click();
	}
	
	static void sendKeys(String xPath, String Value ) {
		browser.findElement(By.xpath(xPath)).sendKeys(Value);
		System.out.println(xPath + "=========" + Value);
	}
	
	static boolean isDisplayed (String xPath) {
		WebElement element = browser.findElement(By.xpath(xPath));
		return element.isDisplayed();
	}
		static boolean isEnabled (String xPath) {
			WebElement element = browser.findElement(By.xpath(xPath));
	
		return element.isDisplayed();
	}
	static void navigateURL(String url) {
		browser.get(url);
	}
	

}//class
