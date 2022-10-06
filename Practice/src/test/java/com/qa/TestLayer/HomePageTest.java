package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.practice.TestBase.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void verifyTitle() {
		home.verifyTitle();
	}
	
	@Test
	public void verifyLogo() {
		home.verifyLogo();
	}
	
	@Test
	public void moveToSelenuimPractice() {
		home.selenium_practice();
	}
	
	@Test
	public void clickXpathPractice() {
		home.clickOnXpathPractice();
	}
	}
