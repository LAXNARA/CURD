package com.lax.product.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lax.product.app.entitys.Products;
import com.lax.product.app.repository.ProductRepository;
import com.lax.product.app.service.ProductService;

import lombok.SneakyThrows;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Products> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public void deleteProduct(Integer pId) {
		productRepository.deleteById(pId);

	}

	@Override
	public Products createProduct(Products products) {
		return productRepository.save(products);
	}

	@Override
	@SneakyThrows
	public Products updateProduct(Integer pId, Products products) {
		Optional<Products> product = productRepository.findById(pId);
		if (product.equals(Optional.empty())) {
			throw new Exception("No product available with this id");
		}
		return productRepository.saveAndFlush(products);
	}

}
