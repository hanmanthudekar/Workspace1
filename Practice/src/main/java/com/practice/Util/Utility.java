package com.practice.Util;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practice.TestBase.BaseClass;

public class Utility extends BaseClass {	
	
	public static Actions act;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;
	public static Select s;
	
	public void mouseActions() {
		act = new Actions(driver);
	}
	
	public void scroll() {
		js = ((JavascriptExecutor)driver);
	}
	
	public void implicitWaits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void explicitWaits() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public void dropDownHandeling(WebElement element) {
		s = new Select(element);
	}
	
	
}
