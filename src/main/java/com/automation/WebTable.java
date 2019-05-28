package com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lombok.extern.log4j.Log4j;


public class WebTable {

	WebDriver driver;
	Logger log = Logger.getLogger(WebTable.class);

	@Test
	public void getTableRowColCount() {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Launching Chrome");
		int rowsCount = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		System.out.println("No of rows are "+rowsCount);
	
		int colCount = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
//		System.out.println("No of rows are "+colCount);
//		log.info("Finish Chrome");
		log.info("No of rows are "+colCount);
			
	}

	@Test
	public void getDatafromTable() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	try {
	driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[1]/a")).click();
//	System.out.println("Clickable");
	log.info("Clickable");
	}
	catch (Exception e) {
		
//		System.out.println("Not Clickable");
		log.info("Not Clickable");
	}
	
	
	
	}
	
	@Test
	public void getDynamicDatafromTable() {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	String currentPrice = driver.findElement(By.xpath("//a[contains(text(),'Monsanto India')]/parent::*/following-sibling::td[3]")).getText();
	System.out.println(currentPrice);
	
	}
	
	@Test
	public void getRowData() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> rowData = driver.findElements(By.xpath("//a[contains(text(),'Monsanto India')]/parent::td[1]/parent::tr"));
		for (WebElement row :rowData ) {
	
			System.out.println(row.getText());
				
			}
			
		}
		
	}

