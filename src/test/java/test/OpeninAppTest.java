package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import generic.BasicSetup;
import pages.Login;
import pages.SignUp;

/*
 * OpeninAppTest class extends BasicSetup to perform test operations.
 * It includes test methods for signing up and logging into the application.
 */
public class OpeninAppTest extends BasicSetup {

    private SignUp signup;
    private Login login;
    
    /*
     * Method to initialize page objects before each test method.
     * This ensures fresh instances of page objects for every test.
     */
    
    @BeforeMethod
    public void initPageObjects() {
        signup = new SignUp(driver);
        login = new Login(driver);
    }

    //  ----------- Test method to perform the sign-up process.
    @Test(priority = 0, enabled = true)
    public void signUp() throws InterruptedException {
    	//  ----------- Wait for the page to load
    	
    	Thread.sleep(4000);
    	
    	//  ----------- Click on the Brand element
        signup.getBrand().click();
        Thread.sleep(2000);
        
        //  ----------- Click on the Sign up tag
        signup.getSignUpTag().click();
        Thread.sleep(2000);
        
        //  ----------- Enter the Name field
        signup.getNameFeild().sendKeys(name);
        
        test.log(LogStatus.PASS, "Name enter successfully");
        Thread.sleep(2000);
        
        //  ----------- Enter the Email field
        signup.getEmailFeild().sendKeys(userEmail);
        test.log(LogStatus.PASS, "Email enter successfully");
        Thread.sleep(2000);
        
        //  ----------- Enter the Password field
        signup.getPassFeild().sendKeys(password);
        test.log(LogStatus.PASS, "Password enter successfully");
        Thread.sleep(2000);
        
        //  ----------- Click on the Continue button
        signup.getContinueFeild().click();
        Thread.sleep(2000);
        
        //  ----------- Enter the Website URL field
        signup.getWebsiteFeild().sendKeys(websiteUrl);
        test.log(LogStatus.PASS, "Website URL enter successfully");
        Thread.sleep(2000);
        
        //  ----------- Enter the Mobile Number field
        signup.getNumberFeild().sendKeys(mobileNum);
        test.log(LogStatus.PASS, "Mobile Number enter successfully");
        
        Thread.sleep(2000);
        
        //  ----------- Select the Industry
        signup.getSelectIndutry().click();
        Thread.sleep(2000);
 
        //  ----------- Select the Brand
        signup.getBrand().click();
        Thread.sleep(2000);
        
        //  ----------- Click on the Sign up button
        signup.getSignUpbtn().click();
        Thread.sleep(15000);
        
        test.log(LogStatus.PASS, "Successfully sign up the application");
    }
    
    //Test method to perform the login process
    
    @Test(priority = 1, enabled = true)
    public void loginTest() throws InterruptedException {
    	
    	//  ----------- Click on the Brand element
    	signup.getBrand().click();
    	Thread.sleep(4000);
    	
    	//  ----------- Click on the Login button
    	login.getClick_login().click();
    	Thread.sleep(2000);
    	
    	//  ----------- Enter the Email field
    	login.getLogin_email().sendKeys("pegimof720@reebsd.com");
    	
    	test.log(LogStatus.PASS, "Email entered successfully");
    	Thread.sleep(4000);
    	
    	//  ----------- Click on the Next button
    	login.getNext_Btn().click();
    	Thread.sleep(4000);
    	
    	//  ----------- Enter the Password field
    	login.getEnter_Password().sendKeys("Pegimof720@reebsd.com");
    	
    	test.log(LogStatus.PASS, "Password entered successfully");
    	Thread.sleep(4000);
    	
    	// ----------- Click on the Login button
    	login.getLogin_btn().click();
    	
    	test.log(LogStatus.PASS, "Successfully Login the application");
    	
    }
    
   
    
}