package DataDrivenTestingPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

import BaseClass.SkillBaseClass;

public class SkillRary extends SkillBaseClass{
	public static void main(String[]args) throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("C:\\DwsLogin\\GIftCardDetails.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet= wb.getSheet("Sheet1");
		String email=sheet.getRow(1).getCell(0).toString();
		String password=sheet.getRow(1).getCell(1).toString();
		Thread.sleep(2000);
		register();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
