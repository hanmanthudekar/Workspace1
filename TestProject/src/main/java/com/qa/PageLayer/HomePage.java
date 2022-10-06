package com.qa.PageLayer;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.BasecClass;

public class HomePage extends BasecClass{

	@FindBy(xpath="//a[@href='http://sandbox786.com/mccaV5/orientation_live']")
	private WebElement onlineOrientation;
	
	@FindBy(xpath = "//a[text()='Click here to register']")
	private WebElement register;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	public void scrollDown() {
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("scroll(0,5000)");
	}
	
	public void clickOnOnlineOrientation() {
		String parentHandle = driver.getWindowHandle();
		onlineOrientation.click();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String hs: allHandles) {
		if(!hs.equals(parentHandle)) {	
			driver.switchTo().window(hs);
			register.click();
		}
		}
	}
	}
