package com.aitee.stepdefenition;

import org.junit.Assert;

import com.aitee.base.BaseClass;
import com.aitee.pageobject.HomePage;
import com.aitee.pageobject.MobilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test extends BaseClass {
	
	HomePage homepage = null;
	MobilePage mobilepage = null;

	@Given("load the URL {string}")
	public void load_the_url(String string) {
	    initDriver();
	    getUrl(string);
	}

	@When("Search for {string} in Search Option")
	public void search_for_in_search_option(String string) {
	           homepage = new HomePage(driver);
	           sendkeys(homepage.getSearchbox(), string);
	           clickButton(homepage.getSearchbutton());
	           
	}

	@When("click on {string}")
	public void click_on(String string) {
	   mobilepage = new MobilePage(driver);
	  clickButton(mobilepage.mobilename(driver, string));
	}

	@Then("Check Page Landed on {string}")
	public void check_page_landed_on(String string) {
	         String producttitle = getStringText(mobilepage.getProducttitle());
	         Assert.assertTrue(producttitle.contains(string));
	}

	@When("Click on AddCart")
	public void click_on_add_cart() {
		Assert.assertEquals(true, false);
	   clickButton(mobilepage.getAddtocart());
	}
	
	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    System.out.println("name1 coloumn");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	  System.out.println("marks" + int1);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
	   System.out.println("Result Coloumn" + string);
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    System.out.println("name2 column");
	}

}
