package dataDrivenTestingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderPractice {

	public static WebDriver driver;
	
	@Test(dataProvider="fbLoginData")
	public void login(String username , String password)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(driver.getTitle().equals("Facebook"), "loggin succesful");
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	@DataProvider(name="fbLoginData")
	public Object[][] loginData()
	{
		Object data[][] = new Object [2][2];
		
		data[0][0] = "8975015726";
		
		data[0][1] = "Hanmant@Sandhya";
		
		data[1][0] = "9665779160";
		
		data[1][1] = "9665779160";
		return data;
	}
	
}
