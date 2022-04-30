package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	// declaration
	@FindBy(xpath = "//a[@class=\"ico-login\"]")
	private WebElement loginLink;
	
	@FindBy(xpath = "//input[@id=\"Email\"]")
	private WebElement emailTextbox;
	
	@FindBy (xpath = "//input[@id=\"Password\"]")
	private WebElement pwdTextbox;
	
	@FindBy (xpath = "//input[@value=\"Log in\"]")
	private WebElement loginBtn;
	
	@FindBy (xpath = "//a[@class=\"account\"]")
	private WebElement loginAccountElement;		
	
	@FindBy(xpath = "//a[@class=\"ico-logout\"]")
	private WebElement logoutAfterLoginBtn;

			
	//initialization
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void clickOnLoginLink() {
		loginLink.click();
	}
	
	public void enterEmail(String email) {
		emailTextbox.sendKeys(email);
	}
	
	public void enterPwd(String pwd) {
		pwdTextbox.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public String loggedinEmailID() {
		return loginAccountElement.getText();
	}
	
	public void logoutAfterLogin() {
		logoutAfterLoginBtn.click();
	}
	
	
}
