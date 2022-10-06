package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.BaseClass;

public class HomePage extends BaseClass {


	@FindBy(xpath="//img[@class='logo img-responsive']")
	private WebElement logo;
	
	@FindBy(xpath="")
	private WebElement logo1;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLogo() {
		
		if(logo.isDisplayed()) {
			System.out.println("Verified logo Succesfully ");
		}
		else {
			System.out.println("logo is not present");
		}
	}
}
