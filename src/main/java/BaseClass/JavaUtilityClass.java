package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class JavaUtilityClass

{
	public static String loginData(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\ConfigerFile\\LoginFunction.properties");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
	}

}
