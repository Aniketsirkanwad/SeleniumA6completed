package PageObjectModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.DWSLogin;

public class LoginFunction {
	@Test
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		DWSLogin ref=new DWSLogin(driver);
		ref.login_Link();
		ref.userName("raju@gmail.com");
		ref.password("Raju@123");
		ref.loginButon();
	}

}
