package com.ustglobal.stockmanagement.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.ustglobal.stockmanagement.dto.OrderBean;
import com.ustglobal.stockmanagement.dto.OrderResponse;
import com.ustglobal.stockmanagement.dto.StockBean;
import com.ustglobal.stockmanagement.dto.StockResponse;
import com.ustglobal.stockmanagement.service.OrderService;
import com.ustglobal.stockmanagement.service.StockService;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;

	@PostMapping(path="/addorder",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse addOrder(@RequestBody OrderBean bean) {
		OrderResponse response = new OrderResponse();
		if(service.addOrder(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data added to DB");
		}
		return response;

	}//end of add()

	@PutMapping(path="/modifyorder",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse modifyOrder(@RequestBody OrderBean bean) {
		OrderResponse response = new OrderResponse();
		if(service.modifyOrder(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data modified in DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not modified in DB");
		}
		return response;

	}

	@GetMapping(path = "/getorder",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse  getOrderById(@RequestParam("OrderId") int orderId) {
		OrderResponse response = new OrderResponse();
		OrderBean bean = service.getOrderById(orderId);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setOrderbeans(Arrays.asList(bean));
		}else {
			response.setStatusCode(401);
			response.setMessage("Filure");
			response.setDescription("Data not found in the DB");

		}
		return response;

	}
}
