package DataDrivenTestingPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ShopperStakBaseClass {
	public static String shopperlogin(String key) throws IOException
	{
		Properties pr=new Properties();
		FileInputStream fis=new FileInputStream(".\\ConfigerFile\\LoginFunction.properties");
		pr.load(fis);
		String date=pr.getProperty(key);
		return date;
	}

}
