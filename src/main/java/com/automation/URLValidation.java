package com.automation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidation {
	
	private Pattern pattern;
	private Matcher matcher;
	
	private static final String URL_REGEX = "(?:(?:https?|ftp|file):\\/\\/|www\\.|ftp\\.)(?:\\([-A-Z0-9+&@#\\/%=~_|$?!:,.]*\\)|[-A-Z0-9+&@#\\/%=~_|$?!:,.])*(?:\\([-A-Z0-9+&@#\\/%=~_|$?!:,.]*\\)|[A-Z0-9+&@#\\/%=~_|$])";

	public URLValidation(){
		
		pattern = Pattern.compile(URL_REGEX);
		
	}
	
	public boolean validateURL(final String url) {
		
		matcher = pattern.matcher(url);
		return matcher.matches();
		
	}
	
	}
