package PomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage{
 public  DWSHomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
private @FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")WebElement title;
private @FindBy(className="ico-register") WebElement register;
private @FindBy(className="ico-login") WebElement login;
private @FindBy(className="cart-label") WebElement shoppingCart;
private @FindBy(xpath="//span[text()='Wishlist']") WebElement wishlist;
private @FindBy(id="small-searchterms") WebElement searchTextField;
private@FindBy(xpath="(//a[contains(text(),'Books')])[1]") WebElement books;
private@FindBy(xpath="(//a[contains(text(),'Computers')])[1]") WebElement computers;
private @FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")WebElement electronic;
private @FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")WebElement apparel_Shoes;
private @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]") WebElement digitalDownload;
private @FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]") WebElement jewelry;
private @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]") WebElement giftCard;

public void title(String user) {
	title.sendKeys(user);
}
public void register() {
	register.click();
}
public void login() {
	login.click();
}
public void shoppingCart() {
	shoppingCart.click();
}
public void wishlist() {
	wishlist.click();
}
public void searchTextField(String user) {
	searchTextField.sendKeys(user);
}
public void books()
{
	books.click();
}
public void computers() {
	computers.click();
}
public void electronic() {
	electronic.click();
}
public  void apparel_Shoes() {
	apparel_Shoes.click();
}
public void digitalDownload() {
	digitalDownload.click();
}
public void jewelry() {
	jewelry.click();
}
public void giftCard() {
	giftCard.click();
}
}
