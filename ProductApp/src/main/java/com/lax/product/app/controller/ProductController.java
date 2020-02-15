package com.lax.product.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lax.product.app.entitys.Products;
import com.lax.product.app.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/create")
	public Products createProduct(@RequestBody Products products) {
		return productService.createProduct(products);
	}

	@PutMapping("/update/{pId}")
	public Products updateProduct(@PathVariable("pId") Integer pId, @RequestBody Products products) {
		return productService.updateProduct(pId, products);
	}

	@GetMapping("/getAll")
	public List<Products> getAllProducts() {
		return productService.getAllProduct();
	}

	@DeleteMapping("/delete/{pid}")
	public void deleteProduct(@PathVariable("pId") Integer pId) {
		productService.deleteProduct(pId);
	}

}
