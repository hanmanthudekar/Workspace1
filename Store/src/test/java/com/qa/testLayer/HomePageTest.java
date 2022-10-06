package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.BaseClass;

public class HomePageTest extends BaseClass{
	
	@Test
	public void logo() {
		home.verifyLogo();
	}

}
