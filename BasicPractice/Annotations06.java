package BasicPractice;

import org.testng.annotations.*;

public class Annotations06 {
	
	@BeforeMethod
	void logIn() {
		System.out.println("LogIn @BeforeMethod");
	}
	
	@AfterMethod
	void logOut() {
		System.out.println("LogOut @AfterMethod");
	}
	@Test(priority=1)
	void search() {
		System.out.println("Searching...");
	}
	@Test(priority=2)
	void advSearch() {
		System.out.println("Advanced Searching...");
	}
	
	
	@BeforeClass
	void logIn2() {
		System.out.println("LogIn- Before class");
	}
	
	@AfterClass
	void logOut2() {
		System.out.println("LogOut - after class");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("Before Test");
	}
	@AfterTest
	void at() {
		System.out.println("After Test");
	}
	@BeforeSuite
	void bs() {
		System.out.println("Before - Suite");
	}
	@AfterSuite
	void as() {
		System.out.println("After - Suite");
	}
}
