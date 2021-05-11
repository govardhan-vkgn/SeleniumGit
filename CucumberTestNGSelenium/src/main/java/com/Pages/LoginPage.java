package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver pdriver;
	
	private By emailid = By.id("email");
	private By password = By.id("passwd");
	private By signIn = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	
	public LoginPage(WebDriver pdriver) {
		// TODO Auto-generated constructor stub
		this.pdriver = pdriver;
	}

	public String getLoginPageTitle() {
		return pdriver.getTitle();
	}
	public boolean isForgotPwdLiknExist() {
		return pdriver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		pdriver.findElement(emailid).sendKeys(username);
	}
	public void enterPassword(String pwd) {
		pdriver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLogin() {
		pdriver.findElement(signIn).click();
	}
	
	public AccountsPage doLogin(String un,String pwd) {
		System.out.println("Login with username : " + un + "\n" + "passwrod : " + pwd);
		pdriver.findElement(emailid).sendKeys(un);
		pdriver.findElement(password).sendKeys(pwd);
		pdriver.findElement(signIn).click();
		return new AccountsPage(pdriver);
	}
}
