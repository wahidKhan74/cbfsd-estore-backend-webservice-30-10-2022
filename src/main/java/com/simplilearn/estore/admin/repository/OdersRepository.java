package com.simplilearn.estore.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.estore.admin.entity.Orders;

public interface OdersRepository extends JpaRepository<Orders, Integer>{

}
