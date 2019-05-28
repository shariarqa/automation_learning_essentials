package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Collapse {
	@Test
	 public void collapse() throws InterruptedException {
	 
	 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
	 
	 Thread.sleep(10000);
	 
	 WebElement collapsebtn = driver.findElement(By.xpath("//*[@id='accordian1']/h3"));
	 collapsebtn.click();
	 
	 String className = collapsebtn.getAttribute("class");
	 
	 if(className.contains("clearfix open active")) {
		 
		 System.out.println("Done");
	 }
	 else {
		 System.out.println("not done");
	 }
	 
		String verifyText= "Book IRCTC Tickets online";
		String actural = driver.findElement(By.xpath("//*[@id='customertab1']/div[2]/div[3]/div[2]/div/ul/li[7]")).getText();
		Assert.assertEquals(verifyText, actural);
		
	}
	 

}
