package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioCheck {

	WebDriver driver;
	
	@Test
	public void radioCheckBox() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://learn.letskodeit.com/p/practice");
		
		// Select Radio Button with the Assertion//
		WebElement bmwRadio = driver.findElement(By.xpath("//*[@id='bmwradio']"));
		bmwRadio.click();
		
		System.out.println("BMW Radion Button is Selected -------->>" + bmwRadio.isSelected());
		Assert.assertTrue(bmwRadio.isSelected());
		
		//Radio Button with if statement//
		
		boolean z = bmwRadio.isSelected();
		if(z == true) {
			System.out.println("Radio Button Selected");
			
		}
		else if (z == false) {
			
			bmwRadio.click();
			System.out.println("Was Not Selected, But Now Selected");
		}
		
		
		//Click on Checkbox if its not Selected//
		WebElement bmwcheck = driver.findElement(By.xpath("//*[@id='bmwcheck']"));
		
		boolean x = bmwcheck.isSelected();
		if(x==false) {
			bmwcheck.click();
			System.out.println("Checkbox is Selected Now");
		}
		else if (x==true)  {
			bmwcheck.click();
			System.out.println("Checkbox is Unselected");
			
		}
		Thread.sleep(3000);
		
		//Uncheck the Checkbox//
		
		boolean y = bmwcheck.isSelected();
		if(y==true) {
			bmwcheck.click();
			
			
		}
		
		String[] car= {"bmw","benz"};
		
		//Multiple CheckBox Selection//
		List<WebElement> checkBoxs = driver.findElements(By.xpath("//*[@id='checkbox-example']/fieldset/label"));
		int noe = checkBoxs.size();
		
		System.out.println(Integer.toString(checkBoxs.size()));
		
		for(int i=0; i<noe; i++) {
			checkBoxs.get(i).click();
		}
				
			}
			
		
		
		
	}
		
	
	

