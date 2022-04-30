package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.RegisterPage;
import TestNG.FinalProj.BaseTest;

public class RegistrationSuccess extends BaseTest {

	@Parameters({ "email", "pwd" })

	@Test()
	public void verifyRegistration(String email, String pwd) {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.clickOnRegisterLink();
		registerPage.selectGender();
		registerPage.enterFirstname("halleyna");
		registerPage.enterLastname("user2222");
		registerPage.enterEmail(email);
		registerPage.enterPassword(pwd);
		registerPage.enterConfirmPassword(pwd);
		registerPage.saveDetails();

		String expectedRegistrationMessage = "Your registration completed";
		assertEquals(registerPage.getRegisterSuccessfulMessage(), expectedRegistrationMessage);
		System.out.println("Registration is successful");

		registerPage.goToNextPage();
		registerPage.logoutAfterRegistration();
	}

}
