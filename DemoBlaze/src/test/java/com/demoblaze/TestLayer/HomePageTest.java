package com.demoblaze.TestLayer;

import org.testng.annotations.Test;

import com.demoblaze.PageLayer.HomePage;
import com.demoblaze.TestBase.BaseClass;
import com.demoblaze.utilties.AddToCart;

public class HomePageTest extends BaseClass{

	@Test
	public void bySamsung_Galaxy_S6() {
		h.clickOnPhones();
		h.clickOnPhones();
		add.clickOnAddToCart();

	}
}
