package Grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class payment {
	
	@Test(priority=1,groups={"regression","sanity"})
	void paymentOnline() {
		System.out.println("paymentOnline");
	}
	@Test(priority=2,groups={"regression","sanity","functional"})
	void paymentOffline() {
		System.out.println("paymentOffline");
	}

}
