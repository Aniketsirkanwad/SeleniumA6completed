package ExtentReoprt;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.DwsScreenShot;
@Listeners(Com.Crm.Listeners1.ScreenShotWithFail.class)
public class TakeScreenShotONFailedTestCase extends DwsScreenShot   {
	@Test
	public void loginFunction() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin01@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin0");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}
		
		
}



