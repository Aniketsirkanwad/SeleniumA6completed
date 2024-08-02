package Listeners;

import static org.testng.Assert.assertEquals;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.BaseClassDWS;
@Listeners(Com.Crm.Listeners1.Basic.class)
public class TestCaseBasic extends BaseClassDWS{
	@Test
	public void main1() throws InterruptedException {
		String expected_Url="https://demowebshop.tricentis.com/";
		preCondition(expected_Url);
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//    	driver.get("https://demowebshop.tricentis.com/");
     	Thread.sleep(2000);	
		String actual_Url=driver.getCurrentUrl();
		assertEquals(expected_Url,actual_Url);
//		Reporter.log("main1",true);
		
	}
	@Test
	public void main2() throws InterruptedException {
		String expected_Url="https://demowebshop.tricentis.com";
		preCondition(expected_Url);
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//     	driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);	
		String actual_Url=driver.getCurrentUrl();
		assertEquals(expected_Url,actual_Url);
//		Reporter.log("main2",true);
		
	}

}
