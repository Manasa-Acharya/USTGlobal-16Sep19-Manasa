package com.ustglobal.stockmanagement.controller;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.stockmanagement.dto.StockResponse;

@RestControllerAdvice
public class HandlerException {

	public StockResponse getException() {
		StockResponse response = new StockResponse();
		response.setStatusCode(501);
		response.setMessage("Error");
		response.setDescription("Got an exception");
		return response;

	}
}
