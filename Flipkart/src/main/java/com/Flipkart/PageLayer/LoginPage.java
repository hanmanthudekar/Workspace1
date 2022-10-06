package com.Flipkart.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.TestBase.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(xpath="//input[@class='_2IX_2- _3umUoc VJZDxU']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername() {
		username.sendKeys("9371909272");
	}
	
	public void setPassword() {
		password.sendKeys("Hanmant@143");
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	
}
