package com.automation;

import org.testng.annotations.Test;

public class TestEmailValidation {
	
	
	@Test
	public void emailvalidate() {
		
		EmailValidator validEmail = new EmailValidator();
		
		String email = "shariar@gmail.com";
		
		System.out.println(email+ " is Valid = " +validEmail.validate(email) );
			
		}
		
		
	

	@Test
	public void urlValid() {

		URLValidation validURL = new URLValidation();

		String url = "taxilandny.com";

		System.out.println(url + " is Valid = " + validURL.validateURL(url) );

	}
	
}
