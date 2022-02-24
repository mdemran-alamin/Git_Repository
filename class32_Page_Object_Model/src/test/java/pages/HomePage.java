package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_Pom.Base;

public class HomePage extends Base {
	WebDriver driver;

	
	By WelcomeText = By.xpath("//h2[text()='Welcome Test ']");
	
	public String getWelcomeText() {
		return browser.findElement(WelcomeText).getText();
	}
	 
	
	
}
