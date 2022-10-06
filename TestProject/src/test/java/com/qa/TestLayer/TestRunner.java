package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.BasecClass;

public class TestRunner extends BasecClass {

	@Test
	public void homePage() {
		h.scrollDown();
		h.clickOnOnlineOrientation();
	}
	
	@Test
	public void orientedRegister() {
		o.setFirstName();
		o.setLastName();
		o.setMail();
		o.setMobile();
		o.setPassword();
		o.setCpassword();
		o.selectCheckBox();
		o.VerifyRegisterButton();
	}
	
	@Test
	public void testRunner() {
		r.selectCheckbox();
		r.clickOnRegister();

	}
}
