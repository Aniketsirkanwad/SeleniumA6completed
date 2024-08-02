package DataDrivenTestingPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDrivenTesting.JavaUtilityClass;



public class OrangeHrmAssignment {
	public static void main(String[]args) throws IOException
	{
		String username=JavaUtilityClass.loginData("username");
		String password=JavaUtilityClass.loginData("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit'] ")).click();
	}

}
