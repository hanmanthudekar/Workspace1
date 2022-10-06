package com.demoblaze.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demoblaze.PageLayer.HomePage;
import com.demoblaze.utilties.AddToCart;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static HomePage h;
	public static AddToCart add;

	@BeforeMethod
	public void launchBrowser()
	{	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		h = new HomePage();
		add= new AddToCart();

	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
}
