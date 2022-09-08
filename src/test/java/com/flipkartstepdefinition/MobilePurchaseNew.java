package com.flipkartstepdefinition;


	import org.junit.BeforeClass;
	import org.junit.AfterClass;

	import org.junit.Before;
	import org.junit.After;
	import org.junit.Test;
	//import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	//import org.openqa.selenium.interactions.Actions;

	public class MobilePurchaseNew {
	static WebDriver driver=new ChromeDriver();
		
		 
		@BeforeClass
		    public static void beforeclass() {
			System.out.println("beforeclass");
			
			System.setProperty("webdriver.chrome.driver","D:\\Junit\\junit-arun\\Driver\\chromedriver.exe");
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
		}
			
		/*@AfterClass
		    
		public static void afterclass() {
			System.out.println("afterclass");
			//driver.quit();
		}
			
		@Before
			public void beforemethod() {
			System.out.println("beforemethod");
			//start time
		}
			
		@After
		    public void aftermethod() {
			System.out.println("aftermethod");
			//end time
		}*/
			@Test
			public void newMethod() throws InterruptedException {  
		    System.out.println("method1 from mobile");
			WebElement btnclick = driver.findElement(By.className("Login"));
			btnclick.click();
			Thread.sleep(1000);
			WebElement close = driver.findElement(By.className("✕"));
			close.click();
			
		
			}
	
	}
			
			
			
		
		
		
		







