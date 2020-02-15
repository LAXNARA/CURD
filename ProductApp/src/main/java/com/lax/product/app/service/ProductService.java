package com.lax.product.app.service;

import java.util.List;

import com.lax.product.app.entitys.Products;

public interface ProductService {

	List<Products> getAllProduct();

	void deleteProduct(Integer pId);

	Products createProduct(Products products);

	Products updateProduct(Integer pId, Products products);

}
