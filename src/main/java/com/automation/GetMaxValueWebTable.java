package com.automation;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetMaxValueWebTable {
	
	WebDriver driver;
	//*** https://www.guru99.com/handling-dynamic-selenium-webdriver.html**//
	
	
	@Test
	public void getTableRowColCount() throws ParseException {

		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
		 String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List  col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List  rows = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[5]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        
	        
	        for (int i =1;i<rows.size();i++)
	        {    
	            max= driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
	            NumberFormat f =NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	            max = num.toString();
	            m = Double.parseDouble(max);
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
		
			
	}

}
