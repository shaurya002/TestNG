package BasicPractice.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestingAnnotations04 {

	@Test
	void def() {
		System.out.println("CLASS - TestingAnnotations04");
	}
	@AfterTest
	void at() {
		System.out.println("After Test");
	}
}
