package com.automation;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkPresentsOnSite {
	
	WebDriver driver;

	@Test
	public void printAllLinks() {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(int i=0; i<links.size(); i++) {
			
			System.out.println(links.get(i).getAttribute("href"));
			
		}
		

			
			
			
		}
		
		

	
	
	}


