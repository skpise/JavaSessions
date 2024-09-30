package com.symplore.ussessions.warehousemanagement.repository;

import java.util.List;

import com.symplore.ussessions.warehousemanagement.entity.ProductDetails;

public interface ProductDetailsRepository {

	public void addProduct(ProductDetails productDetails);

	public List<ProductDetails> viewProducts();

	public int deleteProduct(Integer productId);

	public int updateProduct(Integer productId, String productName);

}
