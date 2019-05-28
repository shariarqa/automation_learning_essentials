package com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class webDriverTest {
	
	WebDriver driver;
	String Yahoo = "https://www.yahoo.com/";
	String Paypal= "https://www.paypal.com";
	
	/* If any PayPal Test fail because of the security challenge please run again, 
	 * security pictures required manual verification. 
	 * In that case please run again that test it will pass!
     * 
     * Total Runtime of this script is 1.1974 Minute Approximately
     * 
     * TestNG annotations used
     * 
     * If your firefox is the latest version, please use gecko driver.  " Please Change the Path" 
     * 
     * To complete the test i took about 5 hours.
     * 
     */
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shari\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	
	
	@Test (priority=1)
	public void funWithYahooPage() throws InterruptedException {
		
		driver.get(Yahoo);
		// Step 1. Assert that we are on the correct page by checking that title = 'Yahoo' 
		String title = driver.getTitle();
		
		try {
		    Assert.assertEquals(title, "Yahoo");
		} catch (AssertionError e) {
		    System.out.println("We are not on Yahoo");
		    throw e;
		}
		System.out.println("Walla! Title Matched");
		
		
	
		/*
		 * Step 2. Display the count of options on the left side panel ('Mail', 'News', 'Sports',......)
		 * including 'More Yahoo Sites' option
	 	 */
		
		driver.findElement(By.xpath("//a[contains(text(),'More...')]")).click();
		for(WebElement links: driver.findElements(By.tagName("a"))){
			
			System.out.println("Get All The Links Here ------------------>>" + links.getText());
			
		}
		
				
		try{		
		// Step 3: Enter 'Nutrition' on the search bar on the top
		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("Nutrition");
		
		// Step 4: Click Search button
		driver.findElement(By.xpath("//*[@id='uh-search-button']")).click();
		}
		catch(WebDriverException e){
			
			System.out.println("Not Clicked");
				
			}
		
		System.out.println("Walla! Search Done");

		// Step 5: Display count of Images on the page
		driver.get(Yahoo);
		Thread.sleep(3000);
		List<WebElement> listImages=driver.findElements(By.tagName("img"));
		System.out.println("No. of Images: "+ listImages.size());
		

		// Step 6. Click 'Sign In' button on the top left side

		driver.get(Yahoo);
		driver.findElement(By.id("uh-signin")).click();
		// Step 7. Display the boolean state of the checkbox next to 'Keep me signed in'
		
		try{
		boolean check = driver.findElement(By.xpath("//input[@id='persistent']")).isSelected();
		}catch(WebDriverException e){
			
			System.out.println("Not Clicked");
				
			}
		
		System.out.println("Walla! Checkbox Selected");
		
		// Step 8. Click 'Sign In' button 
		driver.findElement(By.id("login-signin")).click();
		
		/*
		 * Step 9. Error will be displayed. 
		 * Assert true when the error message contains the expectedErrorStr defined below
		 */
		
		String error = driver.findElement(By.id("username-error")).getText();
		String expectedErrorStr = "Sorry, we don't recognize this email.";

		if(error.equals(expectedErrorStr)){
			System.out.println("Error Matched");
		}else
			System.out.println("Error Didn't Matched");

		}
	
	
	/**
	 * Test to simulate an attempted Sign in to Paypal and validate error
	 * message returned
	 * 
	 * Starting point will be the PayPal
	 * 
	 * *** You may want to do a manual test at first to gather the needed
	 * element locators needed for the test ****** Run Thru The Debugger
	 * 
	 * https://www.paypal.com
	 * 
	 * Follow Steps below
	 * 
	 */	
	
	
	
	
	@Test (priority=2)
	public void funWithPayPalSignUpPage() throws InterruptedException {
		
		driver.get(Paypal);
		
		
		
		/*
		 * Step 1. Assert that we are on the correct page by checking that title = 'Send Money, Pay Online or Set Up
		 * a Merchant Account - PayPal'  
		 */ 
		
		String payPaltitle = driver.getTitle();
		
		try {
		    Assert.assertEquals(payPaltitle, "Send Money, Pay Online or Set Up a Merchant Account - PayPal");
		} catch (AssertionError e) {
		    System.out.println("We are not on PayPal");
		    throw e;
		}
		System.out.println("<<---------Walla! Title Matched------------>>");
		
		
	}
	
	@Test (priority=3)
	private void signUpFormFillup(){
		driver.get(Paypal);
		// Step 2. Click 'Sign Up for Free' button
		
		
		driver.findElement(By.xpath("//a[@id='signup-button']")).click();
		
					
		driver.findElement(By.xpath("//a[@id='cta-btn']")).click();
		
		/* 
		 * Step 4: Enter password test123 
    	 * Step 5: Enter confirm password test123
    	 * Step 6: Click 'Continue' button    
    	 */
			
		
		   driver.findElement(By.xpath("//button[text()='Next']")).click();			
			
			// Step 3: Enter email address test@google.com 
			
			driver.findElement(By.id("paypalAccountData_email")).sendKeys("test@google.com");
		
		    //Step 4: Enter password test123 
			
			driver.findElement(By.id("paypalAccountData_password")).sendKeys("test123");
			
			//Step 5: Enter confirm password test123
			//Step 6: Click 'Continue' button 
			
			
			driver.findElement(By.id("paypalAccountData_confirmPassword")).sendKeys("test123");
		
			
			
			try{
				boolean confirmPasswordFieldDisplayed =  driver.findElement(By.id("paypalAccountData_confirmPassword")).isDisplayed();
				}
				catch(WebDriverException e){
					
					System.out.println("Not Dislplayed");
						
					}
				
				System.out.println("Walla! Confirm Password Displayed");

				}
			
			
					
	// Step 9. Display the count of Images on the Sign In page
	@Test (priority=4)
	public void countOfImages(){
		driver.get(Paypal);

	List<WebElement> listImages=driver.findElements(By.tagName("img"));
	System.out.println("No. of Images: "+ listImages.size());
			
	}
	
	
	// Step 10. Display the country flag shown on the bottom right side
	@Test (priority=5)
	public void displayFlag(){
		driver.get(Paypal);
	try{
	boolean flag = driver.findElement(By.xpath("//a[@title='See all countries/regions']")).isDisplayed();
	}
	catch(WebDriverException e){
		
		System.out.println("Not Dislplayed");
			
		}
	
	System.out.println("Walla! Flag Displayed");

	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	

}
