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

public class MultipleDataprovivers {

	public static WebDriver driver;
	
	@Test(dataProvider="search data",priority=1)
	public void test_Google_Search(String search){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys(search);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.name("btnK")).click();
		
	}
	
	@Test(dataProvider="fbLoginData",priority=2)
	public void fbLogin(String username,String password) {
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
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="search data")
	public Object[] searchItems() {
		
		Object [] parameter = new Object[3];
		
		parameter [0] = "Facebook";
		parameter [1] = "whatsapp web";
		parameter [2] = "https//:www.instagram.com";
		
		return parameter;
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
