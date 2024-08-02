package DataProvidersExcelPractice;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class ShopperStakeDataProvider {
		@DataProvider(name="data")
		public Object[][] sender() throws EncryptedDocumentException, IOException{

			FileInputStream fis=new FileInputStream("C:\\DwsLogin\\LogoinDetails.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheet= (Sheet) wb.getSheet("Sheet1");
			int row=sheet.getRow(0).getPhysicalNumberOfCells();
			int colom=sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] obj=new Object[row][colom];
			for (int i = 0; i < row; i++) {
			for (int j = 0; j < colom; j++) {
			obj[i][j]=	sheet.getRow(i).getCell(j).toString();
			}	
			}
			return obj;
		}
		@Test(dataProvider="data")
		public void receiver(String data1,String data2) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(7000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("Email")).sendKeys(data1);
			driver.findElement(By.id("Password")).sendKeys(data2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			
		}
	}



