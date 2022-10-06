package com.practice.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.practice.Pagelayer.HomePage;
import com.practice.Util.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver ;
	public static HomePage home;
	public static Utility util;
	
	@BeforeSuite
	public void launchurl() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.hyrtutorials.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		home = new HomePage();
		util = new Utility();
	}
	
	//@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
