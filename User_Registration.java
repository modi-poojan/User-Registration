package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {

	final String NAME = "^[A-Z][a-zA-Z]{2,}$";
	final String E_MAIL = "^[\\w-]+(\\.[\\w-]+)*@[\\w]+[.]([\\w]{1,2}.)*[a-zA-Z]{2,}$";
	final String PHONE_NUMBER = "^^[0-9]{1,3}[\\s][0-9]{10}$"; 
	final String PASSWORD = "^(?=.*[A-Z]){8,}$";
	
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
	
	public boolean validate_mobilenumber(String number) {
		
		Pattern pattern = Pattern.compile(PHONE_NUMBER);
		Matcher matcher = pattern.matcher(number);
		return matcher.matches();
	}
	
	public boolean validate_password(String password) {
		
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
	
}
