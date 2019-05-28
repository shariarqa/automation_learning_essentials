package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class Calender {
	
	WebDriver driver;
	String month = "January 2019";
	String date = "21";
	
	
	@Test (groups= {"sanity"})
	public void windowhandle() {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/");
		
				
		driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input")).click();
		
	WebElement mon = driver.findElement(By.xpath("//div[@class=\"datepicker dropdown-menu\"]/div[1]/table[1]/thead[1]/tr[1]/th[2]"));
		
	while (true) {
		
		if(mon.getText().equals(month)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//div[@class=\"datepicker dropdown-menu\"]/div[1]/table[1]/thead[1]/tr[1]/th[3]")).click();
		}
		
	}
		
	driver.findElement(By.xpath("//div[@class=\"datepicker dropdown-menu\"]/div[1]/table[1]/tbody/tr/td[contains(text(),'"+date+"')]")).click();
	
	}

}
