package PomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DigitalDownloads {
	
	public DigitalDownloads(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	private @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]") WebElement digitalDownload;
	private @FindBy(id="products-orderby") WebElement sortBy;
	private @FindBy(id="products-pagesize")WebElement display;
	private @FindBy(id="products-viewmode")WebElement view;

	public void digitalDownload() {
		digitalDownload.click();
	}
	public void sortBy(int i) {
		Select se=new Select(sortBy);
	}
	public void display(int user) {
		Select se=new Select(display);
	}
	public void view(int user) {
		Select se=new Select(view);
	}
}
