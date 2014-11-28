package com.lebk.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lebk.webstore.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping
	public String list(Model model) {

		model.addAttribute("products", productService.getAllProducts());

		return "products";
	}

	@RequestMapping("/all")
	public String allProducts(Model model) {

		model.addAttribute("products",
				productService.getAllProducts().subList(0, 1));

		return "products";
	}

	@RequestMapping("/{category}")
	public String getProductsByCategory(Model model,
			@PathVariable String category) {
		model.addAttribute("products",
				productService.getProductsByCategory(category));
		return "products";
	}
}