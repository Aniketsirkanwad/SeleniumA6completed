package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSLogin {
	
public DWSLogin(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
private @FindBy(className="ico-login")
WebElement login_Link;

private @FindBy(id="Email")
WebElement userName;

private @FindBy(name="Password")
WebElement password;

private @FindBy(xpath="(//input[@type='submit'])[2]")
WebElement loginButton;

public void login_Link() {
	login_Link.click();
}
public void userName(String user) {

	userName.sendKeys(user);
}
public void password(String pass) {
	password.sendKeys(pass);
}
public void loginButon() {
	loginButton.click();
}
}
