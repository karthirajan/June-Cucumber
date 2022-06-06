package com.flipkart.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.When;

public class TelevisionSteps extends Commonactions{
	
	static String name;
	
	@When("User search tv")
	public void user_search_tv() {
		
		name = "LG tv";
		
		driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
	    
	}

	@When("user select the tv")
	public void user_select_the_tv() {
		
		String[] s = name.split(" ");
		
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+s[0]+"')])[2]"));
	    String fn = mobileName.getText();
		System.out.println("Mobile Name is :"+fn);
		
		mobileName.click();
	    
	}

}
