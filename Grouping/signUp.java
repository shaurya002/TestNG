package Grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class signUp {
	
	@Test(priority=1,groups="regression")
	void signUpByEmail() {
		System.out.println("signUpByEmail");
	}
	@Test(priority=2,groups="regression")
	void signUpByFacebook() {
		System.out.println("signUpByFacebook");
	}
	@Test(priority=3,groups="regression")
	void signUpByTwitter() {
		System.out.println("signUpByTwitter");
	}

}
