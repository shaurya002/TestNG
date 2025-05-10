package BasicPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations02 {
	
	@BeforeClass
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
	
	@AfterClass
	void logOut() {
		System.out.println("LogOut");
	}
	
}
