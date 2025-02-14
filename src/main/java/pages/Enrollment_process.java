package pages;

import static common.CommonActions.clickElement;
import static common.CommonActions.clickElementThenTab;
import static common.CommonActions.clickUsingJavascriptExecutor;
//import static common.CommonActions.findYourNameFromTheTable;
import static common.CommonActions.inputText;
import static common.CommonActions.inputTextThenClickTab;
import static common.CommonActions.pause;
//import static common.CommonActions.rightClickActionAccept;
//import static common.CommonActions.rightClickActionDismiss;
//import static common.CommonActions.scrollIntoViewTheElementUsingJavascriptExecutor;
import static common.CommonActions.selectDropdown;
import static common.CommonActions.selectElelementFromDropdownOnebyOne;
import static common.CommonActions.switchToChildWindow;
import static common.CommonActions.validationOfHeader;
import static common.CommonActions.validationOfOtherHeader;
import static common.CommonActions.validationOfSubHeader;
import static common.CommonActions.verifyCurrentUrl;
import static common.CommonActions.verifyErrorMessageUnderTheField;
import static common.CommonActions.verifyLengthOfTheFieldContent;
import static common.CommonActions.verifyTextOfTheWebElement;
import static common.CommonActions.verifyTitle;
import static utils.IConstant.password;
import static utils.IConstant.user_id;

import java.io.File;
import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Attribute;


public class Enrollment_process {
	
	WebDriver driver;
	WebDriverWait wait;

	public Enrollment_process(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "//a[@id='logo-id']")
	WebElement logoElement;

	@FindBy(id = "login-link")
	WebElement loginElement;
	
	@FindBy(xpath = "//a[@id='login-link' and @class='nav-link']")
	WebElement loginHeader;

	@FindBy(xpath = "//h1[text()='Dashboard']")
	WebElement dashboard;

	@FindBy(xpath = "//a[contains(text(), 'Return site')]")
	WebElement returnSite;

	@FindBy(id = "dashboard-link")
	WebElement dashboardBack;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle nav-user']")
	WebElement dropdown;

	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logOut;

	@FindBy(xpath = "//a[@id='dashboard-link']")
	WebElement dashboard2;

	@FindBy(xpath = "//img[@class='avatar-rounded']")
	WebElement imageOnDashboard;

	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logout;

	@FindBy(xpath = "//h1[text()= 'Dashboard']")
	WebElement headerDashboardElement;

	@FindBy(xpath = "//span[text()='Profile']")
	WebElement profile;

	@FindBy(xpath = "//a[@id='home-tab']")
	WebElement validationOfProfile;

	@FindBy(xpath = "//span[text()='Add Course']")
	WebElement addCourse;

	@FindBy(xpath = "//h1[text()='Enroll Course']")
	WebElement validationOfEnrollCourse;

	@FindBy(xpath = "//span[text()='Quiz List']")
	WebElement quizList;

	@FindBy(xpath = "(//span[text()='Quiz List'])[2]")
	WebElement quizlistHeader;

	@FindBy(xpath = "//span[text()='Home Work']")
	WebElement homeWork;

	@FindBy(xpath = "//span[text()='Homework List']")
	WebElement validationOfHomeWorkList;

	@FindBy(xpath = "//span[text()='Codding Challenge']")
	WebElement codinChallenge;

	@FindBy(xpath = "//span[text()='Coding Challenge List']")
	WebElement validationOfcodingChallenge;

	@FindBy(xpath = "//span[text()='Exam']")
	WebElement exam;

	@FindBy(xpath = "//span[text()='Exam List']")
	WebElement validationOfExam;

	@FindBy(xpath = "//span[text()='Bootcamp']")
	WebElement bootCamp;

	@FindBy(xpath = "//span[text()='Bootcamp List']")
	WebElement validationbootCamp;

	@FindBy(xpath = "//span[text()='Class Notes']")
	WebElement classNote;

	@FindBy(xpath = "//h1[text()='Class Note List']")
	WebElement validationOfClassNoteList;

	@FindBy(xpath = "//span[text()='Class Schedule']")
	WebElement classSchedule;

	@FindBy(xpath = "//h1[text()='Class Calendar']")
	WebElement validationOfclassCalenda;

	@FindBy(xpath = "//span[text()='Join The Class']")
	WebElement joinTheClass;

	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement validationOfMeetingList;

	@FindBy(xpath = "//span[text()='Class recording']")
	WebElement classRecording;

	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement listOfMeeting;

	@FindBy(xpath = "//span[text()='Others']")
	WebElement others;

	@FindBy(xpath = "//h1[text()='Others']")
	WebElement validationOfOthers;

	@FindBy(xpath = "(//a[text()='Click'])[5]")
	WebElement gitHubElement;

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;

	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement validationOfAuomation;

	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enrollNow;

	@FindBy(xpath = "//h3[text()='Select your course from the dropdown']")
	WebElement enrollNowHeader;

	@FindBy(xpath = "//h1[text()='Please choose from below']")
	WebElement automationSubHeader;

	@FindBy(xpath = "//td[text()='smjohn.eu@gmail.com']")
	WebElement sendingEmail;

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automationElement;

	@FindBy(xpath = "//button[text()='Mouse Hover Action']")
	WebElement mouseHoverElement;

	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enroll;

	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstnameElement;

	@FindBy(xpath = "//small[@id='f_name_error']")
	WebElement firstNameErrorElement;

	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement firstNameRequiredFieldElement;

	@FindBy(xpath = "//input[@name='m_name']")
	WebElement middlElement;

	@FindBy(xpath = "//small[@id='m_name_error']")
	WebElement middleNmaeErrorElement;

	@FindBy(xpath = "//small[@id='l_name_error']")
	WebElement lastNameErrorElement;

	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lastNameRequireFieldElement;

	@FindBy(xpath = "//input[@name='l_name' and @class='form-control']")
	WebElement lastElement;

	@FindBy(xpath = "//select[@name='i_am']")
	WebElement selectProfession;

	@FindBy(xpath = "//select[@id='id_i_am']/option")
	List<WebElement> selecProfessionList;

	@FindBy(xpath = "//*[@name='course_wish_to_enroll' and @class='form-control']")
	WebElement selectCourse;

	@FindBy(xpath = "//*[@name='course_wish_to_enroll' and @class='form-control']/option")
	List<WebElement> selectCourseList;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNum;

	@FindBy(xpath = "//input[@id='id_email' and @name='email']")
	WebElement emailAdd;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passWordAdd;

	@FindBy(xpath = "//*[@id='password_error']")
	WebElement passErrorRequired;

	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement Gender;

	@FindBy(xpath = "//select[@name='gender']/option")
	List<WebElement> selectGenderList;

	// @FindBy(xpath = "//option[text()='Select Birth Year']")
	// WebElement birthYear;

	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement selectBirthYear;

	@FindBy(xpath = "//span[text()='Birth Year is a required field.']")
	WebElement birthYearRequiredFieldElement;

	@FindBy(xpath = "//select[@name='birth_month']/option")
	List<WebElement> selectBirthMonthList;

	@FindBy(xpath = "//select[@name='birth_month']")
	WebElement selectBirthMonth;

	@FindBy(xpath = "//span[text()='Birth Month is a required field.']")
	WebElement birthMonthRequiredFieldElement;

	@FindBy(xpath = "//select[@name='birth_date']")
	WebElement selectBirthDay;

	@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
	WebElement birthDayRequiredFieldElement;

	@FindBy(xpath = "//*[@id='id_image']")
	WebElement choosefile1;

	@FindBy(xpath = "//span[text()='Personal Image is a required field.']")
	WebElement chooseFileRequiredField;

	@FindBy(xpath = "//input[@id='id_photo_id']")
	WebElement choosefile2;

	@FindBy(xpath = "//span[text()='Photo Id is a required field.']")
	WebElement choosePhotoRequiredField;

	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement homeAddressL1;

	@FindBy(xpath = "//span[text()='Home Address Line 1 is a required field.']")
	WebElement homeAddress1RequiredFieldElement;

	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement homeAddressL2;

	@FindBy(xpath = "//input[@id='id_city']")
	WebElement cityElement;

	@FindBy(xpath = "//span[text()='City is a required field.']")
	WebElement cityRequiredFieldElement;

	@FindBy(xpath = "//select[@id='id_state']")
	WebElement stateElement;

	@FindBy(xpath = "//span[text()='State is a required field.']")
	WebElement stateRequiredFieldElement;

	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCodElement;

	@FindBy(xpath = "//span[text()='ZIP Code is a required field.']")
	WebElement zipCodeRequiredFieldElement;

	@FindBy(xpath = "//select[@name='immigration_status']")
	WebElement immigrationElement;

	@FindBy(xpath = "//select[@name='immigration_status']/option")
	List<WebElement> immigrationList;

	@FindBy(xpath = "//input[@name='arrival_date']")
	WebElement arrivalDateElement;

	@FindBy(xpath = "//input[@id='id_emergency_contact']")
	WebElement emergencyElement;

	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement knowAboutUs;

	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement highEducation;

	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement countryOriginElement;

	@FindBy(xpath = "//select[@id='id_primary_language']/option")
	List<WebElement> selectlanguageList;

	@FindBy(xpath = "//select[@id='id_primary_language']")
	WebElement selectLanguage;

	@FindBy(xpath = "//input[@id='id_sign_by_name']")
	WebElement signtureElement;

	@FindBy(xpath = "//span[text()='Signature is a required field.']")
	WebElement signtureRequiredFieldElement;

	@FindBy(id = "//a[@id='termsLink']")
	WebElement doubleClickActionElement;

	@FindBy(linkText = "//*[contains(text(),'Double Click to the')]")
	WebElement doubleClickElement;

	@FindBy(xpath = "//*[@id='is_agree' and @name='is_agree']")
	WebElement agreeClickElement;

	@FindBy(xpath = "//input[@id='is_agree']")
	WebElement iAgreeCheckBox;

	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submitButton;

	@FindBy(id = "//*[@id='customButton']")
	WebElement rightClickElement;

	@FindBy(xpath = "//button[text()='Right Click Action']")
	WebElement rightClickActionElement;

	@FindBy(xpath = "//li[text()='Back']")
	WebElement clickBackButton;

	@FindBy(xpath = "//li[text()='Cancel']")
	WebElement cancel_Element;

	@FindBy(xpath = "//*[text()='Accept']")
	WebElement acceptElement;

	@FindBy(xpath = "//input[@id='emails' and @class='form-control form-control-lg']")
	WebElement useremailElement;

	@FindBy(xpath = "//*[@id='password' and @class='form-control form-control-lg']")
	WebElement userpassElement;

	@FindBy(xpath = "//button[@id='login']")
	WebElement loginbuttonElement;

	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement firstNameReq;

	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lastNameReq;

	@FindBy(xpath = "//*[@id='i_am_error']")
	WebElement iamrequiredfield;

	@FindBy(xpath = "//*[@id='course_wish_error']")
	WebElement courseWishtoEnrollisarequiredfield;

	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phoneNumRequiredField;

	@FindBy(xpath = "//*[@id='email_error']")
	WebElement emailRequiredField;

	@FindBy(id = "//button[@id='submit_button']")
	WebElement submitEnrollPagElement;

	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement AutomationHeaderText;

	@FindBy(xpath = "//td[text()='Muktar mizi']")
	WebElement findmyName;

	@FindBy(xpath = "//td[text()='9293306564']")
	WebElement scroll_down_to_Find_MyName;

	@FindBy(xpath = "//h1[text()='Automated the Table']")
	WebElement table_Header;

	@FindBy(xpath = "//*[text()='Ok']")
	WebElement accept_OK;

	@FindBy(xpath = "//a[text()='Terms and condition']")
	WebElement terms_and_condition;

	@FindBy(xpath = "//button[text()='Accept']")
	WebElement accept_Button;

	@FindBy(xpath = "//*[text()='August Test Account']")
	WebElement find_My_Name_Scroll_Down;

	@FindBy(xpath = "//*[@id='home_address_error']")
	WebElement home_Address_1_error;
	
	@FindBy(xpath = "//h1[text()='Registration Successful!']")
	WebElement successsfull;
	

	
	
	public void landing_on_dashboard() {
		clickElement(loginHeader);
		inputTextThenClickTab(useremailElement, user_id);
		pause(1000);
		inputTextThenClickTab(userpassElement, password);
		pause(1000);
		clickElement(loginbuttonElement);
		pause(2000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");

	}
	


	public void step_one_Click_on_automation_to_navigate_to_automation_page() {

		// Automation.
		pause(2000);
		clickElement(automation);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfSubHeader(automationSubHeader, "Please choose from below");

	
	}

	public void click_enroll_Now_to_navigate_to_enrollhome_page() {

		pause(2000);
		validationOfHeader(AutomationHeaderText, "Automation");
		pause(2000);
		validationOfSubHeader(automationSubHeader, "Please choose from below");
		pause(2000);
		switchToChildWindow(driver, enroll);
		pause(2000);
	

	}
	
	public void happy_path_enters_valid_details_in_each_required_field_for_enrollment() {
		
		pause(2000);
		clickElement(firstnameElement);
		pause(2000);
		inputTextThenClickTab(firstnameElement, "Shuvo");
		pause(2000);
		inputTextThenClickTab(middlElement, "M");
		pause(2000);
		inputText(lastElement, "Mirza");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selecProfessionList);
		pause(2000);
		selectDropdown(selectProfession, "a Student");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		pause(2000);
		selectDropdown(selectCourse, "Python");
		pause(2000);
		inputTextThenClickTab(phoneNum, "9293306564");
		pause(2000);
		inputTextThenClickTab(emailAdd, "MirzaShuvo79@gmail.com");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Muktar2024$");
		pause(2000);
		selectDropdown(Gender, "Male");
		pause(2000);
		File file = new File("./image/Screenshot 2024-11-30 185110.png");
		choosefile1.sendKeys(file.getAbsolutePath());
		pause(2000);
		File file2 = new File("./image/Screenshot 2024-11-30 185141.png");
		choosefile2.sendKeys(file.getAbsolutePath());
		pause(2000);
		selectDropdown(selectBirthYear, "1989");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectBirthMonth, selectBirthMonthList);
		pause(2000);
		selectDropdown(selectBirthMonth, "December");
		pause(2000);
		inputTextThenClickTab(selectBirthDay, "16");
		pause(2000);
		inputTextThenClickTab(homeAddressL1, "2268 Seward Ave");
		pause(2000);
		inputTextThenClickTab(homeAddressL2, "Apt 3");
		pause(2000);
		inputTextThenClickTab(cityElement, "Bronx");
		pause(2000);
		inputTextThenClickTab(stateElement, "New York");
		pause(2000);
		inputTextThenClickTab(zipCodElement, "10473");
		pause(2000);
		inputTextThenClickTab(immigrationElement, "Citizen");
		pause(2000);
		inputTextThenClickTab(arrivalDateElement, "24th Jan 2013");
		pause(2000);
		inputTextThenClickTab(emergencyElement, "9293306564");
		pause(2000);
		inputTextThenClickTab(knowAboutUs, "Friends");
		pause(2000);
		inputTextThenClickTab(highEducation, "Graduate");
		pause(2000);
		inputTextThenClickTab(countryOriginElement, "Bangladesh");
		pause(2000);
		inputTextThenClickTab(selectLanguage, "English");
		pause(2000);
		inputTextThenClickTab(signtureElement, "Shuvo M Mirza");
		pause(2000);
		
		//Actions actions = new Actions(driver);
		//actions.doubleClick(terms_and_condition).build().perform();
		//pause(2000);
		//clickElement(accept_Button);
		//pause(2000);
		//clickElement(submitEnrollPagElement);
		//pause(2000);
		
	}
	
	

	public void happy_path_to_automation_then_click_enroll_now_then_input_all_information() {

		pause(2000);
		clickElement(logoElement);
		pause(2000);
		clickElement(loginElement);
		pause(2000);
		useremailElement.clear();
		useremailElement.sendKeys(user_id);
		pause(2000);
		clickElement(useremailElement);
		pause(2000);
		userpassElement.clear();
		userpassElement.sendKeys(password);
		pause(2000);
		clickElement(userpassElement);
		pause(2000);
		clickElement(loginbuttonElement);
		pause(3000);
		clickElement(automationElement);
		pause(2000);
		switchToChildWindow(driver, enroll);
		pause(2000);
		clickElement(firstnameElement);
		pause(2000);
		inputTextThenClickTab(firstnameElement, "Shuvo");
		pause(2000);
		inputTextThenClickTab(middlElement, "M");
		pause(2000);
		inputText(lastElement, "Mirza");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selecProfessionList);
		pause(2000);
		selectDropdown(selectProfession, "a Student");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		pause(2000);
		selectDropdown(selectCourse, "Python");
		pause(2000);
		inputTextThenClickTab(phoneNum, "9293306564");
		pause(2000);
		inputTextThenClickTab(emailAdd, "MirzaShuvo79@gmail.com");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Muktar2024$");
		pause(2000);
		selectDropdown(Gender, "Male");
		pause(2000);
		File file = new File("./image/Screenshot 2024-11-30 185110.png");
		choosefile1.sendKeys(file.getAbsolutePath());
		pause(2000);
		File file2 = new File("./image/Screenshot 2024-11-30 185141.png");
		choosefile2.sendKeys(file.getAbsolutePath());
		pause(2000);
		selectDropdown(selectBirthYear, "1989");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectBirthMonth, selectBirthMonthList);
		pause(2000);
		selectDropdown(selectBirthMonth, "December");
		pause(2000);
		inputTextThenClickTab(selectBirthDay, "16");
		pause(2000);
		inputTextThenClickTab(homeAddressL1, "2268 Seward Ave");
		pause(2000);
		inputTextThenClickTab(homeAddressL2, "Apt 3");
		pause(2000);
		inputTextThenClickTab(cityElement, "Bronx");
		pause(2000);
		inputTextThenClickTab(stateElement, "New York");
		pause(2000);
		inputTextThenClickTab(zipCodElement, "10473");
		pause(2000);
		inputTextThenClickTab(immigrationElement, "Citizen");
		pause(2000);
		inputTextThenClickTab(arrivalDateElement, "24th Jan 2013");
		pause(2000);
		inputTextThenClickTab(emergencyElement, "9293306564");
		pause(2000);
		inputTextThenClickTab(knowAboutUs, "Friends");
		pause(2000);
		inputTextThenClickTab(highEducation, "Graduate");
		pause(2000);
		inputTextThenClickTab(countryOriginElement, "Bangladesh");
		pause(2000);
		inputTextThenClickTab(selectLanguage, "English");
		pause(2000);
		inputTextThenClickTab(signtureElement, "Shuvo M Mirza");
		pause(2000);
		Actions actions = new Actions(driver);
		actions.doubleClick(terms_and_condition).build().perform();
		pause(2000);
		clickElement(accept_Button);
		pause(2000);
		clickElement(submitEnrollPagElement);
		pause(2000);

	}

	
	public void submitEnrollment() {
		pause(2000);
		clickElement(submitEnrollPagElement);
		pause(2000);
	}
	
	
	public void acceptTerms() {

		pause(2000);
		//scrollIntoViewTheElementUsingJavascriptExecutor(driver, signtureElement);
		pause(2000);
		Actions actions = new Actions(driver);
		actions.doubleClick(terms_and_condition).build().perform();
		pause(2000);
		clickElement(accept_Button);
		pause(2000);

	}
	
	public boolean is_Success_Page_Displayed() {
	    pause(2000); // Pause if needed, but better to use explicit waits

	    // Verify if the current URL is correct
	    String expectedUrl = "https://enthrallit.com/course/enroll/success/";
	    String actualUrl = driver.getCurrentUrl();
	    if (!actualUrl.equals(expectedUrl)) {
	        System.out.println("URL mismatch! Expected: " + expectedUrl + ", but found: " + actualUrl);
	        return false;
	    }

	    // Verify the page title
	    String expectedTitle = "Registration Success";
	    String actualTitle = driver.getTitle();
	    if (!actualTitle.equals(expectedTitle)) {
	        System.out.println("Title mismatch! Expected: " + expectedTitle + ", but found: " + actualTitle);
	        return false;
	    }

	    // Validate the success message
	    String expectedSuccessMessage = "Registration Successful!";
	    WebElement successMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Registration Successful!')]"));
	    
	    if (successMessageElement.isDisplayed() && successMessageElement.getText().equals(expectedSuccessMessage)) {
	        return true;
	    } else {
	        System.out.println("Success message mismatch or not displayed!");
	        return false;
	    }
	}

	}
