 package pages;

import org.openqa.selenium.By;


import base_Pom.Base;

public class LandingPage extends Base{

	
	
	By loginBtn = By.xpath("//a[@href='elogin.php']");
	
	public void navigateUrl() {
		browser.get("https://sit.skyschooling.com/microtech");
	}
	
	public void click_Login_Button(){
		browser.findElement(loginBtn).click();
	}
	

	
	
}
