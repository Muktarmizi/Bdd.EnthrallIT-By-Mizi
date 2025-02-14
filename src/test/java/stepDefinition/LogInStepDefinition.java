package stepDefinition;

import baseUtil.BaseClass;
import static org.junit.Assert.*;
import baseUtil.HookClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import baseUtil.HookClass;
import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.HookTestStep;
import pages.LogIn;

public class LogInStepDefinition extends BaseClass {

	@Given("User is on the enthrall IT Homepage URL")
	public void user_is_on_the_enthrall_it_homepage_url() {
		logIn.logo_and_title_validation();
	}

	@When("User click on Login Button navigated to Login Page")
	public void user_click_on_login_button_navigated_to_login_page() {
		logIn.click_login_from_menu_section();
	}

	@When("User enter Email in the Email field")
	public void user_enter_email_in_the_email_field() {
		logIn.email();
	}

	@When("User enter Password in the Password field")
	public void user_enter_password_in_the_password_field() {
		logIn.password();
	}

	@When("User finally click on Login Button")
	public void user_finally_click_on_login_button() {
		logIn.click_login_button();

	}

	@Then("User will navigate to DashBoard Page")
	public void user_will_navigate_to_dash_board_page() {
		logIn.landing_on_dashboard();
	}

	@When("User click on Login Button to navigate to login page")
	public void click_on_login_button_to_navigate_to_login_page() {
		logIn.click_login_from_menu_section();
	}

	@When("User enter UserId as {string}")
	public void user_enter_user_id_as(String string) {
		logIn.emailId(string);
	}

	@When("User enter Password as {string}")
	public void user_enter_password_as(String string) {
		logIn.password(string);
	}


}
