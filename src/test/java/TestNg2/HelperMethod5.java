package TestNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperMethod5 {
	@Test(groups="regression")
	public void shoes5() throws InterruptedException {	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://reebok.abfrl.in/");
		Thread.sleep(2000);
		driver.close();
	}

}
