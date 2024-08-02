package ExtentReoprt;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
@Test	
	public void BasicTeport()
	{
	//Create spark reporter
	ExtentSparkReporter spark=new ExtentSparkReporter("./Report/Reporter.html");
	
	//configer the spart reporter
	spark.config().setDocumentTitle("SampleReport");
	spark.config().setReportName("Manikandan");
	spark.config().setTheme(Theme.DARK);
	
	//create the extent report
	ExtentReports report=new ExtentReports();
	
	//configure extent report
	report.setSystemInfo("Os","Window-10");
	report.setSystemInfo("Browser","Chrome-100");
	
	//attach the  spark repoter to the exten report
    report.attachReporter(spark);
    ExtentTest test=report.createTest("BasicReport");
    test.log(Status.INFO, "reprt is successfully created");
    report.flush();
	}

}
