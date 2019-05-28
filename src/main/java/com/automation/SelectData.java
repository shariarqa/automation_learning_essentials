package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectData {

	WebDriver driver;

	@Test
	public void selectData() {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://taxilandny.com/get-free-car-insurance-quotes/");

		// Selecting the Value of a DropDown//

		WebElement coverage = driver.findElement(By.xpath("//*[@id='input_1_14']"));

		Select select = new Select(coverage);
		select.selectByVisibleText("Change of Broker");

		// Putting All the Value of The DropDown in to a List of WebElement//
		List<WebElement> cov = select.getOptions();

		for (int i = 0; i < cov.size(); i++) {

			System.out.println(cov.get(i).getText());

		}

		// Matching a Single String with the DropDown Value//
		String str = "Full Coverage";

		for (WebElement ele : cov) {

			if (ele.getText().equals(str)) {

				System.out.println("Matched");

			}
		}

		// Mathching a complete String Array withe Drop Down Value----Two Way//
		
		//-------------First Way ---------------------------//

		String[] exp = { "Liability Insurancee", "Full Coveragee", "Change of Brokerr" };

		for (int j = 0; j < exp.length; j++) {

			for (WebElement webElement : cov) {

				if (webElement.getText().toLowerCase().equals(exp[j].toLowerCase())) {

					System.out.println("Matched");
				}

				else {
					System.out.println("Not Matched");
				}

			}
			//-------------Second Way ---------------------------//
			String[] expect = { "Liability Insurance", "Full Coverage", "Change of Broker" };
			
			for (int k = 0; k < cov.size(); k++) {
				
				WebElement webEle = select.getOptions().get(k);
				
				System.out.println(webEle.getText());
				for(int l=0; l<expect.length; l++) {
					
					if(webEle.getText().toLowerCase().equals(expect[l].toLowerCase())) {
						System.out.println("Matched");
					}
					
				}
				
			}
		}

	}

}
