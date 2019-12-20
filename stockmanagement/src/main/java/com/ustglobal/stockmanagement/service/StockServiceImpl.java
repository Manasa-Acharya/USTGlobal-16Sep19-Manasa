package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.StockDAO;
import com.ustglobal.stockmanagement.dto.StockBean;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockDAO dao; 

	@Override
	public boolean addProduct(StockBean bean) {

		return dao.addProduct(bean);
	}

	@Override
	public boolean modifyProduct(StockBean bean) {

		return dao.modifyProduct(bean);
	}

	@Override
	public StockBean getProductByName(String name) {

		return dao.getProductByName(name);
	}



	@Override
	public List<StockBean> getProductByCompany(String company) {

		return dao.getProductByCompany(company);
	}

	@Override
	public List<StockBean> getProductByCategory(String category) {

		return dao.getProductByCategory(category);
	}

	@Override
	public List<StockBean> getAllProduct() {

		return dao.getAllProduct();
	}



}
