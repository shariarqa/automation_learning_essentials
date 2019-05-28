package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zoom {
	
	@Test
	 public void zoomInOut() {
	 
	 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://taxilandny.com/accident-claims/");
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("document.body.style.zoom=200%");
	 
	
	 

	}

}
