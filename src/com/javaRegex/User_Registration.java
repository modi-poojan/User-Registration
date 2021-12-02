package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {

	final String NAME = "^[A-Z][a-zA-Z]{2,}$";
	final String E_MAIL = "^[\\w]+(.[\\w-]+)+@[\\w]+[.]([\\w]{1,2}.)*[a-zA-Z]{2,}$";
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
	
	public boolean validate_E_Mail(String e_mail) {
		
		Pattern pattern = Pattern.compile(E_MAIL);
		Matcher matcher = pattern.matcher(e_mail);
		return matcher.matches();
		
	}
}
