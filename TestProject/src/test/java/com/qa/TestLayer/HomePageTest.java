package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.PageLayer.HomePage;
import com.qa.PageLayer.OrientationRegisterationPage;
import com.qa.PageLayer.RegisterPage;
import com.qa.TestBase.BasecClass;

public class HomePageTest extends BasecClass{
	

	@Test
	public void scrollDown() {
		h.scrollDown();
		h.clickOnOnlineOrientation();
		
	}
		
	}
