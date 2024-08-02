package Listeners;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NetwokFailure {
	@Test(retryAnalyzer = Com.Crm.Listeners1.RetryNetwork.class)
	public void executeOneMotreTime() {
		String expected_Url="https://demowebshop.tricentis.com";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actual_Url=driver.getCurrentUrl();
	assertEquals(expected_Url,actual_Url,"Url is not Match");
	driver.quit();
	
	}

}
