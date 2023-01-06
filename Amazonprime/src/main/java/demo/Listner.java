package demo;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listner implements ITestListener
{
	ExtentReports er;
	//It will monitor the listners class example when it is starting ending
	ExtentTest test;
	

	public void onTestStart(ITestResult result) {
     String name = result.getName();
	 //particular test case monitor
     test = er.createTest(name);
	   
		
	}

	public void onTestSuccess(ITestResult result) {
		  String name = result.getName();
		  test.log(Status.PASS, name +"---pass");
		
		
	}

	public void onTestFailure(ITestResult result) {
		  String name = result.getName();
		  test.log(Status.FAIL, name +"----->fail");
		  
				 
		
	}

	public void onTestSkipped(ITestResult result) {
		  String name = result.getName();
		  test.log(Status.SKIP, name +"---->skipped");
		  
		
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\ExtentReport\\"+3+"html");
				//To provide title to the report
				
				esr.config().setDocumentTitle("Final Vtiger Report");
				//To providing the theme or colour
				esr.config().setTheme(Theme.STANDARD);
				//To provide the Reporter name
				esr.config().setReportName("Nikhil");
				
				
				//Extra Relevent Information Report
				er = new ExtentReports();
				er.attachReporter(esr);
				er.setSystemInfo("operating system","window");
				er.setSystemInfo("Language","java");
				

				
				
		 
		
		
	}

	public void onFinish(ITestContext context) {
		
		//It is going to consolidate the Report
		
		er.flush();


	}
		
  
}
