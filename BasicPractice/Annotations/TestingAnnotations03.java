package BasicPractice.Annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingAnnotations03 {
	
	@Test
	void abc() {
		System.out.println("CLASS - TestingAnnotations03");
	}
	@BeforeTest
	void bt() {
		System.out.println("Before Test");
	}
}
