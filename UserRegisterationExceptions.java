package com.javaRegex;

public class UserRegisterationExceptions extends Exception {

	public String messgae;
	public TypeOfException type;
	
	public UserRegisterationExceptions() {
		super();
	
	}
	
	 public UserRegisterationExceptions(String message) {
		 super();
		 this.messgae = message;
	 }
	 
	 public UserRegisterationExceptions(String message, TypeOfException type) {
		 super();
		 this.messgae = message;
		 this.type = type;
	 }

	
}
