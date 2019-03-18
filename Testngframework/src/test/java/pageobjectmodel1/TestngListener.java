package pageobjectmodel1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestngListener implements ITestListener {


public void onTestStart(ITestResult result) {
		System.out.println("Test has been started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test got passed are "+ result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test got failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test has been skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

