package TestNgBasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTezseCase {
	@Test(priority=1,invocationCount=1)
	public void dws() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.close();	
	}
	@Test(priority=2,invocationCount=1,threadPoolSize=5)
	public void csk() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority=0,invocationCount=1)
	public void rcb() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
		driver.close();	
	}
	@Test(priority=5,invocationCount=1)
	public void mumbai() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mumbaiindians.com/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority=4,invocationCount=1)
	public void sunrises() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.sunrisershyderabad.in/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority=6,invocationCount=1)
	public void dillicapita() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.suzukimotorcycle.co.in/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority=7,invocationCount=1)
	public void panjab() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.marutisuzuki.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	
}
