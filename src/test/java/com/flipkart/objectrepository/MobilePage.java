package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonactions;

public class MobilePage extends Commonactions{
	
	public MobilePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "q")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement closeIcon;
	
	@FindBy(xpath = "//button[text()='BUY NOW']")
	private WebElement buyNow;
	
	@FindBys({
		@FindBy(xpath = "//button[text()='BUY NOW']"),
		@FindBy(id = "Buy")
	})
	private WebElement buy;
	
	@FindAll({
		@FindBy(xpath = "//button[text()='BUY NOW']"),
		@FindBy(id = "Buy")
	})
	private WebElement BuyOR;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getCloseIcon() {
		return closeIcon;
	}

	public WebElement getBuyNow() {
		return buyNow;
	}
	
	

}
