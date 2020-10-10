package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("api/")

public class MyController {
	
	@Autowired
	private ProductService productService;
	
	//get list of products
	@GetMapping("/products")
	public List<Product> getProducts(){
		return this.productService.getProducts();		
	}
	
	@GetMapping("/return-policy")
	public String getReturnPolicy() {
		return this.productService.getReturnPolicy();
	}
	
	//singleProduct
	@GetMapping("/products/{categoryId}")
	public List<Product> getProductByCategory(@PathVariable("categoryId") String categoryId) {
		return this.productService.getProductByCategory(Long.parseLong(categoryId));
	}
	
	//retrieve variant id
	@GetMapping("variant/{varId}")
	public int getPrice(@PathVariable("varId") String id) {
		return this.productService.getVariantPrice(id);
	}
	
	//singleProduct
	@GetMapping("/product/{productId}")
	public Product getProduct(@PathVariable("productId") String productId) {
		return this.productService.getProduct(Long.parseLong(productId));
	}
		
	
	@PostMapping(path="/products",consumes="application/json")
	public Product addProduct(@RequestBody Product product) {
		return this.productService.addProduct(product);
		
	}
	
	

}
