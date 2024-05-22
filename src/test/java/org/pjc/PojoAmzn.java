package org.pjc;

import org.bsc.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAmzn extends BaseClass {
	public PojoAmzn() {
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(id="twotabsearchtextbox")
		private WebElement searchbox;
		
		@FindBy(xpath="//input[@value='Go'][1]")
		private WebElement clicksearch;
		
		@FindBy(xpath="//span[text()='I15 PROMAX Unlocked Android Phone 5G Cell Phone with 8GB+256GB Dynamic Island and Titanium Design Smart Phones 6.8“ HD Screen 50MP+24MP Camera 6800 mAh Long Battery Dual SIM Phone (Black)']")
		private WebElement clickimg;
		
		
		@FindBy(id="add-to-cart-button")
		private WebElement clickaddcart;
		
		
		
		//getters


		public WebElement getSearchbox() {
			return searchbox;
		}


		public WebElement getClicksearch() {
			return clicksearch;
		}


		public WebElement getClickimg() {
			return clickimg;
		}


		public WebElement getClickaddcart() {
			return clickaddcart;
		}
		
		
		
		
		
		
		
	

}
