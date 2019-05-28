package com.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LenthValidation {

	@Test (groups= {"regression"})
	public void lenghtValidation() {
	
	String str = "This is Cool";
	
	int strSize = str.length(); 	
	int realSize = 12;
	if(strSize>12) {
		System.out.println("Bad");
	}
	else {
		System.out.println("Bad Size");
	}
	
	Assert.assertEquals(realSize, strSize);

}
}
