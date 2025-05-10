package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamTest {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setUp(String br, String url) {
		
		switch(br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		default: System.out.println("Invalid Browser..."); return;
		}
		
		driver.get(url);
	}
	
	@Test(priority=1)
	void testLogo() {
		boolean isVisibleLogo = driver.findElement(By.xpath("//textarea[@class='gLFyf']")).isDisplayed();
		Assert.assertEquals(isVisibleLogo, true);
	}
	
	@Test(priority=2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test(priority=3)
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
