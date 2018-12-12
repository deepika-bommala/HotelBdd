package RegisterFolder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cg.model.RegisterPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDef 
{
	RegisterPageFactory registerPage; 
	WebDriver driver;
	
		@Given("^User is on HotelBooking page$")
		public void user_is_on_HotelBooking_page() throws Throwable {
			driver=new FirefoxDriver();
			driver.get("D:\\HotelBookingDemo\\hotelbooking.html");
			registerPage=new RegisterPageFactory(driver); 
		}
		
		@When("^FirstName is blank$")
		public void firstname_is_blank() throws Throwable {
			registerPage.setFirstName("");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please fill the First Name'$")
		public void display_alert_box_Please_fill_the_First_Name() throws Throwable {
			
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please fill the First Name";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		@When("^LastName is blank$")
		public void lastname_is_blank() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please fill the Last Name'$")
		public void display_alert_box_Please_fill_the_Last_Name() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please fill the Last Name";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		@When("^EmailId is blank$")
		public void emailid_is_blank() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please fill the Email'$")
		public void display_alert_box_Please_fill_the_Email() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please fill the Email";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		@When("^Invalid EmailId is given$")
		public void invalid_EmailId_is_given() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please enter valid Email Id'$")
		public void display_alert_box_Please_enter_valid_Email_Id() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please enter valid Email Id.";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		
		@When("^MobileNo is blank$")
		public void mobileno_is_blank() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please fill the Mobile No'$")
		public void display_alert_box_Please_fill_the_Mobile_No() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please fill the Mobile No.";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		@When("^Invalid mobileNo entered$")
		public void invalid_mobileNo_entered() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("12345");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please enter valid Contact no'$")
		public void display_alert_box_Please_enter_valid_Contact_no() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please enter valid Contact no.";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		
		@When("^Gender is not selected$")
		public void gender_is_not_selected() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");			//not selecting any radiobutton
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please Select the Gender'$")
		public void display_alert_box_Please_Select_the_Gender() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please Select the Gender";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		@When("^City is not choosen$")
		public void city_is_not_choosen() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");
			registerPage.setGender("male");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please select city'$")
		public void display_alert_box_Please_select_city() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please select city";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		@When("^State is not choosen$")
		public void state_is_not_choosen() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");
			registerPage.setGender("male");
			registerPage.setCity("Hyderabad");			
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please select state'$")
		public void display_alert_box_Please_select_state() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please select state";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		@When("^Room type is not choosen$")
		public void room_type_is_not_choosen() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");
			registerPage.setGender("male");
			registerPage.setCity("Hyderabad");
			registerPage.setState("Telangana");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please select the Room type'$")
		public void display_alert_box_Please_select_the_Room_type() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please select the Room type";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}
		@When("^Card Holder Name is blank$")
		public void card_Holder_Name_is_blank() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");	
			registerPage.setGender("male");
			registerPage.setCity("Hyderabad");
			registerPage.setState("Telangana");
			registerPage.setRoomType("ac");
			registerPage.setCardName("");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please fill the Card holder name'$")
		public void display_alert_box_Please_fill_the_Card_holder_name() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please fill the Card holder name";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^Debit Card Number is blank$")
		public void debit_Card_Number_is_blank() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");	
			registerPage.setGender("male");
			registerPage.setCity("Hyderabad");
			registerPage.setState("Telangana");
			registerPage.setRoomType("ac");
			registerPage.setCardName("SoumyaK");
			registerPage.setCardNo("");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please fill the Debit card Number'$")
		public void display_alert_box_Please_fill_the_Debit_card_Number() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please fill the Debit card Number";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^CVV is blank$")
		public void cvv_is_blank() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");
			registerPage.setGender("male");
			registerPage.setCity("Hyderabad");
			registerPage.setState("Telangana");
			registerPage.setRoomType("ac");
			registerPage.setCardName("SoumyaK");
			registerPage.setCardNo("1234556789");
			registerPage.setCVV("");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please fill the CVV'$")
		public void display_alert_box_Please_fill_the_CVV() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please fill the CVV";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^Expiration month is blank$")
		public void expiration_month_is_blank() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");
			registerPage.setGender("male");
			registerPage.setCity("Hyderabad");
			registerPage.setState("Telangana");
			registerPage.setRoomType("ac");
			registerPage.setCardName("SoumyaK");
			registerPage.setCardNo("1234556789");
			registerPage.setCVV("123");
			registerPage.setEMonth("");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please fill expiration month'$")
		public void display_alert_box_Please_fill_expiration_month() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please fill expiration month";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^Expiration Year is blank$")
		public void expiration_Year_is_blank() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");
			registerPage.setGender("male");
			registerPage.setCity("Hyderabad");
			registerPage.setState("Telangana");
			registerPage.setRoomType("ac");
			registerPage.setCardName("SoumyaK");
			registerPage.setCardNo("1234556789");
			registerPage.setCVV("123");
			registerPage.setEMonth("5");
			registerPage.setEYear("");
			registerPage.clickRegisterButton();
		}

		@Then("^Display alert box 'Please fill the expiration year'$")
		public void display_alert_box_Please_fill_the_expiration_year() throws Throwable {
			String actualErrorMsg=driver.switchTo().alert().getText();
			String expErrorMsg="Please fill the expiration year";
			Assert.assertEquals(expErrorMsg, actualErrorMsg);
			driver.switchTo().alert().accept();
			driver.close();
		}

		
		@When("^All Valid details given$")
		public void all_Valid_details_given() throws Throwable {
			registerPage.setFirstName("Soumya");
			registerPage.setLastName("Karpurapu");
			registerPage.setEmail("soumya123@cpg.com");
			registerPage.setPhone("9949105993");
			registerPage.setGender("male");
			registerPage.setCity("Hyderabad");
			registerPage.setState("Telangana");
			registerPage.setRoomType("ac");
			registerPage.setCardName("SoumyaK");
			registerPage.setCardNo("1234556789");
			registerPage.setCVV("123");
			registerPage.setEMonth("5");
			registerPage.setEYear("2024");
			registerPage.clickRegisterButton();
		}

		@Then("^Navigate to success page$")
		public void navigate_to_success_page() throws Throwable {
			driver.navigate().to("D:\\JavaFullStackSoftware\\HotelBookingDemo\\success.html");
			   
		}


}
