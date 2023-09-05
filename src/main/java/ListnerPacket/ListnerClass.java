package ListnerPacket;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener

{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getName()+": Main Method Started");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+" Status: Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName()+" Status: Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(result.getName()+" Status: Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Main Test"+context.getName()+" Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Main Test"+context.getName()+" Finished");

	}

}
