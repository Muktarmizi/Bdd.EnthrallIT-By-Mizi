package stepDefinition;

import org.junit.Assert;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Enrollment_process;

public class EnrollnowStepDefinition extends BaseClass {

    Enrollment_process enrollment_process;

    @Given("the user is on the Enthrall IT homepage")
    public void theUserIsOnTheEnthrallITHomepage() {
        driver.get("URL_of_Enthrall_IT_homepage");
        enrollment_process.landing_on_dashboard();
    }

    @When("the user clicks on the {string} tab to navigate to the Automation page")
    public void theUserClicksOnTheTabToNavigateToTheAutomationPage(String tabName) {
        enrollment_process.step_one_Click_on_automation_to_navigate_to_automation_page();
        
    }

    @When("the user clicks {string} to navigate to the Enrollment page")
    public void theUserClicksToNavigateToTheEnrollmentPage(String buttonName) {
       enrollment_process.click_enroll_Now_to_navigate_to_enrollhome_page();
    }

    @When("the user enters valid details in each required field for enrollment")
    public void theUserEntersValidDetailsInEachRequiredFieldForEnrollment() {
    	enrollment_process.happy_path_enters_valid_details_in_each_required_field_for_enrollment();;
    }

    @When("the user double-clicks on {string} to accept")
    public void theUserDoubleClicksOnToAccept(String termsText) {
        enrollment_process.acceptTerms();
    }

    @Then("the user clicks the {string} button, and they are navigated to the success page")
    public void theUserClicksTheButtonAndTheyAreNavigatedToTheSuccessPage(String buttonName) {
        enrollment_process.submitEnrollment();
        Assert.assertTrue("Enrollment success page was not displayed!", enrollment_process.is_Success_Page_Displayed());
    }
}
