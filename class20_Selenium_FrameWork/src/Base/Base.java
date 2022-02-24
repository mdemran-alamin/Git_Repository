package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	//Declare a WebDriver class variable which name is browser 
	public static WebDriver browser;	
	
	public static void browser_setup() {
		//Set ChromeDriver.exe path as property
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
		//instantiate browser by ChromeDriver() Constructor
		browser = new ChromeDriver();	
		
		browser.manage().window().maximize();
	}
	
	public static void click(String xPath) {
		browser.findElement(By.xpath(  xPath ) ).click();
	}
	
	public static void sendKeys(String xPath, String value) {
		browser.findElement(By.xpath( xPath )).sendKeys( value );
	}
	
	public static boolean isDisplayed(String xPath){
		WebElement element = browser.findElement(By.xpath( xPath ) );
		return element.isDisplayed();
	}
	
	public static boolean isEnabled(String xPath){
		WebElement element = browser.findElement(By.xpath( xPath ) );
		return element.isEnabled();
	}
	
	public static void navigateURL(String url) {
		browser.get( url );
	}
	
	
	
	
}
