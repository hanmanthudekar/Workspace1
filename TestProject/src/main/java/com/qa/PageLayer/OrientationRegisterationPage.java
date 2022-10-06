package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.BasecClass;

public class OrientationRegisterationPage extends BasecClass {
	
	public OrientationRegisterationPage() {
		PageFactory.initElements(driver,this);		
	}

	@FindBy(xpath="//input[@name='fname']")
	private WebElement firstName;

	@FindBy(xpath="//input[@name='lname']")
	private WebElement lastName;

	@FindBy(xpath="//input[@name='email']")
	private WebElement mail;

	@FindBy(xpath="//input[@name='phno']")
	private WebElement mobile;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//input[@name='cpassword']")
	private WebElement confirmPassword;
	 
	@FindBy(xpath="//input[@name=\"terms\"]")
	private WebElement checkBox;
	
	@FindBy(xpath="//button[@class='submit btn btn-primary btn-block']")
	private WebElement registerButton;

	
	public void setFirstName() {
		firstName.sendKeys("Nagesh");
	}

	public void setLastName() {
		lastName.sendKeys("Ande");
	}

	public void setMail() {
		mail.sendKeys("abc@gmail.com");
	}

	public void setMobile() {
		mobile.sendKeys("123456789");
	}

	public void setPassword() {
		password.sendKeys("Nagesh@123");
	}

	public void setCpassword() {
		confirmPassword.sendKeys("Nagesh@123");
	}
	
	public void selectCheckBox() {
		checkBox.click();
	}
	
	public void VerifyRegisterButton() {
		registerButton.click();
	}

}
