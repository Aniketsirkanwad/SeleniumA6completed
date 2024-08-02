package AssertionPractice;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMaticHardAssertion {
	@Test
	public void testMatic1() throws InterruptedException{
		String expected_url="https://testmatick.com/best-demo-websites-to-perform-software-test-automation";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testmatick.com/best-demo-websites-to-perform-software-test-automation/");
		Thread.sleep(2000);
		String actual_Url=driver.getCurrentUrl();
		assertNotEquals(expected_url,actual_Url);
		Reporter.log("I am in TestMatic Page",true);
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.id("comment")).sendKeys("Hi How Are You");
		driver.findElement(By.id("author")).sendKeys("Pallu");
		driver.findElement(By.id("email")).sendKeys("pallu@gmail.com");
		driver.findElement(By.id("url")).sendKeys("demoredbus.com");
		Thread.sleep(3000);
	    WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	    Thread.sleep(3000);
	    checkBox.click();
	    assertTrue(checkBox.isSelected(),"Element is Selected");
	    WebElement commentButton=driver.findElement(By.id("submit"));
	    commentButton.click();
	    assertFalse(commentButton.isSelected(),"Submit Button is Selected");
	}
}
