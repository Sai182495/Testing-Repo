package com.aitee.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	private WebElement searchbutton;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
