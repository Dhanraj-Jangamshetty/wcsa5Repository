package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener{

	
	public void onTestStart(ITestResult result) {
	
	}

	
	public void onTestSuccess(ITestResult result) {
	
	}

	
	public void onTestFailure(ITestResult result) {
	
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("This method failed taken ScreenShot : "+failedMethod,true);
		failedMethod(failedMethod);
	}

	
	public void onTestSkipped(ITestResult result) {
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	public void onStart(ITestContext context) {
	
	}

	
	public void onFinish(ITestContext context) {
		
	}

}