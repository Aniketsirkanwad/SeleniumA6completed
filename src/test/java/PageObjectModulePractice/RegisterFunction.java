package PageObjectModulePractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PomPractice.DWSRegister;

public class RegisterFunction {
	@Test
	public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		DWSRegister ref=new DWSRegister(driver);
		ref.register();
		ref.gender();
		ref.firstName("paru");
		ref.lastName("Patil");
		ref.email("paru@gmail.com");
		ref.password("Paru@123");
		ref.confirmPassword("Paru@123");
		ref.registerButton();
	}

}
