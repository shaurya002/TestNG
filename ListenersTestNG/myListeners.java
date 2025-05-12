package ListenersTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// by implementing ITestListener
// by extending TestListenerAdapter

public class myListeners implements ITestListener{
	
	public void onStart(ITestContext context) {
		System.out.println("this is on Start");
	  }
	
	
	public void onTestStart(ITestResult result) {
	    System.out.println("this is on Test Start");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("this is on Test Success");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("this is on Test Failure");
		//here we can take screenshot becoz test got failed
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("this is on Test Skipped");
	  }
	
	public void onFinish(ITestContext context) {
		System.out.println("this is on Finish");
	  }
	
}
