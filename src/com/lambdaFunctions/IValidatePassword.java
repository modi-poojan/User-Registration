package com.lambdaFunctions;

import com.javaRegex.UserRegisterationExceptions;

@FunctionalInterface
public interface IValidatePassword {

	public boolean validate_password(String password) throws UserRegisterationExceptions;
}
