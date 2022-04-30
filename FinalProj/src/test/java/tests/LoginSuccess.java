package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestNG.FinalProj.BaseTest;

public class LoginSuccess extends BaseTest{
	
	@Parameters({ "email", "pwd" })
	
	@Test()
	public void verifyLoginWithRegisteredUser(String email, String pwd) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLoginLink();
		loginPage.enterEmail(email);
		loginPage.enterPwd(pwd);
		loginPage.clickOnLoginBtn();

		String expectedLoginEmail = email;
		assertEquals(loginPage.loggedinEmailID(), expectedLoginEmail);
		System.out.println("LoginID is correctly seen");

		loginPage.logoutAfterLogin();
	}


}
