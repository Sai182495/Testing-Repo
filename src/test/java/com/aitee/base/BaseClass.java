package com.aitee.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public static WebDriver driver;
	
	public void initDriver() {	
		System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void sendkeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	
	public void clickButton(WebElement element) {
		element.click();
	}
	
	public String getStringText(WebElement element) {
		return element.getText();
	}
	
	public void handelMultipleWindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindow = new ArrayList<>();
		listwindow.addAll(windowHandles);
		String string = listwindow.get(index);
		driver.switchTo().window(string);
	}
}
