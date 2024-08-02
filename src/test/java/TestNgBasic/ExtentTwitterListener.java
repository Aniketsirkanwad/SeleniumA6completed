package TestNgBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClass.DWSBaseListeners;

public class ExtentTwitterListener extends DWSBaseListeners{
	@Test
	public void TwiterRegister() throws InterruptedException {
		String given_Url="https://x.com/nopCommerce";
		String parent=driver.getWindowHandle();
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Set<String> child = driver.getWindowHandles();	
		for (String str : child) {
			driver.switchTo().window(str);
			String currnet_Url=driver.getCurrentUrl();
			if(given_Url.equals(currnet_Url))
		{
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				driver.findElement(By.xpath("(//div[@class='css-175oi2r r-16y2uox r-1wbh5a2']/div[2])[1]")).sendKeys("Paru");
				driver.findElement(By.xpath("(//div[@class='css-175oi2r r-16y2uox r-1wbh5a2']/div[2])[2]")).sendKeys("9087654356");
				WebElement day=driver.findElement(By.id("SELECTOR_1"));
				Select se=new Select(day);
				se.selectByIndex(15);
				WebElement mon=driver.findElement(By.id("SELECTOR_2"));
				Select se2=new Select(mon);
				se2.selectByIndex(9);
				WebElement yer=driver.findElement(By.id("SELECTOR_3"));
				Select se3=new Select(yer);
				se3.selectByIndex(133);
				driver.findElement(By.xpath("(//div[@dir='ltr'])[12]")).click();
}
}
}
}
