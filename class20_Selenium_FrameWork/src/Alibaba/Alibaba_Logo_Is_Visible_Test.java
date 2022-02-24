package Alibaba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alibaba_Logo_Is_Visible_Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Driver\\chromedriver.exe");

		WebDriver browser;

		browser = new ChromeDriver();

		browser.get("https://alibaba.com");

		// check the logo Alibaba exist in main page

		WebElement logo = browser.findElement(By.xpath(
				"//header//div[@class='sc-hd-cell sc-hd-hide sc-hd-show-s sc-hd-m-logo']/a[@class='J-sc-hd-i-logo sc-hd-i-logo sc-hd-i-logo-new']"));

		boolean a = logo.isEnabled();

		if (a == true) {
			System.out.println("Logo is displayed");
		}

		else {
			System.out.println("Logo is not displayed");
		}

	}// main

}// class
