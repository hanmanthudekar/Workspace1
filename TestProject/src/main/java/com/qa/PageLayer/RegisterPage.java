package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.BasecClass;

public class RegisterPage extends BasecClass{
	
	public RegisterPage(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@class='radio-custom-label'][1]")
	private WebElement checkBox;
	
	@FindBy(xpath = "//button[1]")
	private WebElement registerButton;
	
		
	public void selectCheckbox() {
		checkBox.click();
	}
	
	public void clickOnRegister() {
		registerButton.click();
	}
}
