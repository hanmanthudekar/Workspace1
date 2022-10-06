package com.qa.Utility;

import org.openqa.selenium.JavascriptExecutor;

import com.qa.TestBase.BasecClass;

public class UtilClass extends BasecClass{

	public void scrollDown() 
	{
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("scroll(0,1000)");
	}
}
