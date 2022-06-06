package com.flipkart.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.MobilePage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileSteps extends Commonactions{
	
	
	
	static String name;
	MobilePage m = new MobilePage();
	
	Commonactions a = new Commonactions();
	
	@Given("User launches flipkart application")
	public void user_launches_flipkart_application() {
		
		
	   
	}

	@Given("User login flipkart by using credentials")
	public void user_login_flipkart_by_using_credentials() {
		
		 try{
				
				
				m.getCloseIcon().isDisplayed();
				m.getCloseIcon().click();
				
			}catch (Exception e) {
				
				System.out.println("Login not required");
				
			}
	    
	}
	


	@When("User search mobiles")
	public void user_search_mobiles() {
		
		name = "realme";
		a.inserText(m.getSearchBar(), name);
	    
	}

	@When("user select the mobile")
	public void user_select_the_mobile() {
		
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[2]"));
	    String fn = mobileName.getText();
		System.out.println("Mobile Name is :"+fn);
		
		mobileName.click();
	    
	}

	@When("User navigates into new window and click on add to cart")
	public void user_navigates_into_new_window_and_click_on_add_to_cart() {
		
		a.window();
	    
	}

	@Then("user validate the cart page")
	public void user_validate_the_cart_page() throws IOException {
		
		
		a.scrollDown(m.getBuyNow());
		String text = m.getBuyNow().getText();
		//Assert.assertTrue(text.contains("Hi"));
		
		a.screenShot("report1");
		
		Assert.assertEquals("BUY NOW", text);
		System.out.println(text);
		if(text.contains("Hi")){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		

	    
	}
	
	@When("User search mobiles by using one dim list")
	public void user_search_mobiles_by_using_one_dim_list(DataTable dataTable) {
		
		List<String> asList = dataTable.asList();
		
       name = asList.get(1);
		
		m.getSearchBar().sendKeys(name,Keys.ENTER);
	    
	}
	
	@When("User search mobiles by using one dim map")
	public void user_search_mobiles_by_using_one_dim_map(DataTable dataTable) {
		
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		
       name = asMap.get("phone3");
		
		driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
	    
	}
	
	@When("User search mobiles {string}")
	public void user_search_mobiles(String phone) {
		
		name = phone;
		
		m.getSearchBar().sendKeys(name,Keys.ENTER);
	    
	}

}
