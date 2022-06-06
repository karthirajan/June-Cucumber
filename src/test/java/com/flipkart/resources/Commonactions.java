package com.flipkart.resources;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.flipkart.stepdefinition.MobileSteps;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
	public void launch(String url) {
		 WebDriverManager.chromedriver().setup();
		 
		ChromeOptions c = new ChromeOptions();
		c.addArguments("start-maximized");
		//c.addArguments("--headless");
		 
		 driver = new ChromeDriver(c);
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void inserText(WebElement ele,String value){
		ele.sendKeys(value,Keys.ENTER);
	}
	
	public void window() {
		
		 String parent = driver.getWindowHandle();
			
			Set<String> child = driver.getWindowHandles();
			for (String x : child) {
				
				if(!x.equals(parent)){
					driver.switchTo().window(x);
					System.out.println("window switched");
				}
				
			}

	}
	
	public void scrollDown(String x, String y){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	
	public void scrollDown(WebElement ele) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}
	
	public void screenShot(String name) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//target//"+name+".png");
		FileUtils.copyFile(source, dest);

	}

}
