package com.simplilearn.estore.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.estore.admin.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer>{

}
