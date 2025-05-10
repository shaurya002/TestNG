package Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DependencyExample {
	
	@Test(priority=1)
	void openApp() {
		System.out.println("launching..");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods="openApp")
	void search() {
		Assert.assertTrue(false);
		System.out.println("search...");
	}
	
	@Test(priority=3, dependsOnMethods = {"openApp", "search"})
	void advSearch() {
		System.out.println("advanceSearch...");
	}

	
	@Test(priority=4, dependsOnMethods="openApp")
	void closeApp() {
		System.out.println("closing...");
	}

}
