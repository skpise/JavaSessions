package com.symplore.ussessions.warehousemanagement.service;

import com.symplore.ussessions.warehousemanagement.entity.ProductDetails;
import com.symplore.ussessions.warehousemanagement.repository.ProductDetailsRepository;
import com.symplore.ussessions.warehousemanagement.repository.ProductDetailsRepositoryImpl;

public class ProductServiceImpl implements ProductDetailsService {

	private ProductDetailsRepository productRepository = new ProductDetailsRepositoryImpl();

	@Override
	public String addProduct(ProductDetails productDetails) {
		productRepository.addProduct(productDetails);
		return "PRODUCT ADDED SUCCESSFULLY";
	}

}
