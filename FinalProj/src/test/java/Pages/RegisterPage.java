package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {

	// declaration
	@FindBy(xpath = "//a[text()=\"Register\"]")
	private WebElement registerLink;

	@FindBy(id = "gender-female")
	private WebElement genderBtn;

	@FindBy(id = "FirstName")
	private WebElement firstnameTextbox;

	@FindBy(id = "LastName")
	private WebElement lastnameTextbox;

	@FindBy(id = "Email")
	private WebElement emailTextbox;

	@FindBy(id = "Password")
	private WebElement pwdTextbox;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpwdTextbox;

	@FindBy(id = "register-button")
	private WebElement registerBtn;

	@FindBy(xpath = "//div[@class=\"result\"]")
	private WebElement registerSuccessMsg;

	@FindBy(xpath = "//input[@value=\"Continue\"]")
	private WebElement continueAfterRegisterBtn;

	@FindBy(xpath = "//a[@class=\"ico-logout\"]")
	private WebElement logoutAfterRegistrationBtn;

	// initialization
	public RegisterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Utilization

	public void clickOnRegisterLink() {
		registerLink.click();
	}

	public void selectGender() {
		genderBtn.click();
	}

	public void enterFirstname(String name1) {
		firstnameTextbox.sendKeys(name1);
	}

	public void enterLastname(String name2) {
		lastnameTextbox.sendKeys(name2);
	}

	public void enterEmail(String email) {
		emailTextbox.sendKeys(email);
	}

	public void enterPassword(String pwd) {
		pwdTextbox.sendKeys(pwd);
	}

	public void enterConfirmPassword(String confirmpwd) {
		confirmpwdTextbox.sendKeys(confirmpwd);
	}

	public void saveDetails() {
		registerBtn.click();
	}

	public String getRegisterSuccessfulMessage() {
		return registerSuccessMsg.getText();
	}

	public void goToNextPage() {
		continueAfterRegisterBtn.click();
	}

	public void logoutAfterRegistration() {
		logoutAfterRegistrationBtn.click();
	}

}
