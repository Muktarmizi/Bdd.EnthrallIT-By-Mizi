package stepDefinition;

import baseUtil.BaseClass;
import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepDefinition extends BaseClass {

	@Given("User is on the enthrall IT Homepage URL {string}")
	public void user_is_on_the_enthrall_it_homepage_url() {
		logIn.logo_and_title_validation();
	}

	@When("Click on login from Menu Section")
	public void click_on_login_from_menu_section() {
		logIn.click_login_from_menu_section();
	}

	@When("User enter UserId in the User field")
	public void user_enter_user_id_in_the_user_field() {
		logIn.user_id();
	}

	@When("User enter Password in the Password field")
	public void user_enter_password_in_the_password_field() {
		logIn.password_in();
	}

	@When("User finally click on Login Button")
	public void user_finally_click_on_login_button() {
		logIn.click_login_button();
	}

	@Then("User will navigate to DashBoard Page")
	public void user_will_navigate_to_dash_board_page() {
		logIn.landing_on_dashboard();
	}

}
