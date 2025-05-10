package Parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviders {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void TestLogIn(String m, String p) throws InterruptedException {
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(m);
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys(p);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		
		boolean status = driver.findElement(By.xpath("//p[@style='color: red;']")).isDisplayed();
		if(status) {
			Assert.assertTrue(status);
			
		}else {
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	
	@DataProvider(name="dp")
	Object [][] loginData() {
		
		Object [][] data = {
				{"abc@1234.com", "1234d567f89"},
				{"abqc@1234.com", "123s45a6789"},
				{"ab@1234.com", "12345d67a89"},
				{"abcd@1234.com", "123c45a6789"},
						};		
		return data;
	}
	
}
