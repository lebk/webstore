package com.lebk.webstore.domain.repository;

import java.util.List;

import com.lebk.webstore.domain.Product;

public interface ProductRepository {

	List<Product> getAllProducts();

	Product getProductById(String productId);

	List<Product> getProductsByCategory(String category);
}
