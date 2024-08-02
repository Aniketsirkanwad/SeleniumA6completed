package PomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSRegister {
	public DWSRegister(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	private @FindBy(className="ico-register") WebElement register;
	private @FindBy(id="gender-male") WebElement gender;
	private @FindBy(name="FirstName") WebElement firstName;
	private @FindBy(id="LastName") WebElement lastName;
	private @FindBy(id="Email") WebElement email;
	private @FindBy(id="Password")WebElement password;
	private @FindBy(id="ConfirmPassword") WebElement confirmPassword;
	private @FindBy(id="register-button") WebElement registerButton;
	
	public void register() {
		register.click();
	}
	public void gender() {
		gender.click();
	}
	public void firstName(String user) {
		firstName.sendKeys(user);
	}
	public void lastName(String user) {
		lastName.sendKeys(user);
	}
	public void email(String user) {
		email.sendKeys(user);
	}
	public void password(String user) {
		password.sendKeys(user);
	}
	public void confirmPassword(String user) {
		confirmPassword.sendKeys(user);
	}
	public void registerButton() {
		registerButton.click();
	}

}
