package TestNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperMethod4 {
	@Test(groups="regression")
	public void shoe4() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nike.com/in/w/air-force-1-shoes-5sj3yzy7ok");
		Thread.sleep(2000);
		driver.close();
	}

}
