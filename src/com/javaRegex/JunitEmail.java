package com.javaRegex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JunitEmail {
	
	String input;
	boolean result;
	
	public JunitEmail(String input , boolean result) {
		
		this.input = input;
		this.result = result;
	}

	UserValidation call = new UserValidation();
	
	@Parameters
	public static Collection email() { 
		
		return Arrays.asList(new Object[][] {
			
			{"abc@yahoo.com", true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com", true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc@gmail.com.com",true},
			
			{"abc",false},
			{".abc@.com.my",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"abc123@.com.com –",false},
			{".abc@abc.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false},
			{"abc..2002@gmail.com",false},
			{"abc.@gmail.com",false},
			{"abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},
			{"13. abc@gmail.com.aa.au",false},
			
			});
	}
	
	@Test
	public void  validate_E_Mail() {
		try {
			boolean output = call.emailValidation.validate_E_Mail(input);
			assertEquals(result, output);
		}
		catch(UserRegisterationExceptions exception_){
			exception_.printStackTrace();
		}
}
}

