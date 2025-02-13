package stepDefinition;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogIn;

public class EnrollnowStepDefinition extends BaseClass {

	@Given("User puting value in each field Click Login Button to navigate to Dashboard page")
    public void userPutingValueInEachFieldClickLoginButtonToNavigateToDashboardPage() {
		enrollment_process.landing_on_dashboard();
		
	}

	@When("User Click on Automation to navigate to Automation page")
	public void userClickOnAutomationToNavigateToAutomationPage() {
       enrollment_process.step_one_Click_on_automation_to_navigate_to_automation_page();
	}

	@When("User Click Enroll Now to navigate to enrollhome page")
	public void userClickEnrollNowToNavigateToEnrollhomePage() {
		enrollment_process.click_enroll_Now_to_navigate_to_enrollhome_page();
		

	}

	@When("User Puting value in each field to enrollment process")
	public void userPutingValueInEachFieldToEnrollmentProcess() {
		enrollment_process.happy_path_puting_value_in_each_field_on_enroll_home_page();

	}

	@When("User Double Click on Terms and Condition to select Accept")
	public void userDoubleClickOnTermsAndConditionToSelectAccept() {
        enrollment_process.double_click_to_the_terms_and_condition();
	}

	@Then("User Click Submit Button it will navigate to Successfull Page")
	public void userClickSubmitButtonItWillNavigateToSuccessfullPage() {
        enrollment_process.navigate_to_Successful_page();
	}

}
