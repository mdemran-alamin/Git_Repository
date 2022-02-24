package Alibaba;

import org.openqa.selenium.By;

public class Alibaba_Search_Camera_Test extends Base {

	public static void main(String[] args) throws InterruptedException {

		// go to Alibaba site
		browser_set();
		browser.get("https://alibaba.com");
		browser.manage().window().maximize();

		// Enter 'Camera' in Search box
		// browser.findElement(By.xpath("//header//input[@type='text']")).sendKeys("Camera");
		sendKeys("//header//input[@type='text']", "Camera");

		// Click search button

		// browser.findElement(By.xpath("//header//i[@class='ui-searchbar-button-icon']")).click();

		click("//header//i[@class='ui-searchbar-button-icon']");

		Thread.sleep(1000);
		// browser.close();

	}// main

	static void click(String xPath) {
		browser.findElement(By.xpath(xPath)).click();
	}

	static void sendKeys(String xPath, String Value) {
		browser.findElement(By.xpath(xPath)).sendKeys(Value);
	}

}// class
