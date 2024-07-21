package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SignUp;

/**
 * BasicSetup class handles the initial setup and teardown for Selenium WebDriver tests.
 * It includes methods for initializing WebDriver, loading properties, and generating test reports.
 */
    
public class BasicSetup {
    
	// WebDriver instance
	protected WebDriver driver;
	
	// Properties for user credentials and URLs
	protected String userEmail;
	protected String password;
	protected String mobileNum;
	protected String websiteUrl;
	protected String name;
	
	// ExtentReports instances for logging test reports
	protected ExtentReports report;
	protected ExtentTest test;
	
	/**
     * Method to generate the test report.
     * This is executed once before any test methods in the class.
     */
	
	@BeforeClass
	public void reportGenarate() {
	
	// Initializing ExtentReports with the path for the report file
    report =  new ExtentReports("C:\\Users\\Manisha\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\OpeninAppAutomation\\report.html");
	
    // Starting the test with a title
    test = report.startTest("OpeninApp Automation Report");
	

	}
	
	
	//Method to set up WebDriver and load properties before each test method.
	
	@BeforeMethod
	public void setUp() throws IOException{
		// Load properties from the specified file
		
		Properties pro = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Manisha\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\OpeninAppAutomation\\src\\test\\resources\\basic.properties");
		
		pro.load(fis);
		
		//---------- Set up ChromeDriver using WebDriverManager -----------
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		//---------- Log the success of opening the Chrome browser
		
		test.log(LogStatus.PASS,"Chrome browser opens successfully");
		
		//----------- implicit wait command to match the script speed woth browser speed
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//----------- will maximize the browser
		driver.manage().window().maximize();
		
		//----------- Log the success of maximizing the browser window
		test.log(LogStatus.PASS, "Browser is maximized");
		
		//----------- Navigate to the base URL specified in properties
		driver.get(pro.getProperty("OpeninAppBaseURL"));
		
		// ----------- Log the success of loading the URL
		test.log(LogStatus.PASS, "URL loaded successfully");
		
		// ----------- Initialize the SignUp page object
		SignUp signup = new SignUp(driver);
		
		// ----------- Load user credentials and other properties
		
        userEmail = pro.getProperty("userEmail");
        
        password = pro.getProperty("password");
        
        mobileNum = pro.getProperty("mobileNum");
        
        websiteUrl = pro.getProperty("websiteUrl");
        
        name = pro.getProperty("name");
        
		
	}
	
	/**
     * Method to clean up after each test method.
     * This will close the browser.
     */
	
	@AfterMethod
	public void teardown() {
		
	// ----------- Quit the WebDriver instance
		
		driver.quit();
	}
	
	/**
     * Method to end the test and flush the report.
     * This is executed once after all test methods in the class.
     */
	 @AfterClass
	public void endTest() 
	 {
		// ----------- End the test in the report and flush the report to the file
		 report.endTest(test);
		 
		 report.flush();
	 }
}
