package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaptchaPage {
	private WebDriver pdriver;
	
	private By captchasymbol = By.xpath("//*[@id=\"rc-anchor-container\"]/div[4]/div[1]/div[1]");
	private By captchacheckbox = By.xpath("//*[@class=\"recaptcha-checkbox-border\"]");
	
	public CaptchaPage(WebDriver pdriver) {
		// TODO Auto-generated constructor stub
		this.pdriver = pdriver;
	}
	
	public String getCaptchaPageTitle() {
		return pdriver.getTitle();
	}
	public String getCaptchaSymbolExist() {
		return pdriver.findElement(captchasymbol).getAttribute("aria-hidden");
	}
	public void clickCaptchaCheckbox() {
		 pdriver.findElement(captchacheckbox).click();;
	}
}
