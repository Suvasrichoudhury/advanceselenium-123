package TestNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenerImplimentation implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("test execution failed",true);
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("test execution started",true);
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("test execution finish",true);
		
	}
	

	
}

