package com.symplore.ussessions.warehousemanagement.controller;

import com.symplore.ussessions.warehousemanagement.entity.ProductDetails;
import com.symplore.ussessions.warehousemanagement.service.ProductDetailsService;
import com.symplore.ussessions.warehousemanagement.service.ProductServiceImpl;

public class ProductServiceController {

	private ProductDetailsService productDetailsService = new ProductServiceImpl();

	public void addProduct(ProductDetails product) {
		
		
		String successMessage = productDetailsService.addProduct(product);
		
		
		System.out.println(successMessage);

	}
}
