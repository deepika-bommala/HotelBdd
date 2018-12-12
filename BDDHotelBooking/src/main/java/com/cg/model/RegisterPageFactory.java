package com.cg.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageFactory 
{
	WebDriver driver;
	
	@FindBy(id="txtFirstName")
	@CacheLookup
	WebElement txtFN;
	@FindBy(id="txtLastName")
	@CacheLookup
	WebElement txtLN;
	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement Email;
	@FindBy(name="Phone")
	@CacheLookup
	WebElement Phone;	
	@FindBy(name="city")
	@CacheLookup
	WebElement city;
	@FindBy(name="state")
	@CacheLookup
	WebElement state;
	@FindBy(id="txtGender1")
	@CacheLookup
	WebElement gender1;   //Radiobutton1
	@FindBy(id="txtGender2")
	@CacheLookup
	WebElement gender2;//RadioButton2
	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[12]/td[2]/input[1]")
	@CacheLookup
	WebElement check1;//checkBox1
	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[12]/td[2]/input[2]")
	@CacheLookup
	WebElement check2;//checkBox2
	@FindBy(id="txtCardholderName")
	@CacheLookup
	WebElement cardName;
	@FindBy(id="txtDebit")
	@CacheLookup
	WebElement cardNo;
	@FindBy(id="txtCvv")
	@CacheLookup
	WebElement CVV;
	@FindBy(id="txtMonth")
	@CacheLookup
	WebElement eMonth;
	@FindBy(id="txtYear")
	@CacheLookup
	WebElement eYear;
	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement registerBtn;
	
	
	public RegisterPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setFirstName(String fn) {
		txtFN.sendKeys(fn);
	}
	public void setLastName(String ln) {
		txtLN.sendKeys(ln);
	}
	public void setEmail(String email) {
		Email.sendKeys(email);
	}
	public void setPhone(String phone) {
		Phone.sendKeys(phone);
	}	
	public void setCity(String Rcity) {
		city.sendKeys(Rcity);
	}
	public String getCity() {
		String name=city.getText();  //dropdownbox(select)
		return name;
	}
	public void setState(String Rstate) {
		state.sendKeys(Rstate);
	}
	public String getState() {
		String sname=state.getText(); //dropdownbox(Select)
		return sname;
	}	
	public void setGender(String gen) {     // radioButtons
		if(gen.equalsIgnoreCase("female"))
			gender2.click();
		else
			gender1.click();
	}
	public void setRoomType(String type) {  //checkBox
		if(type.equalsIgnoreCase("ac"))
			check1.click();
		else
			check2.click();
	}
	public void setCardName(String CName) {
		cardName.sendKeys(CName);
	}
	public void setCardNo(String CNo) {
		cardNo.sendKeys(CNo);
	}
	public void setCVV(String cvv) {
		CVV.sendKeys(cvv);
	}
	public void setEMonth(String month) {
		eMonth.sendKeys(month);
	}
	public void setEYear(String year) {
		eYear.sendKeys(year);
	}
	public void clickRegisterButton(){
		registerBtn.click();
	}
	
}
