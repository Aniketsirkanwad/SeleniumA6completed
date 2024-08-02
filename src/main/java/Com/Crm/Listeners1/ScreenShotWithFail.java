package Com.Crm.Listeners1;


	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
    import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClass.DwsScreenShot;

	public class ScreenShotWithFail extends DwsScreenShot  implements ITestListener {
		ExtentSparkReporter spark;
		ExtentReports report;
		 ExtentTest test;
		@Override
		public void onTestStart(ITestResult result) {
			String t_name=result.getMethod().getMethodName();
			Reporter.log(t_name+"is executed");
			 test=report.createTest(t_name);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			String t_name=result.getMethod().getMethodName();
			test.log(Status.PASS,t_name+"is success" );
			Reporter.log(t_name+"is sucess");
			
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String t_name=result.getMethod().getMethodName();
			test.log(Status.FAIL,t_name+"is failure" );
			Reporter.log(t_name+"is failure");
			TakesScreenshot ts =(TakesScreenshot)driver;
			String screenshot=ts.getScreenshotAs(OutputType.BASE64);
			test.addScreenCaptureFromBase64String(screenshot);
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			String t_name=result.getMethod().getMethodName();
			test.log(Status.SKIP,t_name+"skipeed" );
			Reporter.log(t_name+"is skipped");
		}

		@Override
		public void onStart(ITestContext context) {
			//Create spark reporter
			spark=new ExtentSparkReporter("./Report/failedTestCase.html");
			
			//configer the spart reporter
			spark.config().setDocumentTitle("SampleReport");
			spark.config().setReportName("Manikandan");
			spark.config().setTheme(Theme.DARK);
			
			//create the extent report
			 report=new ExtentReports();
			
			//configure extent report
			report.setSystemInfo("Os","Window-10");
			report.setSystemInfo("Browser","Chrome-100");
			
			//attach the  spark repoter to the exten report
		    report.attachReporter(spark);
		}

		@Override
		public void onFinish(ITestContext context) {
			report.flush();
		}

	}


