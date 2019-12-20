package com.ustglobal.stockmanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.ustglobal.stockmanagement.dto.StockBean;
import com.ustglobal.stockmanagement.dto.StockResponse;
import com.ustglobal.stockmanagement.service.StockService;


@CrossOrigin(origins="*",allowCredentials = "true")
@RestController
public class StockController {

	@Autowired
	private StockService service;

	@PostMapping(path="/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse addProduct(@RequestBody StockBean bean) {
		StockResponse response = new StockResponse();
		if(service.addProduct(bean)) {
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

	@PutMapping(path="/modify",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse modifyProduct(@RequestBody StockBean bean) {
		StockResponse response = new StockResponse();
		if(service.modifyProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data modified in DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not modified in DB");
		}
		return response;

	}//end of modify

	@GetMapping(path="/getname/{name}",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getProductByName(@RequestParam("name") String name) {
		StockResponse response = new StockResponse();
		StockBean bean = service.getProductByName(name);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setStockbeans(Arrays.asList(bean));
		}else {
			response.setStatusCode(401);
			response.setMessage("Filure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}//end of getname

	@GetMapping(path="/getcompany",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getProductByCompany(@RequestParam("company") String company) {
		StockResponse response = new StockResponse();
		List<StockBean>bean = service.getProductByCompany(company);
		if(!bean.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setStockbeans(bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Filure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}//end of getname

	@GetMapping(path="/getcategory",

			produces=MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getProductByCategory(@RequestParam("category") String category) {
		StockResponse response = new StockResponse();
		List<StockBean>bean = service.getProductByCategory(category);
		if(!bean.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setStockbeans(bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Filure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}//end of getcategory

	@GetMapping(path = "/get-all",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getAllProduct(){
		StockResponse response = new StockResponse();
		List<StockBean> beans = service.getAllProduct();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setStockbeans(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("Filure");
			response.setDescription("Data not found in the DB");
		}

		return response;

	}//end of getAllProduct

}
