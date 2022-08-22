package com.flipkart.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durai\\eclipse-workspace\\Selenium\\dri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sprint.com");
		Thread.sleep(5000);
		WebElement cl1 = driver.findElement(By.xpath("//button[text()='x']"));
		cl1.click();
		Thread.sleep(2000);
		WebElement cl2 = driver.findElement(By.xpath("//button[text()='Accept']"));
		cl2.click();
		
		WebElement move1 = driver.findElement(By.xpath("//a[text()='Phones & devices']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(move1).perform();
		WebElement move2 = driver.findElement(By.xpath("//a[text()='Cell phones']"));
		move2.click();
		WebElement move3 = driver.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
		ac.moveToElement(move3).perform();
		String text = move3.getText();
		System.out.println(text);
	}

}
