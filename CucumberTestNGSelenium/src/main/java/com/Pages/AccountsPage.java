package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
private WebDriver pdriver;
	
	private By accountsections = By.xpath("//div[@class = 'row addresses-lists']");
	
	public AccountsPage(WebDriver pdriver) {
		// TODO Auto-generated constructor stub
		this.pdriver = pdriver;
	}
	
	public String getAccountsPageTitle() {
		return pdriver.getTitle();
	}

	public int getAccountSectionCount() {
		 return pdriver.findElements(accountsections).size();
	}
	
	public List<String> getAccountSectionList() {
		List<String> ListOptions = new ArrayList<>();
		
		List<WebElement> AccountHeaderList = pdriver.findElements(accountsections);
		for(WebElement ele : AccountHeaderList) {
			String text = ele.getText();
			//System.out.println(text);
			ListOptions.add(text);
		}
		return ListOptions;
	}
}
