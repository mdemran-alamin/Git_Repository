package pages;

import org.openqa.selenium.By;
import base_Pom.Base;

public class EmployeeLoginPage extends Base {

	By userIdBox = By.name("mailuid");
	By userPasswordBox = By.name("pwd");
	By loginButtonClick = By.name("login-submit");
	By employeeLogin = By.xpath("//h1[text()='Employee Login ']");

	public void enterUserId(String useId) {
		browser.findElement(userIdBox).sendKeys(useId);
	}

	public void enterUserPassword(String password) {
		browser.findElement(userPasswordBox).sendKeys(password);
	}

	public void clickLoginBtn() {
		browser.findElement(loginButtonClick).click();
	}

	public String getEmployeeLoginLabel() {
		return browser.findElement(employeeLogin).getText();
	}
}
