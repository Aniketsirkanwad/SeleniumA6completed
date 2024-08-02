package TestNgBasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Com.Crm.Listeners1.ReportWithMultipleTestCases.class)
public class ExecuteWithListeners {
	@Test
	public void dominos() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://pizzaonline.dominos.co.in/");
		Reporter.log("I am hungry",true);
		
	}
	@Test(timeOut=1000)
	public void csk() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.chennaisuperkings.com/");
	Reporter.log("Thala is back",true);
	Thread.sleep(2000);
	}
	@Test(dependsOnMethods="csk")
	public void rcb() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		Reporter.log("Rcb will win upcoming IPL",true);
	}
}
