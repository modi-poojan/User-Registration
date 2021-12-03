package com.javaRegex;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserJunitTest {

	User_Registration call = new User_Registration();
	
	@Test
	public void firstName_True() {
		boolean output = call.validate_firstName("Kunal");
		assertEquals(true, output);
	}
	
	@Test
	public void firstName_False() {
		boolean output = call.validate_firstName("joey");
		assertEquals(false, output);
	}
	
	@Test
	public void lastName_True() {
		boolean output = call.validate_lastName("Agrawal");
		assertEquals(true, output);
	}
	
	@Test
	public void lastName_False() {
		boolean output = call.validate_lastName("agrawal");
		assertEquals(false, output);
	}
	
	@Test
	public void email_True() {
		boolean output = call.validate_E_Mail("abc.ssds@gmai.com");
		assertEquals(true, output);
	}
	
	@Test
	public void email__False() {
		boolean output = call.validate_E_Mail("asd..@hs.dd.1l");
		assertEquals(false, output);
	}
	
	@Test
	public void mobile__True() {
		boolean output = call.validate_mobilenumber("91 2152482478");
		assertEquals(true, output);
	}
	
	@Test
	public void mobile__False() {
		boolean output = call.validate_mobilenumber("87824554");
		assertEquals(false, output);
	}
	
	@Test
	public void password__True() {
		boolean output = call.validate_password("Kvddf@asf9");
		assertEquals(true, output);
	}
	
	@Test
	public void password__False() {
		boolean output = call.validate_password("Gamfdt+sfaf");
		assertEquals(false, output);
	}
	
}

