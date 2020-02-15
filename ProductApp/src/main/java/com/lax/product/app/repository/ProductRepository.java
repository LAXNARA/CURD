package com.lax.product.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lax.product.app.entitys.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer>{

}
