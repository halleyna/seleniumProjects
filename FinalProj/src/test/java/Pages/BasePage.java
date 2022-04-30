package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	// to refresh the page
	public void refreshPage() {
		driver.navigate().refresh();
	}

	// To verify the page title
	public void verifyTitle(String title) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Waiting for title to be : " + title);
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("Found title");
	}

	// To verify the element is visible
	public void verifyElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Waiting for element to be visible " + element);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element became visible");
	}

}
