package BasicPractice.Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestingAnnotations05 {
	
	@Test
	void ttt() {
		System.out.println("Class - TestingAnnotations05");
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
