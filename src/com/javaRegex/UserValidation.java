package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.lambdaFunctions.*;
public class UserValidation {

	final String NAME = "^[A-Z][a-zA-Z]{2,}$";
	final String E_MAIL = "^[\\w-]+(\\.[\\w-]+)*@[\\w]+[.]([\\w]{1,2}.)*[a-zA-Z]{2,}$";
	final String PHONE_NUMBER = "^^[0-9]{1,3}[\\s][0-9]{10}$"; 
	final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
	
	public IValidateName nameValidation = (Fname) ->{
		
		Pattern pattern = Pattern.compile(NAME);
		Matcher matcher = pattern.matcher(Fname);
		return matcher.matches();
	};
	
	public IValidateEmail emailValidation =(e_mail) ->{
		
		Pattern pattern = Pattern.compile(E_MAIL);
		Matcher matcher = pattern.matcher(e_mail);
		return matcher.matches();
	};
	
	public IValidateMobileNumber phoneValidation = (number) -> {
		
		Pattern pattern = Pattern.compile(PHONE_NUMBER);
		Matcher matcher = pattern.matcher(number);
		return matcher.matches();
	};
	
	public IValidatePassword passwordValidation = (password) -> {
		
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	};
	
}
