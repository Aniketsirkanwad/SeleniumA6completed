package BaseClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class GiftCard extends DWSBase
{
	public static ArrayList<String> readExcel() throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\comp\\OneDrive\\Desktop\\SeleniumNotes\\Giftcard1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet2");
			int row=sheet.getPhysicalNumberOfRows();
			int column=sheet.getRow(0).getPhysicalNumberOfCells();
			
			//System.out.println(row);
			//System.out.println(column);
			
			ArrayList<String> arr=new ArrayList<String>();
			
			for(int i=0;i<row;i++)
			{
				arr.add(sheet.getRow(i).getCell(0).toString());
			}
			return arr;
			
		}
		
		public static void main(String[] args) throws InterruptedException, IOException, EncryptedDocumentException {
		int i=0;
		precondition();
		Thread.sleep(2000);
		login();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		ArrayList<String> data = readExcel();
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys(data.get(i++));
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys(data.get(i++));
		WebElement your_name = driver.findElement(By.id("giftcard_2_SenderName"));
		your_name.clear();
		your_name.sendKeys(data.get(i++));
		WebElement your_email = driver.findElement(By.id("giftcard_2_SenderEmail"));
		your_email.clear();
		your_email.sendKeys(data.get(i++));
		driver.findElement(By.id("giftcard_2_Message")).sendKeys(data.get(i++));
		WebElement quntity = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		
		double d=Double.parseDouble(data.get(i++));
		int a=(int)d;
		String value=""+a;
		quntity.clear();
		quntity.sendKeys(value);
							
		driver.findElement(By.id("add-to-cart-button-2")).click();
		
		Thread.sleep(4000);
		 
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
        
		WebElement gift_card = driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[2]"));
		
		if(gift_card.isDisplayed())
		{
			System.out.println("gift card is added successfully");
		}
		else
		{
			System.out.println("gift card is not added in shopping cart");
		}
		
		Thread.sleep(2000);
		
		login();
		
		postCondition();
		
		
		
	}

		

	

}