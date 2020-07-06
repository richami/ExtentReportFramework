package com.qa.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentReports generateExtentReport()
	{
		String path=System.getProperty("user.dir")+"\\ExtentReport\\index.html";
		reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Zero Banking Test Report");
		reporter.config().setDocumentTitle("Test Results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester Name", "Richa Mittal");
		return extent;
		
	}

}
