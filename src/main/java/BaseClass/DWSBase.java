package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DWSBase {
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
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void login() throws IOException {
		String username=JavaUtilityClass.loginData("username");
		String password=JavaUtilityClass.loginData("password");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
	public static void postCondition()
	{
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}

}
