package com.ustglobal.exception.customizedcheckedexception;

public class InvalidAmountException extends Exception {
private String message = "Daily limitt is 40k";
@Override
public String getMessage() {
	return message;
}
}
