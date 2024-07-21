package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

     /**
      * This class represents the SignUp page in the Page Object Model (POM) framework.
      * It locates the web elements on the sign-up page and provides methods to interact with them.
      */

public class SignUp {

	//----------- WebDriver instance for the page -----------
	
	WebDriver driver;
	
	//----------- Constructor to initialize the web elements using PageFactory -----------
	
	public SignUp(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//----------- Web elements located using @FindBy annotation -----------
	
	//----------- locate brand element -----------
	@FindBy(xpath = "//*[text()='Brand']")
	private WebElement brand;
	
	//----------- locate sign up element -----------
	@FindBy(xpath = "(//*[text()='Sign up'])[1]")
	private WebElement signUpTag;
	
	//----------- locate name element -----------
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement nameFeild;
	
	//----------- Locate the Email field element -----------
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement emailFeild;
	
	//----------- Locate the Password field element -----------
	@FindBy(xpath = "//input[@placeholder='*********']")
	private WebElement passFeild;
	
	//----------- Locate the Continue field element -----------
	@FindBy(xpath = "//*[text()='Continue']")
	private WebElement continueFeild;
	
	//----------- Locate the Website field element -----------
	@FindBy(xpath = "//input[@placeholder='Website']")
	private WebElement websiteFeild;
	
	//----------- Locate the Phone Number field element -----------
	@FindBy(xpath = "//input[@placeholder='Phone Number']")
	private WebElement numberFeild;
	
	//----------- Locate the Select Industry element -----------
	@FindBy(xpath = "//input[@placeholder='Select Industry*']")
	private WebElement selectIndutry;
	
	//----------- Locate the Select Brand element -----------
	@FindBy(xpath = "//*[text()='Brand']")
	private WebElement selectBrand;

	//----------- Locate the Sign up button element -----------
	@FindBy(xpath = "(//*[text()='Signup'])[2]")
	private WebElement signUpbtn;
	
	//----------- Getter methods to access the web elements -----------
	
	public WebElement getBrand() {
		return brand;
	}

	public WebElement getSignUpTag() {
		return signUpTag;
	}

	public WebElement getNameFeild() {
		return nameFeild;
	}

	public WebElement getEmailFeild() {
		return emailFeild;
	}

	public WebElement getPassFeild() {
		return passFeild;
	}

	public WebElement getContinueFeild() {
		return continueFeild;
	}

	public WebElement getWebsiteFeild() {
		return websiteFeild;
	}

	public WebElement getNumberFeild() {
		return numberFeild;
	}

	public WebElement getSelectIndutry() {
		return selectIndutry;
	}

	public WebElement getSelectBrand() {
		return selectBrand;
	}

	public WebElement getSignUpbtn() {
		return signUpbtn;
	}
	
	
	
}
