package com.javaRegex;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserJunitTest {

	UserValidation call = new UserValidation();
	
	@Test
	public void firstName_True() {
		try {
			boolean output = call.nameValidation.validate_Name("Kunal");
			assertEquals(true, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
	}
	
	@Test
	public void firstName_False()  {
		try {
			boolean output = call.nameValidation.validate_Name("joey");
			assertEquals(false, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
	}
	
	@Test
	public void lastName_True() throws UserRegisterationExceptions {
		try {
			boolean output = call.nameValidation.validate_Name("Agrawal");
			assertEquals(true, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
	}
	
	@Test
	public void lastName_False() {
		try {
			boolean output = call.nameValidation.validate_Name("agrawal");
			assertEquals(false, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
	}
	
	@Test
	public void email_True() {
		try {
			boolean output = call.emailValidation.validate_E_Mail("abc.ssds@gmai.com");
			assertEquals(true, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
		
	}
	
	@Test
	public void email__False() {
		try {
			boolean output = call.emailValidation.validate_E_Mail("asd..@hs.dd.1l");
			assertEquals(false, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
	}
	
	@Test
	public void mobile__True() {
		try {
			boolean output = call.phoneValidation.validate_mobilenumber("91 2152482478");
			assertEquals(true, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
	}
	
	@Test
	public void mobile__False() {
		try {
			boolean output = call.phoneValidation.validate_mobilenumber("87824554");
			assertEquals(false, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
	}
	
	@Test
	public void password__True() {
		try {
			boolean output = call.passwordValidation.validate_password("Kvddf@asf9");
			assertEquals(true, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
	}
	
	@Test()
	public void password__False() {
		try {
			boolean output = call.passwordValidation.validate_password("Gamfdt+sfaf");
			assertEquals(false, output);
		}
		catch(UserRegisterationExceptions exception_) {
			exception_.printStackTrace();
		}
	}
	
}

