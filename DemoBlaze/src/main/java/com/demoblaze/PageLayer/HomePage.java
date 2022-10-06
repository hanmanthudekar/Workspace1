package com.demoblaze.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.TestBase.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//a[@id='itemc'])[1]")
	private WebElement phones;
	
	@FindBy(xpath="(//a[@class='hrefch'])[1]")
	private WebElement samsung_galaxy_s6;
	
	public void clickOnPhones() {
		phones.click();
	}
	
	public void clickOn_samsung_galaxy_s6() {
		samsung_galaxy_s6.click();	
	}

}
