package Alibaba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alibaba_Search_Text_Box_Is_Visible_Test extends Base {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Driver\\chromedriver.exe");
//
//		WebDriver browser;
//
//		browser = new ChromeDriver();
		
		browser_set();
		
		browser.get("https://alibaba.com");
		
		WebElement searchButton=browser.findElement(By.xpath("//header//div//input[@type='submit']"));
		
		boolean e = searchButton.isEnabled();
		
		if (e==true) {
			System.out.println("SearchBox is Enabled");
		}
		else {
			System.out.println("SearchBox is not Enabled");
		}
	
		
		Thread.sleep(2000);
		browser.close();
		
		
	}//main

}//class
