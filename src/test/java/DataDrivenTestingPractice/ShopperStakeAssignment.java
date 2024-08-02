package DataDrivenTestingPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStakeAssignment {
	public static void main(String[] args) throws InterruptedException, IOException {
		String email=ShopperStakBaseClass.shopperlogin("email");
		String password=ShopperStakBaseClass.shopperlogin("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		
	}

}
