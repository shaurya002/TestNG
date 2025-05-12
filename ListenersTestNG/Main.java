package ListenersTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.awesomeqa.com/ui");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test (priority=1)
	void urlcnfrm() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.awesomeqa.com/ui/");
	}
	
	@Test (priority=2, dependsOnMethods= {"urlcnfrm"})
	void logoCnfrm() {
		boolean status = driver.findElement(By.xpath("//img[@title='TheTestingAcademy eCommerce']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test (priority=3, dependsOnMethods= {"urlcnfrm"})
	void titleCnfrm() {
		Assert.assertEquals(driver.getTitle(), "Your Store");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	
}
