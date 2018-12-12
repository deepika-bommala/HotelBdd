package LoginFolder;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.cg.model.LoginPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef 
{
	LoginPageFactory loginPage;
	WebDriver driver;	
		
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("D:\\JavaFullStackSoftware\\HotelBookingDemo\\login.html");
		loginPage=new LoginPageFactory(driver);
		
	}

	@When("^username password is blank$")
	public void username_password_is_blank() throws Throwable {
		loginPage.setUserName("");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
	}

	@Then("^Display error Message 'Please enter Username'$")
	public void display_error_Message_Please_enter_Username() throws Throwable {
		
		WebElement divEle=driver.findElement(By.id("userErrMsg"));
		String actualErrorMsg=loginPage.getUserNameError();
		String expErrorMsg="* Please enter userName.";
		Assert.assertEquals(expErrorMsg, actualErrorMsg);
		driver.close();
	}
	@When("^username is given but password is blank$")
	public void username_is_given_but_password_is_blank() throws Throwable {
		loginPage.setUserName("Soumya");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
	}

	@Then("^Display error Message 'Please enter password'$")
	public void display_error_Message_Please_enter_password() throws Throwable {
		WebElement divEle=driver.findElement(By.id("pwdErrMsg"));
		String actualErrorMsg=loginPage.getpwdError();
		String expErrorMsg="* Please enter password.";
		Assert.assertEquals(expErrorMsg, actualErrorMsg);
		driver.close();
	}
	@When("^Invalid username password are entered$")
	public void invalid_username_password_are_entered() throws Throwable {
		loginPage.setUserName("Soumya");
		loginPage.setPassword("soumya123");
		loginPage.clickLoginButton();
	}

	@Then("^Display alert box 'Invalid login! Please try again!'$")
	public void display_alert_box_Invalid_login_Please_try_again() throws Throwable {
		
		String actualErrorMsg=driver.switchTo().alert().getText();
		String expErrorMsg="Invalid login! Please try again!";
		Assert.assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}
	@When("^Valid username password are entered$")
	public void valid_username_password_are_entered() throws Throwable {
		loginPage.setUserName("Capgemini");
		loginPage.setPassword("capgemini123");
		loginPage.clickLoginButton();
	}

	@Then("^Navigate to hotelbooking page$")
	public void navigate_to_hotelbooking_page() throws Throwable {
	   driver.navigate().to("D:\\JavaFullStackSoftware\\HotelBookingDemo\\hotelbooking.html");
	   driver.close();
	}
	
	
	
	


}
