package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.IConstant.password;
import static utils.IConstant.user_id;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.CommonActions.*;
//import static utils.IConstant.password;
//import static utils.IConstant.user_id;

import java.time.Duration;

public class LogIn {
	WebDriver driver;
	WebDriverWait wait;

	// Parameterized Constructor
	public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	

	@FindBy(xpath = "//a[@id='logo-id']")
	WebElement logoElement;

	@FindBy(xpath = "//li[@id='home' and @name='home']")
	WebElement homeHeader;

	@FindBy(xpath = "//a[@id='login-link' and @class='nav-link']")
	WebElement loginHeader;

	@FindBy(xpath = "(//a[@id='login-link'])[2]")
	WebElement loginFooter;

	@FindBy(xpath = "//h2[text()='Login into your account']")
	WebElement loginHeaderText;

	@FindBy(xpath = "//a[text()='Enroll now']")
	WebElement enrollNowHeader;

	@FindBy(id = "enroll_now")
	WebElement enrollNowFooter;

	@FindBy(xpath = "//h2[contains(text(),'Enroll to ')]")
	WebElement enrollNowHeaderText;

	@FindBy(xpath = "//h2[text()='Contact Us']")
	WebElement ScrolldownToContactUS;

	@FindBy(xpath = "//*[@id='emails' and @class='form-control form-control-lg']")
	WebElement userIdElement;

	@FindBy(id = "enroll-button")
	WebElement enrollElement;

	@FindBy(xpath = "//input[@id='emails' and @class='form-control form-control-lg']")
	WebElement useremailElement;

	@FindBy(xpath = "//*[@id='password' and @class='form-control form-control-lg']")
	WebElement userpassElement;

	@FindBy(xpath = "//*[@id='login' and@class='btn btn-lg px-5']")
	WebElement loginbuttonElement;
	//// button[@id='login']

	@FindBy(id = "login-link")
	WebElement loginElement;

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

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automationElement;

	@FindBy(xpath = "//button[text()='Mouse Hover Action']")
	WebElement mouseHoverElement;

	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enroll;

	@FindBy(xpath = "//*[text()='Login into your account']")
	WebElement loginHeaderTextElement;

	@FindBy(id = "login-link")
	WebElement loginElement1;

	public void logo_and_title_validation() {
		pause(2000);
		elementDisplayed(logoElement);
		clickElement(logoElement);
		verifyTitle(driver, "Enthrall IT");

	}

	public void click_login_from_menu_section() {

		pause(2000);
		elementEnabled(loginHeader);
		clickElement(loginHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		validationOfHeader(loginHeaderTextElement, "Login into your account");

	}

	public void email() {

		clickElement(loginHeader);
		pause(2000);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		inputTextThenClickTab(useremailElement,user_id);
		pause(1000);
	}

	public void password() {

		clickElement(loginHeader);
		pause(2000);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		inputTextThenClickTab(userpassElement, password);
		pause(1000);
	}
	
	public void emailId(String string) {
		inputText(useremailElement, string);
		pause(2000);
	}
	
	public void password(String string) {
		inputText(userpassElement, string);
		pause(2000);
	}
	

	public void click_login_button() {

		clickElement(loginHeader);
		pause(2000);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		clickElement(loginbuttonElement);
		pause(2000);
	}

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
	

}
