package com.automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandleExample {

	WebDriver driver;

	@Test
	public void windowhandle() {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Latest\\com.automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//li[contains(@class,'youtube')]//a[contains(@target,'_blank')]")).click();
		driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[4]/a")).click();

		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> itr = windowID.iterator();

		String w1 = itr.next();
		String w2 = itr.next();
		String w3 = itr.next();
		String w4 = itr.next();
		String w5 = itr.next();

		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		System.out.println(w5);
		driver.close();
		driver.switchTo().window(w1);

		driver.quit();

	}

}
