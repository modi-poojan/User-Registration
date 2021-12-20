package com.javaRegex;

import java.util.Scanner;

public class User_Main {

	public static void main(String[] args) throws UserRegisterationExceptions {
		System.out.println("\nUser Registration\n");
		Scanner scan = new Scanner(System.in);
		
		UserValidation call = new UserValidation();
		
		System.out.println("Enter First Name: \n");
		String fname = scan.next();
		System.out.println(call.nameValidation.validate_Name(fname));
		
		
		System.out.println("Enter Last Name: \n");
		String lname = scan.next();
		System.out.println(call.nameValidation.validate_Name(lname));		

		System.out.println("Enter email: \n");
		String email = scan.next();
		System.out.println(call.emailValidation.validate_E_Mail(email));
		
		System.out.println("Enter Mobile Number: \n");
		String number = scan.next();
		System.out.println(call.phoneValidation.validate_mobilenumber(number));
		
		System.out.println("Enter Password: \n");
		String password = scan.next();
		System.out.println(call.passwordValidation.validate_password(password));
		
		System.out.println("Adding a sentence");		
	scan.close();	
	}
}
