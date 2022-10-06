package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.PageLayer.RegisterPage;
import com.qa.TestBase.BasecClass;

public class RegisterPageTest extends BasecClass {


	@Test
	public void validateRegisterPage() {
		r.selectCheckbox();
		r.clickOnRegister();
	}



}
