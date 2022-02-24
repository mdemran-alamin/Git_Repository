package Alibaba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alibaba_Create_A_Posting_Link_Is_Enabled_Test {

	public static void main(String[] args) throws InterruptedException {

		// set ChromeDriver.exe path as property 
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Driver\\chromedriver.exe");

		// Declare a WebDriver class  
		WebDriver browser;

		browser = new ChromeDriver();
		
		browser.get("https://alibaba.com");
						
		//Check Search Box  is Enabled or not? 
		WebElement searchBox= browser.findElement(By.xpath("//header//input[@name='SearchText']"));
		
		boolean a= searchBox.isEnabled();
		
		if (a==true) {
			System.out.println("SearchBox is Enabled");
		}
		else {
			System.out.println("SearchBox is not Enabled");
		}
		
		Thread.sleep(2000);
		browser.close();
		
		
		
		
	}

}
