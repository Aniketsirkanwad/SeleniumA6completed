package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class HardAssertAsserEquals {
	@Test
	public void  main(){
		String expected_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url=driver.getCurrentUrl();
		assertEquals(expected_url,actual_url);
		assertNotEquals(expected_url,actual_url,"url is not Matching");
		Reporter.log("I am in DWS Home Page",true);
		WebElement search_field=driver.findElement(By.id("small-searchterms"));
		search_field.sendKeys("mobile",Keys.ENTER);
		WebElement advance_Search=driver.findElement(By.id("As"));
		advance_Search.click();
		assertTrue(advance_Search.isSelected(),"element is not selected");
		driver.findElement(By.id("Isc")).click();  
	}

	
}

