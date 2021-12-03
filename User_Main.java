package com.javaRegex;

import java.util.Scanner;

public class User_Main {

	public static void main(String[] args) {
		System.out.println("\nUser Registration\n");
		Scanner scan = new Scanner(System.in);
		
		User_Registration call = new User_Registration();
		
		System.out.println("Enter First Name: \n");
		String fname = scan.next();
		System.out.println(call.validate_firstName(fname));
		
		System.out.println("Enter Last Name: \n");
		String lname = scan.next();
		System.out.println(call.validate_lastName(lname));		

		System.out.println("Enter email: \n");
		String email = scan.next();
		System.out.println(call.validate_E_Mail(email));
		
		System.out.println("Enter Mobile Number: \n");
		String number = scan.next();
		System.out.println(call.validate_E_Mail(number));
		
		System.out.println("Enter Password: \n");
		String password = scan.next();
		System.out.println(call.validate_E_Mail(password));
		
		
	scan.close();	
	}
}
