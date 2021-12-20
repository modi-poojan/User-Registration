package com.lambdaFunctions;

import com.javaRegex.UserRegisterationExceptions;

@FunctionalInterface
public interface IValidateEmail {

	public boolean validate_E_Mail(String e_mail) throws UserRegisterationExceptions ;
}
