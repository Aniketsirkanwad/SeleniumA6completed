package ExtentReoprt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginFunctionWithCorrectCredential {
	@Test
	public void CorrectCredential() throws InterruptedException {
		//Create spark reporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./Report/LoginFunction.html");
		//configer the spart reporter
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Manikandan");
		spark.config().setTheme(Theme.DARK);
		//create the extent report
		ExtentReports report=new ExtentReports();
		//configure extent report
		report.setSystemInfo("Os","Window-10");
		report.setSystemInfo("Browser","Chrome-100");
		//attach the  spark repoter to the extent report
	   report.attachReporter(spark);
	   ExtentTest test=report.createTest("CorrectCredential");
	   
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		WebElement community_Poll=driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if(community_Poll.isDisplayed()) {
			test.log(Status.INFO,"comunity_Poll is displayed");
		}
		else
		{
			test.log(Status.INFO,"comunity_Poll is not Displayed");
		}
		report.flush();
	}
}
