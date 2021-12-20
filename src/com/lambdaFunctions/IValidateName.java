package com.lambdaFunctions;

import com.javaRegex.UserRegisterationExceptions;

@FunctionalInterface
public interface IValidateName {

	public boolean validate_Name(String Fname) throws UserRegisterationExceptions;
}
