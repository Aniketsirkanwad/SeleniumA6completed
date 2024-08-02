package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("C:\\DwsLogin\\GIftCardDetails.xlsx");
		Workbook wb=WorkbookFactory.create(fis);{
	    Sheet sheet=wb.getSheet("Sheet3");
		String firstname=sheet.getRow(0).getCell(0).toString();
		String lastname=sheet.getRow(1).getCell(0).toString();
		String phno=sheet.getRow(2).getCell(0).toString();
		String email=sheet.getRow(3).getCell(0).toString();
		String password=sheet.getRow(4).getCell(0).toString();
		String conpassword=sheet.getRow(5).getCell(0).toString();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Create Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("First Name")).sendKeys(firstname);
		driver.findElement(By.id("Last Name")).sendKeys(lastname);
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("Phone Number")).sendKeys(phno);
		driver.findElement(By.name("Email Address")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("Confirm Password")).sendKeys(conpassword);
		WebElement agree=driver.findElement(By.id("Terms and Conditions"));
		agree.click();
		driver.findElement(By.xpath("//button[@class='signup_bn5__l1dQe']")).click();
		}
		
	}
	
}