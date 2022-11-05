package com.simplilearn.estore.enduser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.estore.enduser.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
