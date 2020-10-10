package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	public List<Product> getProducts();
	
	public List<Product> getProductByCategory(Long categoryId);
	
	public Product getProduct(Long productId);
	
	public Product addProduct(Product product);
	


	public int getVariantPrice(String id);

	public String getReturnPolicy();
	
	

}
