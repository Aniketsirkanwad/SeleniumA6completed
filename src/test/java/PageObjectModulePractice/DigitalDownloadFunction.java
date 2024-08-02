package PageObjectModulePractice;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import PomPractice.DigitalDownloads;

public class DigitalDownloadFunction {
	@Test
	public void DigitalDownload() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		DigitalDownloads ref=new DigitalDownloads(driver);
		ref.digitalDownload();
		ref.sortBy(2);
		ref.display(4);
		ref.view(1);
	}

}
