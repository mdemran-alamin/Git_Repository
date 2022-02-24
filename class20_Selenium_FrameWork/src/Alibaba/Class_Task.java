package Alibaba;

public class Class_Task extends Base{

	
	public static void main(String[] args) throws InterruptedException  {

		browser_set();
		
		// navigate Alibaba
		navigateURL("https://www.alibaba.com");
		
		// click help center from footer
		Thread.sleep(2000);

		click("//a[text()='Help Center']");
		
		
		
		
		// Search 'toys' in search box
		
		Thread.sleep(5000);
		sendKeys("//input[@class='ant-input ant-input-lg']","toys");
	
		
		// click Sourcing tab

		
		// Check "Help Center for buyers" is visible
		
		/*
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
	}// main

}// class
