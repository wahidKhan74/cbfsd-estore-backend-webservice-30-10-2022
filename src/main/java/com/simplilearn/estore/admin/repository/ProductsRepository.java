package com.simplilearn.estore.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.estore.admin.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
