package PageObjectModulePractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PomPractice.DWSHomePage;

public class HomeFunction {
	@Test
public void home() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	DWSHomePage ref=new DWSHomePage(driver);
	//ref.title(null);
	ref.register();
	ref.login();
	ref.shoppingCart();
	ref.wishlist();
	ref.searchTextField("shoes");
	ref.books();
	ref.computers();
	ref.electronic();
	ref.apparel_Shoes();
	ref.digitalDownload();
	ref.jewelry();
	ref.giftCard();
	}
}
