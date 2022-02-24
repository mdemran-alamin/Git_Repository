package step_definitions;

import static org.junit.Assert.assertEquals;

import base_Pom.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeLoginPage;
import pages.HomePage;
import pages.LandingPage;

public class TestDef_Login_Functionalities extends Base {

	LandingPage landingPage = new LandingPage();
	EmployeeLoginPage empLogin = new EmployeeLoginPage();
	HomePage homePage = new HomePage();

	@Given("I am in landing page")
	public void i_am_in_landing_page() {
		landingPage.navigateUrl();

	}

	@When("I click on Login Menu")
	public void i_click_on_Login_Menu() {
		landingPage.click_Login_Button();

	}

	@Then("verify I am in Employee Login Page")
	public void verify_I_am_in_Employee_Login_Page() {
		soft.assertThat("Employee Login").isEqualTo(empLogin.getEmployeeLoginLabel());

	}

	@Then("I enter Login Id")
	public void i_enter_Login_Id() {

		empLogin.enterUserId("testpilot@gmail.com");
		
		
	}

	@Then("I enter Password")
	public void i_enter_Password() {
		empLogin.enterUserPassword("1234");

	}

	@Then("Click on Login Button")
	public void click_on_Login_Button() {
		empLogin.clickLoginBtn();

	}

	@Then("I will be in my Home page")
	public void i_will_be_in_my_Home_page() {

		assertEquals("Welcome Test",homePage.getWelcomeText());
	}

}
