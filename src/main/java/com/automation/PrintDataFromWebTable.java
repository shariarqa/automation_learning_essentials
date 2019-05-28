package com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintDataFromWebTable {

	WebDriver driver;
	
	
	public void getRowData() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/monthly");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'Urja Global')]/parent::td[1]/parent::tr"));
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
				
			}
			
		}
	
	
	public void getRowData1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='t01']/tbody/tr[2]/td[1]/parent::tr"));
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
				
			}
			
		}
	
	@Test
	public void printAllDataCompleteTable() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
				
			}
			
		}


	

}
