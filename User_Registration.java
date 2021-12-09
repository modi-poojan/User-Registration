package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {

	final String NAME = "^[A-Z][a-zA-Z]{2,}$";
	final String E_MAIL = "^[\\w-]+(\\.[\\w-]+)*@[\\w]+[.]([\\w]{1,2}.)*[a-zA-Z]{2,}$";
	final String PHONE_NUMBER = "^^[0-9]{1,3}[\\s][0-9]{10}$"; 
	final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=[^_\\W]*[_\\W][^_\\W]*$).{8,}$";
	
	public boolean validate_firstName(String Fname)throws UserRegisterationExceptions {
		
		Pattern pattern = Pattern.compile(NAME);
		Matcher matcher = pattern.matcher(Fname);
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegisterationExceptions("First name invalid", TypeOfException.INVALID_FIRST_NAME);
		}
	}
	
	public boolean validate_lastName(String Lname) throws UserRegisterationExceptions {
		
		Pattern pattern = Pattern.compile(NAME);
		Matcher matcher = pattern.matcher(Lname);
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegisterationExceptions("Last name invalid", TypeOfException.INVALID_LAST_NAME);
		}
	}
	
	public boolean validate_E_Mail(String e_mail)throws UserRegisterationExceptions {
		
		Pattern pattern = Pattern.compile(E_MAIL);
		Matcher matcher = pattern.matcher(e_mail);
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegisterationExceptions("E-mail is invalid", TypeOfException.INVALID_EMAIL);
		}
	}
	
	public boolean validate_mobilenumber(String number)throws UserRegisterationExceptions {
		
		Pattern pattern = Pattern.compile(PHONE_NUMBER);
		Matcher matcher = pattern.matcher(number);
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegisterationExceptions("Phone-number is invalid", TypeOfException.INVALID_MOBILE_NUMBER);
		}
	}
	
	public boolean validate_password(String password)throws UserRegisterationExceptions {
		
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher matcher = pattern.matcher(password);
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegisterationExceptions("Password is invalid", TypeOfException.INVALID_PASSWORD);
		}
	}
	
}
