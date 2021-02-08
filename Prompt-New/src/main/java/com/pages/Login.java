package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.Base;

public class Login extends Base {
	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(xpath = "//button[text()='Sign In']")
	public WebElement LoginBtn;

	@FindBy(xpath = "//h4[contains(text(),'Sign in using your credentials')]")
	public WebElement lheader;

	@FindBy(xpath = "//button[text()='Stay Signed In']")
	public WebElement staySigninButton;

	public Login() {
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver, this);
	}

	public void login(String username, String pass) throws InterruptedException {
//		Assert.assertTrue(lheader.isDisplayed(), "Title text field present which is not expected");
//	 Assert.assertEquals("Log in to get started or",lheader.getText(),"No screen found");
		Assert.assertEquals(lheader.isDisplayed(), true, "No login screen found");
		email.sendKeys(username);
		password.sendKeys(pass);
		LoginBtn.click();
		// Thread.sleep(2000);

		// Assert.assertEquals(lheader.isDisplayed(), false,"Not logged in");
	}
}
