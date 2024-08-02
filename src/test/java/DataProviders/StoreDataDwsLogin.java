package DataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

   public class StoreDataDwsLogin {
		@DataProvider(name="data")
		public Object[][] sender(){
			Object[][] obj=new Object[2][2];
			obj[0][0]="admin01@gmail.com";
			obj[0][1]="admin01";
			obj[1][0]="admin02@gmail.com";
			obj[1][1]="admin02";
			return obj;
		}
		@Test(dataProvider="data")
		public void receiver(String data1,String data2)
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("email");
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("password");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			driver.close();
		}
	}
	
