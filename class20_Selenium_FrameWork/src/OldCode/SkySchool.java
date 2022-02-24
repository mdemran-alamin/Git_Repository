package OldCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkySchool {
	public static void main(String[] args) throws InterruptedException {
		// Recording 4

		// Step 1: Download Selenium Executable - SeleniumHQ.org -> Selenium.dev
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");

		/*
		 * Step 2 Download Selenium Jars for Java Cut and Paste in c:\java\driver folder
		 * and extract Right click on Project->Build Path->Configure Build Path Click
		 * Ligrary Tab Click Class Path Click 'Add External Jars' button Add 2 Jara
		 * Files from Selenium Folder Then Click on Class Path again And open Libs
		 * folder and Select 5 Jar files Then Click Apply and Close
		 */
		WebDriver browser;
		browser = new ChromeDriver();

		// browser.get("https://sit.skyschooling.com/selenium01");
		browser.get("https://sit.skyschooling.com//sdet//selenium//xpath//index.html");
		// browser.get("file:///C:/Java21Jun/Class%20videos/Class%2019%20-%20Selenium%202/index.html");

		Thread.sleep(3000);
		// Locate the Element which Id is firstName
		WebElement fName = browser.findElement(By.id("firstName"));
		fName.sendKeys("Joe");

		Thread.sleep(2000);
		WebElement lName = browser.findElement(By.name("LastName"));
		lName.sendKeys("Biden");

		WebElement email = browser.findElement(By.className("email"));
		email.sendKeys("abcmmmmmmm@gmail.com");

		WebElement tag = browser.findElement(By.tagName("textarea"));
		tag.sendKeys("9172574204");

		// linkedText
		// WebElement linkedText = browser.findElement(By.linkText("Visit My Linkedin
		// Accout"));
		// linkedText.click();

		// PartialLinkedText
		WebElement partialLinkedText = browser.findElement(By.partialLinkText("Linkedin"));
		partialLinkedText.click();

		// Navigate to backward of current tab
		browser.navigate().back(); // it is Chain method

		// xPath
		// Enter Address
		WebElement address = browser.findElement(By.xpath("/html/body/table/tbody/tr[7]/td[2]/input"));
		address.sendKeys("123 test drive");

		// WebElement button =
		// browser.findElement(By.xpath("//button[@id='submit_result']"));
		// button.click();

		browser.findElement(By.xpath("//button[@id='submit_result']")).click();

		// cssSelectors - back

		// .jar means Java ARchive
		// JAR files are a group of class fine

		Thread.sleep(1000);
		// browser.close();
	}
	
}