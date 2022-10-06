package com.practice.Pagelayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.practice.TestBase.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//img[@id='Header1_headerimg']")
	private WebElement logo;
	
	@FindBy(xpath="(//ul/li[@class='parent'])[6]")
	private WebElement selenium_practice;
	
	@FindBy(xpath="(//ul/li[@class='parent'])[6]//a")
	private List<WebElement> xpathPractice;

	public void verifyTitle() {
		String title = driver.getTitle();

		Assert.assertTrue(title.equals("H Y R Tutorials - H Y R Tutorials"));
		System.out.println("Title verified sucessfully...");
	}

	public void verifyLogo() {
		boolean cond = logo.isDisplayed();
		Assert.assertTrue(cond=true);
		System.out.println("Logo verified succesfully...");
	}
	
	public void selenium_practice() {
		util.mouseActions();
		util.act.moveToElement(selenium_practice);
		System.out.println("Moved to Selenium Parctice");
	}
	
	public void clickOnXpathPractice() {
		
		for(WebElement e:xpathPractice) {
			if(e.getText().equals("XPath Practice")) {
				e.click();
			}
		}
	}
}
