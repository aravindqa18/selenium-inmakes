package org.stepdefinition;

import org.bsc.BaseClass;
import org.pjc.PojoAmzn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComeBack extends BaseClass {
	PojoAmzn az;
	@Given("open the chrome browser and maximize the window")
	public void open_the_chrome_browser_and_maximize_the_window() {
		launchbrowser();
		Windowmaximize();
		
	   
	}
	

	@When("pass the amazon url")
	public void pass_the_amazon_url() throws InterruptedException {
		
		launchurl("https://www.amazon.com/");
	   
	}

	@When("click the search icon")
	public void click_the_search_icon() throws InterruptedException {
		Thread.sleep(5000);
		az = new PojoAmzn();
		passtext("iphone 15 pro max phone", az.getSearchbox());
	   
	}

	@When("enter iphone in the search text box and click search")
	public void enter_iphone_in_the_search_text_box_and_click_search() {
		az = new PojoAmzn();
		
		clickbtn(az.getClicksearch());
	  
	}

	@When("click the first product")
	public void click_the_first_product() {
		az = new PojoAmzn();
		clickbtn(az.getClickimg());
	    
	}

	@When("click add to cart icon")
	public void click_add_to_cart_icon() {
		az = new PojoAmzn();
		clickbtn(az.getClickaddcart());
	  
	}

	@Then("close the browser")
	public void close_the_browser() {
		closebrowser();
	   
	}

}
