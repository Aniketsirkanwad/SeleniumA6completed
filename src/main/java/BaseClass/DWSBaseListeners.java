package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DWSBaseListeners {
	public static WebDriver driver;
	@BeforeClass
	public void preCondition() throws IOException {
		String browser=JavaUtilityClass.loginData("browser");
		String url=JavaUtilityClass.loginData("url");
		if(browser.equals("chrome")) {
		driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
	}
	@BeforeMethod
	public void login() throws IOException {
		String username=JavaUtilityClass.loginData("username");
		String password=JavaUtilityClass.loginData("password");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void logOut() {
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void postCondition() {
		driver.quit();
	}

}


