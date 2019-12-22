package com.ustglobal.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ustglobal.librarymanagementsystem.dto.UserResponse;

public class HandlerException {

	@ExceptionHandler(Exception.class)
	public  UserResponse getException() {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Got an Exception");
		return response;
				
	}
}
