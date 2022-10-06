package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.qa.PageLayer.HomePage;
import com.qa.PageLayer.OrientationRegisterationPage;
import com.qa.PageLayer.RegisterPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasecClass {

	public static WebDriver driver;
	public static HomePage h;
	public static OrientationRegisterationPage o;
	public static RegisterPage r;

	
	@BeforeSuite
	public void launchBrowser()
	{	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://sandbox786.com/mccaV5/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		h = new HomePage(driver);
		o = new OrientationRegisterationPage();
		r = new RegisterPage();



	}

	@AfterSuite
	public void tearDown() 
	{
		driver.quit();
	}
}
