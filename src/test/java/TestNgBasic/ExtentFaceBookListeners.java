package TestNgBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import BaseClass.DWSBaseListeners;
//@Listeners(Com.Crm.Listeners1.)
public class ExtentFaceBookListeners extends DWSBaseListeners{
	@Test
	public void faceBookRegister() throws InterruptedException {
		String given_Url="https://www.facebook.com/nopCommerce";
		String given_Url1="https://www.facebook.com/reg/?next=%2FnopCommerce";
		String parent=driver.getWindowHandle();
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> child = driver.getWindowHandles();	
		for (String str : child) {
			driver.switchTo().window(str);
			String currnet_Url=driver.getCurrentUrl();
			if(given_Url.equals(currnet_Url))
			{
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				Set<String> child1 = driver.getWindowHandles();
				for (String str1 : child1) {
					driver.switchTo().window(str1);
					String currnet_Url1=driver.getCurrentUrl();
					if(given_Url1.equals(currnet_Url1)) {
						driver.findElement(By.name("firstname")).sendKeys("Pratu");
						driver.findElement(By.name("lastname")).sendKeys("Patil");
						driver.findElement(By.name("reg_email__")).sendKeys("pratu@gmail.com");
						driver.findElement(By.name("reg_passwd__")).sendKeys("Pratu@123");
						WebElement day=driver.findElement(By.id("day"));
						Select se=new Select(day);
						se.selectByIndex(23);
						WebElement mon=driver.findElement(By.id("month"));
						Select se1=new Select(mon);
						se1.selectByIndex(9);
						WebElement yer=driver.findElement(By.id("year"));
						Select se2=new Select(yer);
						se2.selectByIndex(234);
						driver.findElement(By.xpath("//label[text()='Male']")).click();
						driver.findElement(By.name("websubmit")).click();
					}
				}
		}
	}
 }
}
