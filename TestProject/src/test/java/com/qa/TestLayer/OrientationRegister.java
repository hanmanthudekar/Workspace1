package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.PageLayer.OrientationRegisterationPage;
import com.qa.TestBase.BasecClass;

public class OrientationRegister extends BasecClass{

	@Test
	public void validateOrientationRegisterationPage() {
		o.setFirstName();
		o.setLastName();
		o.setMail();
		o.setMobile();
		o.setPassword();
		o.setCpassword();
		o.selectCheckBox();
		o.VerifyRegisterButton();
	}

}
