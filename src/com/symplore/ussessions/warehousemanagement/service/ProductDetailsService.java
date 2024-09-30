package com.symplore.ussessions.warehousemanagement.service;

import java.util.List;

import com.symplore.ussessions.warehousemanagement.entity.ProductDetails;

public interface ProductDetailsService {

	public String addProduct(ProductDetails productDetails);
	public List<ProductDetails> viewProducts();
	public String updateProduct(Integer productId, String productName);
	public String deleteProduct(Integer productId);
}
