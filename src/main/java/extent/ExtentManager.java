package extent;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	public ExtentReports getExtentReports() 
	{
		String reportpath = System.getProperty("user,dir") + "/reports/extent-report.html";
		
		File reportsfolder = new File(System.getProperty("user.dir") + "/reports");
		
		if(!reportsfolder.exists()) 
		{
			reportsfolder.mkdirs();
		}
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
		reporter.config().setReportName("Automation Test Result");
		reporter.config().setDocumentTitle("Test Report");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Prateek");
		
		return extent;
				
	}
	
}
