package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Login class represents the Login page of the application.
 * It contains WebElement locators and methods for interacting with the login page elements.
 */
public class Login {

	// ----------- WebDriver instance for interacting with the browser
	WebDriver driver;
	 
	// ----------- Constructor to initialize the WebDriver instance and PageFactory
	public Login(WebDriver driver) {
		
		this.driver = driver;
		// ----------- Initialize the PageFactory elements
		PageFactory.initElements(driver, this);
	}
	// WebElement for the 'Login' button on the page
	@FindBy(xpath = "(//*[text()='Login'])[1]")
	private WebElement click_login;
	
	// WebElement for the email input field
	@FindBy(xpath = "//input[@label='Enter your Email ID']")
	private WebElement login_email;
	
	// WebElement for the email input field
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement next_Btn;
	
	// WebElement for the password input field
	@FindBy(xpath = "//input[@label='Enter Password*']")
	private WebElement enter_Password;
	
	// WebElement for the final 'Login' button
	@FindBy(xpath = "(//*[text()='Login'])[2]")
	private WebElement login_btn;

	
	public WebElement getClick_login() {
		return click_login;
	}

	public WebElement getLogin_email() {
		return login_email;
	}

	public WebElement getNext_Btn() {
		return next_Btn;
	}

	public WebElement getEnter_Password() {
		return enter_Password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}
	
}
