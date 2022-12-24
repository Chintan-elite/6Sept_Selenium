package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoTestListener implements ITestListener
{
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test passed...");
	}
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("test failed...");
	}
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("test started...");
	}
	
	
	
	
	public void onFinish(ITestContext context) {
		System.out.println("finished...");
	}
	
	
	
}
