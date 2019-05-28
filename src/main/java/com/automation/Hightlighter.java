package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hightlighter {

	@Test
	 public void highlighterElement() {
	 
	 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://taxilandny.com/accident-claims/");
	 WebElement ele = driver.findElement(By.xpath("//*[@id='input_4_1_3']"));
	                //Call the highlighterMethod and pass webdriver and WebElement which you want to highlight as arguments.
	 highLighterMethod(driver,ele);
	 ele.sendKeys("SoftwareTestingMaterial.com");
	 }
	 
	        //Creating a custom function
	 public void highLighterMethod(WebDriver driver, WebElement element){
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid yellow;');", element);
	 }
	}

