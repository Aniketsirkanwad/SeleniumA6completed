package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SkillBaseClass {
	public static WebDriver driver;
	public static void precondition() throws IOException
	{
		String browser=JavaUtilityClass.loginData("browser");
		String url=JavaUtilityClass.loginData("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
	}
	public static void register() throws IOException, InterruptedException
	{
		String firstName=JavaUtilityClass.loginData("firstName");
		String lastName=JavaUtilityClass.loginData("lastName");
		String email=JavaUtilityClass.loginData("email");
		String password=JavaUtilityClass.loginData("password");
		String cPassword=JavaUtilityClass.loginData("cPassword");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.xpath("(//input[@placeholder='Email'])[2]")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("repassword")).sendKeys(cPassword);
		Thread.sleep(2000);
		driver.findElement(By.name("signup")).click();
	}
	public static void postCondition() {
		driver.close();
	}

}
