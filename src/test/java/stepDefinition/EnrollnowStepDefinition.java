package stepDefinition;

import org.junit.Assert;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Enrollment_process;

public class EnrollnowStepDefinition extends BaseClass {

	@Given("User is on the Enthrall IT Homepage URL")
	public void userIsOnTheEnthrallITHomepageURL() {
		enrollment_process.logo_and_title_validation();
	}

	@When("User click on the Login Button navigated to Login Page")
	public void userClickOnTheLoginButtonNavigatedToLoginPage() {
		enrollment_process.click_login_from_menu_section();
	}

	@When("User enters valid credentials and click on the Login Button")
	public void userEntersValidCredentialsAndClickOnTheLoginButton() {
		enrollment_process.email();
		enrollment_process.password();
		enrollment_process.click_login_button();
	}

	@Then("User should be navigated to Dashboard")
	public void userShouldBeNavigatedToDashboard() {
		enrollment_process.landing_on_dashboard();
	}

	@When("User click on the Automation section")
	public void userClickOnTheAutomationSection() {
		enrollment_process.click_Automation();
	}

	@Then("User should be navigated to the EnrollNow Automation Page")
	public void userShouldBeNavigatedToTheEnrollNowAutomationPage() {
		enrollment_process.navigated_to_Automation_page();
	}

	@When("User click on the EnrollNow Button")
	public void userClickOnTheEnrollNowButton() {
		enrollment_process.click_enroll_Now_to_navigate_to_enrollhome_page();
	}

	@Then("User should be navigated to the Enroll home page")
	public void userShouldBeNavigatedToTheEnrollHomePage() {
		enrollment_process.navigated_to_the_Enroll_home_page();
	}

	@When("User fills in all required fields and click on the Submit Button")
	public void userFillsInAllRequiredFieldsAndClickOnTheSubmitButton() {
		enrollment_process.happy_path_to_automation_then_click_enroll_now_then_input_all_information();
	}

	@Then("User should be navigated to the successful enrollment page")
	public void userShouldBeNavigatedToTheSuccessfulEnrollmentPage() {
		enrollment_process.is_Success_Page_Displayed();
	}

}
