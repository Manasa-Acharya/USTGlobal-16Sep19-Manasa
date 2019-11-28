package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {
public static void main(String[] args) {
	System.out.println("Main started");
	
	ValidateAmout va = new ValidateAmout();
	try {
		va.checkAmount(100000);
		System.out.println("withdraw ur cash");
	} catch (InvalidAmountException e) {
		System.err.println(e.getMessage());
	}
	
	
	
	
	System.out.println("Main ended");
}
}
