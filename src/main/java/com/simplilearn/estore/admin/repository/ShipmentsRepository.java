package com.simplilearn.estore.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.estore.admin.entity.Shipments;

public interface ShipmentsRepository extends JpaRepository<Shipments, Integer>{

}
