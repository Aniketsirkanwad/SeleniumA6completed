package TestNgBasic;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.BaseClassDWS;

public class ClickOnMultiopleElemnt extends BaseClassDWS {
	@Test
	public void clickOnElement() throws InterruptedException{
		String given_Url="https://demowebshop.tricentis.com/news/rss/1";
		String given_Url1="https://www.facebook.com/nopCommerce";
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		for (WebElement web : links) {
			String currnent_Url=driver.getCurrentUrl();
			if(given_Url.equals(currnent_Url))
			{
				driver.navigate().back();
				Thread.sleep(2000);
			}
			web.click();
			Set<String> child = driver.getWindowHandles();
			for (String str:child) {
				driver.switchTo().window(str);
				String current_Url1=driver.getCurrentUrl();
				if(given_Url1.equals(current_Url1))
				{
					driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				}
		}
		
	}
	}
}
