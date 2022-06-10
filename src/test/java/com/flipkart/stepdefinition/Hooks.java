package com.flipkart.stepdefinition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions a = new Commonactions();
	
	Properties p = new Properties();
	
	@Before
	public void beforeScenario() throws Throwable {
		
		FileReader file = new FileReader(".//src//test//resources//credentials.properties");
		
		p.load(file);
		
		  
		
		System.out.println("Before each scenario ex: browser launch");
        a.launch(p.getProperty("Environment"));
        
        
        p.setProperty("username","rajan");  
		
        FileWriter f = new FileWriter(".//src//test//resources//credentials.properties");
		  
		p.store(f,"default");
        //driver.navigate().back();
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		
		System.out.println("After each scenario ex: browser quit");
		
		if(scenario.isFailed()){
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		}else{
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		}
		
		driver.quit();

	}
	
	//Exceution Order
	//Before
	//Background
	//Scenario
	//After

}
