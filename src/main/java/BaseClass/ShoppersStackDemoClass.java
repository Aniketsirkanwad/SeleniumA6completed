package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShoppersStackDemoClass  {
	public  static WebDriver driver;
	public static  void precondition() throws IOException 
	{
	String browser=JavaUtilityClass.loginData("browser");
	String url=JavaUtilityClass.loginData("url");
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 driver = new ChromeDriver();
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
	 driver.get("https://www.shoppersstack.com/");
	 }
}


