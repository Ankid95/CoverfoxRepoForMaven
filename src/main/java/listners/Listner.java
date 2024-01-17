package listners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import active__BASE__Coverfox.Lunching__URL_BASE_Coverfox;
import active__UTILE__coverfox.Common__Method__For__Coverfox_in_UTIL__Class;

public class Listner extends Lunching__URL_BASE_Coverfox implements ITestListener 
{
	@Override
	public void onStart(ITestContext context) {
		 Reporter.log("onStart Listner works", true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{ Reporter.log("taking scnshort  onTestFailure Listner works", true);
	try {
		Common__Method__For__Coverfox_in_UTIL__Class.TakeScreenShort(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		 Reporter.log("onTestSkipped Listner works", true);
	}
	@Override
	public void onFinish(ITestContext context) {
		
		 Reporter.log("onFinish Listner works", true);
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		 Reporter.log("onTestSuccess Listner works", true);
	}
}
