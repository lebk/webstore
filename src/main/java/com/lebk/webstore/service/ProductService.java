package com.lebk.webstore.service;

import java.util.List;

import com.lebk.webstore.domain.Product;

public interface ProductService {
	List<Product> getAllProducts();

	Product getProductById(String productId);

	List<Product> getProductsByCategory(String category);

}
