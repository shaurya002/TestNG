package BasicPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations01 {
	
	@BeforeMethod
	void logIn() {
		System.out.println("LogIn");
	}
	@Test(priority=1)
	void search() {
		System.out.println("Searching...");
	}
	@Test(priority=2)
	void advSearch() {
		System.out.println("Advanced Searching...");
	}
	@AfterMethod
	void logOut() {
		System.out.println("LogOut");
	}

}
