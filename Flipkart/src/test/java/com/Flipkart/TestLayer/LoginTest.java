package com.Flipkart.TestLayer;

import org.testng.annotations.Test;

import com.Flipkart.TestBase.BaseClass;

public class LoginTest extends BaseClass{

	@Test
	public void loginTest()
	{
		login.setUsername();
		login.setPassword();
		login.clickOnLoginButton();
	}
}
