package DataDrivenTestingPractice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookLoginAssignment {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Raju");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElement(By.name("reg_email__")).sendKeys("9087657867");
		driver.findElement(By.id("password_step_input")).sendKeys("Raju@123");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select se=new Select(day);
		se.selectByIndex(9);
		Thread.sleep(2000);
		
		WebElement mon=driver.findElement(By.name("birthday_month"));
		Select se1=new Select(mon);
		se1.selectByIndex(8);
		Thread.sleep(2000);
		
		WebElement yer=driver.findElement(By.name("birthday_year"));
		Select se2=new Select(yer);
		se2.selectByIndex(14);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		
	}

}
