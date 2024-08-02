package PomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCard {
	public GiftCard(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	private @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]") WebElement giftCard;
	private @FindBy(xpath="//input[@fdprocessedid='yg6g9m']") WebElement giftCard1;
	private @FindBy(id="giftcard_1_RecipientName") WebElement reciptName;
	private @FindBy(id="giftcard_1_RecipientEmail")WebElement reciptEmail;
	private @FindBy(id="giftcard_1_SenderName")WebElement senderName;
	private @FindBy(id="giftcard_1_SenderEmail") WebElement senderEmail;
	private @FindBy(id="c")WebElement message;
	private @FindBy(id="addtocart_1_EnteredQuantity")WebElement quant;
	private @FindBy(id="add-to-cart-button-1")WebElement addToCartButton;
	public void giftCard() {
		giftCard.click();
	}
	public void giftCard1() {
		giftCard1.click();
	}
	public void reciptname(String user) {
		reciptName.sendKeys(user);
	}
	public void 

}
