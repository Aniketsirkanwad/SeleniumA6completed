package AssertionPractice;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestMaticSoftAssertion {
	@Test
	public void testMatic2() throws InterruptedException {
		String expected_Url="https://testmatick.com/best-demo-websites-to-perform-software-test-automation";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testmatick.com/best-demo-websites-to-perform-software-test-automation/");
		Thread.sleep(2000);
		String actual_Url=driver.getCurrentUrl();
		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(expected_Url,actual_Url);
		soft.assertNotEquals(expected_Url,actual_Url,"Url is Not Matching");
		Reporter.log("I am in a TestMatic Page",true);
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.id("comment")).sendKeys("Hi How Are You");
		driver.findElement(By.id("author")).sendKeys("Pallu");
		driver.findElement(By.id("email")).sendKeys("pallu@gmail.com");
		driver.findElement(By.id("url")).sendKeys("demoredbus.com");
		Thread.sleep(3000);
	    WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbo']"));
	    Thread.sleep(3000);
	    checkBox.click();
	    soft.assertTrue(checkBox.isSelected(),"Element is Selected");
	    WebElement commentButton=driver.findElement(By.id("submit"));
	    commentButton.click();
	    soft.assertFalse(commentButton.isSelected(),"Submit Button is Selected");
		soft.assertAll();
		
	}

}
