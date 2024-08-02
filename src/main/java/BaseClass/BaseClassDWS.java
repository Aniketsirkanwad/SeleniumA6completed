package BaseClass;

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
import org.testng.annotations.Parameters;

public class BaseClassDWS {
	public  WebDriver driver;
//	@Parameters({"browser","url"})
	@BeforeClass
	public void preCondition(String browser) {
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
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pratikp12@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pratik@123");
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
