package com.simplilearn.estore.enduser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.estore.enduser.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer>{

}
