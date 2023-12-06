package listeners;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class iTestlistener_supportingclassfile implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case : "+result.getName()+" is started.");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case : "+result.getName()+" is passed.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case : "+result.getName()+" is falled.");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case : "+result.getName()+" is skipped.");
	}

	@Override
	// this is different than "onteststart" - this will get executed before the first class file in testng.xml
	// whereas "onteststart" will get executed before the first tc of that class file
	public void onStart(ITestContext context) {
		System.out.println("Test :"+context.getCurrentXmlTest().getName()+" is started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All test cases are finished.");
	}

}



