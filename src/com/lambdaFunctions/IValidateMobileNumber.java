package com.lambdaFunctions;

import com.javaRegex.UserRegisterationExceptions;

@FunctionalInterface
public interface IValidateMobileNumber {

	public boolean validate_mobilenumber(String number) throws UserRegisterationExceptions;
}
