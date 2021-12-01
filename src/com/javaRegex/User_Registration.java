package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {

	public boolean validate_firstName(String Fname) {
		
		String first_name = Fname;
		String user_name = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(user_name);
		Matcher matcher = pattern.matcher(first_name);
		return matcher.matches();
	}
}
