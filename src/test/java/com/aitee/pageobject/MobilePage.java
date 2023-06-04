package com.aitee.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {

	public WebElement mobilename(WebDriver driver, String mobilename) {
		String mobilexpath = "//*[contains(text(),'"+mobilename+"')][2]";
		return driver.findElement(By.xpath(mobilexpath));
	}
	
	@FindBy(id = "productTitle")
	private WebElement producttitle;
	
	@FindBy(xpath = "//*[@id='add-to-cart-button']")
	private WebElement addtocart;

	public WebElement getProducttitle() {
		return producttitle;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	public MobilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
