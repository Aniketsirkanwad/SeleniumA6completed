package Assignments;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAdvance {
	@Test
	public static void main(String[]args) throws InterruptedException {
		String expected_Url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String actual_Url=driver.getCurrentUrl();
		assertEquals(expected_Url,actual_Url);
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Rajan");
		driver.findElement(By.id("LastName")).sendKeys("Patil");
		driver.findElement(By.id("Email")).sendKeys("rajan@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Rajan@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Rajan@123");
		driver.findElement(By.id("register-button")).click();
		
		driver.close();
	}
}


