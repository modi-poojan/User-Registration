package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {

	final static String NAME = "^[A-Z][a-zA-Z]{2,}$";
	
	public boolean validate_firstName(String Fname) {
		
		Pattern pattern = Pattern.compile(NAME);
		Matcher matcher = pattern.matcher(Fname);
		return matcher.matches();
	}
	
	public boolean validate_lastName(String Lname) {
		
		Pattern pattern = Pattern.compile(NAME);
		Matcher matcher = pattern.matcher(Lname);
		return matcher.matches();
	}
}
