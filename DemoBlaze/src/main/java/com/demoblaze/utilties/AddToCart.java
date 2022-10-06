package com.demoblaze.utilties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.TestBase.BaseClass;

public class AddToCart extends BaseClass{

	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	private WebElement addToCart;
	
	public AddToCart() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnAddToCart() {
		addToCart.click();
	}
	
}
