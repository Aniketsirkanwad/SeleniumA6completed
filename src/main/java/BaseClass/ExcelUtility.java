package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public static String getData(String sheetName,int string,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\AdvanceSelenium\\HomeWork1.xlsx");
		Workbook w= WorkbookFactory.create(fis);
		Sheet s = (Sheet) w.getSheet(sheetName);
		return s.getRow(string).getCell(cell).toString();
	}
	
}
 