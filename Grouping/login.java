package Grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class login {
	
	@Test(priority=1,groups="sanity")
	void loginByEmail() {
		System.out.println("loginByEmail");
	}
	@Test(priority=2,groups="sanity")
	void loginByFacebook() {
		System.out.println("loginByFacebook");
	}
	@Test(priority=3,groups="sanity")
	void loginByTwitter() {
		System.out.println("loginByTwitter");
	}

}
